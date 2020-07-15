--------------------- 
### Question 1:

##### a. Question b , c & d will based on the following table schema:
	• order_id NUMBER
	• customer_name VARCHAR
	• order_date DATE
	• quantity NUMBER

##### b. Please write a SQL query to search for the latest order with quantity larger than X.
ans: ` SELECT * FROM orders where quantity > 10 group BY order_date DESC limit 1;`

##### c. Please write a SQL query to list down for each customer how many orders they have made respectively. 
ans:  `SELECT order_id,customer_name, COUNT(*) as 'total_order_count' FROM orders GROUP BY customer_name ORDER BY order_date DESC;`
			
##### d. Please write a SQL query to look for the customer who has made the orders more than X of times from Y date onwards.
ans:  ```SELECT order_id, customer_name, order_date, count(*) FROM orders 
	  where order_date > 'Y' 
	  GROUP BY customer_name having count(*) > X;```
	  
      	  Replace X and Y accordingly;  for ex: X = 10, Y = 2000-01-01 00:00:00

-------------------------
