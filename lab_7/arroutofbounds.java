public class arroutofbounds {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Outside catch print.");
    }
}



//java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
//Outside catch print.