package Lesson10.task3;

import java.io.*;

public class BlackList {
    public static String[] getBlackList(String filename) {
        StringBuilder builder = new StringBuilder();
        String result = "";
        try {
            BufferedReader inReader = new BufferedReader(new FileReader("C://Users/Admin Admin/Desktop/blacklist.txt"));
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
