import java.io.FileInputStream;
import java.io.IOException;

public class R09_IO00_J {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("test.txt");
        int data = file.read();
    }
}
