# Write your MySQL query statement below
DELETE p
FROM Person p
JOIN (
    SELECT p1.id
    FROM Person p1
    JOIN Person p2 ON p1.email = p2.email
    WHERE p1.id != p2.id AND p1.id > p2.id
) temp ON p.id = temp.id;