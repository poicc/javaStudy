package com.soft.study.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: IO练习2
 * @author: crq
 * @create: 2021-11-16 19:11
 **/
public class IoDemo2 {
    public static void main(String[] args) throws IOException{
//        charsetDemo();
//        transferWriter();
//        transferReader();
//        fileWriterDemo();
//        fileReaderDemo();
//        bufferedWriterDemo();
//        bufferedReaderDemo();
//        txtSort();
//        printWriterDemo();
//        writeObjectDemo();
        readObjectDemo();
    }
    /**
     * String类不同编码的getBytes()⽅法
     * @throws UnsupportedEncodingException e
     */
    public static void charsetDemo() throws UnsupportedEncodingException {
        byte[] bytes = "你".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        bytes = "你".getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        bytes = "你".getBytes(StandardCharsets.UTF_16LE);
        System.out.println(Arrays.toString(bytes));
        bytes = "你".getBytes(StandardCharsets.UTF_16LE);
        System.out.println(Arrays.toString(bytes));
    }
    /**
     * 写数据方法
     * @throws IOException e
     */
    public static void transferWriter() throws IOException {
        // 定义⽂件路径
        String fileName = "D:/1/read.txt";
        // 创建流对象,默认UTF8编码
        OutputStreamWriter osw = new OutputStreamWriter(new
                FileOutputStream(fileName));
        // 写数据,保存为6个字节
        osw.write("你好");
        osw.flush();
        osw.close();
        // 定义⽂件路径
        String fileName2 = "D:/1/read1.txt";
        // 创建流对象,指定GBK编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new
                FileOutputStream(fileName2),"GBK");
        // 写数据,保存为4个字节
        osw2.write("你好");
        osw2.flush();
        osw2.close();
    }
    /**
     * 读数据方法
     * @throws IOException e
     */
    public static void transferReader() throws IOException {
        // 定义需要读取的⽂件路径,该⽂件采⽤了gbk编码
        String fileName = "D:/1/read.txt";
        // 创建流对象,默认UTF8编码
        InputStreamReader isr = new InputStreamReader(new
                FileInputStream(fileName));
        // 创建流对象,指定GBK编码
        InputStreamReader isr2 = new InputStreamReader(new
                FileInputStream(fileName), "GBK");
        // 定义变量,保存字符
        int read;
        System.out.println("\n**********使⽤默认编码读取************\n");
        // 使⽤默认编码字符流读取,乱码
        while ((read = isr.read()) != -1) {
            System.out.print((char) read);
        }
        isr.close();
        System.out.println("\n**********使⽤GBK编码读取************\n");
        // 使⽤指定编码字符流读取,正常解析
        while ((read = isr2.read()) != -1) {
            System.out.print((char) read);
        }
        isr2.close();
    }
    /**
     * 字符流便捷类 - 写入数据
     * @throws IOException e
     */
    public static void fileWriterDemo() throws IOException {
        // 使⽤⽂件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");
        //写出单个字符
        fw.write(97);
        fw.flush();
        //写出字符数组
        char[] chs = "ABCDED".toCharArray();
        fw.write(chs);
        fw.flush();
        //写出字符数组的⼀部分，开始索引，写出个数
        fw.write(chs, 1, 3);
        fw.flush();
        //写出字符串
        fw.write("Java⼯程师");
        fw.flush();
        fw.close();
    }
    /**
     * 读取数据
     * @throws IOException E
     */
    public static void fileReaderDemo() throws IOException {
        // 使⽤⽂件名称创建流对象，读取的源⽂件read.txt在项⽬根⽬录下
        FileReader fr = new FileReader("fw.txt");
        // 定义变量，保存有效字符个数
        int len;
        // 定义字符数组，作为装字符数据的容器
        char[] buf = new char[2];
        // 循环读取
        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }
        // 关闭资源
        fr.close();
    }
    /**
     * 字符缓冲流 newLine()方法写换行符
     * @throws IOException e
     */
    public static void bufferedWriterDemo() throws IOException {
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        // 写出数据
        bw.write("Java");
        // 写出换⾏
        bw.newLine();
        bw.write("程序");
        bw.newLine();
        bw.write("员");
        bw.newLine();
        // 释放资源
        bw.close();
    }
    /**
     * 字符缓冲流 readLine()读取⽂本⾏
     * @throws IOException e
     */
    public static void bufferedReaderDemo() throws IOException {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        // 定义字符串,保存读取的⼀⾏⽂字
        String line = null;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.print(line);
            System.out.println("------");
        }
        // 释放资源
        br.close();
    }
    /**
     * 恢复出师表文本顺序
     * @throws IOException e
     */
    public static void txtSort() throws IOException {
        //1.创建ArrayList集合,泛型使⽤String
        ArrayList<String> list = new ArrayList<>();
        //2.创建BufferedReader对象,构造⽅法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        //3.创建BufferedWriter对象,构造⽅法中传递FileWriter对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        //4.使⽤BufferedReader对象中的⽅法readLine,以⾏的⽅式读取⽂本
        String line = null;
        while ((line = br.readLine()) != null) {
            //5.把读取到的⽂本存储到ArrayList集合中
            list.add(line);
        }
        //6.使⽤Collections集合⼯具类中的⽅法sort,对集合中的元素按照⾃定义规则排序
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //依次⽐较集合中两个元素的⾸字⺟,升序排序
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        //7.遍历ArrayList集合,获取每⼀个元素
        for (String s : list) {
            //8.使⽤BufferedWriter对象中的⽅法write,把遍历得到的元素写⼊到⽂本中(内存缓冲区中)
            bw.write(s);
            //9.写换⾏
            bw.newLine();
            bw.flush();
        }
        //10.释放资源
        bw.close();
        br.close();
    }
    /**
     * 打印流 输出字符
     * @throws IOException e
     */
    public static void printWriterDemo() throws IOException {
        // 创建打印流,输出⽬的是字节输出流
        //PrintWriter pw1 = new PrintWriter(new FileOutputStream("a.txt"),true);
        //创建打印流,输出⽬的是字符
        PrintWriter pw = new PrintWriter(new FileWriter("a.txt"),true);
        pw.println(97);
        pw.println(98);
        pw.close();
    }
    /**
     * 序列化对象
     * @throws IOException e
     */
    public static void writeObjectDemo() throws IOException {
        Employee e = new Employee();
        e.name = "zhangsan";
        e.address = "jiangsu";
        e.age = 20;
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            // 创建序列化流对象
            ObjectOutputStream out = new ObjectOutputStream(new
                    FileOutputStream("employee.txt"));
            // 写出对象
            out.writeObject(e);
            // 释放资源
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved");
            // 姓名，地址被序列化，年龄没有被序列化。
        } catch(IOException i) {
            i.printStackTrace();
        }
    }
    /**
     * 反序列化对象
     */
    public static void readObjectDemo() {
        Employee e;
        try {
            // 创建反序列化流
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // 读取⼀个对象
            e = (Employee) in.readObject();
            // 释放资源
            in.close();
            fileIn.close();
        } catch (IOException i) {
            // 捕获其他异常
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            // 捕获类找不到异常
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        // ⽆异常,直接打印输出
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("age: " + e.age);
    }
}
