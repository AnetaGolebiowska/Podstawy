package Day7.Zadanie2;

import java.time.DayOfWeek;

public class MissidgDayOFWeekException extends Exception {

    // przechowanie pól dzień tygodnia, jak w zwykłej klasie
    private DayOfWeek  missingDayOfWeek;

    public MissidgDayOFWeekException(DayOfWeek missingDayOfWeek) {
        super ("Brak następującejo dnia tygodnia" + missingDayOfWeek);
        this.missingDayOfWeek = missingDayOfWeek;

    }
    public DayOfWeek getMissingOFWeek (){
        return missingDayOfWeek;
    }
}
