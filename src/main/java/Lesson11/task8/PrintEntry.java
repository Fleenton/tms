package Lesson11.task8;

import java.util.HashMap;
import java.util.Map;

public class PrintEntry {
    public static void printEntry(HashMap<String, String> toyList){
        for (Map.Entry<String,String> entry: toyList.entrySet()) {
            System.out.println("В игрушке " + entry.getKey() + " есть " + entry.getValue());
        }
    }
}
