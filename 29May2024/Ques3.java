import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int grade;
    List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
        } else {
            System.out.println(name + " is already enrolled in this course ");
        }
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
        } else {
            System.out.println("This course is not in the list of "+name);
        }
    }
    public void displayCourses() {
        System.out.println(name + "'s current courses: " + courses);
    }
}


public class Ques3 {
    // Write a Java program to create a class called 
    // "Student" with a name, grade, and courses attributes, and methods to add and remove courses
    public static void main(String[] args) {
        Student student = new Student("Bhavya Gupta", 12);
        student.addCourse("Maths");
        student.addCourse("Science");
        student.addCourse("English");

        student.displayCourses();

        student.removeCourse("Science");
        student.displayCourses();
        
    }
}
