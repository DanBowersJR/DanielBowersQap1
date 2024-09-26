package Date;

public class Date {
    // Attributes representing the day, month, and year
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the date with specific day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns the day of the date
    public int getDay() {
        return day;
    }

    // Sets the day of the date
    public void setDay(int day) {
        this.day = day;
    }

    // Returns the month of the date
    public int getMonth() {
        return month;
    }

    // Sets the month of the date
    public void setMonth(int month) {
        this.month = month;
    }

    // Returns the year of the date
    public int getYear() {
        return year;
    }

    // Sets the year of the date
    public void setYear(int year) {
        this.year = year;
    }

    // Sets the day, month, and year at once
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns the date formatted as dd/mm/yyyy
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
