package datesandtimes;

import java.time.*;

public class DatesAndTimes {

    public static void main(String[] args) {
        calculateAge(LocalDate.of(1997, Month.SEPTEMBER, 4));
        System.out.println(howManyDaysToChristmas());
    }
    public static void calculateAge(LocalDate dob){
        LocalDate now = LocalDate.now();
        Period p = Period.between(dob, now);
        
        System.out.println(p);
    }

    private static String howManyDaysToChristmas() {
        return Period.between(LocalDate.now(), LocalDate.of(2018, Month.DECEMBER, 25)).toString();
    }

    public LocalDate createDate(short year, short month, short day) {
        return LocalDate.of(year, month, day);
    }

    private static boolean isBookLate(LocalDate dueDate, LocalDate dateReturned) {
        return dateReturned.isAfter(dueDate);
    }

    private static void createDateFromString(String date) {

    }
}
