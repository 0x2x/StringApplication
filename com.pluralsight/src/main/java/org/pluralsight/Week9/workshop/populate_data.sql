USE cardealership;
-- generating dealerships
INSERT INTO dealerships(name, address, phone) VALUES (
    "The best dealership ever",
    "187th murda block",
    "911"
)


INSERT INTO dealerships(name, address, phone) VALUES ( "The best dealership ever",
    "an okay dealership"
    "26th block",
    "111"
)

-- generating cars
INSERT INTO vehicles(VIN, sold, `carType`, `carColor`, `carName`, `carPrice`) VALUES
(0002, FALSE, "Ford", "black", "mustang", 75000),
(0003, TRUE, "Toyota", "white", "camry", 32000),
(0004, FALSE, "Honda", "blue", "civic", 28000),
(0005, TRUE, "Chevrolet", "red", "corvette", 88000),
(0006, FALSE, "BMW", "black", "m3", 99000),
(0007, FALSE, "Mercedes", "silver", "c300", 56000),
(0008, TRUE, "Audi", "gray", "a4", 47000),
(0009, FALSE, "Nissan", "white", "altima", 26000),
(0010, TRUE, "Tesla", "blue", "model 3", 540);

-- populating inventory
INSERT INTO inventory(dealership_id, `VIN`) VALUES 
(1,0002), -- dealership_id, `VIN`
(2,0003), -- dealership_id, `VIN`
(1,0004), -- dealership_id, `VIN`
(2,0005),-- dealership_id, `VIN`
(2,0006), -- dealership_id, `VIN`
(1,0007), -- dealership_id, `VIN`
(1,0008), -- dealership_id, `VIN`
(2,0009), -- dealership_id, `VIN`
(2,0010); -- dealership_id, `VIN`


-- sales_contracts
INSERT INTO sales_contracts (dealership_id, VIN, sale_date) VALUES
(1,2, '2025-01-01'),
(2,3, '2025-01-02'),
(2,4, '2025-01-03'),
(1,5, '2025-01-04'),
(2,6, DATE(NOW()));

