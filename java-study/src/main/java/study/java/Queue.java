package study.java;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-23 20:54
 **/
public class Queue {

    private int[] element;
    public static final int CAPACITY = 8;
    private int size = 0;

    public Queue() {
        element = new int[CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= element.length) {
            int[] temp = new int[element.length * 2];
            System.arraycopy(element, 0, temp, 0, element.length);
            element = temp;
        }
        element[size++] = v;
    }

    public int dequeue() {
        if (empty()) {
            throw new RuntimeException("异常");
        } else {
            int temp = element[0];
            for (int i = 0; i < element.length - 1; i++) {
                element[i] = element[i + 1];
            }
            size--;
            return temp;
        }
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
