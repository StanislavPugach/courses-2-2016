## Домашнее задание №25

### Изучаем инструменты для сборки java проектов
 * Ant
   * [Оф. сайт](http://ant.apache.org/)
   * [Jenkov, ant](http://tutorials.jenkov.com/ant/ant-tutorial.html)
 * Maven
   * [Оф. сайт](https://maven.apache.org/)
   * [Jenkov, maven](http://tutorials.jenkov.com/maven/maven-tutorial.html)
   * [Spring project](http://spring-projects.ru/guides/maven/)
 * Gradle
   * [Оф. сайт ](https://gradle.org/)
   * [Jenkov, gradle](http://tutorials.jenkov.com/gradle/gradle-tutorial.html)
   * [Habr](https://habrahabr.ru/post/167227/)

### Добавляем интеграцию с ant, maven и gradle в [ДЗ #18](https://github.com/rxn1d/courses-2-2016/blob/master/module18/module_18_home_work.md)
 * Необходимо создать и настроить build файлы для:
   * Ant (build.xml)
   * Maven (pom.xml)
   * Gradle (build.gradle)
 * Каждый из этих интструментов должен уметь билдить(собирать) проект. Билд должен состоять из таких шагов:
   * Очистка результатов предыдущего билда.
   * Компилирование исходников.
   * Создание war файла.
   * Запуск tomcat с созданным war-файлом.
 * Эти действия могут быть выполнены одно или несколькими командами, не важно. Главное, чтобы был требуемые результат.

 \*Такая конфигурация билда позволит вам автоматизировать и ускорить процесс построения и поднятия web-приложения.
