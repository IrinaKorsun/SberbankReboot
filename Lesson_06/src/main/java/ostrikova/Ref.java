package ostrikova;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

public class Ref {
    public static void printColour(Object Main) throws MalformedURLException, ClassNotFoundException {
        File file = new File("Lesson_06/lib");
        URL url = file.toURI().toURL();
        URL[] urls = new URL[]{url};
        ClassLoader cl = new URLClassLoader(urls);
        Class cls = cl.loadClass("kuzmina.Main");
        try {
            Method printColour = cls.getDeclaredMethod("printColour"); // получаем метод по имени
            printColour.setAccessible(true); //делаем метод доступным
            printColour.invoke(cls); //вызываем объект
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        File file = new File("Lesson_06/lib");
        URL url = file.toURI().toURL();
        URL[] urls = new URL[]{url};
        ClassLoader cl = new URLClassLoader(urls);
        Class cls = cl.loadClass("kuzmina.Main");

        printColour(cls);

        System.out.println("Информация о классе:");
        System.out.println("Имя класса: " + cls);
        System.out.println("Поля класса: " + Arrays.toString(cls.getDeclaredFields()));
        System.out.println("Родительский класс: " + cls.getSuperclass());
        System.out.println("Методы класса: " + Arrays.toString(cls.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(cls.getConstructors()));
    }
}

