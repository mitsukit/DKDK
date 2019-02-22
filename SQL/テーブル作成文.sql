CREATE TABLE user_table(
user_id	int AUTO_INCREMENT NOT NULL,
user_pass	varchar(50) NOT NULL,
user_nickname	varchar(50) NOT NULL,
user_area	varchar(50) NOT NULL,
user_income	int  NOT NULL,
user_school	varchar(50) NOT NULL,
user_gender	varchar(50) NOT NULL,
user_age	int NOT NULL,
user_height	int NOT NULL,
user_body	varchar(50) NOT NULL,
user_job	varchar(50) NOT NULL,
user_holiday	varchar(50) NOT NULL,
user_cigar	varchar(50) NOT NULL,
user_child	varchar(50) NOT NULL,
user_free	varchar(50) NOT NULL,
user_pic	int NOT NULL,
PRIMARY KEY(user_id)
);
