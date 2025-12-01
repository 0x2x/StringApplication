1. How many suppliers are there? Use a query!
    SELECT COUNT(*) FROM northwind.suppliers; - 29

2. What is the sum of all the employee's salaries?
    SELECT SUM(salary) FROM employees; - 20362.929931640625

3. What is the price of the cheapest item that Northwind sells?
    SELECT MIN(`UnitPrice`) FROM products; - 2.5000

4. What is the average price of items that Northwind sells?
    SELECT AVG(`UnitPrice`) FROM products; - 28.86636364
5. What is the price of the most expensive item that Northwind sells?
   SELECT MAX(`UnitPrice`) FROM products; - 263.5000

6. What is the supplier ID of each supplier and the number of items they
supply? You can answer this query by only looking at the Products table.
    SELECT `SupplierID`, COUNT(`ProductName`) FROM products GROUP BY `SupplierID`;

7. What is the category ID of each category and the average price of each item
in the category? You can answer this query by only looking at the Products
table.
SELECT CategoryId, AVG(`UnitPrice`) FROM products GROUP BY `CategoryID`;

8. For suppliers that provide at least 5 items to Northwind, what is the
supplier ID of each supplier and the number of items they supply? You
can answer this query by only looking at the Products table.
SELECT `SupplierID`, COUNT(`ProductID`) FROM products WHERE `ProductID` >= 5 GROUP BY `SupplierID`;


9. List the product id, product name, and inventory value (calculated by
multiplying unit price by the number of units on hand). Sort the results in
descending order by value. If two or more have the same value, order by
product name.
SELECT `ProductID`, `ProductName`, UnitsInStock * `UnitPrice` AS InventoryValue FROM products ORDER BY InventoryValue DESC, `ProductName` ASC;

