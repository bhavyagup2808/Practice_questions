class AutomorphicNumber {   
 
    static boolean isAutomorphic(int num)   
    {   
        int square = num * num;   
        while (num > 0)   
        {   
        
            if (num % 10 != square % 10)   
            
            return false;    
            num = num/10;   
            square = square/10;   
        }   
        return true;   
    }
}   

public class Ques2 {
    public static void main(String[] args) {
        System.out.println(AutomorphicNumber.isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
        System.out.println(AutomorphicNumber.isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
    }
}
