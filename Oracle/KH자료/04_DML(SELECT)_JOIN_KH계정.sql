/*
    < JOIN >
    
    �� �� �̻��� ���̺��� �����͸� ���� ��ȸ�ϰ��� �� �� ����ϴ� ����
    ��ȸ ����� �ϳ��� RESULT SET���� ��
    
    ������ �����ͺ��̽������� �ּ����� �����ͷ� ������ ���̺� �����͸� �����ϰ� ����(�̻����, �ߺ����ּ�ȭ�ϱ����ؼ�)
    => JOIN������ �̿��ؼ� �������� ���̺� �� "����"�� �ξ ���� ��ȸ�ؾ� ��
    => ��, ������ JOIN�� �̿��ؼ� ��ȸ�ϴ°��� �ƴ϶�
     ���̺� ���� "�����"�� �ش��ϴ� �÷��� ��Ī���Ѽ� ��ȸ�ؾ� ��
     
     JOIN�� ũ�� "����Ŭ ���뱸��"�� "ANSI(�̱����� ǥ����ȸ)����"���� ������.
            ����Ŭ ���뱸��        |       ANSI(����Ŭ + �ٸ� DBMS) ����
    ============================================================================
            �����              |     ��������(INNER JOIN) -> JOIN USING/ON
            (EQUQAL JOIN)        |     �ܺ�����(OUTER JOIN) -> JOIN USING
    ----------------------------------------------------------------------------
            ��������              |     ���� �ܺ����� (LEFT OUTER JOIN)
            (LEFT OUTER)         |     ������ �ܺ����� (RIGHT OUTER JOIN)
            (RIGHT OUTER)        |     ��ü �ܺ����� (FULL OUTER JOIN) => ����Ŭ������ �Ұ�
    ----------------------------------------------------------------------------
     ī�׽þ� ��(CARTESIAN PRODUCT)|     ��������(CROSS JOIN)
     ---------------------------------------------------------------------------
            ��ü����(SELF JOIN)
            ������(NON EQUAL JOIN)
*/

-- ��ü ������� ���, �����, �μ��ڵ�, �μ������ ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_CODE
  FROM EMPLOYEE;
  
SELECT DEPT_ID, DEPT_TITLE
  FROM DEPARTMENT;

-- ��ü ������� ���, �����, �����ڵ�, ���޸���� ��ȸ
SELECT EMP_ID, EMP_NAME, JOB_CODE
  FROM EMPLOYEE;

SELECT JOB_CODE, JOB_NAME
  FROM JOB;

--> JOIN�� ���ؼ� ������� �ش��ϴ� �÷��� ��Ī��Ų�ٸ� ��ġ �ϳ��� ������ΰ�ó�� ��ȸ ����
--------------------------------------------------------------------------------
/*
    1. �����(EQUAL JOIN) / ��������(INNER JOIN)
    �����Ű�� �÷��� ���� ��ġ�ϴ� ��鸸 ���εǼ� ��ȸ( == ��ġ�����ʴ� ������ ��ȸ���� ����)
*/

--> ����Ŭ ���� ����
-- FROM���� ��ȸ�ϰ����ϴ� ���̺���� ����(,��)
-- WHERE ���� ��Ī��ų �÷���(�����)�� ���� ������ ������

-- ��ü ������� ���, �����, �μ��ڵ�, �μ��� ���� ��ȸ
-- 1) ������ �� �÷����� �ٸ� ��� (EMPLOYEE - "DEPT_CODE" / DEPARTMENT - "DEPT_ID")
SELECT EMP_ID, EMP_NAME, DEPT_CODE, DEPT_ID, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE = DEPT_ID;
--> ��ġ���� �ʴ� ���� ��ȸ���� ���ܵȰ��� Ȯ�� ����
-- DEPT_CODE�� NULL���̾��� 2���� ��������ʹ� ��ȸ�� �ȵ�, DEPT_ID�� D3, D4, D7�� �μ������ʹ� ��ȸ X
 
-- ���, �����, �����ڵ�, ���޸�
-- 2) ������ �� �÷����� ���� ���(EMPLOYEE - "JOB_CODE" / JOB - "JOB_CODE")
/*
SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME
  FROM EMPLOYEE, JOB
 WHERE JOB_CODE = JOB_CODE;
 */
 -- ambiguously : �ָ��ϴ�, ��ȣ�ϴ� => Ȯ���ϰ� ����̺��� �÷������� �� ����������

