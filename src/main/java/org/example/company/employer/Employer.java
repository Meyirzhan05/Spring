package org.example.company.employer;

public abstract class Employer<T> implements Worker {
    private String name;
    private int age;
    private T role;

    public  Employer(String name, int age, T role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public T getRole() {
        return role;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role=" + role +
                '}';
    }
}
