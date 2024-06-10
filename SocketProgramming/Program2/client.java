import java.net.Socket;

class client {
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",8888);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
