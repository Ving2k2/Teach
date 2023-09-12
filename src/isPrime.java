import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        System.out.print("Nhập Khoảng số cần kiểm tra:");
        int count = sc.nextInt();
        numsPrime(count);
    }

    public static boolean isPrime(int num) {
        int count = 0;
        if (num == 1) return true;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;
        return count == 2;
    }

    public static void numsPrime(int num) {
        int count = 0;
        int i = 1;
        System.out.println("Số hoàn hảo từ " + num + " số đầu tiên là:");
        while (count <= num) {
            if (isPrime(0)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static void numsPrime(int num, int num2) {
        System.out.println("Số hoàn hảo nằm trong khoảng" + num + " và " + num2 + " là:");
        for (int i = num; num <= num2; num++)
            if (isPrime(num)) {
                System.out.print(num+ " ");
            }
    }
}
