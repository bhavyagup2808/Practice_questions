public class Ques16 {
   public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            String s="";
            for(int j=1;j<10;j++)
            {
                if(j<5+i && j>5-i) s+="*";
                else s+=" ";
            }
            System.out.println(s);
        }
   } 
}
