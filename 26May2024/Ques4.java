class Circle{
    int radius;
    double area(int radius)
    {
        return (double) 3.14*radius*radius;
    }
    double circumference(int radius)
    {
        return (double) 2* 3.14 * radius;
    }
}

public class Ques4 {
    // Write a Java program to create a class called "Circle" with a radius attribute. 
    // You can access and modify this attribute. Calculate the area and circumference of the circle.
    public static void main(String[] args) {
        Circle c1 =new Circle();
        c1.radius=7;
        System.out.println("The area of the circle "+ c1.area(c1.radius));
        System.out.println("The circumference of the circle "+ c1.circumference(c1.radius));
        
    }
    
}
