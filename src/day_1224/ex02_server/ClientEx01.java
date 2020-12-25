package day_1224.ex02_server;

import java.net.Socket;

public class ClientEx01 {
    public static void main(String[] args) {
        System.out.println("It's Client!!!");
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9001);
            Thread thread2 = new ReceiverThread(socket);
            Thread thread1 = new SenderThread(socket);
            thread2.setDaemon(true);
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
