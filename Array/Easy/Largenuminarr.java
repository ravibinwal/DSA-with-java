/**
 * Largest_number_in _array
 */
public class Largenuminarr {

    static int largest(int n, int[] arr) {
        // code
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 7, 5, 90 };
        int n = 5;
        int output = largest(n, arr);
        System.out.println(output);
    }
}