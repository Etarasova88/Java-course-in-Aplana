import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Сколько значений вы хотите ввести: ");
        //       String t1 = in.nextLine();
        int number = Integer.parseInt(in.nextLine());
        int mult[] = new int[number];

        System.out.println("Введите числа через Enter в количестве " + number + "шт: \n");

        for (int i = 0; i < number; i++) {
            mult[i] = Integer.parseInt(in.nextLine());

        }


        System.out.println("Элементы массива с результатом умножения на 2: \n");
        for (int i = 0; i < number; i++)
        {
           System.out.println(mult[i]+"* 2 = " + mult[i]*2 +"\n");
}
    }
}
