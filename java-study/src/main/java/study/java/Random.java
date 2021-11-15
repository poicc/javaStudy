package study.java;

/**
 * @description: 生成随机字符串
 * @author: crq
 * @create: 2021-10-15 20:45
 **/
public class Random {
    public static void main(String[] args) {
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "0123456789";
        StringBuffer randomString = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            int randomIndex = (int)(Math.random() * word.length());
            randomString.append(word.charAt(randomIndex));
        }
        for(int i = 0; i < 4; i++) {
            int randomIndex = (int)(Math.random() * num.length());
            randomString.append(num.charAt(randomIndex));
        }
        System.out.println(randomString);
    }

}
