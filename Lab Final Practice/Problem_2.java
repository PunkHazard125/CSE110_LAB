import java.util.*;
import java.math.*;

@SuppressWarnings("unused")

public class Problem_2 {

    public static <T extends Comparable<T>> T findMaxElement(T[] array) throws EmptyArrayException {

        if (array == null || array.length == 0) 
        {
            throw new EmptyArrayException("Array is empty");
        }

        T max = array[0];

        for (T element : array) 
        {
            if (element.compareTo(max) > 0) 
            {
                max = element;
            }
        }

        return max;

    }
    
    public static void main(String[] args) {

        Integer[] intArray = {1, 5, 3, 8, 2};
        String[] strArray = {"apple", "zebra", "banana"};
        Double[] doubleArray = {3.14, 2.71, 1.414, 9.81};
        Character[] charArray = new Character[0];

        try
        {
            System.out.println("Integer array max: " + findMaxElement(intArray));
            System.out.println("String array max: " + findMaxElement(strArray));
            System.out.println("Double array max: " + findMaxElement(doubleArray));
            System.out.println("Character array max: " + findMaxElement(charArray));
        } 
        catch (EmptyArrayException ex) 
        {
            ex.printStackTrace();
        }
    }

}

class EmptyArrayException extends Exception {

    public EmptyArrayException(String message)
    {
        super(message);
    }

}
