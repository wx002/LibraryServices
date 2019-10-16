CREATE TABLE BooksByGenre(
    genreID int primary key auto_increment,
    isbn    int,
    genreTitle varchar(30)
);

CREATE TABLE BooksByAuthor(
    authorID int primary key auto_increment,
    isbn    int,
    authName varchar(50),
    litType  varchar(20)
);

CREATE TABLE BooksByAuthor(
    pubYear int primary key,
    isbn    int primary key,
    pub varchar(50),
);

CREATE TABLE books(
    bookID  int,
    isbn int,
    title   char,
    authorID int,
    genreID int,
    pubYear DATE
);