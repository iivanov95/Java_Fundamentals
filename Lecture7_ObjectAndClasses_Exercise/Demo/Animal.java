package Lecture7_ObjectAndClasses_Exercise.Demo;

public class Animal {
    private String type;
    private int age;

    public Animal (String type, int age) {
        this.type = type;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String newType) {
        this.type = newType;
    }
}