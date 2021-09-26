package Task11;

public class Order {

    Car car;

    private final double costkm = 50;
    private double price;
    private double way;

    public void getPrice()
    {
        price = costkm * way;
    }

    public void order (final Car car )
    {
        final var driver = car.getDriver();

        if (driver.isReady())
        {
            System.out.println("Order started!\n" +"Price = " + price +"\n" + "Your driver is "  + driver.getName() +"." +
                    " Wait for " + car.getColor() +" "+ car.getBrand() + " with numberplate: " + car.getNumberplate() + ".\n");
            driver.setReady(false);
        }
        else
            System.out.println("This driver is busy!\n" + "choose another or wait if all busy.\n");

    }
    public void endOrder (final Car car)
    {
        final var driver = car.getDriver();
        if (!driver.isReady())
        {
            driver.setReady(true);
            System.out.println("Order canceled!\n");
        }

    }
    public static void main(final String[] args)
    {
        final Car car1 = new Car("Mazda", 4321 ,"red");
        final Car car2 = new Car("Ford",3252, "white");
        final Car car3 = new Car("Subaru",7890,"lightblue");

        final Driver d1 = new Driver("John",true);
        final Driver d2 = new Driver("Steve",true);
        final Driver d3 = new Driver("Juzo",true);

        car1.setDriver(d1);
        car2.setDriver(d3);

        final Order o1 = new Order();
        final Order o2 = new Order();

        o1.way = 20;
        o1.getPrice();
        o1.order(car1);
        o2.way = 30;
        o2.getPrice();
        o2.order(car1);
        o1.endOrder(car1);
        car1.setDriver(d2);
        o2.way = 15;
        o2.getPrice();
        o2.order(car1);
        o1.way = 12;
        o1.getPrice();
        o1.order(car2);
    }
}
