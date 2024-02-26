SELECT Employee.name, bonus FROM Employee LEFT JOIN Bonus ON Employee.empID = Bonus.empID WHERE bonus<1000 or bonus is NULL
