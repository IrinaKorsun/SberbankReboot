package shevnin;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ShevninReflection {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
       File file = new File("\\lib\\kuzmina");
        URL url = file.toURI().toURL();
        URL[] urls = new URL[]{url};
        ClassLoader cl = new URLClassLoader(urls);
        Class kuzminaMain = cl.loadClass("kuzmina.Main");
        System.out.println("Found Class - " + kuzminaMain.getName() + "!");
        for (Method method : kuzminaMain.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isStatic(modifiers)) {
                if (Modifier.isPrivate(modifiers)) method.setAccessible(true);
                if (method.getParameterTypes().length == 0) {
                    System.out.println("Call method \"" + method.getName() + "\". This is a static method and has no parameters");
                    method.invoke(null, null);
                 }
            }
        }
    }

}
