CREATE TABLE books(
    bookID  int primary key auto_increment,
    isbn varchar(20), --No clue what max number should be?
    title   varchar(40),
    copies int,
    author_id long
);

