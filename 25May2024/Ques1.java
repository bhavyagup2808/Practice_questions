class Person
{
    private String name;
    private int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
}
public class Ques1 {
    // Write a Java program to create a class called "Person" with a name and age attribute. Create two instances 
    // of the "Person" class, set their attributes using the constructor, and print their name and age.
    public static void main(String[] args) {
        Person p1= new Person("Bhavya Gupta",22);
        Person p2= new Person("Akshat Gupta",19);
        System.out.println("The name of the p1 is "+p1.getName()+" and the age is "+p1.getAge());
        System.out.println("The name of the p2 is "+p2.getName()+" and the age is "+p2.getAge());
    }
}
