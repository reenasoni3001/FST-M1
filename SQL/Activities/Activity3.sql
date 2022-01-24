CREATE TABLE salesman (
    salesman_Id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    comission int
);

DESCRIBLE salesman;


INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;    

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;
ACTIVITY 3
Solution queries:

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';
SELECT salesman_id, comission FROM salesman WHERE salesman_name='Paul Adam';