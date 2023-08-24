### 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee(
id SERIAL PRIMARY KEY,
name VARCHAR(50),
birthday DATE,
email VARCHAR(100)
);

### 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak veri ekleyelim.
insert into employee (id, name, birthday, email) values (1, 'Ambrose Brill', '2000-08-10', 'abrill0@sciencedaily.com');

### 3. Sütunların her birine göre diğer sütunları güncelleyecek UPDATE işlemi yapalım.
UPDATE employee
SET name = 'Elif Mutlu'
WHERE id = 1
RETURNING *;  

UPDATE employee
SET birthday = '1985-03-20'
WHERE email = 'vtadd1@nba.com'
RETURNING *;  

UPDATE employee
SET email = 'hello@gmail.com'
WHERE email = 'vtadd1@nba.com'
RETURNING *;  

### 4. Sütunların her birine göre ilgili satırı silecek DELETE işlemi yapalım.
DELETE FROM employee
WHERE name ='Elif Mutlu';

DELETE FROM employee
WHERE name = 'Bellina Jewks' AND birthday = '1992-04-18';

DELETE FROM employee
WHERE email = 'hello@gmail.com';

DELETE FROM employee
WHERE id >5
RETURNING *;