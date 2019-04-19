import java.util.Scanner;

public class Task4 {
    public static void main(String [] args) {


       Scanner in = new Scanner(System.in);
       System.out.print("Ввести бинарное число: ");
            String figure = in.nextLine();

        int res = Integer.parseInt(figure, 2);

        System.out.print("Результат (int): ");
        System.out.println(res);
    }
}


