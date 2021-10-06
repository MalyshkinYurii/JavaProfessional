package homework3.task2;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class Main {
    //Создайте файл, запишите в него произвольные данные и закройте файл.
    // Затем снова откройте этот файл, прочитайте из него данные(выведете их на консоль), измените данные и запишите их в другой файл.
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("H:\\Malyshkin_Java_Professional\\test.txt");
        Path path2 = Paths.get("H:\\Malyshkin_Java_Professional\\test2.txt");
        //Files.createFile(path);
        Files.write(path, "ddasdasdasd\nsda".getBytes(StandardCharsets.UTF_8));
        System.out.println(Files.readAllLines(path));
        Files.write(path, "newnewenw".getBytes(StandardCharsets.UTF_8));
        Files.copy(path, path2);

    }
}
