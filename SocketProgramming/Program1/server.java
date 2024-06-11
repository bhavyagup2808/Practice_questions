package SocketProgramming.Program1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class server {
    private static final int PORT = 8888;
    private static final int BUF_SIZE = 1024;

    private static int calculate(int operand1, char operator, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0)
                    return operand1 / operand2;
                else
                    return 0; // Division by zero
            default:
                return 0; // Invalid operator
        }
    }

    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8888);
            Socket soc= ss.accept();
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String expression=in.readLine();
            String arr[]=expression.split(" ");
            int operand1=Integer.parseInt(arr[0]);
            char operator=arr[1].charAt(0);
            int operand2=Integer.parseInt(arr[2]);
            int ans=calculate(operand1, operator, operand2)
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println("The result of the expression is"+ans);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

            
    }
}
