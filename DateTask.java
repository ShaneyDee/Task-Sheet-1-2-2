public class DateTask {
    private int day;
    private int month;
    private int year;

    // Constructor
    public DateTask() {
        this(1, 1, 1);
    }

    public DateTask(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter and Setter methods
    public int getDay() {
        return day;
    }

    public int setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
            return 1;
        } else {
            return 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public int setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
            return 1;
        } else {
            return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        if (year > 0) {
            this.year = year;
            return 1;
        } else {
            return 0;
        }
    }

    // toString method to display "12/12/2012" date format
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}

