package Day10;

public class lastOccur {

    public static int lastIndex(int arr[], int index, int val) {

        if (index == arr.length)
            return -1;

        int last_index = lastIndex(arr, index + 1, val);
        if (last_index == -1) {
            if (arr[index] == val) {
                return index;
            } else {
                return -1;
            }
        } else {
            return last_index;
        }

    }

    public static void main(String args[]) {
        int arr[] ={1, 3, 5, 5, 5, 5, 67,5, 123, 125} ;
        int val=5;
        int l_index = lastIndex(arr, 0, val);
        System.out.println(l_index);

    }

}
