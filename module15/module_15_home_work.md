## Домашнее задание №15

### Читаем и разбираемся с базами
 * Ресусры:
   * Ресурсы из [модуля 14](https://github.com/rxn1d/courses-2-2016/blob/master/module14/module_14_home_work.md)
   * Книги
     * Head First SQL Your Brain on SQL - A Learner's Guide By Lynn Beighley - [ссылка](http://shop.oreilly.com/product/9780596526849.do)
 * С чем нужно быть знакомым
   * Что такое база данных
   * Какие они бывают
   * DDL
   * DML
   * CRUD операции
   * MySQL
   * Нормализация

### Устанавливаем [MySQL Community Edition (GPL)](http://dev.mysql.com/downloads/) (это сервер)

### Устанавливаем любой SQL клиент ([Heidi](http://www.heidisql.com/), [DBeaver](http://dbeaver.jkiss.org/), [My SQL Workbench](http://dev.mysql.com/downloads/workbench/), [DataGrip](https://www.jetbrains.com/datagrip/) и т.д.)
 * **Все запросы, которые вы будете использовали для этого задания добавляйтся в файл [people.sql](https://github.com/rxn1d/courses-2-2016/blob/master/module15/src/main/resources/people.sql)**.
 * Создаем базу данных `people`.
 * В ней создаем 2 таблицы
   * `person`
     * `id` (целый тип, первичный ключ)
     * `first_name` (строковый тип)
     * `last_name` (строковый тип)
     * `address_id` (целый тип, внешний ключ на таблицу address)

      | id | first_name | last_name | address_id |
      | ---| ---   | ---       | ---        |
   * `address`
     * `id` (целый тип, первичный ключ)
     * `address` (строковый тип)

      | id | address |
      | ---| ---     |
 * Создаем тестовые данные в обоих таблицах
   * Создаем 10 записей в таблице `address` с помощью SQL `INSERT`:

     | id | address |
     | ---| ---     |
     |1|Ap #999-6608 Felis, St.|
     |2|8403 In Road|
     |3|4895 Dolor. Road|
     |4|233-3092 Sem Av.|
     |5|Ap #258-8948 At, Rd.|
     |6|2911 Nec, Rd.|
     |7|7886 Proin St.|
     |8|Ap #314-418 Lorem Av.|
     |9|Ap #821-4665 Lorem, Rd.|
     |10|Ap #650-4921 Aptent Ave|


   * Создаем 15ть записей в таблице `person` c помощью SQL `INSERT` запросов

     | id | first_name | last_name | address_id |
     | ---| ---     | ---  | ---     |
     |1   |Vincent|Keith|1|
     |2|Fritz|Bray|2|
     |3|Lyle|Patterson|3|
     |4|Holmes|Hardy|4|
     |5|Cody|Larson|5|
     |6|Gary|Ellis|6|
     |7|Victor|Jensen|7|
     |8|Galvin|Freeman|8|
     |9|Jack|Foley|9|
     |10|Christian|Torres|10|
     |11|Peter|Haney|3|
     |12|Cameron|Barry|2|
     |13|Aladdin|Barnett|9|
     |14|Lionel|Soto|1|
     |15|Preston|Trujillo|1|

 * Играем с SQL и пишем запросы, которые умеют:
   * Найти всех людей с именем, которое начинается на `G`
   * Найти все адреса `id` которых больше 10
