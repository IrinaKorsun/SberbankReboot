package shevnin;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ShevninReflection {
    public static void main(String[] args) throws MalformedURLException, InvocationTargetException, IllegalAccessException {
        String classPath = "Lesson_06/lib";
        String className = "kuzmina.Main";
        try {
            File file = new File(classPath);
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class someClass = cl.loadClass(className);
            System.out.println("Найден класс - " + someClass.getName());
            for (Method method : someClass.getDeclaredMethods()) {
                int modifiers = method.getModifiers();
                if (Modifier.isStatic(modifiers)) {
                    if (Modifier.isPrivate(modifiers)) method.setAccessible(true);
                    if (method.getParameterTypes().length == 0) {
                        System.out.println("Вызов метода \"" + method.getName() + "\". Это статический метод без параметров");
                        method.invoke(null, null);
                    }
                }
            }
        } catch (NoClassDefFoundError e) {
            System.out.println("Неправильное наименование класса \"" + className + "\"");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс \"" + className + "\" не найден");
        }
    }
}
