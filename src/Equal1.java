import java.util.Scanner;

public class Equal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Equation has no integer solution");
            return;
        }

        // ax + by = c
        for (int x = 0; x <= c; x++) {
            int y = (c - a * x) / b;
            if ((c - a * x) % b == 0 && y > 0) {
                System.out.println("Nghiệm x: " + x + ", Nghiệm y: " + y);
                    }
                }
            }
}