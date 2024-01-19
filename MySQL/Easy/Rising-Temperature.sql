SELECT weather1.id
FROM Weather weather1, Weather weather2
WHERE DATEDIFF(weather1.recordDate, weather2.recordDate) = 1
AND weather1.temperature > weather2.temperature
