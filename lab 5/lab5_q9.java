class Building {
     int numberOfFloors;
     int numberOfRooms;
     double totalFootage;
    public Building(int numberOfFloors, int numberOfRooms, double
    totalFootage) {
    this.numberOfFloors = numberOfFloors;
    this.numberOfRooms = numberOfRooms;
    this.totalFootage = totalFootage;
    }
    public void displayInformation() {
    System.out.println("Number of Floors: " + numberOfFloors);
    System.out.println("Number of Rooms: " + numberOfRooms);
    System.out.println("Total Footage: " + totalFootage);
    }
    }
    class House extends Building {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    public House(int numberOfFloors, int numberOfRooms, double
    totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
    super(numberOfFloors, numberOfRooms, totalFootage);
    this.numberOfBedrooms = numberOfBedrooms;
    this.numberOfBathrooms = numberOfBathrooms;
    }
    @Override
    public void displayInformation() {
    super.displayInformation();
    System.out.println("Number of Bedrooms: " + numberOfBedrooms);
    System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }
    }
    class Office extends Building {
    private int numberOfTelephones;
    private int numberOfTables;
    public Office(int numberOfFloors, int numberOfRooms, double
    totalFootage, int numberOfTelephones, int numberOfTables) {
    super(numberOfFloors, numberOfRooms, totalFootage);
    this.numberOfTelephones = numberOfTelephones;
    this.numberOfTables = numberOfTables;
    }
    @Override
    public void displayInformation() {
    super.displayInformation();
    System.out.println("Number of Telephones: " + numberOfTelephones);
    System.out.println("Number of Tables: " + numberOfTables);
    }
    }
    public class lab5_q9 {
    public static void main(String[] args) {
    Building building = new Building(10, 50, 10000.0);
    House house = new House(4, 10, 3000.0, 4, 5);
    Office office = new Office(2, 15, 4000.0, 20, 25);
    System.out.println("Building Information:");
    building.displayInformation();
    System.out.println("\nHouse Information:");
    house.displayInformation();
    System.out.println("\nOffice Information:");
    office.displayInformation();
    }
    }