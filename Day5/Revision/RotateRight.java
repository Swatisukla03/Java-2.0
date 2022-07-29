package Day5.Revision;

public class RotateRight {
    public static void rotateRight(int arr[], int n, int d) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }

        for (int i = 0; i < d; i++) {

            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;

        }
        System.out.println();
        System.out.println("After Rotation :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    

    public static void main(String args[]) {
        int arr[] = { 4, 6, 8, 9, 1, 2, 7 };
        int d = 4;
        int n = arr.length;
        rotateRight(arr, n, d);

    }

}
