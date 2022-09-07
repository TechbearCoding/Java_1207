CREATE TABLE Authors(
	AuthorId INT AUTO_INCREMENT,
    AuthorName VARCHAR(20) NOT NULL,
    AuthorLastName VARCHAR(20) NOT NULL,
    PRIMARY KEY(AuthorId)
);


CREATE TABLE Books (
	BookId int AUTO_INCREMENT,
    BookName varchar(255) NOT NULL,
    PRIMARY KEY(BookId)
);


INSERT INTO Authors(AuthorName, AuthorLastName)
VALUES("Test1", "Test1"),
	  ("Test2", "Test2"),
      ("Test3", "Test3"),
	  ("Test4", "Test4");


INSERT INTO Books(BookName)
VALUES ("Rozes brālība"),
	   ("Akmens brālība"),
       ("Dvēseļu putenis");

CREATE TABLE AuthorsBooks(
	AuthorId INT NOT NULL,
    BookId INT NOT NULL,
	FOREIGN KEY (AuthorId) REFERENCES Authors(AuthorId),
    FOREIGN KEY (BookId) REFERENCES Books(BookId)
);

INSERT INTO AuthorsBooks (AuthorId, BookId)
VALUES (1,2),
	   (2,2),
       (2,1),
       (3,1),
       (4,3);
       
SELECT Authors.AuthorName, Authors.AuthorLastName, Books.BookName
FROM Authors
INNER JOIN AuthorsBooks
ON Authors.AuthorId = AuthorsBooks.AuthorId
INNER JOIN Books
ON Books.BookId = AuthorsBooks.BookId
WHERE Books.BookName = 'Akmens brālība'
ORDER BY BookName ASC;

