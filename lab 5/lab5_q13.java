class Distance {
    protected double distanceInMiles;
    public Distance(double distanceInMiles) {
    this.distanceInMiles = distanceInMiles;
    }
    public void travelTime() {
    double timeInHours = distanceInMiles / 60;
    System.out.println("Time taken to cover the distance: " +
    timeInHours + " hours");
    }
    }
    class DistanceMKS extends Distance {
    public DistanceMKS(double distanceInMiles) {
    super(distanceInMiles);
    }
    @Override
    public void travelTime() {
    double distanceInKilometers = distanceInMiles * 1.60934; //Conversion from miles to kilometers
    double timeInHours = distanceInKilometers / 100; // Assuming speed is 100 kilometers per hour
    System.out.println("Time taken to cover the distance: " +
    timeInHours + " hours");
    }
    }
    public class lab5_q13 {
    public static void main(String[] args) {
    Distance distance = new Distance(250);
    System.out.println("For Distance:");
    distance.travelTime();
    DistanceMKS distanceMKS = new DistanceMKS(250);
    System.out.println("For DistanceMKS:");
    distanceMKS.travelTime();
    }
    }