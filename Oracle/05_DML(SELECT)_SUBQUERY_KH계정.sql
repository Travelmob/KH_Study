/*
    < SUBQUERY �������� >

    �ϳ��� �ֵ� SQL��(SELECT, INSERT, UPDATE, CREATE...) �ȿ� ���Ե� �� �ϳ��� QUERY��
    Main SQL���� ���� ���������� �ϴ� ������
*/

-- ���� �������� ����!
SELECT * FROM EMPLOYEE;
-- ���ö ����� ���� �μ��� ������� ������� ��ȸ�ϰ� �ʹ�!
-- 1) ���� ���ö ����� �μ��ڵ� ��ȸ
SELECT
       DEPT_CODE
  FROM
       EMPLOYEE
 WHERE
       EMP_NAME = '���ö'; -- ���ö ����� �μ��ڵ�� D9

-- 2) �μ��ڵ尡 D9�� ����� ��ȸ
SELECT
       EMP_NAME
  FROM
       EMPLOYEE
 WHERE
       DEPT_CODE = 'D9';


-- ���� �� �ܰ踦 �ϳ��� ���������� ��ġ��
SELECT
       EMP_NAME
  FROM
       EMPLOYEE
 WHERE
       DEPT_CODE = (SELECT
                           DEPT_CODE
                      FROM
                           EMPLOYEE
                     WHERE
                           EMP_NAME = '���ö');


-- ���� �������� ����2
-- ��ü ����� ��� �޿����� �� ���� �޿��� �ް� �ִ� ������� ���, �̸�, �����ڵ� ��ȸ
-- 1) ��ü ����� ��� �޿� ���ϱ�
SELECT AVG(SALARY)
  FROM EMPLOYEE; -- �뷫 3,047,662��

-- 2) �޿��� 3,047,662�� �̻��� ����� ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_CODE
  FROM EMPLOYEE
 WHERE SALARY > 3047662;

-- ���� �� �ܰ踦 �ϳ��� �������� ��ġ��
SELECT EMP_ID, EMP_NAME, JOB_CODE
  FROM EMPLOYEE
 WHERE SALARY > (SELECT AVG(SALARY)
                   FROM EMPLOYEE);
--------------------------------------------------------------------------------
/*
    �������� ����
    
    ���������� ������ ������� �� �� �� ���̳Ŀ� ���� �з�
    
    - ������ [���Ͽ�] �������� : ���������� ������ ������� ������ 1�� �� ��
    - ������ [���Ͽ�] �������� : ���������� ������ ������� ���� ���� ��
    - [������] ���߿� �������� : ���������� ������ ������� ���� ���� ��
    - ������ ���߿� ��������   : ���������� ������ �ܷΰ����� ���� �� ���� �� �� ��

    => ���������� ������ ����� �� �� �� ���̳Ŀ� ���� ��밡���� �����ڰ� �޶���
*/

/*
    1. ���� �� ��������(SINGLE ROW SUBQUERY)
    ���������� ��ȸ ������� ������ 1�� �� ��

    �Ϲ� ������(=, !=, <=, >....)
*/

-- �� ������ ��� �޿����� �� ���� �޴� ������� �����, �����ڵ�, �޿� ��ȸ
SELECT AVG(SALARY)
  FROM EMPLOYEE; --> ������� 1�� 1��, ������ 1���� ��

SELECT EMP_NAME, JOB_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY < (SELECT AVG(SALARY)
                   FROM EMPLOYEE);


-- �����޿��� �޴� ����� ���, �����, �����ڵ�, �޿�, �Ի��� ��ȸ
SELECT MIN(SALARY)
  FROM EMPLOYEE; -- > ������� 1�� 1�� 1���� ��

SELECT EMP_NO, EMP_NAME, JOB_CODE, SALARY, HIRE_DATE
  FROM EMPLOYEE
 WHERE SALARY = (SELECT MIN(SALARY)
                   FROM EMPLOYEE);
                   
-- ���ö ����� �޿����� �� ���� �޴� ������� ���, �̸�, �μ���, �޿� ��ȸ
SELECT
       SALARY
  FROM
       EMPLOYEE
 WHERE
       EMP_NAME = '���ö';

SELECT
       EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM
       EMPLOYEE
 WHERE
       SALARY > (SELECT
                        SALARY
                   FROM
                        EMPLOYEE
                  WHERE
                        EMP_NAME = '���ö');



SELECT
       EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
  FROM
       EMPLOYEE, DEPARTMENT
 WHERE
       SALARY > (SELECT
                        SALARY
                   FROM
                        EMPLOYEE
                  WHERE
                        EMP_NAME = '���ö')
   AND
       DEPT_CODE = DEPT_ID;
-- ���ε� ����!



