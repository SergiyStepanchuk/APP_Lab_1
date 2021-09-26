package Task9;

import Global.CustomDouble;

public class CustomCalc
{
    public static double multiplication(final CustomDouble f, final CustomDouble s)
    {
        return f.toDouble() * s.toDouble();
    }
    public static double division(final CustomDouble f, final CustomDouble s)
    {
        return f.toDouble() / s.toDouble();
    }
    public static double addition(final CustomDouble f, final CustomDouble s)
    {
        return f.toDouble() + s.toDouble();
    }
    public static double subtraction(final CustomDouble f, final CustomDouble s)
    {
        return f.toDouble() - s.toDouble();
    }

    public static int multiplication(final int f, final int s)
    {
        return f * s;
    }
    public static int division(final int f, final int s)
    {
        return f / s;
    }
    public static int addition(final int f, final int s)
    {
        return f + s;
    }
    public static int subtraction(final int f, final int s)
    {
        return f - s;
    }
}
