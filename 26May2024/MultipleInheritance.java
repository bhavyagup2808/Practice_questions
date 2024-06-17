interface Bank{  
    float rateOfInterest();  
}
interface Accounts{
    void benifits();
}  
class SBI implements Bank,Accounts{  
    public float rateOfInterest(){return 9.15f;} 
    public void benifits()
    {
        System.out.println("SBI provides best rate of intrest");
        System.out.println("More interest on Saving Account");
    } 
}  
     
public class MultipleInheritance {
    public static void main(String[] args) {
        SBI b1=new SBI();  
        System.out.println("ROI of SBI is : "+b1.rateOfInterest());
        b1.benifits();
    }
}
