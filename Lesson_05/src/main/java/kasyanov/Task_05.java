package kasyanov;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task_05 {

// ***********************************************************************************************************
    // Метод создания коллекций
   public static List<UserSber> createCollection (int sizecoll) { // sizecoll - размер коллекции
   List<UserSber> coll = new ArrayList<UserSber>(); // создаем коллекцию
      // Заполнение коллекции случайнвми значениями

       // Имя полдьзователя:

       for (int i=0; i<sizecoll; i++) {
           //System.out.println("Создан " + i + " объект");
           UserSber collect = new UserSber(); // создаем i-ыйй объект коллекции

       // В ASCII прописные английские буквы находятся в диапазоне 65-90, в алфавите 26 букв.
       String str = "";
            for (int ii=0; ii<3; ii++) { // имя пользователя будет состоять из трех символов
                int num = (int) (Math.random() * 26 + 65);
                str = str + (char)num;
            }
            collect.setUsername(str); // добавление username к объекту collect

            collect.setPasswordHash(str.getBytes());  // добавдение PasswordHash к объекту collect
           // getBytes()кодирует данную строку в последовательность байтов, используя charsetName (кодировку), сохраняет результат в новый массив байтов.

           String str2 = "";
           int num = (int) (Math.random() * 26 + 65);
           str2 = (char)num + "@mail.ru";
           collect.setEmail(str2); // добавление email к объекту collect

           coll.add(collect); // добавление i-го объекта collect в коллекцию coll

           //System.out.println("uername: " +collect.getUsername() + " email: " + collect.getEmail() + " passwordHAsh: " + collect.getPasswordHash());
   } // цикл sizecoll

       // EMail:
   return coll;
   }

    // ***********************************************************************************************************
    // Метод поиска дублей в двух коллекциях
    // collA - первая коллекция
    // collB - вторая коллекция
    public static List<UserSber> findDublicates(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber>  dublicates = new ArrayList<UserSber>();     //  создаем новую коллекцию dublicates
    long start = System.currentTimeMillis();    // старт - начало отсчета времени
    int count = 0;                              // count  - счетчик дублей
    for (UserSber firstSber: collA){
        for (UserSber secondSber: collB){
            if (firstSber.equals(secondSber)) {
             dublicates.add(firstSber);
             count +=1;
            } // if
        } // for collA
        } // for collB
    long end = System.currentTimeMillis();     // end - конец отсчета времени
    NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Время выполнения : " + formatter.format((end-start)/1000d) + " секунд");
        System.out.println("Найдено дубликатов : " + count);

     return dublicates;
    }
// ***********************************************************************************************************

    public static void main(String[] args) {
        System.out.println("Создание коллекций:");
        System.out.print("Создание коллекции А: ");
        List<UserSber> collA = createCollection(100000); //создаем коллекцию А
        System.out.println("OK");
        System.out.print("Создание коллекции B: ");
        List<UserSber> collB = createCollection(100000); //создаем коллекцию B
        System.out.println("OK");

        System.out.println("Поиск дубликатов");
        List<UserSber> dublicates = findDublicates(collA, collB);
        System.out.println("Поиск завершен.");
    }


}
