import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền cần gửi: ");
        double money = sc.nextDouble();
        System.out.print("Nhập lãi ngân hàng: ");
        double profit = sc.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        double month = sc.nextDouble();
        System.out.println("Số tiền nhận được sau " + month + " gửi là: " + profitKMonth(money, profit, month));
        System.out.println("Số tiền lãi nhận được sau " + month + " gửi là: " + (profitKMonth(money, profit, month) - money));
        System.out.println("Số tháng cần được gửi là: " + monthToProfit(money, profitKMonth(money, profit, month), profit));
        System.out.println("Số tiền cần được gửi là: " + moneyToTarget(profitKMonth(money, profit, month), month, profit));

    }

     public static double profitKMonth(double money, double profit, double month) {
         if (month == 0) return money;
         money += money * (profit / 100);
        return profitKMonth(money, profit, month - 1);

        // return money * Math.pow(1 + (profit)/100, month);
         // m - money * Math.pow(1 + (profit)/100, month)
         // m (1-  Math.pow(1 + (profit)/100, month))
     }

     public static int monthToProfit(double money, double targetMoney, double profit) {
        double m = Math.log(targetMoney / money) / Math.log(1 + (profit / 100));
        return (int) m;
     }

    // Phương thức tính số vốn cần gửi ban đầu để nhận được số tiền m trong t tháng với lãi suất hàng tháng
    public static double moneyToTarget(double targetMoney, double month, double profit ) {
        // Sử dụng phương trình giải n để tính số vốn ban đầu cần gửi
        double money = targetMoney / Math.pow(1 + profit / 100, month);
        return money;
    }

}
