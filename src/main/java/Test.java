import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static final String STOP = "--stop";
    private static boolean status = true;

    public static void main(String[] args) throws InterruptedException, IOException {
        FileWriter fileWriter = new FileWriter("D:\\textFromUser.txt", true);
        while (status) {
            StringBuilder sb = new StringBuilder();
            System.out.println("Введите текст:");
            String proverkaNaStop = scanner.nextLine();
            if (!proverkaNaStop.equals(STOP)) {
                sb.append(proverkaNaStop);
                fileWriter.write(sb + "\n");
            } else {
                fileWriter.close();
                System.out.println("Программа завершила работу!");
                status = false;
            }
        }
    }
}