package kasyanov;

//      Изучить возможности Reflection API, прочитать что такое CLASSPATH и попробовать запустить private метод в файле Lesson_06/lib/kuzmina/Main.class через рефлексию.
//      Чтобы class-файл мог увидеть загрузчик классов можно использовать один из вариантов динамической подгрузки через явно указанный путь до источника:

//      File file = new File("path to file");
//      URL url = file.toURI().toURL();
//      URL[] urls = new URL[]{url};
//      ClassLoader cl = new URLClassLoader(urls);
//      Class cls = cl.loadClass("some class with package");

import com.sun.beans.finder.FieldFinder;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Ref {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        //try {
            //File file = new File("Lesson_06/lib/kuzmina/Main.class");   // в  переменную file  считываем данные класса Main.class
            File file = new File("D:\\SberbankReboot\\Lesson_06\\lib");   // в  переменную file  считываем данные класса Main.class
                System.out.println(file);
            URL url = (URL) file.toURI().toURL();
                System.out.println(url);
            URL[] urls = new URL[]{url};
                System.out.println(urls);
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");
                System.out.println(cls);
        //Class cls = cl.loadClass("kuzmina.Task_01.Main");
        //} catch (ClassNotFoundException | NoSuchFieldException | MalformedURLException) {
        //    e.printStackTrace();
        //}


        System.out.println(file);                                   // Lesson_06\lib\kuzmina\Main.class

        System.out.println("Список полей:");
        System.out.println("**************************************************************************************************");
        Field[] declaredFields = cls.getDeclaredFields();    // В массив получаем все поля класса Main.class
        for (Field field :declaredFields) {
            System.out.println(field);                              // выводим на экран массив полей
        }
        //************************************************************************************************************************
        System.out.println("");
        System.out.println("Список методов:");
        System.out.println("**************************************************************************************************");
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method :declaredMethods) {
            System.out.println(method);                              // выводим на экран массив методов
        }

        //************************************************************************************************************************
        //  Запуск метода (способ 1)
        try {
            System.out.print("Запускаем из класса : " + cls + "  метод : ");
            System.out.println(declaredMethods[1]);
            declaredMethods[1].setAccessible(true);
            declaredMethods[1].invoke(cls);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //  Запуск метода (способ 2)
/*        try {
            //Method method1 = cls.getDeclaredMethods("printColour");
            Method method1 = cls.getClass().getDeclaredMethods("printColour");
            //kuzmina.Main.main
            //public static void kuzmina.Main.main(java.lang.String[])
            //private static void kuzmina.Main.printColour()
            method1.setAccessible(true);
            method1.invoke(cls);
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }*/

        //************************************************************************************************************************

    }
}
