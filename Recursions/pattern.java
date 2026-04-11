import java.util.*;

public class Main {

    static void pattern(int n) {
        if (n == 0) return ;
        System.out.print(n + " ");
        pattern(n - 1);
        System.out.print(n + " ");
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
