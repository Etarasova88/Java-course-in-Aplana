import java.io.*;

public class Task17 {

    public static void main(String[] args) {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите построчно текст для записи в файл. Для завершения введите Stop в новую строку." + "\n");
        String text;

        try (FileWriter w = new FileWriter("C://Users//etarasova//Desktop//Java Курс для начинающих//Task17.txt")) {
            do {
                System.out.print("\"Начало строки: ");
                text = r.readLine();

                if (text.compareTo("stop") == 0) break;
                text = text + "\r\n";
                w.write(text);

            }
            while (text.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }

}