-- ��� 1. ���̺���� �̿��ϴ� ���
SELECT EMP_ID, EMP_NAME, EMPLOYEE.JOB_CODE, JOB.JOB_CODE, JOB_NAME
  FROM EMPLOYEE, JOB
 WHERE EMPLOYEE.JOB_CODE = JOB.JOB_CODE;

-- ��� 2. ���̺��� ��Ī ��� ( �� ���̺��� ��Ī �ο� ����)
SELECT EMP_ID, EMP_NAME, E.JOB_CODE, J.JOB_CODE, JOB_NAME
  FROM EMPLOYEE E, JOB J
 WHERE E.JOB_CODE = J.JOB_CODE;


-->> ANSI ����
-- FROM ���� ���� ���̺��� �ϳ� ��� �� ��
-- �� �ڿ� JOIN������ ���� ��ȸ�ϰ����ϴ� ���̺� ���( ��Ī��ų �÷��� ���� ���ǵ� ���� ���)
-- USING / ON ����

-- ���, �����, �μ��ڵ�, �μ���
-- 1) ������ �� �÷����� �ٸ� ��� (EMPLOYEE - "DEPT_CODE" / DEPARTMENT - "DEPT_ID")
-- ������ ON������ ����(USING���� ���Ұ��� XXXXXXXXXXXXXXXXXXXXXXXX)
SELECT EMP_ID, EMP_NAME, DEPT_CODE, DEPT_TITLE
  FROM EMPLOYEE
 /*INNER*/ JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID); -- INNER ���� ����
 
-- ���, �����, �����ڵ�, ���޸�
-- 2) ������ �� �÷����� ���� ���( EMPLOYEE - "JOB_CODE" / DEPARTMENT - "JOB_CODE")
-- ON, USING
-- 2_1) ON���� �̿�  : AMBIGUOUSLY�� �߻��� �� ������ Ȯ���� ����ؾ���!!
SELECT EMP_ID, EMP_NAME, E.JOB_CODE, JOB_NAME
  FROM EMPLOYEE E
  JOIN JOB J ON (E.JOB_CODE = J.JOB_CODE);

-- 2_2) USING���� �̿� : AMBIGUOUSLY �߻� X, ������ �÷��� �ϳ��� ���ָ� �˾Ƽ� ��Ī������
SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME
  FROM EMPLOYEE
  JOIN JOB USING (JOB_CODE);

-- NATURAL JOIN(�ڿ�����)
 SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME
   FROM EMPLOYEE
NATURAL JOIN JOB;
-- �� ���� ���̺� ������ ����, �����Ե� �� ���� ���̺� ��ġ�ϴ� �÷��� �����ϰ� �� �� �����Ѵ�!!(JOB_CODE)= > ��Ī�� �˾Ƽ� ����

-- �߰����� ������ ���� ����
-- ������ �븮�� ������� ���� ��ȸ

-- > ����Ŭ ���� ����
SELECT
       EMP_ID,
       EMP_NAME,
       SALARY,
       JOB_NAME
  FROM
       EMPLOYEE E,
       JOB J
 WHERE
       E.JOB_CODE = J.JOB_CODE
   AND
       JOB_NAME = '�븮';


-- > ANSI ����
SELECT
       EMP_ID,
       EMP_NAME,
       SALARY,
       JOB_NAME
  FROM
       EMPLOYEE
  JOIN
       JOB USING(JOB_CODE)
 WHERE
       JOB_NAME = '�븮';
       
       
----------------------------- �ǽ� ���� -----------------------------
-- 1. �μ��� '�λ������'�� ������� ���, �����, ���ʽ��� ��ȸ
-- ����Ŭ
SELECT EMP_ID, EMP_NAME, BONUS
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_TITLE = '�λ������'
   AND DEPT_CODE = DEPT_ID;
-- ANSI
SELECT EMP_ID, EMP_NAME, BONUS
  FROM EMPLOYEE
  JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
 WHERE DEPT_TITLE = '�λ������';
-- 2. �μ��� '�ѹ���'�� �ƴ� ������� �����, �޿�, �Ի����� ��ȸ
-- ����Ŭ
SELECT EMP_NAME, SALARY, HIRE_DATE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_TITLE != '�ѹ���'
   AND DEPT_CODE = DEPT_ID;
