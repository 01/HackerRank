SELECT DISTINCT CITY
FROM STATION
WHERE SUBSTRING(CITY, CHAR_LENGTH(CITY), 1)= 'A' OR SUBSTRING(CITY, CHAR_LENGTH(CITY), 1)= 'E' OR SUBSTRING(CITY, CHAR_LENGTH(CITY),1 )= 'I' OR SUBSTRING(CITY, CHAR_LENGTH(CITY),1 )= 'O' OR
SUBSTRING(CITY, CHAR_LENGTH(CITY),1)= 'U'