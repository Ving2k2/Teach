import java.util.Scanner;

public class Equal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        int d = scanner.nextInt();

        // x + y + z = e
        for (int x = 0; x <= e; x++) {
            for (int y = 0; y <= e - x; y++) {
                int z = e - x - y;
                // ax + by + cz = d
                if (z >= 0 && a*x + b*y + c*z == d) {
                    System.out.println("nghiệm x: " + x + ", nghiệm y: " + y + "nghiệm z: " + z);
                }
            }
        }

        // Nhập dữ liệu cho bài toán vừa gà vừa chó: x và y
        // x + y = 36
        int totalAnimals1 = 36;
        // 4x + 2y = 100
        int totalLegs1 = 100;

        for (int x = 0; x <= 36; x++) {
            int y = 36 - x;
            if (4 * x + 2 * y == 100 && y >= 0) {
                System.out.println("Số chó: " + x + ", số gà: " + y);
            }
        }


        // 100 bò với 100 cỏ
        // x + y + z = 100
        // X là bò đứng thì ăn 5 cỏ
        // Y là bò nằm thì 3 cỏ
        // Z là bò bệnh thì 3 con ăn hết 1 cỏ
        // In ra X, Y, Z
    }
}
