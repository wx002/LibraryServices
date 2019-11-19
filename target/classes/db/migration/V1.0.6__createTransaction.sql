CREATE TABLE transactions(
    transaction_id long primary key auto_increment,
    transactiondate         timestamp default current_timestamp,
    isbn        long,
    userid      long,
    itemstatus  varchar(4)

);

insert into transactions(bookID, userid, itemStatus) values(0747532699, 1, 'RSRV');
insert into transactions(bookID, userid, itemStatus) values(9780756404079, 2, 'RSRV');
