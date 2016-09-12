## Домашнее задание №16

### Ресурсы
* Транзакционность
  * Tutorialspoint - [ссылка](http://www.tutorialspoint.com/sql/sql-transactions.htm)
  * MySQL - [ссылка](http://dev.mysql.com/doc/refman/5.7/en/commit.html)
* Читаем про JDBC
  * Jenkov Tutorial - [ссылка](http://tutorials.jenkov.com/jdbc/index.html)
  * Tutorialspoint - [ссылка](http://www.tutorialspoint.com/jdbc/jdbc-quick-guide.htm)
* JOIN'ы
  * Wikipedia - [ссылка](https://en.wikipedia.org/wiki/Join_(SQL))
  * Joins Explained - [ссылка](http://www.sql-join.com/)
  * w3schools
    + Joins - [ссылка](http://www.w3schools.com/sql/sql_join.asp)
    + Inner Join - [ссылка](http://www.w3schools.com/sql/sql_join_inner.asp)
    + Left Join - [ссылка](http://www.w3schools.com/sql/sql_join_left.asp)
    + Right Join - [ссылка](http://www.w3schools.com/sql/sql_join_right.asp)
    + Full Join - [ссылка](http://www.w3schools.com/sql/sql_join_full.asp)
* Хранимые процедуры
  * MySQL - [ссылка](https://dev.mysql.com/doc/connector-net/en/connector-net-tutorials-stored-procedures.html)
  * TutsPlus - [ссылка](http://code.tutsplus.com/articles/an-introduction-to-stored-procedures-in-mysql-5--net-17843)

### Пишем приложение для создание адресной книги
 * Приложение должно быть основанно на базе данных из [ДЗ #15](https://github.com/rxn1d/courses-2-2016/blob/master/module15/module_15_home_work.md).
 * Приложение должно быть написанно с помощью графической библиотеки Swing.
 * Приложение должно состоять из:
   * Главного окна.
   * Текстовых инпутов, позволяющих ввести данные о человеке (`first_name`, `last_name`) и его адресе (`address`).
   * Кнопки, которая позволяет сохранить введенные данные в базу.
   * Кнопки, которая позволяет вывести данные о человеке из БД по его `id`.
   * Полей, которые отображают данные о прочитанном человеке.

   ![](https://github.com/rxn1d/courses-2-2016/blob/master/module16/db.png "Application")