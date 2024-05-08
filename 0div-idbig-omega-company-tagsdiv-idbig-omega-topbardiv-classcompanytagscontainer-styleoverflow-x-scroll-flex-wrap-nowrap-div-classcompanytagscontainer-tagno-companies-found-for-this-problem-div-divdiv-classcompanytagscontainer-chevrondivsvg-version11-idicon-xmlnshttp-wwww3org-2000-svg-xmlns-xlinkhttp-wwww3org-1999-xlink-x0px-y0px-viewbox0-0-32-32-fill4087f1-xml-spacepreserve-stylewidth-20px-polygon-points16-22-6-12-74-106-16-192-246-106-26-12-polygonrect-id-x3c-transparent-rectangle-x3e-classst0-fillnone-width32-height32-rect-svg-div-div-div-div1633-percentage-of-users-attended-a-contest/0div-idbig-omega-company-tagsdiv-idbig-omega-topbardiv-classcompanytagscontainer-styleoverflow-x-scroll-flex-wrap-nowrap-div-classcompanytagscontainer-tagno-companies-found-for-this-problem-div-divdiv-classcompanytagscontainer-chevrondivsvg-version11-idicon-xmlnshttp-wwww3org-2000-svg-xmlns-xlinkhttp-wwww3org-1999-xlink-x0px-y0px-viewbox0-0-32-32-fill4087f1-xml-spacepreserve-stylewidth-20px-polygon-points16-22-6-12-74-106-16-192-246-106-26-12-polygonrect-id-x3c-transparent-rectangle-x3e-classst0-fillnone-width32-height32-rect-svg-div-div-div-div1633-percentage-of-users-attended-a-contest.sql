# Write your MySQL query statement below

SELECT contest_id, ROUND((COUNT(contest_id) / (SELECT COUNT(*) FROM Users)) * 100, 2) AS percentage
FROM Users u
RIGHT JOIN Register r
ON r.user_id = u.user_id
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC