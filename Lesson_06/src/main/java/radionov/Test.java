package radionov;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test {

    public static void main(String[] args) throws MalformedURLException {

        File file = new File("Lesson_06\\lib");
        URL u1 = file.toURI().toURL();
        URL[] u2 = new URL[]{u1};
        ClassLoader cl = new URLClassLoader(u2);
        Class c = null;
//Инициализация класса
        try {
            c = cl.loadClass("kuzmina.Main");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//Вызов private метода "printColour"
        try {
            Method method = c.getDeclaredMethod("printColour");
            method.setAccessible(true);
            method.invoke(c);
        } catch (Exception e) {
            System.out.println("Ошибка при инициализации private метода библиотеки");
        }
    }
}
