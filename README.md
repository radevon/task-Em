<h1 align="center">Проект SPRING MVC + Security + MyBatis с PostgreSQL</h1>

## Перед запуском:
- На сервере PostgreSql выполнить инструкции из файла <a href="https://github.com/radevon/task-Em/tree/main/sql/initsql.sql">initsql.sql</a>
- Будут созданы 3 таблицы: **Users, Texts, Comments**
- Настройки поддключения программы если нужно поменять в <a href="https://github.com/radevon/task-Em/blob/main/src/main/webapp/WEB-INF/jdbc.properties">jdbc.properties</a>
- В браузере должны быть разрешены Cookies (уже не обязательно после добавления security)

## Функционал
- Страница Авторизации (ввод логина и пароля - на тестовых данных одинаковые)
- После авторизации страница выводит список Статей, и под каждой статьей можно оставить комментарий от имени авторизованного пользователя.
- Пользователь может удалить только свой оставленный комментарий
- по адресу из браузера доступно для примера Api контроллера <a href="https://github.com/radevon/task-Em/blob/main/src/main/java/com/beloil/spring/controller/UserApiController.java">UserApiController.java</a>
(протестировать можно через Postman или Insomnia)

## Не реализовано, но планировалось
- реализация ролей и добавление jwt, для скрытия api
