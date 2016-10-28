SELECT * FROM (
  SELECT CONCAT(name, '(', SUBSTRING(occupation, 1, 1), ')')
  FROM occupations
  ORDER BY name ASC
) temp1
UNION
SELECT * FROM (
  SELECT concat('There are total ', count(*), ' ', LOWER(occupation), 's.')
  FROM occupations
  GROUP BY occupation
  ORDER BY COUNT(*)
) temp2