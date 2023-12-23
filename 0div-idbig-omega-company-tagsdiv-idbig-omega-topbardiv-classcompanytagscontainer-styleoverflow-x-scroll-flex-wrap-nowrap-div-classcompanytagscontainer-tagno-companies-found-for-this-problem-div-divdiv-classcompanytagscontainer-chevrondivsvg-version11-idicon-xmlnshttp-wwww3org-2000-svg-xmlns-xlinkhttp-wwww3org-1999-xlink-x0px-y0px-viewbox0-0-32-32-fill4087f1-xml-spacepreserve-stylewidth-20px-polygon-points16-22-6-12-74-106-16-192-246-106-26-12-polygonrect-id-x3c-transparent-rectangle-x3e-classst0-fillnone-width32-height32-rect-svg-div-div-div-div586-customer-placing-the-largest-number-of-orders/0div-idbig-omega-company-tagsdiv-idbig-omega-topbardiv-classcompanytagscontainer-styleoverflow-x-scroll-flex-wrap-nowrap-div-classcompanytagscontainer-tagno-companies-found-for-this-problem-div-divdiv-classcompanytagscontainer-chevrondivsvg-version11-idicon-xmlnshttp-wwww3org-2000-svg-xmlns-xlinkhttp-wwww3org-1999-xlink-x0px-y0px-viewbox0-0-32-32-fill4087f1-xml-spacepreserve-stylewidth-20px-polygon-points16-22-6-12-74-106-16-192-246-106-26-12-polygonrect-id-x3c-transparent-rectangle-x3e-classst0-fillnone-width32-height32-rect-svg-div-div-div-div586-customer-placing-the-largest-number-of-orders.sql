SELECT y.customer_number 
FROM
(SELECT COUNT(customer_number) AS num, customer_number
        FROM Orders x
        GROUP BY (customer_number)
        ORDER BY num DESC) y
LIMIT 1;