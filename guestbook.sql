create table guestbook(
	seq integer auto_increment primary key,
	user_id varchar(10) not null,
	title varchar(50) not null,
	content varchar(200) not null,
	reg_date datetime not null default now(),
	read_count integer not null default 0
);

select * from guestbook where seq = 3;
select * from guestbook g left join reply r on g.seq = r.seq where g.seq=5;
drop table reply;
create table reply(
	reply_seq integer auto_increment primary key,
	reply_content varchar(100) not null,
	reply_date datetime not null default now(),
	gb_seq integer not null,
	foreign key (gb_seq) references guestbook(seq)
);

select * from reply;
delete from reply;






