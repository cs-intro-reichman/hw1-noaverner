// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	private static final int HOURS_AT_A_DAY = 24;
	private static final int HOURS_AT_HALF_A_DAY = HOURS_AT_A_DAY / 2;
	private static final String AM = "AM";
	private static final String PM = "PM";

	public static void main(String[] args) {
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit.
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String timePeriodSuffix = (hours >= 12) ? PM : AM;

		// Switch to 12 hour format
		if (hours >= HOURS_AT_HALF_A_DAY) {
			if (hours > HOURS_AT_HALF_A_DAY) {
				hours = hours - HOURS_AT_HALF_A_DAY;
			}
		}

		System.out.printf("%d:%02d %s%n", hours, minutes, timePeriodSuffix);
	}

}