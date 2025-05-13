
CREATE DATABASE IF NOT EXISTS financedb;
USE financedb;
CREATE TABLE IF NOT EXISTS investments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    amount DOUBLE,
    returns DOUBLE
);
