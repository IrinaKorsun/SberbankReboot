package kasyanov.task_01;


//Дан класс UserSber, модифицировать его не можем. Нужно написать утилитный метод
//public static List< UserSber > findDuplicates(Collection< UserSber > collA, Collection< UserSber > collB);
//        который возвращает дубликаты: юзеров, которые есть в обеих коллекциях. Одинаковыми считаем
//        юзеров, у которых совпадают все 3 поля: username, email, passwordHash.
//        Требования производительности: метод findDuplicates должен работать не больше 3-5
//        секунд, если на вход получает 2 коллекции по 100 тысяч элементов в каждой.
//        Рассмотреть несколько вариантов решения задачи, замерить время выполнения, вывести
//        результат на экран. Один из вариантов должен удовлетворять требованиям по
//        производительности

public final class UserSber {
    private String username;        // приватнвая переменная usrrname.UserSber
    private String email;           // приватнвая переменная email.UserSber
    private byte[] passwordHash;    // приватнвый массив байт passwordHash.UserSber

    public String getUsername() {    // Метод для получения имени пользователя класса UberSber
        return username;
    }

    public void setUsername(String u) {    // Метод для присвоения имени пользователя класса UberSber
        this.username = u;
    }

    public String getEmail() {               // Метод для получения email класса UberSber
        return email;
    }

    public void setEmail(String e) {       // Метод для присвоения email класса UberSber
        this.email = e;
    }

    public byte[] getPasswordHash() {               // Метод для получения email класса UberSber
        return passwordHash;
    }

    public void setPasswordHash(byte[] p) {       // Метод для присвоения email класса UberSber
        this.passwordHash = p;
    }

    @Override
    public boolean equals(Object s) {
        if (s == this) return true;
        if (s == null) return false;
        if (s.getClass() != this.getClass()) return false;    // сравниваем, одинаковые ли у объектов классы
        UserSber s2 = (UserSber) s;                         // приводим полученный "s" к классу UserSber и присваиваем полученное значение "s2"
        return (username == s2.username) &&                  // проверяем username
                (email == s2.email) &&                        // проверяем email
                (passwordHash == s2.passwordHash);           // проверяем passwordHash
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode()) +
                ((email == null) ? 0 : email.hashCode()) +
                (((passwordHash) == null) ? 0 : passwordHash.hashCode());
        return result;
    }

}