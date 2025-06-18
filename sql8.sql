-- Retrieve all the customers and sort the results by the country & then by the highest score.
SELECT *
FROM customers
ORDER BY 
	country ASC,
	score DESC