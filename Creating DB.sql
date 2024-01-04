/*Creating employee Table*/
create table employee
(first_name varchar(15),
mid_name char(2),
last_name varchar(15),
SSN_number char(9),
Birthday date,
Address varchar(50),
Sex char(1),
Salary BIGINT(7),
Supervisor_SSN char(9),
Department_Number BIGINT(5));
/*Creating department Table*/
create table department
(Department_Name Varchar(15),
Department_Number BIGINT(5),
ManagerSSN Char(9),
ManageStartDate date);
/*Creating project Table*/
create table project
(Project_Name Varchar(15),
Project_Number BIGINT(5),
Project_Location Varchar(15),
Department_number BIGINT(5));
/*Inserting data in employee table*/
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Doug','E','Gilbert',554433221,'09-JUN-60','11 S 59E,Salt Lake
City,UT','M',80000,'',3);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Joyce','','PAN',543216789,'07-FEB-78','35 S 18E,Salt Lake
City,UT','F',70000,'',2);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Frankin','T','Wong',333445555,'08-DEC-45','638
Voss,Houston,TX','M',40000,'554433221',5);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Jennifer','S','Wallace',987654321,'20-JUN-31','291 Berry
Bellaire,TX','F',43000,'554433221',4);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('John','B','Smith',123456789,'09-JAN-55','731 Fondren
Houston,TX','M',30000,'333445555',5);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Ramesh','K','Narayan',666884444,'15-SEP-52','975 Fire Oak
Humble,TX','M',38000,'333445555',5);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Joyce','A','English',453453453,'31-JUl-62','5631 Rice
Houston,TX','F',25000,'333445555',5);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('James','E','Borg',888665555,'10-NOV-27','450 Stone
Houston,TX','M',55000,'543216789',1);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Alicia','J','Zelaya',999887777,'19-JUL-58','3321 Castle
Spring,TX','F',25000,'987654321',4);
insert into
employee(first_name,mid_name,last_name,ssn_number,birthday,address,sex,salary,supervisor_ssn,department_number) values ('Ahmad','V','Jabbar',987987987,'29-MAR-59','980 Dallas
Houston,TX','M',25000,'987654321',4);
/*Inserting Data in department Table*/
insert into department(department_name,department_number,managerssn,managestartdate)
values('Manufacture',1,888665555,'19-JUN-71');
insert into department(department_name,department_number,managerssn,managestartdate)
values('Administration',2,543216789,'04-JAN-99');
insert into department(department_name,department_number,managerssn,managestartdate)
values('Headquarter',3,554433221,'22-SEP-55');
insert into department(department_name,department_number,managerssn,managestartdate)
values('Finance',4,98764321,'01-JAN-85');
insert into department(department_name,department_number,managerssn,managestartdate)
values('Research',5,333445555,'22-MAY-78');
/*Inserting Data in Project Table*/
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectA',3388,'Houston',1);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectB',1945,'Salt Lake City',3);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectC',6688,'Houston',5);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectD',2423,'Bellaire',4);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectE',7745,'Sugarland',5);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectF',1566,'Salt Lake City',3);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectG',1234,'New York',2);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectH',3467,'Stafford',4);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectI',4345,'Chicago',1);
insert into project_(project_name,project_number,project_location,department_number)
values('ProjectJ',2212,'San Francisco',2);
