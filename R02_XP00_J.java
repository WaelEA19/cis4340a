import java.io.File;

public class R02_XP00_J {

    public void deleteFile() {

        File someFile = new File("someFileName.txt");

        if (!someFile.delete()) {
            System.out.println("File deletion failed.");
        }

    }
}
