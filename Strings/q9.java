public class q9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        
        String result = sb.toString();
        System.out.println(result);
    }
}
