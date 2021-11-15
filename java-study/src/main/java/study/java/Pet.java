package study.java;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-29 09:32
 **/
public abstract class Pet {
    private String name;
    private int love;
    private int health;

    public Pet(){
    }

    public Pet(String name, int love, int health) {
        this.name = name;
        this.love = love;
        this.health = health;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //抽象方法  在抽象类中 没有方法体  在子类中要实现
    public abstract void print();
    public  abstract void eat();



}

