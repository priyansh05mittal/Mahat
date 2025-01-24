class Person{
    String name;
    byte age;
    
    Person(){
        name = "Unknown";
        age = 0;
    }

    Person(String name, byte age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}

public class Program1{
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Priyansh",(byte) 19);

        person1.display();
        person2.display();
    }
}
