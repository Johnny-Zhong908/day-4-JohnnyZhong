package oo;

public class Person {
    private int id;
    private String name;
    private int age;

    // Constructor with all attributes
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Introduce method that returns a string description
    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override equals method to compare persons based on id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return this.id == other.id;
    }

    // Override hashCode to be consistent with equals
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
