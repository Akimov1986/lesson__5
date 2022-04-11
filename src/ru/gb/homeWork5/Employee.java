package ru.gb.homeWork5;

public class Employee {

    private String name;
    private String profession;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Employee(String name, String profession, String email, int tel, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void infoPrint() {
        System.out.println(name + " " + profession + " " + email + " " + tel + " " + salary + " " + age );
    }
}
