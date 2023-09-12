import java.util.Scanner;

public class isPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int num = sc.nextInt();
        System.out.println(isPerfect(num));
        System.out.print("Nhập Khoảng số cần kiểm tra:");
        int count = sc.nextInt();
        numsPerfect(count);
    }

    public static boolean isPerfect(int num) {
        int i = 1;
        int sum = 0;
        if (num == 1) return true;
        while (i < num) {
            if (num % i == 0) sum += i;
            i++;
        }
        return sum == num;
    }

    public static void numsPerfect(int num) {
        int count = 1;
        System.out.println("Số hoàn hảo từ " + num + " số đầu tiên là:");
        while (count <= num) {
            if (isPerfect(count)) {
                System.out.print(count + " ");
            }
            count++;
        }
    }

}
