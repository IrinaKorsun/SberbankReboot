package tishchenko.task01;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class reflection {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        try {
            File file = new File("Lesson_06/lib");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");
            Object loadClass = cls.newInstance();

            Method[] mets = loadClass.getClass().getDeclaredMethods();
            System.out.println("HideClass("+(loadClass)+ ") contains methods :");
            for (int i = 0; i < mets.length; i++) {
                System.out.println("Method " + (i+1) + " " + mets[i]);
            }
            Method openmet = loadClass.getClass().getDeclaredMethod("printColour");
            openmet.setAccessible(true);
            System.out.println("Result open private method :");
            openmet.invoke(cls);
        } catch (Exception e) {
            System.out.println("Class not load!");
        }
    }
}


