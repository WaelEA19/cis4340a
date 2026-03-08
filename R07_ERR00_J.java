public class R07_ERR00_J {

    // NONCOMPLIANT: empty catch block
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
        }
    }
}
