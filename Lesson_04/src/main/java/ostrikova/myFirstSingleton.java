package ostrikova;

public class myFirstSingleton {
    public static  myFirstSingleton instance=new myFirstSingleton();//добавляем в класс приватное статическое поле, содержащее одиночный объект

    private myFirstSingleton(){ //создаём конструктор класса (конструктор по-умолчанию) приватным (чтобы доступ к нему был закрыть за пределами класса, тогда он не сможет возвращать новые объекты)
        System.out.println("Мой первый Синглетон создан!");
    }
    public static myFirstSingleton getInstance() { //Объявляем статический создающий метод
        return instance; // вернуть ранее созданный объект
    }

    public static void main(String[] args) {
        System.out.println(myFirstSingleton.instance.getClass());
    }

}
