import java.util.Scanner;


public class Task7 {

    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Ввести число T: ");
        String t1 = in.nextLine();

        int t=Integer.parseInt(t1);
        int x=7;
        int y=23;
        int z=65;

    if (t == x)
        System.out.print("Данное значение имеется в константе  X\n");

    else if (t == y)
        System.out.print("Данное значение имеется в константе Y\n");

    else if (t == z)
        System.out.print("Данное значение имеется в константе Z\n");


           else
            System.out.print("Такой константы нет!\n");


        }
    }



