# # Write your MySQL query statement below

# SELECT contest_id, ROUND((COUNT(contest_id) / (SELECT COUNT(*) FROM Users)) * 100, 2) AS percentage
# FROM Users u
# RIGHT JOIN Register r
# ON r.user_id = u.user_id
# GROUP BY contest_id
# ORDER BY percentage DESC, contest_id ASC

SELECT 
    r.contest_id,
    ROUND(COUNT(DISTINCT r.user_id) * 100 / total_users.total_count, 2) AS percentage
FROM 
    Register r
CROSS JOIN(
    SELECT COUNT(DISTINCT user_id) AS total_count FROM Users
) AS total_users
GROUP BY 
    r.contest_id
ORDER BY percentage DESC, r.contest_id ASC