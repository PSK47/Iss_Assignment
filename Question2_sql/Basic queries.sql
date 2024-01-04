Use employee;
Use Department;
Use Project;
-- SELECT
SELECT * FROM employee;

-- DISTINCT
SELECT DISTINCT sex FROM employee;

-- WHERE
SELECT * FROM employee WHERE salary > 50000;

-- AND & OR
SELECT * FROM employee WHERE salary > 50000 AND department_number = 5;

-- ORDER BY
SELECT * FROM employee ORDER BY salary DESC;

-- UPDATE
UPDATE employee SET salary = 45000 WHERE department_number = 4;

-- DELETE
DELETE FROM employee WHERE salary < 30000;

-- SELECT TOP
SELECT * FROM employee ORDER BY salary DESC LIMIT 3;

-- LIKE & Wildcards
SELECT * FROM employee WHERE last_name LIKE 'W%';

-- IN
SELECT * FROM employee WHERE department_number IN (1, 3);

-- BETWEEN
SELECT * FROM employee WHERE salary BETWEEN 40000 AND 60000;

-- ALIASES
SELECT first_name AS FirstName, last_name AS LastName FROM employee;