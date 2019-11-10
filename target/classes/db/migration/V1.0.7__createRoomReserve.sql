CREATE TABLE RoomReserve(
    room_id long primary key auto_increment,
    reserveDate         DATE,
    reserveStart         TIME,
    reserveEnd          TIME,
    roomid            int,
    reserveDesc     varchar(50),
    reservee        long

);