-- ANSI
SELECT EMP_NAME, SALARY, HIRE_DATE
  FROM EMPLOYEE
  JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
 WHERE DEPT_TITLE != '�ѹ���';
-- 3. ���ʽ��� �޴� ������� ���, �����, ���ʽ�, �μ��� ��ȸ
-- ����Ŭ
SELECT EMP_NO, EMP_NAME, BONUS, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE = DEPT_ID
   AND BONUS IS NOT NULL;
-- ANSI
SELECT EMP_NO, EMP_NAME, BONUS, DEPT_TITLE
  FROM EMPLOYEE
  JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
 WHERE BONUS IS NOT NULL;
-- 4. �Ʒ��� �� ���̺��� �����ؼ� �μ��ڵ�, �μ���, �����ڵ�, ������(LOCAL_NAME) ��ȸ
SELECT * FROM DEPARTMENT;   -- LOCATION_ID   
SELECT * FROM LOCATION;     -- LOCAL_CODE
-- ����Ŭ
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, LOCAL_NAME
  FROM DEPARTMENT, LOCATION
 WHERE LOCATION_ID = LOCAL_CODE;
 
-- ANSI
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, LOCAL_NAME
  FROM DEPARTMENT
  JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE);

-- ����� / �������� : ��ġ���� �ʴ� ����� ���ʿ� ��ȸ���� ����

--------------------------------------------------------------------------------

/*
    2. �������� / �ܺ����� (OUTER JOIN)

    ���̺� ���� JOIN �� ��ġ���� �ʴ� �൵ ���Խ��Ѽ� ��ȸ ����
    ��, �ݵ�� LEFT / RIGHT�� �����ؾ��� (������ �Ǵ� ���̺��� �����ؾ� ��)
*/

-- "��ü" ������� �����, �޿�, �μ��� ��ȸ
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE
  JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);
-- DEPT_CODE�� NULL�� �� ���� ����� ��ȸ X
-- �μ��� ������ ����� ���� �μ�(D3, D4, D7)���� ��� ��ȸ X

-- 1) LEFT [ OUTER ] JOIN : �� ���̺� �� ���� ����� ���̺��� �������� JOIN
--                          ���� �Ǿ��簣�� ���� ����� ���̺��� �����ʹ� ������ ��ȸ�ǰ� �Ѵ�.(��ġ���� �ʴ���)
--> ANSI����
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE 
  LEFT /*OUTER*/ JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);
--> EMPLOYEE ���̺��� �������� ��ȸ�߱� ������ EMPLOYEE�� �����ϴ� �����ʹ� ���� �Ǿ��簣�� ��ȸ�ǰԲ� �Ѵ�.

--> ����Ŭ ���� ����
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE = DEPT_ID(+);
--> ���� �������� ���� ���̺��� �÷����� �ƴ� �ݴ� ���̺��� �÷��� (+)�� �ٿ��ش�.

-- 2) RIGHT [ OUTER ] JOIN : �� ���̺� �� ������ ����� ���̺��� �������� JOIN
--                          ���� �Ǿ��� ���� ������ ����� �����ʹ� ������ ��ȸ�ǰ� �Ѵ�.
--> ANSI����
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE
  RIGHT OUTER JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

--> ����Ŭ ���� ����
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE(+) = DEPT_ID;

-- 3) FULL [ OUTER ] JOIN : �� ���̺��� ���� ��� ���� ��ȸ�� �� ����

--> ANSI����
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE
  FULL OUTER JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);

--> ����Ŭ ���� ( ����Ŭ ���������� ��� �Ұ� )
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE(+) = DEPT_ID(+);
--------------------------------------------------------------------------------

/*
    3. ī�׽þ� ��(CARTESIAN PRODUCT) / �������� (CROSS JOIN)
    ��� ���̺��� �� ����� ���μ��� ���ε� �����Ͱ� ��ȸ��(������)


    �� ���̺��� ����� ��� ������ ����� ���� ��� => ����� ������ ��� => �������� ����
*/
-- �����, �μ���
--> ����Ŭ ���뱸��
SELECT EMP_NAME, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT; --> 23 * 9 => 207�� �� ��ȸ

-- ANSI����
SELECT EMP_NAME, DEPT_TITLE
  FROM EMPLOYEE
 CROSS JOIN DEPARTMENT;
