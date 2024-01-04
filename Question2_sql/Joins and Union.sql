Use empolyee;
Use Department;

/*Inner Join*/
SELECT employee.emp_id, employee.first_name, employee.last_name, department.department_name
FROM employee
INNER JOIN department ON employee.department_number = department.department_id;

/*Left Join*/
SELECT employee.emp_id, employee.first_name, employee.last_name, department.department_name
FROM employee
LEFT JOIN department ON employee.department_number = department.department_id;

/*Right Join*/
SELECT employee.emp_id, employee.first_name, employee.last_name, department.department_name
FROM employee
RIGHT JOIN department ON employee.department_number = department.department_id;

/*Full join*/
SELECT employee.emp_id, employee.first_name, employee.last_name, department.department_name
FROM employee
FULL JOIN department ON employee.department_number = department.department_id;

/*Union*/
SELECT first_name AS name FROM employee
UNION
SELECT department_name AS name FROM department;