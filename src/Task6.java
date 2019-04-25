import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.OptionalDouble;

public class  Task6 {



    public static void main(String [] args) {
      Scanner in=new Scanner(System.in);
        System.out.print("Ввести число x: ");
      String x1 = in.nextLine();
        System.out.print("Ввести число y: ");
      String y1 = in.nextLine();
        System.out.print("Ввести число z: ");
      String z1 = in.nextLine();


        int x2=Integer.parseInt(x1);
        int y2=Integer.parseInt(y1);
        int z2=Integer.parseInt(z1);


        int average=(x2+y2+z2)/3;
      System.out.print("Среднее значение =" + average +"\n");
      int divide=average/2;

        if (divide>3)
                        System.out.print("Программа выполнена корректно" );

    }
}
