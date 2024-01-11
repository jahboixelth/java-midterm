import java.util.Scanner;

public class ShortDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        String fullDate = convertToFullDate(shortDate);

        System.out.println("Short Date: " + shortDate);
        System.out.println("Full Date: " + fullDate);

        scanner.close();
    }

    public static String convertToFullDate(String shortDate) {
        String[] parts = shortDate.split("-");
        if (parts.length != 3) {
            return "Invalid date format";
        }

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (month < 1 || month > 12) {
            return "Invalid month";
        }

        return monthNames[month - 1] + " " + day + ", " + year;
    }
}
