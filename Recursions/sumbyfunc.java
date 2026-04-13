import java.util.*;

public class Main {

    static int sumFunc(int n) {
         // WRITE LOGIC
        if (n == 1) return 1;
        return n + sumFunc(n - 1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFunc(n));
    }
}
