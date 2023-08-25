CREATE database db_fonyou;

use  db_fonyou;


CREATE TABLE student(
id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR(150) NOT NULL,
age int NOT NULL,
city VARCHAR(150) NOT NULL
);


CREATE TABLE exam(
id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
student  MEDIUMINT NOT NULL,
score MEDIUMINT ,
FOREIGN KEY (student) REFERENCES student(id)
);

CREATE TABLE question(
id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
description_q VARCHAR(150) NOT NULL,
option_a VARCHAR(150) NOT NULL,
option_b VARCHAR(150) NOT NULL,
option_c VARCHAR(150) NOT NULL,
option_d VARCHAR(150) NOT NULL,
correct_option VARCHAR(150) NOT NULL
);

CREATE TABLE question_exam(
id MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_question MEDIUMINT NOT NULL,
id_exam MEDIUMINT NOT NULL,
option_selected  VARCHAR(150)
);


SELECT * FROM student;
SELECT * FROM question;
SELECT * FROM question_exam;
SELECT * FROM exam;


drop table question_exam;
drop table student;
drop table question;
drop table exam;
