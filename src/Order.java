import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        // Cách nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dãy 3 sô: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();



        if (x <= y && y <= z || x >= y && y >= z) {
            System.out.println("Dãy được sắp xếp theo thứ tự");
            System.out.println("Ở vị trí thứ 2 là số : " + y);
        }
        else System.out.println("Dãy không theo thứ tự");

    }
}