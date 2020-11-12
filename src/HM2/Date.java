package HM2;

import java.util.Calendar;

public class Date {
    public static void main(String[] args) {

        addHours(2);

    }
    public static void addHours(int hour){
        int time = hour;
        ++time;
        Calendar cls = Calendar.getInstance();
        java.util.Date dt = cls.getTime();
        cls.add(Calendar.HOUR_OF_DAY, time);
        java.util.Date date = cls.getTime();
        System.out.println("Current time "+dt);
        System.out.println("Time after adding hours: "+date);
    }
}
