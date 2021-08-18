package Lesson10.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader inReader = new BufferedReader(new FileReader("C://Users/Admin Admin/Desktop/taskOne.txt"));
            BufferedWriter outWriter = new BufferedWriter(new FileWriter("C://Users/Admin Admin/Desktop/copy_taskOne.txt"));
            String line;
            while ((line = inReader.readLine()) != null) {
                if (Service.isPalindrome(line)){
                    outWriter.write(line+"\n");
                }
            }
            inReader.close();
            outWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
