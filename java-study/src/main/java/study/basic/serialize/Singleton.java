package study.basic.serialize;

import java.io.Serializable;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-18 23:46
 **/
public class Singleton implements Serializable {

    private static final long serialVersionUID = -76057430100107840L;

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static synchronized Singleton getSingleton() {
        return SingletonHolder.singleton;
    }

    private Object readResolve() {
        return SingletonHolder.singleton;
    }
}
