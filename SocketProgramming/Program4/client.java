import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",8888);
            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the factorial ");
            int n=Integer.parseInt(input.readLine());
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println(n);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str =in.readLine();
            System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
