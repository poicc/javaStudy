package study.basic.generics;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-06 00:21
 **/
public class MyMap<K,V> {
    private final K key;
    private final V value;
    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return "MyMap{" + "key=" + key + ", value=" + value + '}';
    }
}
