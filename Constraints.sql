Use empolyee;
/*Adding Constraint in employee table using Alter*/
alter table employee MODIFY first_name Varchar(15) NOT NULL;
alter table employee MODIFY Last_name Varchar(15) NOT NULL;
alter table employee ADD CONSTRAINT con_pk PRIMARY KEY(SSN_Number);
alter table employee ADD CONSTRAINT con_s CHECK (Sex in ('M','F','m','f'));
ALTER TABLE employee
ALTER COLUMN salary SET DEFAULT 800;
alter table employee ADD CONSTRAINT con_sfk FOREIGN KEY(Supervisor_SSN)REFERENCES
employee(SSN_number) on DELETE SET NULL;
alter table employee ADD CONSTRAINT con_efk FOREIGN KEY
(Department_Number)REFERENCES
dept(Department_number) on DELETE CASCADE;
