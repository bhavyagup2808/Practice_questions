
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",8888);
            BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the string ");
            String str=input.readLine();
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println(str);
            BufferedReader in= new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
