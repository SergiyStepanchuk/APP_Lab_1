package Task10;

import java.util.Arrays;

public class WeatherDay
{
    public enum Time {
        Night,
        Morning,
        Afternoon,
        Evening
    }

    private Weather[] weather;

    public WeatherDay(final Weather[] weather)
    {
        this.weather = weather;
    }

    public Weather getWeather(final Time dayTime)
    {
        return weather[dayTime.ordinal()];
    }

    @Override
    public String toString() {
        String outStr = "";
        for (int i = 0; i < weather.length; i++)
            outStr += String.format("%.7s\t\t- %s\n", Time.values()[i].toString(), weather[i].toString());
        return outStr;
    }
}
