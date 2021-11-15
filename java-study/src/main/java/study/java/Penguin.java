package study.java;


/**
 * @author crq
 */
public class Penguin extends Pet {
   static final String SEX_MALE = "Q仔";
   static final String SEX_FEMALE = "Q妹";
    private String sex;

    public Penguin(){}

    public Penguin(String name,String sex,int love,int health){
        super(name,love,health);
     this.sex = sex;

    }
    //public void sayHi(){
    //    System.out.println("我的名字：" + super.getName() +
    //            "\t性别：" + this.sex + "\t和人的亲密度" +
    //            super.getLove() + "\t我的健康" +super.getHealth());
    //
    //}
    @Override
    public void print(){
        System.out.println("我的名字:"+this.getName()+
                "\t和人的亲密度："+this.getLove()+"\t我的健康度："+this.getHealth());


    }
    @Override
    public String toString(){
       return ("我的名字:"+this.getName()+
                "\t和人的亲密度："+this.getLove()+"\t我的健康度："+this.getHealth());

    }
    @Override
    public void eat(){
        // 吃完饭后，狗的health增加3
        if(this.getHealth() > 95){
            System.out.println("吃饱了");
        }else{
            this.setHealth(this.getHealth() + 5);
        }

    }

    public void swimming(){
        this.setHealth(this.getHealth() - 10);
        this.setLove(this.getLove() + 5);
    }

}
