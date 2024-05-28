SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID where e2.salary>e1.salary
