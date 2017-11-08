create table USER_INFO
(
	ID varchar(40) not null
		primary key,
	ACCOUNT varchar(40) null,
	USER_NAME varchar(40) null,
	AGE int null,
	PASSWORD varchar(40) null,
	CREATE_USER varchar(40) null,
	UPDATE_USER varchar(40) null,
	CREATE_DATE date null,
	UPDATE_DATE date null,
	VERSION int default '0' null
)
;

