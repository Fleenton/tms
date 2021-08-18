package TaskBus.service.filehandler;

import TaskBus.model.ScheduleBus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScheduleReader {
    public List<ScheduleBus> getScheduleBusFile(String filename){
        List<ScheduleBus> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null){
                String [] arrLine = line.split("\s");
                ScheduleBus scheduleBus = new ScheduleBus();
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                scheduleBus.setNameBus(arrLine[0]);
                scheduleBus.setDepartureTime(format.parse(arrLine[1]));
                scheduleBus.setArrivalTime(format.parse(arrLine[2]));
                long dif = scheduleBus.getArrivalTime().getTime() - scheduleBus.getDepartureTime().getTime();
                if(dif<3600000){
                    result.add(scheduleBus);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
