package SocketProgramming.Program1;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class client {
    private static final String SERVER_IP = "10.10.9.16";
    private static final int PORT = 8888;
    private static final int BUF_SIZE = 1024;

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName(SERVER_IP);
            byte[] buffer = new byte[BUF_SIZE];
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter arithmetic expression (operand1 operator operand2): ");
            String expression = scanner.nextLine();
            byte[] expressionData = expression.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(expressionData, expressionData.length, serverAddress, PORT);
            socket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(receivePacket);

            String result = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Result: " + result);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
