SELECT Product.product_name, year, Sales.price
FROM Sales LEFT JOIN Product ON Sales.product_id = Product.product_id;
