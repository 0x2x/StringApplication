SELECT COUNT(*) FROM northwind.suppliers;
SELECT SUM(salary) FROM employees;
SELECT MIN(`UnitPrice`) FROM products;
SELECT AVG(`UnitPrice`) FROM products;
SELECT MAX(`UnitPrice`) FROM products;
SELECT `SupplierID`, COUNT(`ProductName`) FROM products GROUP BY `SupplierID`;
SELECT CategoryId, AVG(`UnitPrice`) FROM products GROUP BY `CategoryID`;
SELECT `SupplierID`, COUNT(`ProductID`) FROM products WHERE `ProductID` >= 5 GROUP BY `SupplierID`;
SELECT `ProductID`, `ProductName`, UnitsInStock * `UnitPrice` AS InventoryValue FROM products ORDER BY InventoryValue DESC, `ProductName` ASC;