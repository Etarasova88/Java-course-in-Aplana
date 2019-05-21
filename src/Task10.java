import java.util.Scanner;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int number1 = Integer.parseInt(in.nextLine());

        System.out.print("Введите количество столбцов: ");
        int number2 = Integer.parseInt(in.nextLine());

        int multiply[][] = new int[number2][number1];

        System.out.println("Введите числовые значения через Enter в количестве " + number1*number2 + "шт: \n");

        for (int i = 0; i < number2; i++) {
            for (int j = 0; j < number1; j++) {
                multiply[i][j] = Integer.parseInt(in.nextLine());

            }
        }

        System.out.println("Элементы массива с результатом умножения на 3: \n");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < number1; j++) {
                System.out.print(multiply[i][j] + " * 3 = " + multiply[i][j]*3 + ", ");
            }
        }
    }
}