package Day7.Zadanie2;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Map;

public class Shop extends Building implements OpeningHours {

    private Map<DayOfWeek, TimeRange> openinHours;


    public Shop(Map<DayOfWeek, TimeRange> openingHours) { // w konstruktorze mapa z godzinami otwarcia
        super(1);
        this.openinHours = openingHours;
        // w konstruktorze mapa z godzinami otwarcia
    }

    @Override
    public BuildingType getBuildingType() {
        return BuildingType.CIVIL;
    }

    @Override
    public LocalTime openFrom(DayOfWeek dayOfWeek) throws MissidgDayOFWeekException {
        TimeRange timeRange = openinHours.get(dayOfWeek);
        if (timeRange != null) {
            return timeRange.getOpenFrom();
        } else {
            throw new MissidgDayOFWeekException(dayOfWeek);
        }

    }

    @Override
    public LocalTime openTo(DayOfWeek dayOfWeek) throws MissidgDayOFWeekException {
        // pobieramy godziny otwarcia dla danego dnia tygodnia
        TimeRange timeRange = openinHours.get(dayOfWeek);
        if (timeRange != null) { // sprawdzamy czy dany dzień tygodnia był w mapie
            return timeRange.getOpenTo(); // jeżeli tak, sprawdzamy godziny otwarcia
        } else {// jeżeli nie , rzucamy wyjątkiem
            throw new MissidgDayOFWeekException(dayOfWeek);
        }
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, LocalTime time) {
        if (openinHours.containsKey(dayOfWeek)) {
            TimeRange timeRange = openinHours.get(dayOfWeek);
            if (time.isAfter(timeRange.getOpenFrom().minusSeconds(1))
                    && time.isBefore(timeRange.getOpenTo().plusSeconds(1))) {
                return true;
            }
        }
        return false;
    }
}