-------------------------------------------------------------------------------------------------
/*
    4. �� ����(NON EQUAL JOIN)
    '=' ��ȣ�� ������� �ʴ� ���ι�

*/
-- �����, �޿�
SELECT EMP_NAME, SALARY
  FROM EMPLOYEE;
  
SELECT * FROM SAL_GRADE;

-- �����, �޿�, �޿����(SAL_LEVEL)
SELECT EMP_NAME, SALARY, SAL_GRADE.SAL_LEVEL
  FROM EMPLOYEE, SAL_GRADE
 WHERE SALARY >= MIN_SAL AND SALARY <= MAX_SAL;

-- ANSI����(ON����)
SELECT EMP_NAME, SALARY, SAL_GRADE.SAL_LEVEL
  FROM EMPLOYEE
  JOIN SAL_GRADE ON(SALARY BETWEEN MIN_SAL AND MAX_SAL);
--------------------------------------------------------------------------------

/*
    5. ��ü ����(SELF JOIN)
    ���� ���̺��� �ٽ� �� �� �����ϴ� ���
    �ڱ� �ڽ��� ���̺�� �ٽ� ������ �δ� ���
*/

SELECT EMP_ID "��� ���", EMP_NAME "�����", SALARY "��� �޿�", MANAGER_ID "��� ���"
  FROM EMPLOYEE;

SELECT * FROM EMPLOYEE; -- ����� ���� ���� ����� ���̺� MANAGER_ID
SELECT * FROM EMPLOYEE; -- ����� ���� ���� ����� ���̺� EMP_ID --> �����, ��� �޿�

-- ��� ���, �����, ��� �μ��ڵ�, ��� �޿�
-- ��� ���, �����, ��� �μ��ڵ�, ��� �޿�
--> ����Ŭ ���� ����
SELECT E.EMP_ID "��� ���", E.EMP_NAME "�����", E.DEPT_CODE "��� �μ��ڵ�", E.SALARY "��� �޿�",
       M.EMP_ID "��� ���", M.EMP_NAME "�����", M.DEPT_CODE "��� �μ��ڵ�", M.SALARY "��� �޿�"
  FROM EMPLOYEE E, EMPLOYEE M
 WHERE E.MANAGER_ID = M.EMP_ID(+);

--> ANSI
SELECT E.EMP_ID "��� ���", E.EMP_NAME "�����", E.DEPT_CODE "��� �μ��ڵ�", E.SALARY "��� �޿�",
       M.EMP_ID "��� ���", M.EMP_NAME "�����", M.DEPT_CODE "��� �μ��ڵ�", M.SALARY "��� �޿�"
  FROM EMPLOYEE E
  LEFT JOIN EMPLOYEE M ON (E.MANAGER_ID = M.EMP_ID);

SELECT E.EMP_ID "��� ���", E.EMP_NAME "�����", D1.DEPT_TITLE "��� �μ���", E.SALARY "��� �޿�",
       M.EMP_ID "��� ���", M.EMP_NAME "�����", D2.DEPT_TITLE "��� �μ���", M.SALARY "��� �޿�"
  FROM EMPLOYEE E
  LEFT JOIN EMPLOYEE M ON (E.MANAGER_ID = M.EMP_ID)
  JOIN DEPARTMENT D1 ON (E.DEPT_CODE = D1.DEPT_ID)
  JOIN DEPARTMENT D2 ON (M.DEPT_CODE = D2.DEPT_ID);
--------------------------------------------------------------------------------
/*
    < ���� JOIN >
*/

-- ���, �����, �μ���, ���޸�, ������(LOCAL_NAME)
SELECT * FROM EMPLOYEE;     -- DEPT_CODE    JOB_CODE
SELECT * FROM DEPARTMENT;   -- DEPT_ID                  LOCAION_ID
SELECT * FROM JOB;          --              JOB_CODE
SELECT * FROM LOCATION;     --                          LOCAL_CODE

--> ����Ŭ ���뱸��
SELECT EMP_ID "���", EMP_NAME "�����", DEPT_TITLE "�μ���", JOB_NAME "���޸�", LOCAL_NAME "�ٹ�������"
  FROM EMPLOYEE E, DEPARTMENT, JOB J, LOCATION
 WHERE DEPT_CODE = DEPT_ID(+)
   AND LOCATION_ID = LOCAL_CODE(+)
   AND E.JOB_CODE = J.JOB_CODE(+);

