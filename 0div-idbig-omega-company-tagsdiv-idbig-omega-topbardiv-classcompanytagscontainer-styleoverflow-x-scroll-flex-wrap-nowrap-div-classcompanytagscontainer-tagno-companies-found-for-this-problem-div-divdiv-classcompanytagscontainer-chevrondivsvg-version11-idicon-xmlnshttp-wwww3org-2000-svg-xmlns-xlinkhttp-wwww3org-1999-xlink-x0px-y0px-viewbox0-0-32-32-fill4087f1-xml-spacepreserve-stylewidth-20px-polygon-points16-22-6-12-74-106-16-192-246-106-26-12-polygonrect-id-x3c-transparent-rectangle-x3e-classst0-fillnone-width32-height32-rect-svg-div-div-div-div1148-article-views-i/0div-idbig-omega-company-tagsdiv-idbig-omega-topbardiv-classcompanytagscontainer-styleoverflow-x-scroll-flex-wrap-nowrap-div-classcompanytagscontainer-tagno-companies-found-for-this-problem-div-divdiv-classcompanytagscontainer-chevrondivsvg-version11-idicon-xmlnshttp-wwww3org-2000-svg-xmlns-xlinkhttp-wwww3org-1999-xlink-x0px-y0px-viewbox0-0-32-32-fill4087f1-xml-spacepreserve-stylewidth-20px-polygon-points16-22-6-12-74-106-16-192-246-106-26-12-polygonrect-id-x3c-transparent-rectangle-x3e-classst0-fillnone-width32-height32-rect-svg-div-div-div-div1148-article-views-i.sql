# Write your MySQL query statement below
# SELECT DISTINCT author_id as id
# FROM Views
# WHERE author_id = viewer_id
# ORDER BY id


SELECT DISTINCT v1.author_id as id
FROM Views v1
JOIN Views v2
ON v1.author_id = v1.viewer_id
ORDER BY id