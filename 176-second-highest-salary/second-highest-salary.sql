# Write your MySQL query statement below
SELECT MAX(salary) SecondHighestSalary From Employee where salary < (select max(salary) from Employee);