# Write your MySQL query statement below


select e1.unique_id, e2.name from Employees as e2
Left Join EmployeeUNI as e1
on e1.id = e2.id;