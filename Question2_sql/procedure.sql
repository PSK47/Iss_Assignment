Use empolyee;

DELIMITER //
CREATE PROCEDURE DisplayDatabase()
BEGIN
    SELECT * FROM employee;
END //
DELIMITER ;
