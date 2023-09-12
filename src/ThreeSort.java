import java.util.Scanner;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(c,Math.max(b,a));
        int min = Math.min(a,Math.min(b,c));

        System.out.println(min);
        System.out.println(a + b + c - max - min);
        System.out.print(max);

    }
}
