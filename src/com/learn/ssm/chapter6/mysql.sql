create database chapter6;

use chapter6;

-- create table t_role (
-- id int(12) auto_increment,
-- role_name varchar(60) not null,
-- note varchar(256) null,
-- primary key(id)
-- );
--
-- insert into t_role(role_name, note) values('role_name_1', 'note_1');
-- insert into t_role(role_name, note) values('role_name_2', 'note_2');
-- insert into t_role(role_name, note) values('role_name_3', 'note_3');
--
-- alter table t_role add column role_no int(12) not null after id;

create table t_role (
id int(12) auto_increment,
role_no int(12) not null,
role_name varchar(60) not null,
note varchar(256) null,
primary key(id)
);

insert into t_role(role_no, role_name, note) values('1', 'role_name_1', 'note_1');
insert into t_role(role_no, role_name, note) values('2', 'role_name_2', 'note_2');
insert into t_role(role_no, role_name, note) values('3', 'role_name_3', 'note_3');