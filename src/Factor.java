import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Kết quả thông thường " + factor(n));
        System.out.println("Kết quả dde quy " + deQuy(n));
    }

    public static int factor(int n) {
        int pow = 1;
        for (int i = 1 ; i <= n; i ++) {
            pow *= i;
        }
        return pow;
    }

    public  static int deQuy(int n) {
        if (n == 1) return 1;
        return n * deQuy(n-1);
    }
    
}
