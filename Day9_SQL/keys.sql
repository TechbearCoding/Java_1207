CREATE DATABASE Library;

ALTER DATABASE Library CHARACTER SET utf8 COLLATE utf8_latvian_ci;

CREATE TABLE Authors(
	AuthorId INT AUTO_INCREMENT,
    AuthorName VARCHAR(20) NOT NULL,
    AuthorLastName VARCHAR(20) NOT NULL,
    Description VARCHAR(200),
    PRIMARY KEY(AuthorId)
);


CREATE TABLE Books (
	BookId int AUTO_INCREMENT,
    BookName varchar(255) NOT NULL,
    Description VARCHAR(200),
    AuthorId INT NOT NULL,
    PRIMARY KEY(BookId),
    FOREIGN KEY (AuthorId) REFERENCES Authors(AuthorId)
);


INSERT INTO Authors(AuthorName, AuthorLastName, Description)
VALUES("Deivids", "Morels", "Action gramatu autors"),
	  ("Aleksandrs", "Grīns", "LV Grīns, ne tas otrs");

SELECT * FROM Authors;

INSERT INTO Books(BookName, Description, AuthorId)
VALUES ("Rozes brālība", "Action grāmatas apraksts", 1),
	   ("Akmens brālība", "Vēl viens apraksts", 1),
       ("Dvēseļu putenis", "1. pk un strēlnieki", 2);

SELECT Authors.AuthorName, Authors.AuthorLastName, Books.BookName
FROM Authors, Books
WHERE Authors.AuthorId = Books.AuthorId;

CREATE TABLE Genres(
	GenreID int auto_increment,
    GenreName varchar(20),
    PRIMARY KEY(GenreID)
);

INSERT INTO Genres(GenreName)
VALUES ("Žanrs1"),
	   ("Žanrs2"),
       ("Žanrs3");


ALTER TABLE Books
ADD GenreID int NOT NULL;

UPDATE Books
SET GenreID = 1
WHERE BookId = 1 OR BookId = 2;

UPDATE Books
SET GenreId = 2
WHERE BookId = 3;

ALTER TABLE Books
ADD FOREIGN KEY (GenreID) REFERENCES Genres(GenreID);


