package galliamov;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Task_01 {
    public static void main(String[] args) {
        Class rCl = null;

        try {
            File rFile = new File("Lesson_06/lib");
            URL rUrl = rFile.toURI().toURL();
            URL[] tblUrls = new URL[]{rUrl};
            ClassLoader rClassLoader = new URLClassLoader(tblUrls);
            rCl = rClassLoader.loadClass("kuzmina.Main");
            System.out.println("Класс загрузился успешно");
        }catch (Exception e){
            System.out.println("Ошибка загрузки класса");
        }

        try {
            Method rMethod = rCl.getDeclaredMethod("printColour");
            rMethod.setAccessible(true);
            rMethod.invoke(rCl);
            System.out.println("Метод загрузился успешно");
        }catch (Exception e){
            System.out.println("Ошибка загрузки метода");
        }

    }
}
