create sequence hibernate_sequence start 1 increment 1;
create table crypto (id int8 not null, amount float8 not null, primary key (id));
create table real_states (id int8 not null, amount float8 not null, primary key (id));
insert into crypto values (nextval('hibernate_sequence'),200.0);
insert into real_states values (nextval('hibernate_sequence'),200.0);