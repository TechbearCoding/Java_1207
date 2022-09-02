CREATE TABLE Users(
	firstName VARCHAR(20),
    lastName VARCHAR(20)
);


INSERT INTO Users (firstName, lastName)
VALUES ('Karlis', 'Jarans'),
	   ('Armands', 'Strauts');
       
       
SELECT * FROM Users;

SELECT lastName FROM Users;