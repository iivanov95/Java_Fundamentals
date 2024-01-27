package Lecture7_ObjectAndClasses_Exercise.OpinionPoll;

public class Person {
    //описва всеки един човек
    //полета - характеристики
    private String name;
    private int age;

    //конструктор - метод, чрез който създаваме обект от класа
    public Person (String name, int age) {
        //нов празен обект
        this.name = name;
        this.age = age;
    }
    //методи - действия
    //getters - методи за достъпване стойностите на полетата
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}