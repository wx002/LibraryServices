CREATE TABLE fee(
    fee_id         int primary key auto_increment,
    fee             decimal(19,4),
    feedate         timestamp default current_timestamp,
    feedesc            varchar(50),
    user_id         long,
    feetype         varchar(7)

);

insert into fee(fee, feedesc, user_id, feetype) values (3.00, 'Broken book', 1, 'REPAIR');

insert into fee(fee, feedesc, user_id, feetype) values (1.50, 'Late Return', 1, 'LATE');