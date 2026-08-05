# Write your MySQL query statement below
select e.name, b.bonus
from Employee as e
Left Join 
Bonus as b
on e.empId = b.empId
where b.bonus is null OR
b.bonus<1000;
