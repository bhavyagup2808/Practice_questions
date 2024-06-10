import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8888);
            Socket soc=ss.accept();
            BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str=in.readLine();
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println("Server Says: "+str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
