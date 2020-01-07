<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>registration</title>
    </head>
    <script type="text/javascript">
        function sendform() {
            if (login.value == '') {
                alert('Логин должен быть задан!');
            } else if (password.value == passconfirm.value) {
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        if (this.responseText == "SUCCESS") main.submit();
                        else alert(this.responseText);
                    }
                };
                xhttp.open("POST", "/chat/addon?login=" + login.value + "&username=" + username.value + "&surname=" + surname.value + "&password=" + password.value, true);
                xhttp.send();
            } else {
                alert('Пароль и подтверждение пароля НЕ совпадают!');
            }
        }
    </script>
    <body>
        <h3>Чат</h3>SberbakReboot<br>
        <form id="main" action="main" method="post">
            <table>
                <tr><th align="right">Логин:</th><th><input type="text" name="login" id="login"></th></tr>
                <tr><th align="right">Имя:</th><th><input type="text" name="username" id="username"></th></tr>
                <tr><th align="right">Фамилия:</th><th><input type="text" name="surname" id="surname"></th></tr>
                <tr><th align="right">Пароль:</th><th><input type="password" name="password" id="password"></th></tr>
                <tr><th align="right">Подтверждение пароля:</th><th><input type="password" name="passconfirm" id="passconfirm"></th></tr>
                <tr><th></th><th>
                    <button id="send" type="button" onclick="sendform();">Зарегистрироваться</button>
                    </th>
                </tr>
            </table>
        </form>
    </body>
</html>
