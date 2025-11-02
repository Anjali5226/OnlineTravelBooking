package util;

import java.util.regex.*;

public class Validator {

    // Validate email format
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        return email != null && pattern.matcher(email).matches();
    }

    // Validate non-empty strings
    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    // Validate positive numbers (e.g., price, seat count)
    public static boolean isPositiveNumber(double number) {
        return number > 0;
    }

    // Validate date format (YYYY-MM-DD)
    public static boolean isValidDate(String date) {
        String dateRegex = "\\d{4}-\\d{2}-\\d{2}";
        return date != null && date.matches(dateRegex);
    }
}
