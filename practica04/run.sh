#!/bin/sh
/etc/init.d/mysql start
/etc/init.d/mysql -u root < script.sql
/usr/bin/java -jar practica04-0.0.1-SNAPSHOT