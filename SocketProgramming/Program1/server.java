package SocketProgramming.Program1;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

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
            DatagramSocket socket = new DatagramSocket(PORT);
            byte[] buffer = new byte[BUF_SIZE];

            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                String received = new String(packet.getData(), 0, packet.getLength());
                String[] parts = received.split(" ");
                int operand1 = Integer.parseInt(parts[0]);
                char operator = parts[1].charAt(0);
                int operand2 = Integer.parseInt(parts[2]);

                int result = calculate(operand1, operator, operand2);
                String resultStr = Integer.toString(result);
                byte[] resultData = resultStr.getBytes();

                InetAddress clientAddress = packet.getAddress();
                int clientPort = packet.getPort();
                DatagramPacket resultPacket = new DatagramPacket(resultData, resultData.length, clientAddress, clientPort);
                socket.send(resultPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
