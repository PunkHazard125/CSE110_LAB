import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;

@SuppressWarnings("unused")

public class Generics_5 {

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        for (int check = 0; check < (list.size() - 1); check++)
        {
            for (int index = 0; index < (list.size() - check - 1); index++)
            {
                if (list.get(index).compareTo(list.get(index + 1)) > 0)
                {
                    Collections.swap(list, index, index + 1);
                }
            }
        }
    }
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 5; i > 0; i--) 
        {
            list.add(i);
        }

        sort(list);

        System.out.println("Sorted list: " + list);

        scanner.close();
    }
}