--> ANSI ����
SELECT EMP_ID "���", EMP_NAME "�����", DEPT_TITLE "�μ���", JOB_NAME "���޸�", LOCAL_NAME "�ٹ�������"
  FROM EMPLOYEE
  LEFT JOIN JOB USING (JOB_CODE)
  LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
  LEFT JOIN LOCATION ON (LOCAL_CODE = LOCATION_ID);
--> ���� JOIN�� ���� ���� �߿�(LOCATION ���̺��� DEPARTMENT���� ���� ���εǸ� ����)

-- �����, �μ���, ���޸�, �ٹ�������, �ٹ�������, �޿����

SELECT * FROM EMPLOYEE;     -- DEPT_CODE    JOB_CODE                SALARY
SELECT * FROM DEPARTMENT;   -- DEPT_ID                  LOCATION_ID
SELECT * FROM LOCATION;     --                          LOCAL_CODE                      NATIONAL_CODE
SELECT * FROM JOB;          --              JOB_CODE
SELECT * FROM NATIONAL;     --                                                          NATIONAL_CODE
SELECT * FROM SAL_GRADE;    --                                      MIN_SAL, MAX_SAL

--> ANSI����
SELECT 
       E.EMP_NAME "�����",
       D.DEPT_TITLE "�μ���",
       J.JOB_NAME "���޸�",
       L.LOCAL_NAME "�ٹ�������",
       N.NATIONAL_NAME "�ٹ�������",
       S.SAL_LEVEL "�޿����"
  FROM
       EMPLOYEE E
  LEFT JOIN JOB J USING(JOB_CODE)
  LEFT JOIN DEPARTMENT D ON(DEPT_CODE = DEPT_ID)
  LEFT JOIN LOCATION L ON(LOCATION_ID = LOCAL_CODE)
  LEFT JOIN NATIONAL N USING(NATIONAL_CODE)
  LEFT JOIN SAL_GRADE S ON (E.SALARY BETWEEN MIN_SAL AND MAX_SAL);

---------------------- JOIN ���� �ǽ����� ----------------------
-- 1. ������ �븮�̸鼭 ASIA ������ �ٹ��ϴ� �������� ���, �����, ���޸�, �μ���, �ٹ�������, �޿��� ��ȸ�Ͻÿ�
-- 2. 70�����̸鼭 �����̰�, ���� ������ �������� �����, �ֹι�ȣ, �μ���, ���޸��� ��ȸ�Ͻÿ�
-- 3. �̸��� '��'�ڰ� ����ִ� �������� ���, �����, ���޸��� ��ȸ�Ͻÿ�
-- 4. �ؿܿ������� �ٹ��ϴ� �������� �����, ���޸�, �μ��ڵ�, �μ����� ��ȸ�Ͻÿ�
-- 5. ���ʽ��� �޴� �������� �����, ���ʽ�, ����, �μ���, �ٹ��������� ��ȸ�Ͻÿ�

-- 6. �μ��� �ִ� �������� �����, ���޸�, �μ���, �ٹ��������� ��ȸ�Ͻÿ�

-- 7. '�ѱ�' �� '�Ϻ�' �� �ٹ��ϴ� �������� �����, �μ���, �ٹ�������, �ٹ��������� ��ȸ�Ͻÿ�

-- 8. ���ʽ��� ���� �ʴ� ������ �� �����ڵ尡 J4 �Ǵ� J7 �� �������� �����, ���޸�, �޿��� ��ȸ�Ͻÿ�

-- 9. ���, �����, ���޸�, �޿����, ������ ��ȸ�ϴµ�
--    �� ��, ���п� �ش��ϴ� ����
--    �޿������ S1, S2 �� ��� '���'
--    �޿������ S3, S4 �� ��� '�߱�'
--    �޿������ S5, S6 �� ��� '�ʱ�' ���� ��ȸ�ǰ� �Ͻÿ�

-- 10. �� �μ��� �� �޿����� ��ȸ�ϵ� �� ��, �� �޿����� 1000���� �̻��� �μ���, �޿����� ��ȸ�Ͻÿ�

-- 11. �� �μ��� ��ձ޿��� ��ȸ�Ͽ� �μ���, ��ձ޿� (����ó��) �� ��ȸ�Ͻÿ� ��, �μ���ġ�� �ȵ� ������� ��յ� ���� �����Բ� �Ͻÿ�













