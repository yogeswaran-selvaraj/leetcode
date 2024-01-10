# Write your MySQL query statement below
SELECT DISTINCT v1.author_id AS id
FROM Views v1
JOIN Views v2
ON v1.author_id = v1.viewer_id
ORDER BY id