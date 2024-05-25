class Student{  
    private int rollNo;
    private String name;
    
    String getName()
    {
        return this.name ;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getRollNo()
    {
        return this.rollNo ;
    }
    void setRollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }
}  
public class Encapsulation{  
    public static void main(String[] args){  
        Student s1= new Student();
        s1.setName("Bhavya gupta");
        s1.setRollNo(12);
        System.out.println("The name of the student is "+s1.getName()+" and the roll no is "+s1.getRollNo());
    }  
 }  
