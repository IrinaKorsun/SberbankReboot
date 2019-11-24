package kasyanov;

//      Изучить возможности Reflection API, прочитать что такое CLASSPATH и попробовать запустить private метод в файле Lesson_06/lib/kuzmina/Main.class через рефлексию.
//      Чтобы class-файл мог увидеть загрузчик классов можно использовать один из вариантов динамической подгрузки через явно указанный путь до источника:

//      File file = new File("path to file");
//      URL url = file.toURI().toURL();
//      URL[] urls = new URL[]{url};
//      ClassLoader cl = new URLClassLoader(urls);
//      Class cls = cl.loadClass("some class with package");

import com.sun.beans.finder.FieldFinder;
import sun.applet.Main;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ref {
    public static void main(String[] args) {

        File file = new File("Lesson_06/lib/kuzmina/Main.class");   // в  переменную file  считываем данные класса Main.class
        System.out.println(file);                                   // Lesson_06\lib\kuzmina\Main.class

        System.out.println("Список полей:");
        System.out.println("**************************************************************************************************");
        Field[] declaredFields = Main.class.getDeclaredFields();    // В массив получаем все поля класса Main.class
            for (Field field :declaredFields) {
            System.out.println(field);                              // выводим на экран массив полей
        }
    //************************************************************************************************************************
        System.out.println("");
        System.out.println("Список методов:");
        System.out.println("**************************************************************************************************");
        Method[] declaredMethods = Main.class.getDeclaredMethods();
        for (Method method :declaredMethods) {
            System.out.println(method);                              // выводим на экран массив полей
        }

     //************************************************************************************************************************

        try {
            Method method1 = Main.class.getDeclaredMethods("run");
            method1.setAccessible(true);
            method1.invoke(Main.class);
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
           }

    //************************************************************************************************************************

}
}
