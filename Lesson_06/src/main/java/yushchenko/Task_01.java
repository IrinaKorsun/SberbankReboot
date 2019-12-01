package yushchenko;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Task_01 {

    public static void main(String[] arg) throws MalformedURLException, ClassNotFoundException, NoSuchFieldException {

        Object hideClass = null;
        try {
            File file = new File("Lesson_06/lib");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("kuzmina.Main");
            hideClass = cls.newInstance();

            // Проверим, есть ли приватное поле, имя которого знаем заранее
            Field f = hideClass.getClass().getDeclaredField("ANSI_BRIGHT_BLUE");
            String sname = f.getName();
            System.out.println("Поле " + sname + " найдено");

            //Узаем все методы класса:
            Method[] methods = hideClass.getClass().getDeclaredMethods();
            for (Method m : methods) {
                System.out.print("Method '" + m.getName() +
                        "' with params ");
                //Узнаем параметры класса
                Class<?>[] params = m.getParameterTypes();
                for (Class<?> paramType : params) {
                    System.out.print(" " + paramType.getName());
                }
                System.out.println("Return type " + m.getReturnType().getName());
                System.out.println();
                m.setAccessible(true);
            }
            //Запускаем метод printColour
            Method hideMet = hideClass.getClass().getDeclaredMethod("printColour");
            hideMet.setAccessible(true);
            hideMet.invoke(hideClass);

        } catch (InstantiationException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException
                | InvocationTargetException | ClassNotFoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