-- �������� ���� �μ��� ������� ���, �����, ��ȭ��ȣ, ���޸� ��ȸ(��, �������� ����)
SELECT
       DEPT_CODE
  FROM
       EMPLOYEE
 WHERE
       EMP_NAME = '������';
       
SELECT EMP_NO, EMP_NAME, PHONE, JOB_NAME
  FROM EMPLOYEE E, JOB J
 WHERE E.JOB_CODE = J.JOB_CODE
   AND DEPT_CODE = (SELECT
                           DEPT_CODE
                      FROM
                           EMPLOYEE
                     WHERE
                           EMP_NAME = '������')
   AND EMP_NAME != '������';
   
SELECT EMP_NO, EMP_NAME, PHONE, JOB_NAME
  FROM EMPLOYEE
  JOIN JOB USING(JOB_CODE)
 WHERE DEPT_CODE = (SELECT
                           DEPT_CODE
                      FROM
                           EMPLOYEE
                     WHERE
                           EMP_NAME = '������')
   AND EMP_NAME != '������';
-- �μ��� �޿� ���� ���� ū �μ� �ϳ����� ��ȸ// �μ��ڵ�, �μ���, �޿��� ��ȸ

SELECT MAX(SUM(SALARY))
  FROM EMPLOYEE
 GROUP BY DEPT_CODE; -- �޿� ���� ���� ū �� ���� ã��

SELECT DEPT_CODE, DEPT_TITLE, SUM(SALARY)
  FROM EMPLOYEE
  JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
 GROUP BY DEPT_CODE, DEPT_TITLE
HAVING SUM(SALARY) = (SELECT MAX(SUM(SALARY))
                        FROM EMPLOYEE
                       GROUP BY DEPT_CODE);

--------------------------------------------------------------------------------
/*
    2. ������ �������� (MULTI ROW SUBQUERY)
    ���������� ��ȸ ����� ���� ���� ��
    
    - IN (10, 20, 30) �������� : ���� ���� ����� �߿��� �ϳ��� ��ġ�ϴ� ���� ������ / NOT IN ������ �̶�� �ǹ�
    
    - > ANY (10, 20, 30) �������� : ���� ���� ����� �߿��� "�ϳ���" Ŭ ���
                                   ���� ���� ����� �߿��� ���� ���� �� ���� Ŭ ���
    - < ANY (10, 20, 30) �������� : ���� ���� ����� �߿��� "�ϳ���" ���� ���
                                    ���� ���� ����� �߿��� ���� ū ������ ���� ���
*/

-- �� �μ��� �ְ� �޿��� �޴� ����� �̸�, �����ڵ�, �޿� ��ȸ
-- 1) �� �μ��� �ְ� �޿� ��ȸ
SELECT MAX(SALARY)
  FROM EMPLOYEE
 GROUP BY DEPT_CODE; -- 2890000, 3660000, 8000000, 3760000, 3900000, 2490000, 2550000

-- 2) ���� �޿��� �޴� ����� ��ȸ
SELECT EMP_NAME, JOB_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY IN (2890000, 3660000, 8000000, 3760000, 3900000, 2490000, 2550000);

-- ���� �� ������ ��ġ��
SELECT EMP_NAME, JOB_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY IN (SELECT MAX(SALARY)
                    FROM EMPLOYEE
                   GROUP BY DEPT_CODE);

-- ������ �Ǵ� ����� ����� ���� �μ��� ������� ��ȸ�Ͻÿ�(�����, �μ��ڵ�, �޿�)
SELECT
       DEPT_CODE
  FROM
       EMPLOYEE
 WHERE
       EMP_NAME IN ('������', '�����');


SELECT EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE IN (SELECT
                            DEPT_CODE
                       FROM
                            EMPLOYEE
                      WHERE
                            EMP_NAME IN ('������', '�����'));

select * from employee;
-- ��� < �븮 < ���� < ���� < ����
-- �븮�����ӿ��� �ұ��ϰ� ���������� �޿����� ���� �޴� ���� ��ȸ(���, �̸�, ���޸�, �޿�)

-- 1) ���� ������ �޿��� ��ȸ
SELECT SALARY
  FROM EMPLOYEE E, JOB J
 WHERE E.JOB_CODE = J.JOB_CODE
   AND JOB_NAME = '����'; -- 2200000, 2500000, 3760000

-- 2) ���� �޿����� ���� �޿��� �޴� ������ ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_NAME, SALARY
  FROM EMPLOYEE E, JOB J
 WHERE E.JOB_CODE = J.JOB_CODE
   AND SALARY >= ANY(2200000, 2500000, 3760000);

-- 3) ���� �������� �ϳ��� ���������� ��ġ�� + �븮���޸� ��ȸ

