## Домашнее задание №19

### Читаем про рефлексию
 * Читаем
   * Философия Java 4-е издание, Брюс Эккель. **Глава 14, Глава 20**.
 * Ресурсы:
   + [Ссылка #1](http://tutorials.jenkov.com/java-reflection/index.html)
   + [Ссылка #2](http://www.quizful.net/post/annotations-in-java)
   + [Ссылка #3](https://habrahabr.ru/company/golovachcourses/blog/217595/)
 * Дополнительно смотрим:
   + Dynamic class reloading
   + Generics
   + Arrays
   + Proxies

### Доделываем предыдущую домашку

### *Маленькое задание на работу с аннотациями
 * Пишем приложение, которое умеет сохранять обьекты классов в базу данных с помощью рефлексии. Для этого:
   * Создайте аннотации `@ToTable`(область дейтсвия - класс) в которой необходимо указывать имя таблицы для маппинга.
   * Создайте аннотацию `@ToColumn`(область действия - поле класса) в которой необходимо указывать имя колонки для поля. Поддерживать необходимо только поля
   типа `int` и `String`/
   * Создайте класс который умеет сохранить объекты аннотированных классов.
 * Пример:
    ```
      @ToTable("persons")
      class Person {
        @ToColumn("id")
        private int id;
        @ToColumn("first_name")
        private String modelName;
        @ToColumn("last_name")
        private String manufacturer;

        ... // сеттеры и геттеры для полей
      }

      main() {
        Person person = new Person();

        ReflectioPersistent rf = new ReflectioPersistent();
        rf.store(person); // запись в базу в таблицу persons
      }
    ```

#### * для тех, у кого все готово