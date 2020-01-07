<%@ page contentType="text/html; charset=UTF-8" %>
  <script type="text/javascript">
   var ws;
    function connect() {
        var webSocketUrl = 'ws://localhost:8090/chat/ex/' + yourKey;
        ws = new WebSocket(webSocketUrl);

        ws.onopen = function () {
          appendMessage('','Вы вошли в чат!');
        };

        ws.onmessage = function (event) {
            if (event.data.indexOf("NewConnection:") == 0 || event.data.indexOf("DelConnection:") == 0) {
                var active = false;
                if (event.data.indexOf("New") == 0) active = true;
                var userList = document.querySelector("div.userlist");
                var elems = userList.childNodes;
                var found = "";
                elems.forEach(
                  function(elem) {
                      var chbox = elem.childNodes[0];
                      var label = elem.childNodes[1];
                      if (chbox.id == event.data.substring(14)) {
                          found = chbox.id;
                          chbox.disabled = !active;
                          if (chbox.disabled) {
                            chbox.checked = false;
                            elem.style.color = "gray";
                          } else {
                            elem.style.color = "black";
                          }
                      }
                  }
                );
                if (found == "") {
                    userList.appendChild(crCheckBox('users', event.data.substring(14), event.data.substring(14), active));
                }
            } else {
                appendMessage('', event.data);
            }
        };

        ws.onclose = function () {
            appendMessage('', 'Вы вышли из чата');
        };

        ws.onerror = function (err) {
            appendMessage(err);
        };
    };

    function setUsers() {

    }

    function appendMessage(type, text) {
        var localDate = new Date();
        if (type == '') {
          chat.value = "["+localDate.toLocaleString() + "] " + text + "\r\n" + chat.value;
        } else {
          chat.value = "["+localDate.toLocaleString() + "] " + type + "> " + text + "\r\n" + chat.value;
        };
    };

    function crCheckBox(name, title, id, active) {
        var ie = !!document.releaseCapture;
        var c = document.createElement(ie ? ['<input name="', name, '" />'].join('') : 'input');
        if (!ie) c.name = name;
        c.type = 'checkbox';
        c.value = title;
        c.disabled = !active;
        c.id = id;
        var l = document.createElement('label');
        l.appendChild(c);
        l.appendChild(document.createTextNode(title));
        l.appendChild(document.createElement("br"));
        if (!active) l.style.color = "gray";
        return l;
    }

    function setUserList() {
        var userList = document.querySelector("div.userlist");
        for(var i=0; i<AllUsers.length; i++) {
            if (AllUsers[i].id != yourKey) userList.appendChild(crCheckBox('users', AllUsers[i].name, AllUsers[i].id, AllUsers[i].active));
        }
    }

    function sendMessage() {
        var userList = document.querySelector("div.userlist");
        var elems = userList.childNodes;
        elems.forEach(
          function(elem) {
          var chbox = elem.childNodes[0];
          if (chbox.checked) {
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        appendMessage(yourName, message.value + ' >> ' + chbox.value);
                         message.value = "";
                    }
                };
                xhttp.open("POST", "/chat/send?key=" + chbox.id + "&sender=" + yourName + "&msg=" + message.value, true);
                xhttp.send();
          }
          }
        );
   }

    function onload() {
      var title = document.querySelector("div.title");
      title.appendChild(document.createTextNode('Чат SberbankReboot. Пользователь ' + yourName));
      setUserList();
      connect();

    };
  </script>

  <body>
  <h3><div class="title"></div></h3>
  <table>
      <tr>
        <th><textarea id="chat" name="name" rows="25" cols="80"></textarea></th>
        <th align="left" valign="top"><div class="userlist"></div></th>
      </tr>
      <tr><th>
        <input id="message" type="text" name="text" size="70"></th><th>
        <button id="send" type="button" name="button" onclick="sendMessage();">Отправить</button>
      </th>
      </tr>
  </table>
      <script>
        onload();
      </script>
  </body>
</html>