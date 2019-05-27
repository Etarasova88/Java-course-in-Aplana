import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число больше или равное нулю " + "\n");
        String s = in.nextLine();

        int x = Integer.parseInt(s);

        double y = (double)x;

        System.out.print("Результат: \n" + s + "\n" + x + "\n"+ y + "\n");


    }

}
