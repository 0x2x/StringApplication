-- 1.

-- 2. What is the order id, shipping name and shipping address of all orders
-- shipped via "Federal Shipping"? HINT: Find the shipper id of "Federal
-- Shipping" in a subquery and then use that value to find the orders that
-- used that shipper
SELECT * FROM orders WHERE `ShipVia` = 3;

-- 3
SELECT OrderID INTO @OID FROM `orders` ORDER BY `OrderID` LIMIT 1;
SELECT * FROM `order details` WHERE `OrderID` = @OID AND `ProductID` = 34;
-- 34 


-- 4. What is the name of the employee that sold order 10266?
-- 5. What is the name of the customer that bought order 10266?
-- Commit and push your queries and send your repo to your Instructor!
-- 4 & 5
SELECT `EmployeeID`, `CustomerID` INTO @EID, @CID FROM orders WHERE `OrderID` = 10266;
-- 4
SELECT `FirstName` FROM employees WHERE `EmployeeID` = @EID;
-- 5
SELECT `ContactName` FROM customers WHERE `CustomerID` = @CID;