/*
    < JOIN >
    
    두 개 이상의 테이블에서 데이터를 같이 조회하고자 할 때 사용하는 구문
    조회 결과는 하나의 RESULT SET으로 옴
    
    관계형 데이터베이스에서는 최소한의 데이터로 각각의 테이블에 데이터를 보관하고 있음(이상방지, 중복을최소화하기위해서)
    => JOIN구문을 이용해서 여러개의 테이블 간 "관계"를 맺어서 같이 조회해야 함
    => 단, 무작정 JOIN을 이용해서 조회하는것이 아니라
     테이블 간의 "연결고리"에 해당하는 컬럼을 매칭시켜서 조회해야 함
     
     JOIN은 크게 "오라클 전용구문"과 "ANSI(미국국립 표준협회)구문"으로 나뉜다.
            오라클 전용구문        |       ANSI(오라클 + 다른 DBMS) 구문
    ============================================================================
            등가조인              |     내부조인(INNER JOIN) -> JOIN USING/ON
            (EQUQAL JOIN)        |     외부조인(OUTER JOIN) -> JOIN USING
    ----------------------------------------------------------------------------
            포괄조인              |     왼쪽 외부조인 (LEFT OUTER JOIN)
            (LEFT OUTER)         |     오른쪽 외부조인 (RIGHT OUTER JOIN)
            (RIGHT OUTER)        |     전체 외부조인 (FULL OUTER JOIN) => 오라클에서는 불가
    ----------------------------------------------------------------------------
     카테시안 곱(CARTESIAN PRODUCT)|     교차조인(CROSS JOIN)
     ---------------------------------------------------------------------------
            자체조인(SELF JOIN)
            비등가조인(NON EQUAL JOIN)
*/

-- 전체 사원들의 사번, 사원명, 부서코드, 부서명까지 조회
SELECT EMP_ID, EMP_NAME, DEPT_CODE
  FROM EMPLOYEE;
  
SELECT DEPT_ID, DEPT_TITLE
  FROM DEPARTMENT;

-- 전체 사원들의 사번, 사원명, 직급코드, 직급명까지 조회
SELECT EMP_ID, EMP_NAME, JOB_CODE
  FROM EMPLOYEE;

SELECT JOB_CODE, JOB_NAME
  FROM JOB;

--> JOIN을 통해서 연결고리에 해당하는 컬럼만 매칭시킨다면 마치 하나의 결과물인것처럼 조회 가능
--------------------------------------------------------------------------------
/*
    1. 등가조인(EQUAL JOIN) / 내부조인(INNER JOIN)
    연결시키는 컬럼의 값이 일치하는 행들만 조인되서 조회( == 일치하지않는 값들을 조회에서 제외)
*/

--> 오라클 전용 구문
-- FROM절에 조회하고자하는 테이블들을 나열(,로)
-- WHERE 절에 매칭시킬 컬럼명(연결고리)에 대한 조건을 제시함

-- 전체 사원들의 사번, 사원명, 부서코드, 부서명 같이 조회
-- 1) 연결할 두 컬럼명이 다른 경우 (EMPLOYEE - "DEPT_CODE" / DEPARTMENT - "DEPT_ID")
SELECT EMP_ID, EMP_NAME, DEPT_CODE, DEPT_ID, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE = DEPT_ID;
--> 일치하지 않는 값은 조회에서 제외된것을 확인 가능
-- DEPT_CODE가 NULL값이었던 2명의 사원데이터는 조회가 안됨, DEPT_ID가 D3, D4, D7인 부서데이터는 조회 X
 
-- 사번, 사원명, 직급코드, 직급명
-- 2) 연결할 두 컬럼명이 같은 경우(EMPLOYEE - "JOB_CODE" / JOB - "JOB_CODE")
/*
SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME
  FROM EMPLOYEE, JOB
 WHERE JOB_CODE = JOB_CODE;
 */
 -- ambiguously : 애매하다, 모호하다 => 확실하게 어떤테이블의 컬럼인지를 다 명시해줘야함

