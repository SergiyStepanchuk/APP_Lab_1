package Global;

public class CustomDouble
{
    public double whole = 0;
    public double fractional = 0;

    public CustomDouble(final double whole, final double fractional) {
        this.whole = whole;
        this.fractional = fractional;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomDouble)) return false;

        final CustomDouble that = (CustomDouble) o;

        if (Double.compare(that.whole, whole) != 0) return false;
        return Double.compare(that.fractional, fractional) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(whole);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fractional);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double toDouble() {
        return whole + fractional;
    }
}