import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество столбцов: ");
        int number1 = Integer.parseInt(in.nextLine());

        System.out.print("Введите количество строк: ");
        int number2 = Integer.parseInt(in.nextLine());

        int multiply[][] = new int[number2][number1];

        System.out.println("Введите числовые значения через Enter в количестве " + number1*number2 + "шт:");

        for (int i = 0; i < number2; i++) {
            for (int j = 0; j < number1; j++) {
                multiply[i][j] = Integer.parseInt(in.nextLine());

            }
        }

        System.out.println("Элементы массива с результатом умножения на 3:");
       // for (int i = 0; i < number2; i++) {
         for (int j = 0; j < number1; j++) {
                System.out.print(multiply[0][j] + " * 3 = " + multiply[0][j]*3 + ", ");
           //}
        }
    }
}