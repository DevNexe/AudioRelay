package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class lf5 {
    public static final AtomicReference<v75> a = new AtomicReference<>();

    public static long a(long j) {
        Calendar calendarD = d(null);
        calendarD.setTimeInMillis(j);
        return b(calendarD).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar calendarD = d(calendar);
        Calendar calendarD2 = d(null);
        calendarD2.set(calendarD.get(1), calendarD.get(2), calendarD.get(5));
        return calendarD2;
    }

    public static Calendar c() {
        v75 v75Var = a.get();
        if (v75Var == null) {
            v75Var = v75.c;
        }
        TimeZone timeZone = v75Var.b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = v75Var.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
