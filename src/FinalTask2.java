import java.util.Scanner;
import java.util.Arrays;

public class FinalTask2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Сколько значений вы хотите ввести: ");

        int number = Integer.parseInt(in.nextLine());
        int[] mArray = new int[number];

        System.out.println("Введите числа через Enter в количестве " + number + "шт: \n");

        for (int i = 0; i < number; i++) {
            mArray[i] = Integer.parseInt(in.nextLine());

        }
        sort(mArray);
    }

    public static void sort(int[] arrayToSort) {
        int temp, j;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                temp = arrayToSort[i + 1];
                arrayToSort[i + 1] = arrayToSort[i];
                j = i;
                while (j > 0 && temp < arrayToSort[j - 1]) {
                    arrayToSort[j] = arrayToSort[j - 1];
                    j--;
                }
                arrayToSort[j] = temp;
            }
        }
        System.out.print(Arrays.toString(arrayToSort));
    }


}

