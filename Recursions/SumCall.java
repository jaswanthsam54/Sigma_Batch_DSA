import java.util.*;

public class Main {

    static void sumParam(int n, int acc) {
        if ( n == 0) { 
        System.out.println(acc);
        return ;
    }
    
    sumParam(n - 1 , acc + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumParam(n, 0);
    }
}
