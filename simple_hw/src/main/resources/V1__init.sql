create table students
(
    id   bigint       not null auto_increment,
    fullName varchar(255) not null,
    mark int          not null,
    primary key (id)
);