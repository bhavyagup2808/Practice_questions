class Car{
    void name (String carName)
    {
        System.out.println("The name of the car is "+ carName);
    }

}
class BMW extends Car{
    String colorName="White";
    void color()
    {
        System.out.println("The colur of BMW is "+ this.colorName);
    }
}
class carSpeed extends BMW{
    void maxSpeedPrint(int maxSpeed)
    {
        System.out.println("The maximum speed of BMW is "+ maxSpeed);
    }
}
public class MultilevelInheritence1 {
    public static void main(String[] args) {
        carSpeed car1= new carSpeed();
        car1.name("BMW");
        car1.color();
        car1.maxSpeedPrint(200);
    }
}
