import java.util.Scanner;

public class Electric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá tiền m1 cho 100 số đầu
        System.out.print("Nhập giá tiền m1 cho 100 số đầu: ");
        double m1 = scanner.nextDouble();

        // Nhập giá tiền m2 cho số thứ 101 trở đi
        System.out.print("Nhập giá tiền m2 cho số thứ 101 trở đi: ");
        double m2 = scanner.nextDouble();

        // Nhập số điện năng tiêu thụ
        System.out.print("Nhập số điện năng tiêu thụ: ");
        double s = scanner.nextDouble();

        // Tính tiền điện phải trả
        double totalCost = calculateElectricityBill(m1, m2, s);

        // Hiển thị kết quả
        System.out.println("Tiền điện phải trả: " + totalCost + " đồng");

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức tính tiền điện phải trả dựa trên các thông số m1, m2 và số điện năng tiêu thụ s
    public static double calculateElectricityBill(double m1, double m2, double s) {
        double totalCost;

        // Nếu số điện năng tiêu thụ s ít hơn hoặc bằng 100, tính theo mức m1
        if (s <= 100) {
            totalCost = s * m1;
        } else {
            // Tính tiền cho 100 số đầu theo m1 và số còn lại theo m2
            totalCost = 100 * m1 + (s - 100) * m2;
        }

        return totalCost;
    }
}
