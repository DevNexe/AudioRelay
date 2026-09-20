package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class df0 {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("GMT");

    public static final u91 a(Long l) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return new u91(calendar.get(13), calendar.get(12), calendar.get(11), O.j(7)[((calendar.get(7) + 7) - 2) % 7], calendar.get(5), calendar.get(6), pj0._values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis());
    }
}
