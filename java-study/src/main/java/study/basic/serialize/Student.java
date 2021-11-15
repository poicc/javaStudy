package study.basic.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @description: 学生
 * @author: crq
 * @create: 2021-10-18 23:01
 **/
public class Student implements Serializable {
    private static final long serialVersionUID = 5286589258612206250L;
    private String name;
    private Integer age;
    private Integer score;
    private transient String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPasswd() {
        return passwd;
    }

    public Student setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        //调用默认的反序列化函数
        objectInputStream.defaultReadObject();
        if (0 > score || 100 < score) {
            throw new IllegalArgumentException("学生分数只能在0到100之间！");
        }
    }

}
