import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;

public class Helloworld {
    public static void main(String[] arg) throws IOException {
        List<String> result = Files.readAllLines(Paths.get("hola.txt"));
        result.forEach(line -> System.out.println(line));  
    }

}
