
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class server {
    static int factorial(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans *=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8888);
            Socket soc=ss.accept();
            BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int n= Integer.parseInt(in.readLine());
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println("Fractorial of "+n+" is: "+ factorial(n));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
