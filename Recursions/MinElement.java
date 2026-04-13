import java.util.*;

public class Main {

    static int min(int[] arr, int i) {
        // use ansFromBelow + ans
        if (i == arr.length - 1) return arr[i];
        int ans = min(arr,i + 1);
        return Math.min(arr[i] , ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println(min(arr, 0));
    }
}
