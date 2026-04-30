

import java.time.*;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Email
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        validateEmail(email);

        // Roll Number
        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();
        validateRollNo(roll);

        // Mobile Number
        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();
        validateNumber(number);

        // Text Search
        System.out.print("Enter String statement: ");
        String str = sc.nextLine();

        System.out.print("Enter text to find: ");
        String txt = sc.nextLine();

        findText(str, txt);

        processLogsBatch();

        sc.close();
    }

    // Email Validate
    public static void validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+\\.ac\\.in$";

        if (Pattern.matches(emailRegex, email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");

            String log = createLog("ERROR", "EmailValidator",
                    "Invalid Email: " + email);

            analyzeLogs(new String[]{log});
        }
    }

    // Roll Number Validation
    public static void validateRollNo(String roll) {
        String rollRegex = "^[A-Z]{2}\\d{4}\\d{3}$";

        if (Pattern.matches(rollRegex, roll)) {
            System.out.println("Valid Roll Number");
        } else {
            System.out.println("Invalid Roll Number");

            String log = createLog("ERROR", "RollValidator",
                    "Invalid Roll: " + roll);

            analyzeLogs(new String[]{log});
        }
    }

    // Phone Number
    public static void validateNumber(String num) {
        String phoneRegex = "^[6-9]\\d{9}$";

        if (Pattern.matches(phoneRegex, num)) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");

            String log = createLog("ERROR", "PhoneValidator",
                    "Invalid Phone: " + num);

            analyzeLogs(new String[]{log});
        }
    }

    // Find Text
    static void findText(String str, String txt) {

        Pattern pattern = Pattern.compile(txt);
        Matcher m = pattern.matcher(str);

        boolean found = false;

        System.out.println("\nSearch Results:");
        while (m.find()) {
            System.out.println("Found: " + m.group() +
                    " at index " + m.start() + "-" + (m.end() - 1));
            found = true;
        }

        if (!found) {
            System.out.println("No match found");
        }

        // replaceAll demo
        String replaced = str.replaceAll("(?i)" + txt, "****");
        System.out.println("After replaceAll: " + replaced);
    }

    // Create Log
    static String createLog(String level, String className, String message) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now().withNano(0);

        return "[" + level + "] " + date + " " + time + " "
                + className + " - " + message;
    }

    // Analyze Logs (Task 14)
    static void analyzeLogs(String[] logs) {

        String logRegex =
                "\\[(\\w+)\\]\\s+(\\d{4}-\\d{2}-\\d{2})\\s+" +
                "(\\d{2}:\\d{2}:\\d{2})\\s+(\\w+)\\s-\\s(.+)";

        Pattern pattern = Pattern.compile(logRegex);

        System.out.println("\nLog Analysis:");

        for (String log : logs) {
            Matcher m = pattern.matcher(log);

            if (m.matches()) {
                System.out.println("Level : " + m.group(1));
                System.out.println("Date  : " + m.group(2));
                System.out.println("Time  : " + m.group(3));
                System.out.println("Class : " + m.group(4));
                System.out.println("Issue : " + m.group(5));
            }
        }
    }

    // Batch Log Processing
    static void processLogsBatch() {

        String[] logs = {
            "[ERROR] 2024-05-01 10:23:45 StudentService - STU123456 failed login",
            "[WARN]  2024-05-01 11:00:00 AuthService - STU654321 token expired",
            "[INFO]  2024-05-02 09:15:30 StudentDAO - STU111222 record fetched",
            "[ERROR] 2024-05-03 14:45:00 PaymentService - STU999888 payment failed",
            "[WARN]  2024-05-04 16:20:10 EmailService - STU777666 email not sent"
        };

        System.out.println("\n🔹 BEFORE PROCESSING:");
        for (String log : logs) {
            System.out.println(log);
        }

        System.out.println("\n🔹 AFTER PROCESSING:");

        for (String log : logs) {

            // Mask Student ID
            log = log.replaceAll("STU\\d{6}", "[STUDENT_ID]");

            // Replace log levels
            log = log.replaceAll("\\bWARN\\b", "[WARNING]");
            log = log.replaceAll("\\bERROR\\b", "[CRITICAL]");

            System.out.println(log);
        }
    }
}