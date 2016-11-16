CREATE DATABASE `final_project_db`;

USE `final_project_db`;

CREATE TABLE `person`
(
  `id`   BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `name` VARCHAR(128)                      NOT NULL
);

INSERT INTO `person` (`name`) VALUE ('Test Name');