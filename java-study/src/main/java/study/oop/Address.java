package study.oop;

import lombok.Data;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-15 21:02
 **/
@Data
public class Address implements Cloneable{
    private Integer id;
    private String describe;


    @Override
    public Object clone() throws CloneNotSupportedException{
       return super.clone();
    }
}
