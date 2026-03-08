public class R08_EXC00_J {

    public static void checkValue(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Invalid value");
        }
    }
}
