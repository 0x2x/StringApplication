-- 1
SELECT products.ProductID, products.`UnitPrice`, products.`CategoryID`  FROM products LEFT JOIN categories ON categories.`CategoryID` = products.`CategoryID`;
 -- 2
SELECT products.`ProductName`, products.`ProductID`, products.`UnitPrice`, products.`SupplierID` FROM products INNER JOIN suppliers ON suppliers.`SupplierID` = products.`SupplierID` WHERE products.`UnitPrice` > 75;
-- 3
SELECT 
    products.`ProductID`, products.`ProductName`, products.`UnitPrice`, products.`CategoryID`, products.`SupplierID` 
FROM products 
INNER JOIN suppliers 
ON suppliers.`SupplierID` = products.`ProductID`
INNER JOIN categories ON categories.`CategoryID` = products.`CategoryID`;

