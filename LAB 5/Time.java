public class Time {
    private int hour;
    private int minute;

    // Constructor
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Method to add two Time objects
    public Time add(Time other) {
        int newMinute = this.minute + other.minute;
        int carry = newMinute / 60;
        newMinute %= 60;
        
        int newHour = this.hour + other.hour + carry;
        newHour %= 24;

        return new Time(newHour, newMinute);
    }

    // Method to display the time
    public void display() {
        System.out.printf("%02d:%02d%n", hour, minute);
    }

    public static void main(String[] args) {
        Time time1 = new Time(10, 45);
        Time time2 = new Time(2, 30);
        
        Time sum = time1.add(time2);
        
        System.out.println("Time 1:");
        time1.display();
        
        System.out.println("Time 2:");
        time2.display();
        
        System.out.println("Sum of Time 1 and Time 2:");
        sum.display();
    }
}