package com.revenuecat.purchases.utils;

import defpackage.b70;
import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = DesugarTimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static Date parse(String str) {
        int i;
        int iPow;
        int i2;
        int i3;
        TimeZone timeZone;
        char cCharAt;
        try {
            int i4 = parseInt(str, 0, 4);
            int i5 = checkOffset(str, 4, '-') ? 5 : 4;
            int i6 = i5 + 2;
            int i7 = parseInt(str, i5, i6);
            if (checkOffset(str, i6, '-')) {
                i6++;
            }
            int i8 = i6 + 2;
            int i9 = parseInt(str, i6, i8);
            boolean zCheckOffset = checkOffset(str, i8, 'T');
            if (!zCheckOffset && str.length() <= i8) {
                return new GregorianCalendar(i4, i7 - 1, i9).getTime();
            }
            if (zCheckOffset) {
                int i10 = i8 + 1;
                int i11 = i10 + 2;
                i3 = parseInt(str, i10, i11);
                if (checkOffset(str, i11, ':')) {
                    i11++;
                }
                int i12 = i11 + 2;
                i2 = parseInt(str, i11, i12);
                if (checkOffset(str, i12, ':')) {
                    i12++;
                }
                if (str.length() <= i12 || (cCharAt = str.charAt(i12)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    iPow = 0;
                    i = 0;
                    i8 = i12;
                } else {
                    int i13 = i12 + 2;
                    i = parseInt(str, i12, i13);
                    if (i > 59 && i < 63) {
                        i = 59;
                    }
                    if (checkOffset(str, i13, '.')) {
                        int i14 = i13 + 1;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i14 + 1);
                        int iMin = Math.min(iIndexOfNonDigit, i14 + 3);
                        iPow = (int) (Math.pow(10.0d, 3 - (iMin - i14)) * ((double) parseInt(str, i14, iMin)));
                        i8 = iIndexOfNonDigit;
                    } else {
                        i3 = i3;
                        i8 = i13;
                        iPow = 0;
                    }
                }
                i2 = i2;
            } else {
                i = 0;
                iPow = 0;
                i2 = 0;
                i3 = 0;
            }
            if (str.length() <= i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_Z;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i8);
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    String str2 = GMT_ID + strSubstring;
                    TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str2);
                    String id = timeZone2.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i9);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i2);
            gregorianCalendar.set(13, i);
            gregorianCalendar.set(14, iPow);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new SerializationException(b70.a("Not an RFC 3339 date: ", str), e);
        }
    }

    private static int parseInt(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
