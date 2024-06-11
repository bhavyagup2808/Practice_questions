import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",8888);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
