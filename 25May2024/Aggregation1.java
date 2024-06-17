class Address
{
    String state ;
    String city;
    String country;
    int pincode;
    public Address(String city, String state, String country , int pincode) {  
        this.city = city;  
        this.state = state;  
        this.country = country; 
        this.pincode = pincode; 
    }  

}
class Student
{
    int id;
    String name;
    int age;
    Address address;
    public Student(int id, String name,int age ,Address address) {  
        this.id = id;  
        this.name = name; 
        this.age=age; 
        this.address=address;  
    } 
    void display(){  
        System.out.println(id+" "+name);  
        System.out.println(address.city+" "+address.state+" "+address.country);  
        }   

}

public class Aggregation1 {
    public static void main(String[] args) {
        Address address1=new Address("gzb","UP","india",302020);  
        Address address2=new Address("gno","UP","india",302020);  
        
        Student e1= new Student(111,"varun",22,address1);  
        Student e2=new Student(112,"arun",18,address2);  
            
        e1.display();  
        e2.display(); 
    }

    
}