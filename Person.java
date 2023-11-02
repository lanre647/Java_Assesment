// Encapsulation 
//Encapsulation in Java is a mechanism that allows bundling of data (variables)
//and methods (functions) within a single unit called a class. It is one of the 
//fundamental principles of object-oriented programming (OOP).
//
//The main goal of encapsulation is to hide the internal details of an object and provide controlled
//access to its data. This is achieved by declaring the variables of a class as private and providing public 
//methods (getters and setters) to access and modify those variables.

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
