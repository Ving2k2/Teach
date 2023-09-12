import java.util.Scanner;

public class Euclide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập toạ độ điểm 1:");
        System.out.print("Toạ độ x: ");
        double x1 = sc.nextDouble();
        System.out.print("Toạ độ y: ");
        double y1 = sc.nextDouble();

        System.out.println("--------------");

        System.out.println("Nhập toạ độ điểm 2:");
        System.out.print("Toạ độ x: ");
        double x2 = sc.nextDouble();
        System.out.print("Toạ độ y: ");
        double y2 = sc.nextDouble();

        System.out.println("--------------");
        double e = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("Khoảng cách giữa 2 điểm là: " + e);
    }
}
