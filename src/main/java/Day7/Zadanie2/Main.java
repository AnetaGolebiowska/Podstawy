package Day7.Zadanie2;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<DayOfWeek, TimeRange> openinHours = new HashMap<>();
        Shop żabka = new Shop(openinHours);
        boolean isOpen = żabka.isOpen(DayOfWeek.MONDAY, LocalTime.of(12, 0));
        System.out.println("Czy żabka jest otwarta w piątek o 12.00? + isOpen");


        LocalTime localTime = null;
        try {
            localTime = żabka.openFrom(DayOfWeek.FRIDAY);
            System.out.println("W piątek godziny otwarica to: " + localTime);
        } catch (MissidgDayOFWeekException e) {
//            System.out.println("W dniu %s sklep jest zamknięty", e.getMissingOFWeek());
        }

    }
}
