import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
class Employee{
    String name;
    int salary;
    LocalDate joinigDate=LocalDate.now();
    Employee(String name,int salary,LocalDate joinDate)
    {
        this.name=name;
        this.salary=salary;
        this.joinigDate=joinigDate;
    }
    void serviceDuration()
    {
        LocalDate dateNow =LocalDate.now();
        long diff= Duration.between(dateNow - this.joinigDate);
    }
}


public class Ques9 {
    // Write a Java program to create a class called "Employee" with a name, salary, 
    // and hire date attributes, and a method to calculate years of service.
    public static void main(String[] args) {
        LocalDate d1=new ;
        Employee e1=new Employee("Bhavya", 50000, null)
    }
}
