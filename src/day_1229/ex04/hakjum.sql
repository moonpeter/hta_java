drop table hakjum purge;

create table hakjum(
    lowccore    number(3),
    hiscore     number(5, 2),
    grade       varchar2(3) primary key
);

insert into hakjum
values (0, 59.99, 'F');
insert into hakjum
values (60, 64.99, 'D0');
insert into hakjum
values (65, 69.99, 'D+');
insert into hakjum
values (70, 74.99, 'C0');
insert into hakjum
values (75, 79.99, 'C+');
insert into hakjum
values (80, 84.99, 'B0');
insert into hakjum
values (85, 89.99, 'B+');
insert into hakjum
values (90, 94.99, 'A0');
insert into hakjum
values (95, 100, 'A+');

select * from hakjum;

drop table student purge;
create table student(
    NO             NUMBER primary key,  -- 기본키
    NAME           VARCHAR2(21) not null, -- not null
    KOR            NUMBER(3) check ( KOR between 0 and 100) not null, -- 0~100 사이의 값, not null
    MATH           NUMBER(3) check ( MATH between 0 and 100) not null, -- 0~100 사이의 값,not null
    ENG            NUMBER(3) check ( ENG between 0 and 100) not null, -- 0~100 사이의 값,not null
    TOT            NUMBER(3),
    AVG            NUMBER(5,2),
    GRADE          VARCHAR2(3) references hakjum(GRADE)
);

create sequence student_seq
    start with 1
    increment by 1;
