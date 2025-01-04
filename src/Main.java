import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Введите путь:");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();

            if (fileExist) {
                System.out.println("Путь указан верно");
                continue;
            }
            ;
            if (isDirectory)
                System.out.println("Указанный путь является путём к папке");
            else
                System.out.println("Указанный файл не существует");


        }

    };
};
