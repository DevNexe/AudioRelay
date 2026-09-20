package defpackage;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class nt4 {
    public final C0239D a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final NumberFormat c;
    public final NumberFormat d;

    public nt4(C0239D c0239d, Locale locale) {
        this.a = c0239d;
        this.c = NumberFormat.getInstance(locale);
        this.d = NumberFormat.getPercentInstance(locale);
    }

    public static String a(int i, long j, long j2) {
        long j3 = j / j2;
        long j4 = j % j2;
        if (i < 1) {
            return String.valueOf(j3);
        }
        return j3 + "." + d(i, j4 / (j2 / ((long) ((int) Math.pow(10.0d, i)))));
    }

    public static String b(nt4 nt4Var, int i) {
        C0239D c0239d = nt4Var.a;
        if (i < 1000) {
            String strValueOf = String.valueOf(i);
            c0239d.getClass();
            return kd.q(Th.j(m21.D, strValueOf));
        }
        NumberFormat numberFormat = nt4Var.c;
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = numberFormat.format(((double) i) / 1000.0d);
        c0239d.getClass();
        return kd.q(Th.j(m21.C, str));
    }

    public static String c(nt4 nt4Var, long j) {
        nt4Var.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes));
        String strD = d(2, hours);
        String strD2 = d(2, minutes);
        String strD3 = d(2, seconds);
        if (hours <= 0) {
            return LPt6Fixed.a(strD2, ":", strD3);
        }
        return strD + ":" + strD2 + ":" + strD3;
    }

    public static String d(int i, long j) {
        return mv4.K(String.valueOf(j), i);
    }
}
