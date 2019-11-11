CREATE TABLE Room_Reserve(
    roomstat_id long primary key auto_increment,
    reserve_start    timestamp,
    reserve_end      timestamp,
    roomid          int,
    reserve_desc     varchar(50),
    reservee        long
);