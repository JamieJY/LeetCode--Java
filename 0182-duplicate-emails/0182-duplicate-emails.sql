# Write your MySQL query statement belows
select distinct(t1.email) as Email 
from Person t1
join Person t2 
on t1.email = t2.email and t1.id != t2.id;