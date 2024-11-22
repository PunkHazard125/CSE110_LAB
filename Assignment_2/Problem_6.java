import java.util.*;

public class Problem_6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Time time_1 = new Time();
        Time time_2 = new Time(555550000);

        System.out.println("Current Time: " + time_1.get_time());
        System.out.println("Time after specific elapsed time: " + time_2.get_time());

        scanner.close();
    }
    
}

class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {

        GregorianCalendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

    }

    public Time(long mili_sec) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(mili_sec);

        this.hour = calendar.get(Calendar.HOUR);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

    }

    public Time(int h, int m, int s) {

        this.hour = h;
        this.minute = m;
        this.second = s;

    }

    public int getHour() {

        return this.hour;

    }

    public int getMinute() {

        return this.minute;

    }

    public int getSecond() {

        return this.second;

    }

    public String get_time() {

        return this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();

    }

    public void setTime(long elapseTime) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapseTime);

        this.hour = calendar.get(Calendar.HOUR);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

    }

}
