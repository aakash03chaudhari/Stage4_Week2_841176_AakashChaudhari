CREATE DATABASE IF NOT EXISTS menuitem_db;
CREATE DATABASE IF NOT EXISTS movie_db;


CREATE database IF NOT EXISTS  user_database;
 
create table if not exists  user_database.user (id int, active bit(1) , password varchar(255), roles varchar(255), user_name varchar(255) );

insert into user_database.user values(1, b'1', "admin", "ROLE_ADMIN", "admin");