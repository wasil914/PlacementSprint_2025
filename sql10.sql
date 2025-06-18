--Find total scores and no. of customers for each country 
SELECT 
	SUM(score) AS total_score,
	COUNT(id) AS Cust,
	country
FROM customers
GROUP BY country 