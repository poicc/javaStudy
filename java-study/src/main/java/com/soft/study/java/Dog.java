package com.soft.study.java;

/**
 * @description: 狗
 * @author: crq
 * @create: 2021-10-15 10:28
 **/
public class Dog extends Pet {
    private String strain;

    public Dog() {

    }


    //构造方法，生成对象时给你的对象的各个属性赋初值的
    //1.没有返回值  2.方法名和类名是相同的
    //无参构造方法
    public Dog(String name, String strain, int love, int health) {
        //访问父类的构造方法
        super(name, love, health);
        this.strain = strain;
    }

    //public Dog(){
    //
    //}
    //对dog类的属性进行封装
    //1.对name属性进行封装 取值、赋值


    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }


    //定义方法  方法就是C语言中讲的函数
    //public 表示访问属性是公有的
    //public void sayHi(){
    //     System.out.println("\t品种:" +this.strain);
    //
    // }

    //重写父类Pet的print方法
    @Override
    public void print() {
        print();
        System.out.println("我的名字:" + this.getName() + "\t品种：" + this.strain +
                "\t和人的亲密度：" + this.getLove() + "\t我的健康度：" + this.getHealth());
    }

    @Override
    public String toString() {
        return ("我的名字:" + this.getName() + "\t品种：" + this.strain +
                "\t和人的亲密度：" + this.getLove() + "\t我的健康度：" + this.getHealth());
    }
    @Override
    public void eat(){
        // 吃完饭后，企鹅的health增加3
        if(this.getHealth() > 97){
            System.out.println("吃饱了");
        }else{
            this.setHealth(this.getHealth() + 3);
        }

    }
    public void catchingFlyDisc(){
        this.setHealth(this.getHealth() - 10);
        this.setLove(this.getLove() + 5);
    }
}
