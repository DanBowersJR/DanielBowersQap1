package Date;

public class TestDate {
    public static void main(String[] args) {
        // Create a Date object with an initial day, month, and year
        Date date = new Date(5, 9, 2024);

        // Print the current date in dd/mm/yyyy format
        System.out.println("Initial Date: " + date);

        // Modify the date to represent December 25, 2024
        date.setDay(25);
        date.setMonth(12);
        date.setYear(2024);

        // Print the updated date after changes
        System.out.println("Updated Date: " + date);
    }
}
