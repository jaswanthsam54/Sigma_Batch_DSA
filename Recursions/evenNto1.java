import java.util.*;

public class Main {

    static void printEven(int n) {
        if (n < 2) return ;
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
        printEven(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
    }
}
