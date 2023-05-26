import java.util.Scanner;

public class Task_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        if (x.equals("Вячеслав")) {
            System.out.println("Привет," + x);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}