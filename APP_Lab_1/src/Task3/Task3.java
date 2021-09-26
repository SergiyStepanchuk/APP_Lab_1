package Task3;

import java.util.Arrays;

public class Task3
{
    public static void main(final String[] args)
    {

        final char[] chArr = {'a', 'b', 'c', 'd'};
        final int[]  iArr =  {1, 2, 3, 4};

        System.out.format("Char array -\t%s\n", Arrays.toString(chArr));
        System.out.format("Int array -\t\t%s\n", Arrays.toString(iArr));
        System.out.format("Output -\t\t%s\n", combineIntArrayCharArrayToString(iArr, chArr));
    }

    public static String combineIntArrayCharArrayToString(final int[] iArr, final char[] chArr)
    {
        String outStr = "";
        final int maxSize = chArr.length > iArr.length ? chArr.length : iArr.length;
        for (int i = 0; i < maxSize; i++)
            outStr += (i < iArr.length ? String.valueOf(iArr[i]) : "") +
                    (i < chArr.length ? String.valueOf(chArr[i]) : "");
        return outStr;
    }
}
