package study.basic.serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-18 23:30
 **/
public class UserInfo implements Externalizable {

    private static final long serialVersionUID = 1163934705502311597L;
    private String userName;
    private Integer userAge;
    private String usePass;

    public UserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserInfo setUserAge(Integer userAge) {
        this.userAge = userAge;
        return this;
    }

    public UserInfo setUsePass(String usePass) {
        this.usePass = usePass;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getUsePass() {
        return usePass;
    }

    public UserInfo() {
        //这个是在第二次测试使用，判断反序列化是否通过构造器
        userAge=20;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException  {
        //  指定序列化时候写入的属性。这里仍然不写入年龄
        out.writeObject(userName);
        out.writeObject(usePass);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException  {
        // 指定反序列化的时候读取属性的顺序以及读取的属性
        // 如果你写反了属性读取的顺序，你可以发现反序列化的读取的对象的指定的属性值也会与你写的读取方式一一对应。因为在文件中装载对象是有序的
        userName=(String) in.readObject();
        usePass=(String) in.readObject();
    }
}
