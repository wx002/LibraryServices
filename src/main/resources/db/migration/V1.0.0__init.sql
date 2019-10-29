CREATE TABLE books(
    bookID  int primary key auto_increment,
    isbn varchar(20), --No clue what max number should be?
    title   varchar(40),
    author varchar(20),
    copies int
/*    genreID int,
    pubYear DATE
*/
);

