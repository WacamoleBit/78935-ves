CREATE DATABASE IF NOT EXISTS saludos;
USE saludos;
CREATE USER 'manu'@'localhost' IDENTIFIED BY '123';
CREATE USER 'manu'@'%' IDENTIFIED BY '123';
GRANT ALL PRIVILEGE ON saludos.* to 'manu'@'localhost';
GRANT ALL PRIVILEGE ON saludos.* to 'manu'@'%';
FLUSH PRIVILEGES;