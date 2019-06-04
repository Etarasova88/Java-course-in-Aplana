import java.util.Scanner;

public class FinalTask3 {

    public static void main(String[] args) {

        float cc = 65.37f;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу сумму в рублях (если с копейками, то в формате 000000.00): ");
        double num = Double.parseDouble(in.nextLine());
        double dol = num / cc;
        System.out.printf("Ваша сумма в долларах составляет: %.2f $\n", dol);
    }
}
