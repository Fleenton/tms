package TaskBus.service.filehandler;

import TaskBus.model.ScheduleBus;
import TaskBus.service.comparator.ComparatorByTime;
import TaskBus.service.format.ScheduleBusFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ScheduleWriter {
    public void writerSchedule(List<ScheduleBus> scheduleBus, String filename){
        Comparator<ScheduleBus> comparator = new ComparatorByTime();
        scheduleBus.sort(comparator);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            ScheduleBusFormat scheduleBusFormat = new ScheduleBusFormat();
            for (ScheduleBus sb: scheduleBus) {
                writer.write(scheduleBusFormat.printFormatScheduleBus(sb));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
