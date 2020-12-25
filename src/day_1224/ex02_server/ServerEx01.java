package day_1224.ex02_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx01 {
    public static void main(String[] args) {
        System.out.println("It's Server!!!");
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9001);
            socket = serverSocket.accept();
            System.out.println("====== Access Info ======");
            System.out.println(socket.getInetAddress().getHostAddress() + " accessed");
            System.out.println("=========================");

            Thread thread1 = new SenderThread(socket);
            Thread thread2 = new ReceiverThread(socket);
            thread2.setDaemon(true);

            thread1.start();
            thread2.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                serverSocket.close();
            } catch (Exception ignored) {
                System.out.println("서버 소켓 닫는 중에 애러 발생");
            }
        }
    }
}
