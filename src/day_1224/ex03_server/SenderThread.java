package day_1224.ex03_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
    private Socket socket;
    private String name;

    SenderThread(Socket socket, String name){
        this.socket = socket;
        this.name = name;
    }

    public void run() {
        PrintWriter writer=null;
        BufferedReader reader=null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(socket.getOutputStream());

            writer.println(name);
            writer.flush();

            while (!socket.isClosed()) {
                String str = reader.readLine();
                if (str.equals("bye"))
                   break;
                writer.println(str);
                writer.flush();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                 writer.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
