package Task7;

public class Task7
{
    public static void main(final String[] args)
    {
        final User us = new User();
        final User us2 = new User();
        final User us3 = new User();
        us3.age = 22;

        System.out.format("us and us2 %b\n", us.equals(us2));
        System.out.format("us and us3 %b\n", us.equals(us3));

        System.out.format("us and us2 %b\n", us.equals(us2));
        System.out.format("us and us3 %b\n", us.equals(us3));
    }
}
