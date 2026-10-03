-- # Write your MySQL query statement below
-- create table Person(
--     personId int primary key,
--     lastName varchar,
--     firstName varchar
-- );

-- create tale Address(
--     addressId int primary key,
--     personId int,
--     city varchar,
--     state varchar
-- );
-- select Person join Address where ...
SELECT 
    Person.firstName,
    Person.lastName,
    Address.city,
    Address.state
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;