package polenok.task_02;

public class Google implements ToysFactory {
    public Bear createBear() {
        return new GoogleBear();
    }

    public Doll createDoll() {
        return new GoogleDoll();
    }
}
