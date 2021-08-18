package Lesson10.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       try {
           BufferedReader inReader = new BufferedReader(new FileReader("C://Users/Admin Admin/Desktop/taskTwo.txt"));
           BufferedWriter outWriter = new BufferedWriter(new FileWriter("C://Users/Admin Admin/Desktop/copy_taskTwo.txt"));
           String line;
           while ((line = inReader.readLine()) != null){
               String [] arrayLines = line.split("\\. |\\? |! ");
               for(String lines: arrayLines) {
                   if (TextFormater.lineCounter(lines) > 2 && TextFormater.lineCounter(lines) < 6) {
                       outWriter.write(lines + "\n");
                   }
                   else if (TextFormater.isPalindrome(lines)) {
                       outWriter.write(lines + "\n");
                   }
               }
           }
           inReader.close();
           outWriter.close();
       }
       catch (IOException e) {
           e.printStackTrace();
       }
    }
}
