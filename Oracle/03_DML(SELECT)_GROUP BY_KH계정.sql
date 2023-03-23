/*
    < GROUP BY �� >

    �׷��� ������ ������ ������ �� �ִ� ����

    ���� ���� ������ �ϳ��� �׷����� ��� ó���� �������� ���
*/

-- ��ü ����� �� �޿���
SELECT SUM(SALARY)
  FROM EMPLOYEE; --> ���� ��ȸ�� ��ü������� �ϳ��� �׷����� ��� ������ ���� ���

SELECT * FROM EMPLOYEE;

-- �� �μ��� �� �޿� ��
SELECT DEPT_CODE, SUM(SALARY)
  FROM EMPLOYEE
 GROUP BY DEPT_CODE;

-- ��ü ��� ��
SELECT COUNT(*)
  FROM EMPLOYEE;
  
-- �� �μ��� ����� 
SELECT DEPT_CODE, COUNT(*)
  FROM EMPLOYEE
 GROUP BY DEPT_CODE;
 
 
-- �� �μ��� �� �޿����� �μ��� �������� �����ؼ� ��ȸ
SELECT DEPT_CODE, SUM(SALARY)   -- 3. SELECT ��
  FROM EMPLOYEE                 -- 1. FROM ��
 GROUP BY DEPT_CODE             -- 2. GROUP BY ��
 ORDER BY DEPT_CODE ASC;        -- 4. ORDER BY ��

-- �� ���޺� �����ڵ�, �� �޿��� ��, ��� ��, ���ʽ��� �޴� ��� ��, ��ձ޿�, �ּұ޿�, �ְ�޿�
SELECT JOB_CODE, SUM(SALARY), COUNT(*), COUNT(BONUS), ROUND(AVG(SALARY)), MAX(SALARY), MIN(SALARY)
  FROM EMPLOYEE
 GROUP BY JOB_CODE;
 
 
-- ���� �� ��� ��
SELECT DECODE(SUBSTR(EMP_NO, 8, 1), '1', '����', '2', '����') "����", COUNT(*) �����
  FROM EMPLOYEE
 GROUP BY SUBSTR(EMP_NO, 8, 1);

----------------------------------------------------------------------------------

-- �� �μ��� ��ձ޿��� 300���� �̻��� �μ��鸸 ��ȸ
SELECT DEPT_CODE, ROUND(AVG(SALARY))
  FROM EMPLOYEE
 WHERE AVG(SALARY) >= 3000000
 GROUP BY DEPT_CODE;

/*  
    < HAVING �� >
    �׷쿡 ���� ������ �����ϰ��� �� �� ����ϴ� ����
    ( �ַ� �׷��Լ��� ������ ������ ���� )
*/

SELECT DEPT_CODE, ROUND(AVG(SALARY))
  FROM EMPLOYEE
 GROUP BY DEPT_CODE
HAVING AVG(SALARY) >= 3000000;

-- �� ���� �� �� �޿��� ���� 1000���� �̻��� ���� �ڵ�, �޿� ���� ��ȸ
SELECT JOB_CODE, SUM(SALARY)
  FROM EMPLOYEE
 GROUP BY JOB_CODE
HAVING SUM(SALARY) >= 10000000;

-- �� �μ� �� ���ʽ��� �޴� ����� ���� �μ����� ��ȸ
SELECT DEPT_CODE
  FROM EMPLOYEE
 GROUP BY DEPT_CODE
HAVING COUNT(BONUS) = 0;

select * from employee;

----------------------------------------------------------------------------------
/*
    < ���� ���� >
    
    SELECT * / ��ȸ�ϰ��� �ϴ� �÷��� / �������� / �Լ��� AS "��Ī"                              5
      FROM ��ȸ�ϰ����ϴ� ���̺� ��                                                             1
     WHERE ���ǽ�                                                                            2
     GROUP BY �׷� ���ؿ� �ش��ϴ� �÷��� / �Լ���                                               3
    HAVING �׷��Լ��Ŀ� ���� ���ǽ�                                                            4
     ORDER BY ���� ���ؿ� �ش��ϴ� �÷��� / ��Ī / �÷����� ASC/DESC NULLS FISRT / NULL LAST      6

    FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY
*/
----------------------------------------------------------------------------------
/*
    < ���� ������ SET OPERATOR >
    
    ���� ���� �������� ������ �ϳ��� ���������� ����� ������
    
    - UNION : ������ (�� �������� ������ ������� ���� �� �ߺ��Ǵ� �κ��� �ѹ� ����)
    - INTERSECT : ������ (�� �������� ������ ������� �ߺ��� ����� �κ�)
    - UNION ALL : ������ ����� �������� ������ ����(�� �������� ������ ������� ������ ����, �����տ��� �ߺ����Ÿ� �������� ���)
    - MINUS : ������(���� ������ ����� ���� ���� ������ ������� ���)
*/

-- 1. UNION(������)
-- �μ��ڵ尡 D5�ų� �޿��� 300������ �ʰ��� ����� ��ȸ(���, �����, �μ��ڵ�, �޿�)

-- �μ��ڵ尡 D5�� ����鸸 ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5'; --> 6�� ��ȸ(�ڳ���, ������, ���ؼ�, �ɺ���, ������, ���ȥ)

-- �޿��� 300���� �ʰ��� ����鸸 ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY > 3000000; --> 8�� ��ȸ(������, ������, ���ö, �����, ������, �ɺ���, ���ȥ, ������)

-- UNION
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5'
 UNION
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY > 3000000; --> 12�� ��ȸ(6�� + 8�� - 2��)
-- �� ������ SELECT���� ���ƾ��Ѵ�.

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5' OR SALARY > 3000000;

-- (�μ��ڵ�, �μ��� �޿���)
SELECT SUM(SALARY)
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D1'
 UNION
SELECT SUM(SALARY)
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D2'
 UNION
SELECT SUM(SALARY)
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5';
 
SELECT DEPT_CODE, SUM(SALARY)
  FROM EMPLOYEE
 GROUP BY DEPT_CODE;

--------------------------------------------------------------------------------

-- 2. UNION ALL : �������� ���� ����� ������ ���ϴ� ������(�ߺ����� ������ �� �� ����)

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5'
 UNION ALL
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY > 3000000;
 
--------------------------------------------------------------------------------

-- 3. INTERSECT : ������

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5'
INTERSECT
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY > 3000000;

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5' AND SALARY > 3000000;
--------------------------------------------------------------------------------

-- 4. MINUS : ������
-- �μ��ڵ尡 D5�� ����� �� �޿��� 300���� �ʰ��� ����� �����ؼ� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5'
 MINUS
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE SALARY > 3000000;

SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
  FROM EMPLOYEE
 WHERE DEPT_CODE = 'D5' AND SALARY <= 3000000;
--------------------------------------------------------------------------------




























