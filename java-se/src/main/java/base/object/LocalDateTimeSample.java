/*
 * Copyright (c) 2020, S.F. Express Inc. All rights reserved.
 */
package base.object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Java8日期时间示例
 * @author 01401957
 * @date 2020/12/8
 */
public class LocalDateTimeSample {
    public static final String dateTimePattern = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String zoneId = "America/Havana";
        LocalDate todayWithZone = LocalDate.now(ZoneId.of(zoneId));
        LocalDate dateOfYearMonthDay = LocalDate.of(2019, 7, 29);
        LocalDate dateOfYearDay = LocalDate.ofYearDay(2020, 250);
        LocalDate parsedDate = LocalDate.parse("2020-12-25");
        System.out.println(">>>>>> LocalDate：");
        System.out.printf("today: %s%n", format(today));
        System.out.printf("todayWithZone: %s, zoneId: %s%n", format(todayWithZone), zoneId);
        System.out.printf("dateOfYearMonthDay(2019, 7, 29): %s%n", format(dateOfYearMonthDay));
        System.out.printf("dateOfYearDay(2020, 250): %s%n", format(dateOfYearDay));
        System.out.printf("parsedDate(2020-12-25): %s%n", format(parsedDate));

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowWithZone = LocalDateTime.now(ZoneId.of(zoneId));
        LocalDateTime timeOfYearMonthDayHourMinuteSecond = LocalDateTime.of(2020, 12, 8, 14, 49, 25);
        LocalDateTime timeOfDateAndTime = LocalDateTime.of(LocalDate.of(2020, 12, 8), LocalTime.of(14, 49, 25));
        LocalDateTime parsedTime = LocalDateTime.parse("2020-12-25 23:59:59", DateTimeFormatter.ofPattern(dateTimePattern));
        System.out.println("\n>>>>>> LocalDateTime：");
        System.out.printf("now: %s%n", format(now));
        System.out.printf("nowWithZone: %s, zoneId: %s%n", format(nowWithZone), zoneId);
        System.out.printf("timeOfYearMonthDayHourMinuteSecond(2020, 12, 8, 14, 49, 25): %s%n", format(timeOfYearMonthDayHourMinuteSecond));
        System.out.printf("timeOfDateAndTime((2020, 12, 8), (14, 49, 25)): %s%n", format(timeOfDateAndTime));
        System.out.printf("parsedTime(2020-12-25 23:59:59): %s, pattern: %s%n", format(parsedTime), dateTimePattern);

        System.out.println("\n>>>>>> Calculate：");
        System.out.printf("now %s plus %d minutes: %s%n", format(now), 690, format(now.plusMinutes(690L)));
        System.out.printf("now %s minus %d days: %s%n", format(now), 690, format(now.minusDays(690L)));
        System.out.printf("%s is before %s: %b%n", format(now), format(now.plusSeconds(1L)), now.isBefore(now.plusSeconds(1L)));
        System.out.printf("%s is after %s: %b%n", format(now), format(now.plusSeconds(1L)), now.isAfter(now.plusSeconds(1L)));
        System.out.printf("%s is equal %s: %b%n", format(now), format(now), now.isEqual(now));
        System.out.printf("%s to LocalDate: %s%n", format(now), format(now.toLocalDate()));
        System.out.printf("%s to LocalTime: %s%n", format(now), format(now.toLocalTime()));
        System.out.printf("%s at start of day: %s%n", format(today), format(today.atStartOfDay()));
    }

    public static String format(LocalDate localDate) {
        return localDate.format(DateTimeFormatter.ISO_DATE);
    }

    public static String format(LocalTime localTime) {
        return localTime.format(DateTimeFormatter.ISO_TIME);
    }

    public static String format(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern(dateTimePattern));
    }
}
