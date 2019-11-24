package kasyanov;

        // Дан класс UserSber, модифицировать его не можем. Нужно написать утилитный метод
        // public static List< UserSber > findDuplicates(Collection< UserSber > collA, Collection< UserSber > collB);
        // который возвращает дубликаты: юзеров, которые есть в обеих коллекциях. Одинаковыми считаем
        // юзеров, у которых совпадают все 3 поля: username, email, passwordHash.
        // Требования производительности: метод findDuplicates должен работать не больше 3-5
        // секунд, если на вход получает 2 коллекции по 100 тысяч элементов в каждой.
        // Рассмотреть несколько вариантов решения задачи, замерить время выполнения, вывести
        // результат на экран. Один из вариантов должен удовлетворять требованиям по
        // производительности

public final class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }
}