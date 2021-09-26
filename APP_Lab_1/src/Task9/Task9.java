package Task9;

import Global.CustomDouble;
public class Task9
{
    public static void main(final String[] args)
    {
        final String[] iResultsMap = {
                "*",
                "/",
                "+",
                "-"
        };

        final int[] iResults = {
                CustomCalc.multiplication(1, 2), // addition
                CustomCalc.division(1, 2),
                CustomCalc.addition(1, 2),
                CustomCalc.subtraction(1, 2)
        };

        final double[] dResults = {
                CustomCalc.multiplication(new CustomDouble(1, 0), new CustomDouble(2, 0)), // addition
                CustomCalc.division(new CustomDouble(1, 0), new CustomDouble(2, 0)),
                CustomCalc.addition(new CustomDouble(1, 0), new CustomDouble(2, 0)),
                CustomCalc.subtraction(new CustomDouble(1, 0), new CustomDouble(2, 0))
        };

        System.out.format("Int calc results - \n");
        for (int i = 0; i < iResultsMap.length; i++)
            System.out.format("1 %s 2 = %d\n", iResultsMap[i], iResults[i]);

        System.out.format("Double calc results - \n");
        for (int i = 0; i < iResultsMap.length; i++)
            System.out.format("1.0 %s 2.0 = %,.04f\n", iResultsMap[i], dResults[i]);

    }
}
