package TaskBus.model;

import java.util.Date;
import java.util.Objects;

public class ScheduleBus {
    private String nameBus;
    private Date departureTime;
    private Date arrivalTime;

    public ScheduleBus() {
    }

    public ScheduleBus(String nameBus, Date departureTime, Date arrivalTime) {
        this.nameBus = nameBus;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleBus that = (ScheduleBus) o;
        return Objects.equals(nameBus, that.nameBus) && Objects.equals(departureTime, that.departureTime) && Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBus, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return "ScheduleBus{" +
                "nameBus='" + nameBus + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
