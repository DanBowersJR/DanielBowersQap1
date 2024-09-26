package Time;

public class Time {
    // Attributes representing hours, minutes, and seconds
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize time with specific hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Returns the current hour
    public int getHour() {
        return hour;
    }

    // Sets the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Returns the current minute
    public int getMinute() {
        return minute;
    }

    // Sets the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Returns the current second
    public int getSecond() {
        return second;
    }

    // Sets the second
    public void setSecond(int second) {
        this.second = second;
    }

    // Increments the time by one second, adjusting minutes and hours if needed
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Decrements the time by one second, adjusting minutes and hours if needed
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    // Returns the time formatted as hh:mm:ss
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
