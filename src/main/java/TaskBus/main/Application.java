package TaskBus.main;

import TaskBus.model.ScheduleBus;
import TaskBus.service.filehandler.ScheduleReader;
import TaskBus.service.filehandler.ScheduleWriter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ScheduleReader scheduleReader = new ScheduleReader();
        ScheduleWriter scheduleWriter = new ScheduleWriter();
        List<ScheduleBus> scheduleBusList = scheduleReader.getScheduleBusFile("C://Users/Admin Admin/Desktop/data.txt");
        scheduleWriter.writerSchedule(scheduleBusList, "C://Users/Admin Admin/Desktop/result.txt");
    }
}
