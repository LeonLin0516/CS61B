/** Class that determines whether or not a year is a leap year.
 *  @author Leon
 */

public class LeapYear {

  public static boolean isLeapYear(int year) {
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("No command line option(s) provided!");
      System.out.println("e.g. java LeapYear 2000");
    } else {
      for (int i = 0; i < args.length; i++) {
        int year = Integer.parseInt(args[i]);
        if (isLeapYear(year)) {
          System.out.printf("%d is a leap year\n", year);
        } else {
          System.out.printf("%d is not a leap year\n", year);
        }
      }
    }
  }
}
