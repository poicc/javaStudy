package com.soft.study.work1;

/**
 * @description:
 * @author: crq
 * @create: 2021-10-31 16:30
 **/
public class Manager extends Employee {
    private String job;

    public Manager(String name, int age, int empno, int salary, String job) {
        super(name, age, empno, salary);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + this.getName() + '\'' +
                ",age=" + this.getAge() +
                ",empno=" + this.getEmpno() +
                ",salary=" + this.getSalary() +
                ",job='" + job + '\'' +
                '}';
    }
}
