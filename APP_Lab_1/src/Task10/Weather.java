package Task10;

public class Weather
{
    private final double temperature; // температура
    private final double pressure; // тиск
    private final double humidity; // вологість

    public Weather(final double temperature, final double pressure, final double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return  temperature + "°\t\t" + pressure + "мм.рт.ст.\t\t" + humidity + "%";
    }
}
