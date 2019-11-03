CREATE TABLE transactions(
    transaction_id long primary key auto_increment,
    transactiondate         timestamp default current_timestamp,
    bookID        long,
    userid      long,
    itemstatus  varchar(4)

);

insert into transactions(bookID, userid, itemStatus) values(1, 1, 'RSRV');
insert into transactions(bookID, userid, itemStatus) values(2, 2, 'RSRV');