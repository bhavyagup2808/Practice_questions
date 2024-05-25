class Dog {
    public String name;
    public String breed;
    Dog(String name, String breed)
    {
        this.name=name;
        this.breed=breed;
    }
    void setter(String name,String breed)
    {
        this.name=name;
        this.breed=breed;
    }
}
public class Ques2 {
    // Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes 
    // using the constructor and modify the attributes using the setter methods and print the updated values.
    public static void main(String[] args) {
        Dog d1=new Dog("Coco", "Golden Retriver");
        d1.setter("Charlie","Bulldog");
        System.out.println("The name of the "+d1.breed +" dog is "+d1.name);
    }
}
