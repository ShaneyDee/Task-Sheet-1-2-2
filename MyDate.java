public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(21, 9, 1984);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        System.out.println("Leap years between " + date1 + " and " + date2 + ":");
        for (int year = date1.getYear(); year <= date2.getYear(); year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

