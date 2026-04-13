import java.util.*;

public class Main {

    static int sumEven(int[] arr, int i) {
        if (i == arr.length - 1 ) return arr[i];
        int rc = sumEven(arr,i+1);
        int ans;
        if (arr[i] % 2 == 0){
            ans = 0 + arr[i];
        }
        else {
            ans = rc;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println(sumEven(arr, 0));
    }
}
