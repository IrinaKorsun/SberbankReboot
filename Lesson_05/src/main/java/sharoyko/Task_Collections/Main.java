package sharoyko.Task_Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList<UserSber> collA = new ArrayList<UserSber>();
        ArrayList<UserSber> collB = new ArrayList<UserSber>();


        //великий и могучий Рандом, создадим 3 переменные rndUserName, rndEmail, rndPassword и заполнем из случайными значениями
        //после чего создадим новый объект SberUser с этими параметрами

        //создадим переменную для определения случайного числа
        int rand;

        //создаем 3 переменные для заполнения рандома
        String rndUserName = "";
        String rndEmail = "";
        String rndPassword = "";

        //создадим переменную для хранения charовских символом (понадобится при рандоме)
        char rnd;

        //добавляем НЕ случайные записи в общие коллекции для проверки работоспособности.
        String a = "IvanovII";
        String b = "Yandex";
        String c = "000111";
        UserSber newUser = new UserSber();
        UserSber newUser1 = new UserSber();
        newUser.setUsername(a);
        newUser1.setUsername(a);
        newUser.setEmail(b);
        newUser1.setEmail(b);
        newUser.setPasswordHash(c.getBytes());
        newUser1.setPasswordHash(c.getBytes());
        collB.add(newUser);
        collA.add(newUser1);


        for (int user = 0; user < 100000; user++) {
            //каждый раз сбрасываем значения
            rndUserName = "";
            rndEmail = "";
            rndPassword = "";
            //генерируем UserName
            for (int i = 0; i < 8; i++) {
                //изпользуем рандом, ограничиеваем его ЯВНО, т.к. там нужны только значения от 97 до 122 по таблице Unicode (латинский алфавит)
                rand = 97 + (int) (Math.random() * 25);
                rndUserName = rndUserName + (char) rand;
            }
            //генерируем Email
            for (int i = 0; i < 15; i++) {
                rand = 97 + (int) (Math.random() * 25);
                rndEmail = rndEmail + (char) rand;
            }
            //генерируем Password
            for (int i = 0; i < 6; i++) {
                rand = 97 + (int) (Math.random() * 25);
                rndPassword = rndPassword + (char) rand;
            }
            //добавляем пользователя
            UserSber newUserA = new UserSber();
            newUserA.setUsername(rndUserName);
            newUserA.setEmail(rndEmail);
            newUserA.setPasswordHash(rndPassword.getBytes());
            collA.add(newUserA);
        }

        for (int user = 0; user < 100000; user++) {
            //каждый раз сбрасываем значения
            rndUserName = "";
            rndEmail = "";
            rndPassword = "";
            //генерируем UserName
            for (int i = 0; i < 8; i++) {
                //изпользуем рандом, ограничиеваем его ЯВНО, т.к. там нужны только значения от 97 до 122 по таблице Unicode (латинский алфавит)
                rand = 97 + (int) (Math.random() * 25);
                rndUserName = rndUserName + (char) rand;
            }
            //генерируем Email
            for (int i = 0; i < 15; i++) {
                rand = 97 + (int) (Math.random() * 25);
                rndEmail = rndEmail + (char) rand;
            }
            //генерируем Password
            for (int i = 0; i < 6; i++) {
                rand = 97 + (int) (Math.random() * 25);
                rndPassword = rndPassword + (char) rand;
            }
            //добавляем пользователя
            UserSber newUserB = new UserSber();
            newUserB.setUsername(rndUserName);
            newUserB.setEmail(rndEmail);
            newUserB.setPasswordHash(rndPassword.getBytes());
            collB.add(newUserB);
        }

        //смотрим размер коллекций
        System.out.println(collA.size());
        System.out.println(collB.size());

        //помещаем в новый ArrayList полученые нами дубли
        ArrayList<UserSber> dupl = (ArrayList<UserSber>) findDuplicates(collA, collB);

        //проверяем что лежит в первом ячейки листа и выводим юзернейм (должно получиться IvanovII)
        System.out.println(dupl.get(0).getUsername());
    }

    public static List<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {

        //записываем начало "таймера"
        long start = System.currentTimeMillis();

        //создание нового листа для дубликатов
        List<UserSber> duplicate = new ArrayList<>();

        //создаем 2 хэшсэта с первой и второй коллекцией
        HashSet h = new HashSet(collA);
        HashSet h2 = new HashSet(collB);

        //сравниваем
        for (UserSber user : collB) {
            if (h.contains(user)) {
                duplicate.add(user);
            }
        }

        //вычисляем прошедшее время "таймера", выводим его на экран
        System.out.println("Время работы: " + (System.currentTimeMillis() - start));
        return duplicate;
    }
}

