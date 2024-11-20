import java.util.*;

public class Problem_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(12) + 1;
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

        System.out.println("Random Month: " + months[number - 1]);

        scanner.close();
    }
}
