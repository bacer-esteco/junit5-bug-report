package mypackage;

import java.net.URL;
import java.net.URLClassLoader;

public class MyThreadMessingClass {


    public int doStuffWithThreads() {
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{}, null);
        Thread.currentThread().setContextClassLoader(urlClassLoader);
        return 1;
    }
}
