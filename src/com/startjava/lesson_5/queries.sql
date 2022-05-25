SELECT *
FROM jaegers;

SELECT *
FROM jaegers
WHERE status != 'Destroyed';

SELECT *
FROM jaegers
WHERE mark = 'Mark-1'
   OR mark = 'Mark-3';

SELECT *
FROM jaegers
ORDER BY mark DESC;

SELECT *
FROM jaegers
WHERE launch = (SELECT MAX(launch) FROM jaegers);

SELECT *
FROM jaegers
WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers)
   OR kaijukill = (SELECT MIN(kaijukill) FROM jaegers);

SELECT AVG(weight) AveregeWeight
FROM jaegers;

UPDATE jaegers
SET kaijukill = kaijukill + 1
WHERE status != 'Destroyed';

DELETE
FROM jaegers
WHERE status = 'Destroyed';