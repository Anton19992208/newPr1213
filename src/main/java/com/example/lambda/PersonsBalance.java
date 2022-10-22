package com.example.lambda;

public class PersonsBalance {

    private String name;
    private Integer age;
    private String surname;
    private Integer sum;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public PersonsBalance(Integer sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PersonsBalance(String name, Integer age, String surname, Integer sum) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "PersonsBalance{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", sum=" + sum +
                '}';
    }
}
