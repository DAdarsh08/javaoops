package Practice;


public class Day1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;
        int ans = missingNum(arr, n);
        System.out.println(ans);
    }

    public static int missingNum(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int s = 0;
        int diff;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];

        }
        diff = sum - s;
        return diff;

    }
}
