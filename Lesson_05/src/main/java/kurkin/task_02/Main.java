package kurkin.task_02;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Temp\\git\\java\\Lesson_06\\lib");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");
            Field field = cls.getDeclaredField("ANSI_BRIGHT_BLUE");
            field.setAccessible(true);
            String name = (String) field.get(cls);
            Method method = cls.getDeclaredMethod("printColour");
            method.setAccessible(true);
            method.invoke(cls);
        } catch (MalformedURLException | ClassNotFoundException | NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}