SELECT EMP_ID, EMP_NAME, JOB_NAME, SALARY
  FROM EMPLOYEE E, JOB J
 WHERE E.JOB_CODE = J.JOB_CODE
   AND SALARY >= ANY(SELECT SALARY
                       FROM EMPLOYEE E, JOB J
                      WHERE E.JOB_CODE = J.JOB_CODE
                        AND JOB_NAME = '����')
   AND JOB_NAME = '�븮';
   
-- ��� < �븮 < ���� < ���� < ����
-- ���� �����ӿ��� �ұ��ϰ� ��� ���������� �޿����� �� ���� �޴� ���� ��ȸ(���, �̸�, ���޸�, �޿�)
SELECT EMP_ID, EMP_NAME, JOB_NAME, SALARY
  FROM EMPLOYEE
  JOIN JOB USING(JOB_CODE)
 WHERE JOB_NAME = '����'
   AND SALARY >= ALL(SELECT SALARY
                       FROM EMPLOYEE
                       JOIN JOB USING(JOB_CODE)
                      WHERE JOB_NAME = '����');
/*
    ALL : ��� AND
    - > ALL �������� : �������� ������� "���"������ Ŭ ��� == ���� ���� ����� �߿��� ���� ū �� ���� Ŭ ���
    - < ALL �������� : �������� ������� "���"������ ���� ��� == ���� ���� ����� �߿��� ���� ���� �� ���� ���� ���
*/

SELECT SALARY
  FROM EMPLOYEE
  JOIN JOB USING(JOB_CODE)
 WHERE JOB_NAME = '����';


-----------------------------------------------------------------------------------

/*
    3. [ ������ ] ���߿� ��������
    ��ȸ ��� ���� �� �������� ������ �÷� ���� ���� ���� ��
*/
-- ������ ����� ���� �μ��ڵ�, ���� �����ڵ忡 �ش��ϴ� ����� ��ȸ

-- > ������ ����� �μ��ڵ�� �����ڵ� ���� ��ȸ
SELECT DEPT_CODE, JOB_CODE
  FROM EMPLOYEE
 WHERE EMP_NAME = '������';    -- D5 / J5

-- > �μ��ڵ尡 D5�̸鼭 �����ڵ尡 J5�� ��� ��ȸ
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, HIRE_DATE
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5'
   AND JOB_CODE = 'J5';
   
--> ���� ������� �ϳ��� ���������� ��ġ��(������ ��������)
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, HIRE_DATE
  FROM EMPLOYEE
 WHERE DEPT_CODE = (SELECT DEPT_CODE
                      FROM EMPLOYEE
                     WHERE EMP_NAME = '������')
   AND JOB_CODE = (SELECT JOB_CODE
                     FROM EMPLOYEE
                    WHERE EMP_NAME = '������');

--> ���߿� ��������
SELECT EMP_NAME, DEPT_CODE, JOB_CODE, HIRE_DATE
  FROM EMPLOYEE
 WHERE (DEPT_CODE, JOB_CODE) = (SELECT DEPT_CODE, JOB_CODE
                                  FROM EMPLOYEE
                                 WHERE EMP_NAME = '������');

-- �ڳ��� ����� ���� �����ڵ�, ���� �������� ���� ������� ���, �̸�, �����ڵ�, ������ ��ȸ

SELECT JOB_CODE, MANAGER_ID
  FROM EMPLOYEE
 WHERE EMP_NAME = '�ڳ���';
 
SELECT EMP_ID, EMP_NAME, JOB_CODE, MANAGER_ID
  FROM EMPLOYEE
 WHERE (JOB_CODE, MANAGER_ID) = (SELECT JOB_CODE, MANAGER_ID
                                   FROM EMPLOYEE
                                  WHERE EMP_NAME = '�ڳ���');

--------------------------------------------------------------------------------

/*
    4. ������ ���߿� ��������
    �������� ��ȸ ������� ���� �� ���� �÷��� ���!
*/

-- �� ���޺� �ּ� �޿��� �޴� ����� ��ȸ(���, �̸�, �����ڵ�, �޿�)

--> �� ���޺� �ּ� �޿�

SELECT JOB_CODE, MIN(SALARY)
  FROM EMPLOYEE
 GROUP BY JOB_CODE;

/*
J2	3700000
J7	1380000
J3	3400000
J6	2000000
J5	2200000
J1	8000000
J4	1550000
*/

--> �����ڵ�� �޿��� ��ġ�ϴ� ����� ������ ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
  FROM EMPLOYEE;
  /*
 WHERE (JOB_CODE, SALARY) = ('J2', 3700000)
    OR (JOB_CODE, SALARY) = ('J7', 1380000)
    OR (JOB_CODE,
    */
 --WHERE (JOB_CODE, SALARY) IN (('J2', 3700000), ('J7', 1380000));