-- 방법 1. 테이블명을 이용하는 방법
SELECT EMP_ID, EMP_NAME, EMPLOYEE.JOB_CODE, JOB.JOB_CODE, JOB_NAME
  FROM EMPLOYEE, JOB
 WHERE EMPLOYEE.JOB_CODE = JOB.JOB_CODE;

-- 방법 2. 테이블의 별칭 사용 ( 각 테이블마다 별칭 부여 가능)
SELECT EMP_ID, EMP_NAME, E.JOB_CODE, J.JOB_CODE, JOB_NAME
  FROM EMPLOYEE E, JOB J
 WHERE E.JOB_CODE = J.JOB_CODE;


-->> ANSI 구문
-- FROM 절에 기준 테이블을 하나 기술 한 뒤
-- 그 뒤에 JOIN절에서 같이 조회하고자하는 테이블 기술( 매칭시킬 컬럼에 대한 조건도 같이 기술)
-- USING / ON 구문

-- 사번, 사원명, 부서코드, 부서명
-- 1) 연결할 두 컬럼명이 다른 경우 (EMPLOYEE - "DEPT_CODE" / DEPARTMENT - "DEPT_ID")
-- 무조건 ON구문만 가능(USING구문 사용불가능 XXXXXXXXXXXXXXXXXXXXXXXX)
SELECT EMP_ID, EMP_NAME, DEPT_CODE, DEPT_TITLE
  FROM EMPLOYEE
 /*INNER*/ JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID); -- INNER 생략 가능
 
-- 사번, 사원명, 직급코드, 직급명
-- 2) 연결할 두 컬럼명이 같은 경우( EMPLOYEE - "JOB_CODE" / DEPARTMENT - "JOB_CODE")
-- ON, USING
-- 2_1) ON구문 이용  : AMBIGUOUSLY가 발생할 수 있으니 확실히 명시해야함!!
SELECT EMP_ID, EMP_NAME, E.JOB_CODE, JOB_NAME
  FROM EMPLOYEE E
  JOIN JOB J ON (E.JOB_CODE = J.JOB_CODE);

-- 2_2) USING구문 이용 : AMBIGUOUSLY 발생 X, 동일한 컬럼명 하나만 써주면 알아서 매칭시켜줌
SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME
  FROM EMPLOYEE
  JOIN JOB USING (JOB_CODE);

-- NATURAL JOIN(자연조인)
 SELECT EMP_ID, EMP_NAME, JOB_CODE, JOB_NAME
   FROM EMPLOYEE
NATURAL JOIN JOB;
-- 두 개의 테이블만 제시한 상태, 운좋게도 두 개의 테이블에 일치하는 컬럼이 유일하게 한 개 존재한다!!(JOB_CODE)= > 매칭을 알아서 해줌

-- 추가적인 조건을 제시 가능
-- 직급이 대리인 사원들의 정보 조회

-- > 오라클 전용 구문
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
       JOB_NAME = '대리';


-- > ANSI 구문
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
       JOB_NAME = '대리';
       
       
----------------------------- 실습 문제 -----------------------------
-- 1. 부서가 '인사관리부'인 사원들의 사번, 사원명, 보너스를 조회
-- 오라클
SELECT EMP_ID, EMP_NAME, BONUS
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_TITLE = '인사관리부'
   AND DEPT_CODE = DEPT_ID;
-- ANSI
SELECT EMP_ID, EMP_NAME, BONUS
  FROM EMPLOYEE
  JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
 WHERE DEPT_TITLE = '인사관리부';
-- 2. 부서가 '총무부'가 아닌 사원들의 사원명, 급여, 입사일을 조회
-- 오라클
SELECT EMP_NAME, SALARY, HIRE_DATE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_TITLE != '총무부'
   AND DEPT_CODE = DEPT_ID;
-- ANSI
SELECT EMP_NAME, SALARY, HIRE_DATE
  FROM EMPLOYEE
  JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
 WHERE DEPT_TITLE != '총무부';
