package Time;

public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects representing specific times
        Time t1 = new Time(21, 10, 15);  // 21:10:15
        Time t2 = new Time(10, 20, 25);  // 10:20:25

        // Increment t1 by one second and display the result
        t1.nextSecond();
        System.out.println("Time t1 after next second: " + t1);  // Expected: 21:10:16

        // Decrement t2 by one second and display the result
        t2.previousSecond();
        System.out.println("Time t2 after previous second: " + t2);  // Expected: 10:20:24
    }
}
