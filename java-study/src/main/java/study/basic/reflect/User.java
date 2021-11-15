package study.basic.reflect;

import lombok.Data;

/**
 * @description: user
 * @author: crq
 * @create: 2021-10-06 21:47
 **/
@Data
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
