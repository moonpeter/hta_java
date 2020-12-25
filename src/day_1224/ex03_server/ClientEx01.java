package day_1224.ex03_server;

import java.net.Socket;

public class ClientEx01 {
    public static void main(String[] args) {
        if(args.length !=1) {
            System.out.println("대화명을 입력하세요");
            return;
        }
        try {
            Socket socket = new Socket("127.0.0.1", 9002);

            Thread thread1 = new SenderThread(socket, args[0]);
            Thread thread2 = new ReceiverThread(socket);
            thread2.setDaemon(true);

            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
