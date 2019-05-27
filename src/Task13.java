import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку1: " + "\n");
        String text1 = in.nextLine();

        System.out.print("Введите строку2: " + "\n");
        String text2 = in.nextLine();


if(text1.length()-text2.length()!=0) {

    if (text1.length() - text2.length() > 0)
        System.out.print(text1);

    if (text1.length() - text2.length() < 0)
        System.out.print(text2);
}
        else

            System.out.print("Строки равны \n");
    }


}