package com.company;

public class MickieIntern implements Intern {

    private String name;
    private String idNumber;
    private String sex;
    private int age;


    @Override
    public void work() {
        System.out.println("Intern " + name + " is working.");
    }

    @Override
    public void drink(String brandOfDrink) {
        System.out.println(name+" is drinking " +brandOfDrink);
    }

    @Override
    public void play(String favSport) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
