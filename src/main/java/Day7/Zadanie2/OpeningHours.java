package Day7.Zadanie2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public interface OpeningHours {

    LocalTime openFrom (DayOfWeek dayOfWeek) throws MissidgDayOFWeekException;
    LocalTime openTo (DayOfWeek dayOfWeek) throws MissidgDayOFWeekException;
    // dodanie przez program fo interface, ponieważ jest metoda Overide

    static DayOfWeek currentDay(){
        LocalDate currentDay = LocalDate.now();
        return currentDay.getDayOfWeek();
    }
    default boolean isOpen (DayOfWeek dayOfWeek, LocalTime time){
        return false;
    }


}