-- 3. 보너스를 받는 사원들의 사번, 사원명, 보너스, 부서명 조회
-- 오라클
SELECT EMP_NO, EMP_NAME, BONUS, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE = DEPT_ID
   AND BONUS IS NOT NULL;
-- ANSI
SELECT EMP_NO, EMP_NAME, BONUS, DEPT_TITLE
  FROM EMPLOYEE
  JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
 WHERE BONUS IS NOT NULL;
-- 4. 아래의 두 테이블을 참고해서 부서코드, 부서명, 지역코드, 지역명(LOCAL_NAME) 조회
SELECT * FROM DEPARTMENT;   -- LOCATION_ID   
SELECT * FROM LOCATION;     -- LOCAL_CODE
-- 오라클
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, LOCAL_NAME
  FROM DEPARTMENT, LOCATION
 WHERE LOCATION_ID = LOCAL_CODE;
 
-- ANSI
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, LOCAL_NAME
  FROM DEPARTMENT
  JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE);

-- 등가조인 / 내부조인 : 일치하지 않는 행들은 애초에 조회되지 않음

--------------------------------------------------------------------------------

/*
    2. 포괄조인 / 외부조인 (OUTER JOIN)

    테이블 간의 JOIN 시 일치하지 않는 행도 포함시켜서 조회 가능
    단, 반드시 LEFT / RIGHT를 지정해야함 (기준이 되는 테이블을 지정해야 함)
*/

-- "전체" 사원들의 사원명, 급여, 부서명 조회
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE
  JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);
-- DEPT_CODE가 NULL인 두 명의 사원은 조회 X
-- 부서에 배정된 사원이 없는 부서(D3, D4, D7)같은 경우 조회 X

-- 1) LEFT [ OUTER ] JOIN : 두 테이블 중 왼편에 기술된 테이블을 기준으로 JOIN
--                          뭐가 되었든간에 왼편에 기술된 테이블의 데이터는 무조건 조회되게 한다.(일치하지 않더라도)
--> ANSI구문
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE 
  LEFT /*OUTER*/ JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);
--> EMPLOYEE 테이블을 기준으로 조회했기 때문에 EMPLOYEE에 존재하는 데이터는 뭐가 되었든간에 조회되게끔 한다.

--> 오라클 전용 구문
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE = DEPT_ID(+);
--> 내가 기준으로 삼을 테이블의 컬럼명이 아닌 반대 테이블의 컬럼명에 (+)를 붙여준다.

-- 2) RIGHT [ OUTER ] JOIN : 두 테이블 중 오른편에 기술된 테이블을 기준으로 JOIN
--                          뭐가 되었든 간에 오른편에 기술된 데이터는 무조건 조회되게 한다.
--> ANSI구문
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE
  RIGHT OUTER JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

--> 오라클 전용 구문
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE(+) = DEPT_ID;

-- 3) FULL [ OUTER ] JOIN : 두 테이블이 가진 모든 행을 조회할 수 있음

--> ANSI구문
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE
  FULL OUTER JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID);

--> 오라클 구문 ( 오라클 구문에서는 사용 불가 )
SELECT EMP_NAME, SALARY, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT
 WHERE DEPT_CODE(+) = DEPT_ID(+);
--------------------------------------------------------------------------------

/*
    3. 카테시안 곱(CARTESIAN PRODUCT) / 교차조인 (CROSS JOIN)
    모든 테이블의 각 행들이 서로서로 매핑된 데이터가 조회됨(곱집합)


    두 테이블의 행들이 모두 곱해진 행들의 조합 출력 => 방대한 데이터 출력 => 과부하의 위험
*/
-- 사원명, 부서명
--> 오라클 전용구문
SELECT EMP_NAME, DEPT_TITLE
  FROM EMPLOYEE, DEPARTMENT; --> 23 * 9 => 207개 행 조회

-- ANSI구문
SELECT EMP_NAME, DEPT_TITLE
  FROM EMPLOYEE
 CROSS JOIN DEPARTMENT;
-------------------------------------------------------------------------------------------------
/*
    4. 비등가 조인(NON EQUAL JOIN)
    '=' 기호를 사용하지 않는 조인문

*/
-- 사원명, 급여
SELECT EMP_NAME, SALARY
  FROM EMPLOYEE;
  
