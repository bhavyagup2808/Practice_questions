class Employee{
    private String name;
    private String jobTitle;
    public double  salary;

    public Employee(String name, String jobTitle, double  salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName() {
        return this.name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public double getSalary() {
        return this.salary;
    }
    public double calculateAnnualSalary() {
        return this.salary * 12;
    }
    public void updateSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * percentage / 100;
            System.out.println("Salary updated. New salary: " + this.salary);
        } else {
            System.out.println("Invalid percentage. Salary not updated.");
        }
    }


}

public class Ques6 {
    // Write a Java program to create a class called 
    // "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 5000);
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
        emp.updateSalary(10);
    }

}
