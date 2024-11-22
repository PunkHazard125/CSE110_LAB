import java.awt.SystemTray;
import java.util.*;

public class Problem_3 {

    public static ArrayList<Integer> create_list() {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++)
        {
            list.add(random.nextInt(100) + 1);
        }

        return list;

    }

    public static void select_sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++)
        {
            int min_index = i;

            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(j) < list.get(min_index))
                {
                    min_index = j;
                }
            }

            Collections.swap(list, i, min_index);
            
        }

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = create_list();

        StopWatch timer = new StopWatch();

        timer.start();

        select_sort(list);

        timer.stop();

        System.out.println("Elapsed time in milliseconds: " + timer.getElapsedTime());

        scanner.close();
    }
    
}

class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {

        this.startTime = System.nanoTime();

    }

    public void start() {

        this.startTime = System.nanoTime();

    }

    public void stop() {

        this.endTime = System.nanoTime();

    }

    public double getElapsedTime() {

        return (this.endTime - this.startTime) / 1_000_000.00;

    }

}
