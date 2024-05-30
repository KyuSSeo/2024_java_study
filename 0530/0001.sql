show databases;
drop database if exists sampledb;
create database sampleDB;

use sampledb;

drop table if exists member;
create table member(
	id int not NULL auto_increment,
    name varchar(100) not null,
    passwd varchar(50) not null,
    primary key(id)
);

show tables;

desc member;

###

alter table member add phone varchar(100);
alter table member drop column phone;
alter table member change column passwd password varchar(6); 
desc member;



rename table member to student;
show tables;


insert into student values('1', '홍길동', '1234');
insert into student values('2', '성춘향', '5678');
insert into student values('3', '이몽룡', '9012');
insert into student values('4', '심청', '3456');

select * from student;
select * from student where id = 2;
select * from student order by password;
select * from student where name = '심청';

delete from student where id = 1;
update student set name = '관리자' where name = '성춘향';
select * from student; 

delete from student;
select * from student;





drop database if exists Exercisedb;
create database ExerciseDb;

use exercisedb;

create table if not exists student(
	num int not NULL,
    pwd varchar(20),
    depart varchar(20),
	name varchar (30),
    address varchar(50),
    phone varchar(20),
    email varchar(30),
    primary key (num)
    
);

show databases;

INSERT INTO STUDENT (num, pwd, depart, name, address, phone, email) VALUES (2018100001, '12', '모바일과', '홍길순', '서울시','010-9002-1234', 'a@naver.com');
INSERT INTO STUDENT (num, pwd, depart, name, address, phone, email) VALUES (2018100002, '34', '모바일과', '홍길동', '경기도','010-2009-4321', 'b@kangwon.ac.kr');
INSERT INTO STUDENT (num, pwd, depart, name, address, phone, email) VALUES (2018200001, 'q1', '영어과', '수여인', '인천시','010-3918-0007', 'c@gmail.com');
INSERT INTO STUDENT (num, pwd, depart, name, address, phone, email) VALUES (2018200002, 'a1', '영어과', '김다운', '서울시','010-3002-0101', 'd@daum.net');


select * from student;

select * from student where depart = '영어과';

update student set depart = '수학과' where depart = '영어과';
delete from student where depart = '모바일과';
