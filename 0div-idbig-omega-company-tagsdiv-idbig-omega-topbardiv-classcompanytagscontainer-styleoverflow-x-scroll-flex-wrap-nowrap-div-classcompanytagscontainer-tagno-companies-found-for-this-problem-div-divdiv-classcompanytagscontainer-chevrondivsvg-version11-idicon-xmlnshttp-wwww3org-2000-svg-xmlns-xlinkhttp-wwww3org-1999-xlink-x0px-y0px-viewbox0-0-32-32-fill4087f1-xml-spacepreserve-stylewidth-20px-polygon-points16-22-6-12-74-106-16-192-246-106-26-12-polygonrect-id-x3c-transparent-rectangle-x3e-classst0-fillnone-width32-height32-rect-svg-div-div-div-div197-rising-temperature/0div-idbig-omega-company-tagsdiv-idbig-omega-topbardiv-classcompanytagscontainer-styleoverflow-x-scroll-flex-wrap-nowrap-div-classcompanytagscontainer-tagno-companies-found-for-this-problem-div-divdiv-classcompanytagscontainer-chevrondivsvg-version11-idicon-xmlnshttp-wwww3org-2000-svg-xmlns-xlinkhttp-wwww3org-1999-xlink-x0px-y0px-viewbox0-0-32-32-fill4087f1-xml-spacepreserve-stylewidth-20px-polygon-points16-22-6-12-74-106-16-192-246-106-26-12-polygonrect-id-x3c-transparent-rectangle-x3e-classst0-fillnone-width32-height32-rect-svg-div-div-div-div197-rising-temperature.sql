# # Write your MySQL query statement below
# SELECT 
#     w2.id
# FROM 
#     Weather w1, Weather w2
# WHERE 
#     DATEDIFF(w2.recordDate, w1.recordDate) = 1 
# AND 
#     w2.temperature > w1.temperature;
    
    SELECT 
    w1.id
FROM 
    Weather w1
WHERE 
    w1.temperature > (
        SELECT 
            w2.temperature
        FROM 
            Weather w2
        WHERE 
            w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
    );