import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Employee{
    String name;
    int salary;
    LocalDate joiningDate=LocalDate.now();
    Employee(String name,int salary,LocalDate joinDate)
    {
        this.name=name;
        this.salary=salary;
        this.joiningDate=joinDate;
    }
    void serviceDuration()
    {
        LocalDate dateNow =LocalDate.now();
        long time = ChronoUnit.DAYS.between(this.joiningDate, dateNow);
        System.out.println("The no of days of service is "+time);
    }
}


public class Ques9 {
    // Write a Java program to create a class called "Employee" with a name, salary, 
    // and hire date attributes, and a method to calculate years of service.
    public static void main(String[] args) {
        LocalDate d1= LocalDate.of(2024,01,20) ;
        Employee e1=new Employee("Bhavya", 50000, d1);
        e1.serviceDuration();
    }
}
