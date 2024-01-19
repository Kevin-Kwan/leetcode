SELECT act1.machine_id, ROUND(AVG(act2.timestamp-act1.timestamp),3) as processing_time 
FROM Activity act1 JOIN Activity act2 ON act1.machine_id=act2.machine_id
WHERE act1.activity_type='start' AND act2.activity_type='end'
GROUP BY act1.machine_id
