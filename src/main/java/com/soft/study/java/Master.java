package com.soft.study.java;

/**
 *
 * @author crq
 */
public class Master {
    private String name;
    private double money;

    public Master(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void feed(Pet pet){
        pet.eat();
    }

    public Pet getPet(String typeId){
        Pet pp = null;
        if("1".equals(typeId)){
            Dog dog = new Dog("包子","梗犬",90,90);
            pp = dog;
        }
        if ("2".equals(typeId)){
            Penguin qq = new Penguin("meimei","Q妹",95,90);
            pp = qq;
        }
        return pp;
    }

    public void play(Pet pet){
        if (pet instanceof Dog){
            Dog dog = (Dog)pet;
            dog.catchingFlyDisc();
        }else if(pet instanceof Penguin){
            Penguin penguin = (Penguin)pet;
            penguin.swimming();
        }

    }


}
