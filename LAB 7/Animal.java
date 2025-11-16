public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}