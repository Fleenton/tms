package TaskBus.service.format;

import TaskBus.model.ScheduleBus;

import java.text.SimpleDateFormat;

public class ScheduleBusFormat implements PrintFormatScheduleBus {

    @Override
    public String printFormatScheduleBus(ScheduleBus scheduleBus) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        return scheduleBus.getNameBus() + " " + timeFormat.format(scheduleBus.getDepartureTime()) + " " + timeFormat.format(scheduleBus.getArrivalTime()) + "\n";
    }
}
