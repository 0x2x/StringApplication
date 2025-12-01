-- Active: 1763490423544@@127.0.0.1@3306@cardealership
CREATE DATABASE IF NOT EXISTS cardealership;
USE cardealership;
CREATE TABLE dealerships (
	dealership_id    INT PRIMARY KEY AUTO_INCREMENT,
    name             VARCHAR(50),
    address          varchar(50),
    phone            varchar(12)
)

CREATE TABLE vehicles(
    -- This is how we will trace it back using VIN
    VIN         int PRIMARY KEY, 
    sold        BOOLEAN,
    carType     VARCHAR(10),
    carColor    VARCHAR(10),
    carName     VARCHAR(10),
    carPrice    DOUBLE
)

-- (track which dealership has the vehicle)
CREATE TABLE inventory(
    dealership_id INT,
    VIN INT
)

CREATE TABLE sales_contracts(
    id INT PRIMARY KEY AUTO_INCREMENT,
    dealership_id INT,
    VIN INT,
    sale_date DATE,
    FOREIGN KEY(dealership_id) REFERENCES dealerships(dealership_id),
    FOREIGN KEY(VIN) REFERENCES vehicles(VIN)
)
