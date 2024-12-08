package christmas.model;

import java.util.List;

public class Calendar {
    private final List<Integer> weekend;
    private final List<Integer> satrtDays;

    public Calendar () {
        this.weekend = List.of(1, 2, 8, 9, 15, 16, 22, 23, 29, 30);
        this.satrtDays = List.of(3,10,17,24, 31, 25);
    }

    public boolean isWeekDay(int date) {
        if(weekend.contains(date)){
            return false;
        }
        return true;
    }

    public boolean isStarDay(int date) {
        if(satrtDays.contains(date)){
            return true;
        }
        return false;
    }
    
}
