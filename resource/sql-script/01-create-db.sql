
CREATE DATABASE IF NOT EXISTS  `web_employee`;
USE `web_employee`;

DROP TABLE `employee`;
CREATE TABLE IF NOT EXISTS `employee`(

`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`first_name` VARCHAR (36),
`last_name` VARCHAR (48),
`company` VARCHAR (48)

)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;