import java.util.*;

public class Problem_2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] days = new String[7];

        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        String[] months = new String[12];

        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        String month = months[calendar.get(Calendar.MONTH)];
        String week_day = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.print("Current Time: ");
        System.out.println(week_day + ", " + month + " " + day + ", " + year);

        calendar.setTimeInMillis(1234567898765L);

        year = calendar.get(Calendar.YEAR);
        month = months[calendar.get(Calendar.MONTH)];
        week_day = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.print("Time after applying setTimeInMillis(1234567898765L): ");
        System.out.println(week_day + ", " + month + " " + day + ", " + year);

        scanner.close();
    }
    
}
