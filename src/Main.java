import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Введите путь:");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExist || isDirectory ) {
                System.out.println("Указанный файл не существует или указанный путь является путём к папке");

            }
            else {
                n++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + n);
            }
        }
    };
};
