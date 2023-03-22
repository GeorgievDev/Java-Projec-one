public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("Name of person = " + name);
        System.out.println("Age of person = " + age);
    }
}
