import java.util.Scanner;

public class divide {
    private static double calculate(String a, double a1, double b1) {
        switch (a) {

            case "divide":
                if (b1 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a1 / b1;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = x.nextDouble();

        System.out.print("Nhap b: ");
        double b = x.nextDouble();

        System.out.println("Chon phep tinh:");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");

        int key = x.nextInt();

        switch (key) {
            case 4:
                System.out.println("Ket qua: " + calculate("divide", a, b));
                break;

            default:
                System.out.println("Lua chon khong hop le!");
        }
    }
}
