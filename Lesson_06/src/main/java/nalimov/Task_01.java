package nalimov;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.NoSuchElementException;

public class Task_01 {


    public static void main(String[] args) throws NoSuchFieldException {


        try {
            File file = new File("Lesson_06/lib");
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader classLoader = new URLClassLoader(urls);
            Class c = classLoader.loadClass("kuzmina.Main");
            //Class c = Class.forName("kuzmina.Main");
            Field[] field = c.getDeclaredFields();

            for (int i = 0; i < field.length; i++) {
                System.out.println(field[i].getName());
                System.out.println(field[i].getType());
                System.out.println(field[i].getType().isPrimitive());

            }

            Method[] method = c.getDeclaredMethods();

            for (int i = 0; i < method.length; i++) {
                System.out.println(method[i].getName());

            }

            Method methodInv = c.getDeclaredMethod("printColour");
            methodInv.setAccessible(true);
            methodInv.invoke(c);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
