package Task11;

public class Car {

    private Driver driver;
    private String brand;
    private int numberplate;
    private String color;

    public Car(final String brand, final int numberplate, final String colour ){
        this.brand = brand;
        this.numberplate = numberplate;
        this.color = colour;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Car car = (Car) o;

        if (numberplate != car.numberplate) return false;
        if (driver != null ? !driver.equals(car.driver) : car.driver != null) return false;
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = driver != null ? driver.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + numberplate;
        return result;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberplate() {
        return numberplate;
    }

    public String getColor() {
        return color;
    }

    public void setDriver(final Driver driver) {
        this.driver = driver;
    }
}
