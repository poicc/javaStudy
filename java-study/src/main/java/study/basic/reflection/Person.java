package study.basic.reflection;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-10 00:06
 **/
public class Person {
    private Integer id;
    private String name;
    public static void getPerson() {
        System.out.println("I am a person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }
}
