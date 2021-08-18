package TaskBus.service.comparator;

import TaskBus.model.ScheduleBus;

import java.util.Comparator;

public class ComparatorByTime implements Comparator<ScheduleBus> {

    @Override
    public int compare(ScheduleBus o1, ScheduleBus o2) {
        return o1.getDepartureTime().compareTo(o2.getDepartureTime());
    }
}
