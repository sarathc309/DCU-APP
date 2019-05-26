	/*create table users(
user_name varchar(255) not null,
password varchar(255) not null,
uid integer(5) not null,
date_created timestamp not null,
date_updated timestamp not null,
primary key(uid)
);


create table user_info(
uid integer(5) not null,
first_name varchar(255) not null,
last_name varchar(255) not null,
e_mail varchar(255) not null,
phone_no integer(10) not null,
ssn integer(9) not null,
date_created timestamp not null,
date_updated timestamp not null,
foreign key (uid) references users(uid) 
); 


create table account(
acct_cd varchar(3) not null,
acct_name varchar(255) not null,
date_created timestamp not null,
date_updated timestamp not null,
primary key (acct_cd)
);

create table account_details(
acct_cd varchar(3) not null,
acct_no integer(10) not null,
uid integer(5) not null,
balance double not null,
date_created timestamp not null,
date_updated timestamp not null,
primary key(acct_no),
foreign key(uid) references users(uid),
foreign key(acct_cd) references account(acct_cd)
);

create table acct_reporting(
acct_cd varchar(3) not null,
acct_no integer(10)not null,
amount double not null,
memo varchar(255) not null,
trans_type varchar(255) not null,
foreign key(acct_no) references account_details(acct_no),
foreign key(acct_cd) references account(acct_cd)
);*/


CREATE SEQUENCE acct_num
  MINVALUE 1000001
  MAXVALUE 9999999
  START WITH 1000001
  INCREMENT BY 1
  CACHE 20;






insert into users(user_name,password,uid,date_created,date_updated)
values('nbehara','Rockz520',10510,sysdate(),sysdate());
insert into users(user_name,password,uid,date_created,date_updated)
values('spolu','Rockz510',10511,sysdate(),sysdate());

insert into user_info(users_uid,first_name,last_name,e_mail,phone_no,ssn,
date_created,date_updated)
values(10510,'Naga','Behara','sarathc309@gmail.com',3617200552,123456789
,sysdate(),sysdate());
insert into user_info(users_uid,first_name,last_name,e_mail,phone_no,ssn,
date_created,date_updated)
values(10511,'Mounica','Polu','spolu@gmail.com',3625467895,987654321,
sysdate(),sysdate());

insert into account(acct_cd,acct_name,date_created,date_updated)
values('CHK','CHECKINGS ACCOUNT',sysdate(),sysdate());

insert into account(acct_cd,acct_name,date_created,date_updated)
values('SAV','SAVINGS ACCOUNT',sysdate(),sysdate());
/*
insert into account_balance(acct_no,balance,date_created,date_updated)
values(2450000510,5590.56,sysdate(),sysdate());
insert into account_balance(acct_no,balance,date_created,date_updated)
values(7280000511,10000.56,sysdate(),sysdate());

insert into account_statement(acct_no,amount,trans_type,memo,date_created,date_updated)
values(7280000511,5000.00,'Deposit','transfer from xyz',sysdate(),sysdate());

insert into account_statement(acct_no,amount,trans_type,memo,date_created,date_updated)
values(2450000510,100.00,'Transfer','bill pay',sysdate(),sysdate());

*/





