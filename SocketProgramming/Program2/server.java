import java.net.*;

class server{
    public static void main(String[] args) {
        try{
            ServerSocket ss =new ServerSocket(8888);
            Socket soc=ss.accept();
            System.out.println("The connection is established");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}