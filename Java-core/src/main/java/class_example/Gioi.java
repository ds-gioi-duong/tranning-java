package class_example;

public class Gioi extends Human  {
    public Gioi(String name, int age) {
        super(name,age);
    }
    @Override
    public void sayHello(){
        System.out.println("Hello Thuc ngu");
    }
}
