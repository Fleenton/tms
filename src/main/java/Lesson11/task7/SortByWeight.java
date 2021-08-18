package Lesson11.task7;

import Lesson11.task1_3.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class SortByWeight {
    public static List<HeavyBox> sortByWeight(List<HeavyBox> contentsBigBox){
        HeavyBox bigBox = new HeavyBox();
        List<HeavyBox> miniBox = new ArrayList<>();
        double weightConst = 0.3;
        for (HeavyBox box: contentsBigBox) {
            if (box.getWeight() <= weightConst){
                miniBox.add(box);
            }
        }
        return miniBox;
    }
}
