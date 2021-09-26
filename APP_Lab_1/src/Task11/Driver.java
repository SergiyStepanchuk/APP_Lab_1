package Task11;

public class Driver
{
    private String name;
    private boolean ready;

    public Driver(final String name, final Boolean ready)
    {
        this.name = name;
        this.ready = ready;
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Driver driver = (Driver) o;

        return name != null ? name.equals(driver.name) : driver.name == null;
    }

    @Override
    public int hashCode()
    {
        return name != null ? name.hashCode() : 0;
    }

    public String getName()
    {
        return name;
    }

    public boolean isReady()
    {
        return ready;
    }

    public void setReady(final boolean ready)
    {
        this.ready = ready;
    }
}
