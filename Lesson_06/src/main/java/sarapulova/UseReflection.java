package sarapulova;

import java.io.File;
import java.lang.reflect.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class UseReflection {

    public static void main(String[] args) {
        URL url = null;
        Class myClass = null;

        try {
            File myFile = new File("Lesson_06/lib");
            System.out.println("File = " + myFile.toString());
            url = myFile.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader myClassLoader = new URLClassLoader(urls);
            myClass = myClassLoader.loadClass("kuzmina.Main");
        } catch (Exception e) {
            System.out.println("Ошибка загрузки класса");
            e.printStackTrace();
        }

        Field[] arrField = myClass.getDeclaredFields();
        System.out.println("Fields: ");
        for (int i = 0; i < arrField.length; i++)
        {
            System.out.println(arrField[i]);
        }

        Method[] arrMethod = myClass.getDeclaredMethods();
        System.out.println("----------------------------------------");
        System.out.println("Methods: ");
        for (int i = 0; i < arrMethod.length; i++)
        {
            System.out.println(arrMethod[i]);
        }
        System.out.println("----------------------------------------");

        Object myObj = null;
        try {
            myObj = myClass.newInstance();
            System.out.println(myObj.getClass());
            Method mthPrint = myObj.getClass().getDeclaredMethod("printColour");
            mthPrint.setAccessible(true);
            mthPrint.invoke(myClass);
        } catch (Exception e) {
            System.out.println("Ошибка создания объекта и запуска метода");
            e.printStackTrace();
        }

    }
}
