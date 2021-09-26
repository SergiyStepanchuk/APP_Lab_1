package Task10;

public class Task10
{
    public static void main(final String[] args)
    {
        final WeatherDay[] weekWeather = {
             new WeatherDay(new Weather[]{ // Mounday
                     new Weather(11, 764, 76), // Night
                     new Weather(12, 755, 66), // Morning
                     new Weather(13, 711, 55), // Afternoon
                     new Weather(14, 714, 50) // Evening
             }),
            new WeatherDay(new Weather[]{ // Tuesday
                    new Weather(11, 764, 76), // Night
                    new Weather(12, 755, 66), // Morning
                    new Weather(13, 711, 55), // Afternoon
                    new Weather(14, 714, 50) // Evening
            }),
            new WeatherDay(new Weather[]{ // Wednesday
                    new Weather(11, 764, 76), // Night
                    new Weather(12, 755, 66), // Morning
                    new Weather(13, 711, 55), // Afternoon
                    new Weather(14, 714, 50) // Evening
            }),
            new WeatherDay(new Weather[]{ // Thursday
                    new Weather(11, 764, 76), // Night
                    new Weather(12, 755, 66), // Morning
                    new Weather(13, 711, 55), // Afternoon
                    new Weather(14, 714, 50) // Evening
            }),
            new WeatherDay(new Weather[]{ // Friday
                    new Weather(11, 764, 76), // Night
                    new Weather(12, 755, 66), // Morning
                    new Weather(13, 711, 55), // Afternoon
                    new Weather(14, 714, 50) // Evening
            }),
            new WeatherDay(new Weather[]{ // Saturday
                    new Weather(11, 764, 76), // Night
                    new Weather(12, 755, 66), // Morning
                    new Weather(13, 711, 55), // Afternoon
                    new Weather(14, 714, 50) // Evening
            }),
            new WeatherDay(new Weather[]{ // Sunday
                    new Weather(11, 764, 76), // Night
                    new Weather(12, 755, 66), // Morning
                    new Weather(13, 711, 55), // Afternoon
                    new Weather(14, 714, 50) // Evening
            })
        };

        for (int i = 0; i < WeekDay.values().length; i++)
            System.out.println(WeekDay.values()[i].toString() + ":\n" + weekWeather[i].toString());
    }
}
