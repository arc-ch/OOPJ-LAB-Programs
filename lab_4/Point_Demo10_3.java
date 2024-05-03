
public class Point_Demo10_3 {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.show();  
        Point point2 = new Point(10, 7, 5);
        point2.show(); 
        Point point3 = new Point(point2);
        point3.show();

        System.out.println("Distance from origin: " +point2.find_distance());

        System.out.println("Distance between point: " + point2.find_distance(4, 8, 3));

        System.out.println("Equal check: " + point2.is_Equal(point3));
    }
}
class Point {
    int x;
    int y;
    int z;
   Point() {
       x = 0;
       y = 0;
       z = 0;
   }

   Point(int x, int y, int z) {
       this.x = x;
       this.y = y;
       this.z = z;
   }

   Point(Point p) {
       this.x = p.x;
       this.y = p.y;
       this.z = p.z;
   }

   float find_distance() {
       return (float)Math.sqrt(x * x + y * y + z * z);
   }

   float find_distance(int x1, int y1, int z1) {
       int dx = x - x1;
       int dy = y - y1;
       int dz = z - z1;
       double p=Math.sqrt(dx * dx + dy * dy + dz * dz);
       return (float)p ;
   }

   float find_distance(Point p) {
       int dx = x - p.x;
       int dy = y - p.y;
       int dz = z - p.z;
       return (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
   }
   boolean is_Equal(Point p) {
       return (x == p.x && y == p.y && z == p.z);
   }
   void show() {
       System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
   }
}

