class Vehicle {
    protected String regnum, color, ownerName;
    protected int speed;
    public void showData() {
    System.out.println("This is a Vehicle Class");
    }
    }
    class Bus extends Vehicle {
    private int routeNumber;
    public Bus(String regno, String c, String owner, int sp, int route) {
    regnum = regno;
    color = c;
    ownerName = owner;
    speed = sp;
    routeNumber = route;
    }
    public void showData() {
    super.showData();
    System.out.println("Reg no: " + regnum);
    System.out.println("Color: " + color);
    System.out.println("Owner: " + ownerName);
    System.out.println("Speed: " + speed);
    System.out.println("Route: " + routeNumber);
    }
    }
    class Car extends Vehicle {
    private String manufacturerName;
    public Car(String regno, String c, String owner, int sp, String manu)
    {
    regnum = regno;
    color = c;
    ownerName = owner;
    speed = sp;
    manufacturerName = manu;
    }
    public void showData() {
    super.showData();
    System.out.println("Reg no: " + regnum);
    System.out.println("Color: " + color);
    System.out.println("Owner: " + ownerName);
    System.out.println("Speed: " + speed);
    System.out.println("Manufacturer: " + manufacturerName);
    }
    }
    public class lab5_q6b {
    public static void main(String[] args) {
    Bus b = new Bus("1111", "Blue", "Abhinav", 50, 122);
    b.showData();
    Car c = new Car("2222", "Red", "Archit", 129, "Supra");
    c.showData();
    }
    }