package class_example;

public class Human {
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human() {
    }

    protected void sayHello() {
        System.out.println("Hello " + name);
    }
}
