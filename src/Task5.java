import java.util.Scanner;

public class Task5 {
    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Ввести число: ");

        String figure = in.nextLine();
        int x=Integer.parseInt(figure);

        int res1=x*1;
        int res2=x*2;
        int res3=x*3;
        int res4=x*4;
        int res5=x*5;
        int res6=x*6;
        int res7=x*7;
        int res8=x*8;
        int res9=x*9;
        int res10=x*10;

        System.out.print("\nТаблица умножения числа "+x+":\n");
        System.out.print(figure+"*1="+res1+"\n");
        System.out.print(figure+"*2="+res2+"\n");
        System.out.print(figure+"*3="+res3+"\n");
        System.out.print(figure+"*4="+res4+"\n");
        System.out.print(figure+"*5="+res5+"\n");
        System.out.print(figure+"*6="+res6+"\n");
        System.out.print(figure+"*7="+res7+"\n");
        System.out.print(figure+"*8="+res8+"\n");
        System.out.print(figure+"*9="+res9+"\n");
        System.out.print(figure+"*10="+res10+"\n");
    }


   }
