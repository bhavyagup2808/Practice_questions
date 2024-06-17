class TrafficLight{
    private String color;
    int duration;
    TrafficLight(String color,int duration)
    {
        this.color=color;
        this.duration=duration;

    }
    void setcolor(String color)
    {
        this.color=color;
    }
    void checkcolor()
    {
        if(this.color == "Red" || this.color=="Green")
        {
            System.out.println("The colour of the light is either Red or Green");
        }
        else {
            System.out.println("The color of the light is yellow");
        }
    }

}


public class Ques8{
    // Write a Java program to create class called "TrafficLight" with 
    // attributes for color and duration, and methods to change the color and check for red or green
    public static void main(String[] args) {
        TrafficLight t1=new TrafficLight("Yellow", 50);
        t1.checkcolor();
        t1.setcolor("Red");
        t1.checkcolor();
    }
}