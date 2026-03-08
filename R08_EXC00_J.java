public class R08_EXC00_J {

    public static void checkValue(int x) throws Exception {
        if (x < 0) {
            throw new Exception("Invalid value");
        }
    }
}
