package au.gov.ppsr.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.DecimalFormat;
import java.util.Date;

import static java.util.concurrent.TimeUnit.HOURS;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 *
 */
public final class FormatHelper {

  private static final int MEGABYTES_DIVIDER = 1024 * 1024;
  private static final int MINUTE_IN_MILLIS = 60000;
  private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("yyyyMMddHHmmssSSS");
  private static final int MINUTES_MOD = 1000 * 60 * 60;
  private static final int SECONDS_MOD = 1000 * 60;

  private FormatHelper() {

  }

  /**
   * Turns milliseconds into "00 hr 00 min" format.
   *
   * @param milliseconds the value in milliseconds to be converted
   * @return the milliseconds in "00 hr 00 min" format
   */
  public static String millisecondsToString(long milliseconds) {
    if (milliseconds == 0 || milliseconds < MINUTE_IN_MILLIS) {
      return "0 min";
    }

    String output = "";

    long hours = MILLISECONDS.toHours(milliseconds);
    if (hours > 0) {
      output = hours + " hr ";
    }

    long minutes = MILLISECONDS.toMinutes(milliseconds);
    long leftOverMinutes = minutes - HOURS.toMinutes(hours);

    if (leftOverMinutes > 0) {
      output += leftOverMinutes + " min";
    }
    return output.trim();
  }

  /**
   * Turns milliseconds into "PT00H00M00S" format.
   *
   * @param milliseconds the value in milliseconds to be converted
   * @return the milliseconds in "PT00H00M00S" format
   */
  public static String millisecondsToDateTimeDuration(long milliseconds) {
    long hours = MILLISECONDS.toHours(milliseconds);
    long minutes = MILLISECONDS.toMinutes(milliseconds % MINUTES_MOD);
    long seconds = MILLISECONDS.toSeconds((milliseconds % MINUTES_MOD) % SECONDS_MOD);

    return String.format("PT%02dH%02dM%02dS", hours, minutes, seconds);
  }

  /**
   * Turns bytes into a megabytes (MB).
   *
   * @param bytes the value to be converted in bytes
   * @return the bytes in megabytes format with MB appended at the end
   */
  public static String bytesToMegaBytes(long bytes) {
    double megaBytes = (double) bytes / (double) MEGABYTES_DIVIDER;
    return new DecimalFormat("##0.00").format(megaBytes) + " MB";
  }

  /**
   * Convert a date to standardised date time format.
   *
   * @param date the date to convert
   * @return the standardised date time format
   */
  public static String dateToDateTime(Date date) {
    DateTime dateTime = new DateTime(date);
    return DATE_TIME_FORMATTER.print(dateTime);
  }
}
