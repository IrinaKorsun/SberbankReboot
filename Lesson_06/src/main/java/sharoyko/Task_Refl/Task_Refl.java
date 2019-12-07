package sharoyko.Task_Refl;

import sun.applet.Main;

import java.io.File;
import java.lang.reflect.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Task_Refl {

    public static void main(String[] args) {

        try {
            //идем по пути к папке lib где лежит нужный класс
            File file = new File("Lesson_06/lib");
            //преобразуем путь в URL
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            //воспользуемся класслоадером
            ClassLoader cl = new URLClassLoader(urls);
            //выгружаем наш "класс майн" в класс
            Class cls = cl.loadClass("kuzmina.Main");
            //создаем новый объект класса
            Object d = cls.newInstance();
            //проверем какой класс создан и загружен
            System.out.println(d.getClass());
            //ищем метод
            Method mth = d.getClass().getDeclaredMethod("printColour");
            //открываем к нему доступ
            mth.setAccessible(true);
            //исполняем указанный метод
            mth.invoke(cls);
            //ловим ошибки
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | MalformedURLException | ClassNotFoundException | InstantiationException e) {
            //в случае ошибки выводим стэк трейс
            e.printStackTrace();
        }

    }
}
