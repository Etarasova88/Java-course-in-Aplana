import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: " + "\n");
        String text = in.nextLine();

        System.out.println("Результат без пробелов: " + text.replace(" ", ""));
    }
}
