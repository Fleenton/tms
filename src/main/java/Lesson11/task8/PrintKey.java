package Lesson11.task8;

import java.util.HashMap;
import java.util.Map;

public class PrintKey {
    public static void printKey(HashMap<String, String> toyList){
        System.out.println("Названия игрушек:");
        for (Map.Entry<String,String> entry: toyList.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
