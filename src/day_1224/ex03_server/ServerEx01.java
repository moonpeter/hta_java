package day_1224.ex03_server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx01 {
    public static void main(String[] args) {
        System.out.println("It's Server!!!");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9002);
            while (true) {
                Socket socket = serverSocket.accept();

                Thread thread = new PerClientThread(socket);
                thread.start();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
