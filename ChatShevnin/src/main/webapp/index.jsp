<%@ page contentType="text/html; charset=UTF-8" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>chat</title>
  </head>
  <body>
  <h3>Чат</h3>SberbakReboot<br>
<form action="main" method="post">
    <table>
        <tr><th>Имя:</th><th><input type="text" name="login"></th></tr>
        <tr><th>Пароль:</th><th><input type="password" name="password"></th></tr>
        <tr>
            <th><input type="button" value="Зарегистрироваться" onclick="window.location.href='add'"></th>
            <th><input type="submit" value="Войти"></th>
        </tr>
    </table>
</form>
</body>
</html>
