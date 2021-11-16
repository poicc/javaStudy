package com.soft.study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class Employee extends Person {
    private int empno;
    private int salary;


    public Employee(String name, int age, int empno, int salary) {
        super(name, age);
        this.empno = empno;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                ",age=" + this.getAge() +
                ",empno=" + empno +
                ", salary=" + salary +
                '}';
    }
}
