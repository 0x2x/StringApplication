USE  cardealership;


-- 1 query
SELECT * FROM cardealership.dealerships;

-- 2 
SELECT v.VIN, v.carType, v.carColor
FROM cardealership.vehicles as v
INNER JOIN cardealership.inventory as i
ON v.VIN = i.VIN;

-- 3
SELECT * FROM inventory WHERE `VIN` = 0002;
-- 4
SELECT Did.dealership_id, Did.address, Did.name, Did.phone
FROM dealerships as Did
INNER JOIN cardealership.inventory as i
ON Did.dealership_id = i.dealership_id WHERE i.`VIN` = 3;

-- 5
SELECT i.dealership_id, c.`carName` , c.`VIN`, c.`carColor`
FROM vehicles 
AS c
INNER JOIN cardealership.inventory as i
ON c.`VIN` = i.`VIN` WHERE `carName` = "mustang"
;


-- 6
SELECT S.id, S.`VIN`, S.sale_date, S.dealership_id
FROM cardealership.sales_contracts
AS S
INNER JOIN cardealership.dealerships as D
ON D.dealership_id = S.dealership_id WHERE S.sale_date ='2025/01/04'
AND S.dealership_id = 1;

