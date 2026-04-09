public class Main {

    static void printDesc(int n) {
        if (n == 0) return ; 
        System.out.println(n + " ");
        printDesc(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printDesc(n);
    }
}
