package study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(2, "crq");
        Student student2 = new Student(3, "crq");
        System.out.println(student1.equals(student2));
    }
}
