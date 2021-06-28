create table `item`
(
    id    int auto_increment primary key,
    name  varchar(256) not null,
    price int          not null
);

create table `order`
(
    id int auto_increment primary key
);