package ostrikova;

import sun.applet.Main;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

public class Info {
           File file = new File("Lesson_06/lib/kuzmina");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");

    public Info() throws MalformedURLException, ClassNotFoundException {
    }

   public static class CodeAnalyzer {

        public static void analyzeClass(Object o) throws MalformedURLException, ClassNotFoundException {
            File file = new File("Lesson_06/lib/kuzmina");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");

            System.out.println("Имя класса: " + cls);
            System.out.println("Поля класса: " + Arrays.toString(cls.getDeclaredFields()));
            System.out.println("Родительский класс: " + cls.getSuperclass());
            System.out.println("Методы класса: " +  Arrays.toString(cls.getDeclaredMethods()));
            System.out.println("Конструкторы класса: " + Arrays.toString(cls.getConstructors()));
        }

        public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {

            analyzeClass(new Main());
        }
    }

}
