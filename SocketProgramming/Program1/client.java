package SocketProgramming.Program1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class client {
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",8888);
            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter arithmetic expression (operand1 operator operand2): ");
            String expression = input.readLine();
            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
            out.println(expression);
            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
