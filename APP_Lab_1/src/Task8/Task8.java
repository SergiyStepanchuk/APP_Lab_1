package Task8;
import Global.CustomDouble;

public class Task8
{
    public static void main(final String[] args) {
        final CustomDouble cs = new CustomDouble(1, 0.3);
        final CustomDouble cs2 = new CustomDouble(1, 0.3);
        final CustomDouble cs3 = new CustomDouble(22, 0.11);

        System.out.format("cs and cs2 %b\n", cs.equals(cs2));
        System.out.format("cs and cs3 %b\n", cs.equals(cs3));
        System.out.format("Output - %,.4f\n", cs3.toDouble());
    }
}