-- ������� �ϳ��� ���ļ� �ϳ��� ���������� �����.

SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
  FROM EMPLOYEE
 WHERE (JOB_CODE, SALARY) IN (SELECT JOB_CODE, MIN(SALARY)
                                FROM EMPLOYEE
                               GROUP BY JOB_CODE);

-- �� �μ��� �ְ� �޿��� �޴� ����� ��ȸ(���, �̸�, �μ��ڵ�, �޿�)

SELECT NVL(DEPT_CODE, '����'), MAX(SALARY)
  FROM EMPLOYEE
 GROUP BY DEPT_CODE;
 
SELECT EMP_ID, EMP_NAME, NVL(DEPT_CODE, '����'), SALARY
  FROM EMPLOYEE
 WHERE (NVL(DEPT_CODE, '����'), SALARY) IN (SELECT NVL(DEPT_CODE, '����'), MAX(SALARY)
                                             FROM EMPLOYEE
                                            GROUP BY DEPT_CODE)
 ORDER BY SALARY DESC;
---------------------------------------------------------------------------------
/*
    5. �ζ��� ��(INLINE - VIEW)
    FROM���� ���������� �����ϴ� ��

    ���������� ������ ��� (RESULT SET) �� ���̺� ��� ���!
*/

-- ���ʽ� ���� ������ 3000���� �̻��� ������� ���, �̸�, ���ʽ����� ����, �μ��ڵ带 ��ȸ
SELECT EMP_ID, EMP_NAME, (SALARY + SALARY * NVL(BONUS, 0)) * 12 "���ʽ� ���� ����", DEPT_CODE
  FROM EMPLOYEE
 WHERE (SALARY + SALARY * NVL(BONUS, 0)) * 12 >= 30000000;
 
SELECT EMP_NAME
  FROM (SELECT EMP_ID, 
               EMP_NAME, 
               (SALARY + SALARY * NVL(BONUS, 0)) * 12 "���ʽ� ���� ����", 
               DEPT_CODE
          FROM EMPLOYEE)
 WHERE "���ʽ� ���� ����" >= 30000000;
  
--> �ζ��� �並 �ַ� ����ϴ� ��
-- TOP-N�м� : �����ͺ��̽� �� �ִ� �ڷ� �� �ֻ��� �� ���� �ڷḦ ���� ���� ����ϴ� ���

-- �� ���� �� �޿��� ���� ���� ���� 5��
-- * ROWNUM : ����Ŭ���� �������ִ� �÷�, ��ȸ�� ������� 1���� ������ �ٿ���
SELECT ROWNUM, EMP_NAME, SALARY  -- 3
  FROM EMPLOYEE                 -- 1
 WHERE ROWNUM <= 5               -- 2
 ORDER BY SALARY DESC;           -- 4


--> ORDER BY���� ����ؼ� ������ RESULTSET�� ������ ROWNUM���� �ο��Ŀ� ROWNUM <= 5
SELECT ROWNUM "����", E.*
  FROM (SELECT EMP_NAME, SALARY, BONUS, DEPT_CODE, JOB_CODE
          FROM EMPLOYEE
         ORDER BY SALARY DESC) E
 WHERE ROWNUM <= 5;
 
-- �� �μ��� ��� �޿��� ���� 3�� �μ��� �μ��ڵ�, ��� �޿� ��ȸ
SELECT ROWNUM "����", DEPT_CODE, ROUND("��ձ޿�") "��ձ޿�"
FROM (SELECT DEPT_CODE, AVG(SALARY) "��ձ޿�"
        FROM EMPLOYEE
       GROUP BY DEPT_CODE
       ORDER BY "��ձ޿�" DESC)
WHERE ROWNUM <= 3;

-- ���� �ֱٿ� �Ի��� ��� 5�� ��ȸ   �����, �޿�, �Ի���
SELECT ROWNUM, E.*
  FROM (SELECT EMP_NAME, SALARY, HIRE_DATE
          FROM EMPLOYEE
         ORDER BY HIRE_DATE DESC) E
 WHERE ROWNUM <= 5;


--------------------------------------------------------------------------------
/*
    6. ���� �ű�� �Լ�
    RANK() OVER(���ı���)
    DENSE_RANK() OVER(���ı���)
    
    ��, ���� �Լ����� ������ SELECT�������� �ۼ� ����

*/

SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC)
  FROM EMPLOYEE;

SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY DESC)
  FROM EMPLOYEE;

SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC)
  FROM EMPLOYEE
 WHERE RANK() OVER(ORDER BY SALARY DESC) <= 5;

SELECT *
  FROM (SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) "����"
          FROM EMPLOYEE)
 WHERE ���� <= 5;









































