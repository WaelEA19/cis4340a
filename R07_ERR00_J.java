public class R07_ERR00_J {

    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
