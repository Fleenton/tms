package Lesson11.task8;

import java.util.HashMap;
import java.util.Map;

public class PrintValues {
    public static void printValues(HashMap<String, String> toyList){
        System.out.println("Что есть в игрушках:");
        for (Map.Entry<String,String> entry: toyList.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
