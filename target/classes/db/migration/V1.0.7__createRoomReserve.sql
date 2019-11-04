CREATE TABLE RoomReserve(
    room_id long primary key auto_increment,
    reserveDate         timestamp default current_timestamp,
    reserveDuration        decimal(19,2),
    roomid            int,
    reserveDesc     varchar(50),
    reservee        long

);