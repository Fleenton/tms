package Lesson10.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {
    public static String[] getText(String filename) {
        StringBuilder builder = new StringBuilder();
        String result = "";
        try {
            BufferedReader inReader = new BufferedReader(new FileReader("C://Users/Admin Admin/Desktop/tskThree.txt"));
            String line;
            while ((line = inReader.readLine()) != null) {
                builder.append(line.strip()).append(" ");
            }
            result = builder.toString().strip();
            inReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return result.split(" ");
    }
}
