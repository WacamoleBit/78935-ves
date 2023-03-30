CREATE USER 'manu'@'localhost' IDENTIFIED BY '123'
CREATE USER 'manu'@'127.0.01' IDENTIFIED BY '123'
GRANT ALL PRIVILEGE ON saludos.* to 'manu'@'localhost';
GRANT ALL PRIVILEGE ON saludos.* to 'manu'@'127.0.0.1';
FLUSH PRIVILEGES;