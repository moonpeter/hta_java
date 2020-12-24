package day_1223.ex06_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerEx01 {
    public static void main(String[] args) {
        System.out.println("여기는 서버 입니다!!!!!!!");

        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9000);
            socket = serverSocket.accept();

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            byte arr[] = new byte[128];
            in.read(arr);
            System.out.println(new String(arr));

            String str = "Hello, Client";
            out.write(str.getBytes());

        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (Exception ignored) {
                System.out.println("소켓 닫는 중 에러입니다.");
            }
            try {
                serverSocket.close();
            } catch (Exception ignored) {
                System.out.println("서버 소켓 닫는 중 에러입니다.");
            }
        }
    }
}
