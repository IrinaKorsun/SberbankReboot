package melnikov;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Task_01 {

    public static void main(String[] args) throws InvocationTargetException {

        try {
            File file = new File("Lesson_06/lib");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");
            Method method = cls.getDeclaredMethod("printColour");
            method.setAccessible(true);
            method.invoke(cls);
        } catch (MalformedURLException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
