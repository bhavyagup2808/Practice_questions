class Vehicle{
    void run(){
        System.out.println("Vehicle is running !!!");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is Running !!!");
    }
    void parentRun()
    {
        super.run();
    }
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        Bike obj1 =new Bike();
        obj1.run();
        obj1.parentRun();
    }
}
