package Task4;

public class Task4
{
    public static void main(final String[] args)
    {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0)
                System.out.print("FizzBuzz");
            else if (i % 5 == 0)
                System.out.print("Buzz");
            else if (i % 3 == 0)
                System.out.print("Fizz");
            else
                System.out.print(i);
            System.out.print(" ");
            if (i % 20 == 0)
                System.out.print('\n');
        }
        System.out.print('\n');
    }
}
