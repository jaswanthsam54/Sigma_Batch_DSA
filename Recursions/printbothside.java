public class Main {

    static void printBoth(int n) {
        if (n == 0) return ;
        System.out.print(n + " ");
        printBoth(n - 1);
        if (n == 1) System.out.println();
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 3;
        printBoth(n);
    }
}
//3 2 1 
//1 2 3