SELECT * FROM SAL_GRADE;

-- 사원명, 급여, 급여등급(SAL_LEVEL)
SELECT EMP_NAME, SALARY, SAL_GRADE.SAL_LEVEL
  FROM EMPLOYEE, SAL_GRADE
 WHERE SALARY >= MIN_SAL AND SALARY <= MAX_SAL;

-- ANSI구문(ON구문)
SELECT EMP_NAME, SALARY, SAL_GRADE.SAL_LEVEL
  FROM EMPLOYEE
  JOIN SAL_GRADE ON(SALARY BETWEEN MIN_SAL AND MAX_SAL);
--------------------------------------------------------------------------------

/*
    5. 자체 조인(SELF JOIN)
    같은 테이블을 다시 한 번 조인하는 경우
    자기 자신의 테이블과 다시 조인을 맺는 경우
*/

SELECT EMP_ID "사원 사번", EMP_NAME "사원명", SALARY "사원 급여", MANAGER_ID "사수 사번"
  FROM EMPLOYEE;

SELECT * FROM EMPLOYEE; -- 사원에 대한 정보 도출용 테이블 MANAGER_ID
SELECT * FROM EMPLOYEE; -- 사수에 대한 정보 도출용 테이블 EMP_ID --> 사수명, 사수 급여

-- 사원 사번, 사원명, 사원 부서코드, 사원 급여
-- 사수 사번, 사수명, 사수 부서코드, 사수 급여
--> 오라클 전용 구문
SELECT E.EMP_ID "사원 사번", E.EMP_NAME "사원명", E.DEPT_CODE "사원 부서코드", E.SALARY "사원 급여",
       M.EMP_ID "사수 사번", M.EMP_NAME "사수명", M.DEPT_CODE "사수 부서코드", M.SALARY "사수 급여"
  FROM EMPLOYEE E, EMPLOYEE M
 WHERE E.MANAGER_ID = M.EMP_ID(+);

--> ANSI
SELECT E.EMP_ID "사원 사번", E.EMP_NAME "사원명", E.DEPT_CODE "사원 부서코드", E.SALARY "사원 급여",
       M.EMP_ID "사수 사번", M.EMP_NAME "사수명", M.DEPT_CODE "사수 부서코드", M.SALARY "사수 급여"
  FROM EMPLOYEE E
  LEFT JOIN EMPLOYEE M ON (E.MANAGER_ID = M.EMP_ID);

SELECT E.EMP_ID "사원 사번", E.EMP_NAME "사원명", D1.DEPT_TITLE "사원 부서명", E.SALARY "사원 급여",
       M.EMP_ID "사수 사번", M.EMP_NAME "사수명", D2.DEPT_TITLE "사수 부서명", M.SALARY "사수 급여"
  FROM EMPLOYEE E
  LEFT JOIN EMPLOYEE M ON (E.MANAGER_ID = M.EMP_ID)
  JOIN DEPARTMENT D1 ON (E.DEPT_CODE = D1.DEPT_ID)
  JOIN DEPARTMENT D2 ON (M.DEPT_CODE = D2.DEPT_ID);
--------------------------------------------------------------------------------
/*
    < 다중 JOIN >
*/

-- 사번, 사원명, 부서명, 직급명, 지역명(LOCAL_NAME)
SELECT * FROM EMPLOYEE;     -- DEPT_CODE    JOB_CODE
SELECT * FROM DEPARTMENT;   -- DEPT_ID                  LOCAION_ID
SELECT * FROM JOB;          --              JOB_CODE
SELECT * FROM LOCATION;     --                          LOCAL_CODE

--> 오라클 전용구문
SELECT EMP_ID "사번", EMP_NAME "사원명", DEPT_TITLE "부서명", JOB_NAME "직급명", LOCAL_NAME "근무지역명"
  FROM EMPLOYEE E, DEPARTMENT, JOB J, LOCATION
 WHERE DEPT_CODE = DEPT_ID(+)
   AND LOCATION_ID = LOCAL_CODE(+)
   AND E.JOB_CODE = J.JOB_CODE(+);

