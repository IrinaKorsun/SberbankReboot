package polenok;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Task_01 {
    public static void main(String[] args) {
        String classPath = "Lesson_06/lib";
        String className = "kuzmina.Main";
        try {
            File file = new File(classPath);
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader classLoader = new URLClassLoader(urls);
            Class loClass = classLoader.loadClass(className);
            Object loadClass = loClass.newInstance();

            Method[] method = loadClass.getClass().getDeclaredMethods();
            System.out.println("HideClass("+(loadClass)+ ") contains methods :");
            for (int i = 0; i < method.length; i++) {
                System.out.println("Method " + (i+1) + " " + method[i]);
            }
            Method omethod = loadClass.getClass().getDeclaredMethod("printColour");
            omethod.setAccessible(true);
            System.out.println("Result open private method :");
            omethod.invoke(loClass);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
