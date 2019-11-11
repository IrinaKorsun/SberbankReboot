package polenok.task_02;

public class Yandex implements ToysFactory {
    public Bear createBear() {
        return new YandexBear();
    }

    public Doll createDoll() {
        return new YandexDoll();
    }
}