--> ANSI 구문
SELECT EMP_ID "사번", EMP_NAME "사원명", DEPT_TITLE "부서명", JOB_NAME "직급명", LOCAL_NAME "근무지역명"
  FROM EMPLOYEE
  LEFT JOIN JOB USING (JOB_CODE)
  LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
  LEFT JOIN LOCATION ON (LOCAL_CODE = LOCATION_ID);
--> 다중 JOIN할 때는 순서 중요(LOCATION 테이블이 DEPARTMENT보다 먼저 조인되면 오류)

-- 사원명, 부서명, 직급명, 근무지역명, 근무국가명, 급여등급

SELECT * FROM EMPLOYEE;     -- DEPT_CODE    JOB_CODE                SALARY
SELECT * FROM DEPARTMENT;   -- DEPT_ID                  LOCATION_ID
SELECT * FROM LOCATION;     --                          LOCAL_CODE                      NATIONAL_CODE
SELECT * FROM JOB;          --              JOB_CODE
SELECT * FROM NATIONAL;     --                                                          NATIONAL_CODE
SELECT * FROM SAL_GRADE;    --                                      MIN_SAL, MAX_SAL

--> ANSI구문
SELECT 
       E.EMP_NAME "사원명",
       D.DEPT_TITLE "부서명",
       J.JOB_NAME "직급명",
       L.LOCAL_NAME "근무지역명",
       N.NATIONAL_NAME "근무국가명",
       S.SAL_LEVEL "급여등급"
  FROM
       EMPLOYEE E
  LEFT JOIN JOB J USING(JOB_CODE)
  LEFT JOIN DEPARTMENT D ON(DEPT_CODE = DEPT_ID)
  LEFT JOIN LOCATION L ON(LOCATION_ID = LOCAL_CODE)
  LEFT JOIN NATIONAL N USING(NATIONAL_CODE)
  LEFT JOIN SAL_GRADE S ON (E.SALARY BETWEEN MIN_SAL AND MAX_SAL);

---------------------- JOIN 종합 실습문제 ----------------------
-- 1. 직급이 대리이면서 ASIA 지역에 근무하는 직원들의 사번, 사원명, 직급명, 부서명, 근무지역명, 급여를 조회하시오
-- 2. 70년대생이면서 여자이고, 성이 전씨인 직원들의 사원명, 주민번호, 부서명, 직급명을 조회하시오
-- 3. 이름에 '형'자가 들어있는 직원들의 사번, 사원명, 직급명을 조회하시오
-- 4. 해외영업팀에 근무하는 직원들의 사원명, 직급명, 부서코드, 부서명을 조회하시오
-- 5. 보너스를 받는 직원들의 사원명, 보너스, 연봉, 부서명, 근무지역명을 조회하시오

-- 6. 부서가 있는 직원들의 사원명, 직급명, 부서명, 근무지역명을 조회하시오

-- 7. '한국' 과 '일본' 에 근무하는 직원들의 사원명, 부서명, 근무지역명, 근무국가명을 조회하시오

-- 8. 보너스를 받지 않는 직원들 중 직급코드가 J4 또는 J7 인 직원들의 사원명, 직급명, 급여를 조회하시오

-- 9. 사번, 사원명, 직급명, 급여등급, 구분을 조회하는데
--    이 때, 구분에 해당하는 값은
--    급여등급이 S1, S2 인 경우 '고급'
--    급여등급이 S3, S4 인 경우 '중급'
--    급여등급이 S5, S6 인 경우 '초급' 으로 조회되게 하시오

-- 10. 각 부서별 총 급여합을 조회하되 이 때, 총 급여합이 1000만원 이상인 부서명, 급여합을 조회하시오

-- 11. 각 부서별 평균급여를 조회하여 부서명, 평균급여 (정수처리) 로 조회하시오 단, 부서배치가 안된 사원들의 평균도 같이 나오게끔 하시오













