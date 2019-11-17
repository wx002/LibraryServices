CREATE TABLE Book_Reservation(
    b_resID int primary key auto_increment,
    bookisbn integer,
    username varchar(40));

insert into book_reservation(bookisbn, username)
    values(9780756404079, 'testUserName');
    
insert into book_reservation(bookisbn, username)
    values(9780756404079, 'UserName');
