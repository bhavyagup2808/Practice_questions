class Car{
    void name (String carName, int maxSpeed)
    {
        System.out.println("The name of the car is "+ carName +" and the maximum speed is "+ maxSpeed);
    }

}
class BMW extends Car{
    String colorName="White";
    void color()
    {
        System.out.println("The colur of BMW is "+ this.colorName);
    }
}
public class SimpleInheritance
{
    public static void main(String[] args) {
        BMW x =new BMW();
        x.name("BMW", 200);
        x.color();
        
    }
}