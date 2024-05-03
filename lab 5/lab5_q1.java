
public class lab5_q1 {
    public static void main(String[] args) {
         lab5_q1 object= new lab5_q1();

        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10, 12};

        int[] C = object.mergearr(A, B);
        
        System.out.println("Merged Array:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }

    int[] mergearr(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < m) {
            C[k++] = A[i++];
        }

        while (j < n) {
            C[k++] = B[j++];
        }

        return C;
    }
}


