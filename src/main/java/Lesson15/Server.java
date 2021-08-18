package Lesson15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket listener = null;
        Socket socket;
        BufferedReader reader;
        BufferedWriter writer;
        String line;
        try {
            listener = new ServerSocket(9999);
            System.out.println("Ready");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket = listener.accept();
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                try {
                    line = reader.readLine();
                    int count = line.length();
                    String result = "Length = " + count;
                    writer.write(result);
                    writer.flush();
                    if (line.equalsIgnoreCase("stop")) {
                        System.out.println("Server disconnect");
                        socket.close();
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
