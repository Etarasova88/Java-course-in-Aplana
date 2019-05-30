import java.io.*;

public class Task18 {

    public static void main(String[] args) throws IOException {

        String s;
        int lineNumber = 0;//объявили начальню отметку переменной
        try (BufferedReader r = new BufferedReader(new FileReader("C://Users//etarasova//Desktop//Java Курс для начинающих//Task17.txt"))) {
            while ((s = r.readLine()) != null) {
                System.out.println(s);
                lineNumber++;

            }

            System.out.print("Введите " + lineNumber + " строк текста для записи в файл." + "\n");


       //String text;
                try (FileWriter w = new FileWriter("C://Users//etarasova//Desktop//Java Курс для начинающих//Task17.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { //InputStreamReader(System.in) считыватель из консоли
                    for (int i = 0; i < lineNumber; i++) {
                        System.out.print("\"Начало строки: ");
                        if (i==lineNumber-1){
                            w.write(br.readLine());}
                        else{

                        w.write(br.readLine() + "\r\n");}

                    }
                }



        }
    }
}
        /*String text;
        try (FileWriter w = new FileWriter("C://Users//etarasova//Desktop//Java Курс для начинающих//Task17.txt", true)) {

            do {
                System.out.print("\"Начало строки: ");
                text = r.readLine();

                if (r.readLine().compareTo(lineNumber) = 0) break;
                text = text + "\r\n";
                w.write(text);

            }
            while (text.compareTo("stop") != 0);

        }
    }
}
*/