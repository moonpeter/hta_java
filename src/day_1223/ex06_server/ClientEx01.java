package day_1223.ex06_server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx01 {
    public static void main(String[] args) {
        System.out.println("여기는 클라이언트입니다.");
        Socket socket = null;
        try {
//            socket = new Socket("127.0.0.1", 9000);
            socket = new Socket("192.168.0.24", 9000);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            String str = "Hello, Server";
            out.write(str.getBytes());
            byte arr[] = new byte[128];
            System.out.println(new String(arr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (Exception e) {
                System.out.println("소켓 닫는 중에 에러 발생");
           }
        }
    }
}
