package Task2;

public class Task2
{
    public static void main(final String[] args) {
        final char ch = 'a';
        final String str = "aaabbaaa";
        int counter = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ch)
                ++counter;

        System.out.format("%d '%c' in '%s'\n", counter, ch, str);
    }
}