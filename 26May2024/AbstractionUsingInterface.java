interface Shape{  
    void draw();  
}  
class Rectangle implements Shape{  
    public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Shape{  
    public void draw(){System.out.println("drawing circle");}  
}

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.draw();
        Rectangle r1=new Rectangle();
        r1.draw();
    }
}
