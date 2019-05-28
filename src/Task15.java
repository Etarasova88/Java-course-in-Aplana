import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {

        int [] mArray = {1, 7, 22, 6, 9, 0, 12, 4};
        System.out.println(Arrays.toString(mArray));
        sort (mArray);
    }

    public static void sort (int[] arrayToSort) {

        for(int i = arrayToSort.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arrayToSort[j] > arrayToSort[j+1] ){
                int tmp = arrayToSort[j];
                arrayToSort[j] = arrayToSort[j+1];
                arrayToSort[j+1] = tmp;
            }
        }
    }

                System.out.print(Arrays.toString(arrayToSort));
            }
        }



