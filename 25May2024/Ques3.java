class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2 * (this.width + this.height);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        System.out.println("The perimeter of the rectangle is " + r1.perimeter());
        System.out.println("The area of the rectangle is " + r1.area());
    }
}

