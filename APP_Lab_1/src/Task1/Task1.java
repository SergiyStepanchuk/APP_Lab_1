package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class Task1
{
    public static void main(final String[] args)
    {
        final String[] arr = {
                "1",
                "22",
                "333",
                "4444",
                "55555",
                "666666",
                "7777777"
        };
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());

        System.out.println("\t\t\t");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
