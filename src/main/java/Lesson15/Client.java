package Lesson15;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket clientSocket = null;
        BufferedReader reader;
        BufferedWriter writer;
        BufferedReader bufferedReader;
        String local = "localhost";
        String line;
        try {
            InetAddress ipAddress = InetAddress.getByName(local);
            clientSocket = new Socket(ipAddress, 9999);
            System.out.println("Ready");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            /*while (true) {*/
                try {
                    line = bufferedReader.readLine();
                    writer.write(line);
                    writer.flush();
                    line = reader.readLine();
                    System.out.println(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
