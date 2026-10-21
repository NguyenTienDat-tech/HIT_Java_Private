import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp chiều dài: ");
        double dai = sc.nextDouble();
        System.out.print("Nhâp chiều dài: ");
        double rong = sc.nextDouble();
        System.out.println("Chu vi: " + (dai + rong) * 2.0);
        System.out.println("Diện tích: " + dai * rong);
    }
}