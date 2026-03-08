import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {

    private static final Logger logger =
        Logger.getLogger(R00_IDS03_J.class.getName());

    private static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
            ? username
            : "unauthorized user";
    }

    public static void logLogin(boolean loginSuccessful, String username) {

        String sanitizedUser = sanitizeUser(username);

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizedUser);
        } else {
            logger.severe("User login failed for: " + sanitizedUser);
        }
    }
}
