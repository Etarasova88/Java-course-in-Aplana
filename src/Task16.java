import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {

    public static void main(String[] args) {
        String s;
        try (BufferedReader r = new BufferedReader(new FileReader("C://Users//etarasova//Desktop//Java Курс для начинающих//notes.txt"))) {
            while ((s = r.readLine()) != null) {
                System.out.println(s);

            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}