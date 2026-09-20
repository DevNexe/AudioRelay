package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter h;
    public static final DateTimeFormatter i;
    public static final DateTimeFormatter j;
    private final f a;
    private final Locale b;
    private final w c;
    private final y d;
    private final Set e;
    private final j$.time.chrono.o f;
    private final ZoneId g;

    static {
        r rVar = new r();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        z zVar = z.EXCEEDS_PAD;
        rVar.j(aVar, 4, 10, zVar);
        rVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        rVar.l(aVar2, 2);
        rVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        rVar.l(aVar3, 2);
        y yVar = y.STRICT;
        j$.time.chrono.v vVar = j$.time.chrono.v.d;
        DateTimeFormatter dateTimeFormatterT = rVar.t(yVar, vVar);
        ISO_LOCAL_DATE = dateTimeFormatterT;
        r rVar2 = new r();
        rVar2.p();
        rVar2.a(dateTimeFormatterT);
        rVar2.h();
        rVar2.t(yVar, vVar);
        r rVar3 = new r();
        rVar3.p();
        rVar3.a(dateTimeFormatterT);
        rVar3.o();
        rVar3.h();
        rVar3.t(yVar, vVar);
        r rVar4 = new r();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        rVar4.l(aVar4, 2);
        rVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        rVar4.l(aVar5, 2);
        rVar4.o();
        rVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        rVar4.l(aVar6, 2);
        rVar4.o();
        rVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter dateTimeFormatterT2 = rVar4.t(yVar, null);
        r rVar5 = new r();
        rVar5.p();
        rVar5.a(dateTimeFormatterT2);
        rVar5.h();
        rVar5.t(yVar, null);
        r rVar6 = new r();
        rVar6.p();
        rVar6.a(dateTimeFormatterT2);
        rVar6.o();
        rVar6.h();
        rVar6.t(yVar, null);
        r rVar7 = new r();
        rVar7.p();
        rVar7.a(dateTimeFormatterT);
        rVar7.e('T');
        rVar7.a(dateTimeFormatterT2);
        DateTimeFormatter dateTimeFormatterT3 = rVar7.t(yVar, vVar);
        h = dateTimeFormatterT3;
        r rVar8 = new r();
        rVar8.p();
        rVar8.a(dateTimeFormatterT3);
        rVar8.h();
        DateTimeFormatter dateTimeFormatterT4 = rVar8.t(yVar, vVar);
        i = dateTimeFormatterT4;
        r rVar9 = new r();
        rVar9.a(dateTimeFormatterT4);
        rVar9.o();
        rVar9.e('[');
        rVar9.q();
        rVar9.m();
        rVar9.e(']');
        rVar9.t(yVar, vVar);
        r rVar10 = new r();
        rVar10.a(dateTimeFormatterT3);
        rVar10.o();
        rVar10.h();
        rVar10.o();
        rVar10.e('[');
        rVar10.q();
        rVar10.m();
        rVar10.e(']');
        rVar10.t(yVar, vVar);
        r rVar11 = new r();
        rVar11.p();
        rVar11.j(aVar, 4, 10, zVar);
        rVar11.e('-');
        rVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        rVar11.o();
        rVar11.h();
        rVar11.t(yVar, vVar);
        r rVar12 = new r();
        rVar12.p();
        rVar12.j(j$.time.temporal.j.c, 4, 10, zVar);
        rVar12.f("-W");
        rVar12.l(j$.time.temporal.j.b, 2);
        rVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        rVar12.l(aVar7, 1);
        rVar12.o();
        rVar12.h();
        rVar12.t(yVar, vVar);
        r rVar13 = new r();
        rVar13.p();
        rVar13.c();
        j = rVar13.t(yVar, null);
        r rVar14 = new r();
        rVar14.p();
        rVar14.l(aVar, 4);
        rVar14.l(aVar2, 2);
        rVar14.l(aVar3, 2);
        rVar14.o();
        rVar14.g("+HHMMss", "Z");
        rVar14.t(yVar, vVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        r rVar15 = new r();
        rVar15.p();
        rVar15.r();
        rVar15.o();
        rVar15.i(aVar7, map);
        rVar15.f(", ");
        rVar15.n();
        rVar15.j(aVar3, 1, 2, z.NOT_NEGATIVE);
        rVar15.e(' ');
        rVar15.i(aVar2, map2);
        rVar15.e(' ');
        rVar15.l(aVar, 4);
        rVar15.e(' ');
        rVar15.l(aVar4, 2);
        rVar15.e(':');
        rVar15.l(aVar5, 2);
        rVar15.o();
        rVar15.e(':');
        rVar15.l(aVar6, 2);
        rVar15.n();
        rVar15.e(' ');
        rVar15.g("+HHMM", "GMT");
        rVar15.t(y.SMART, vVar);
    }

    DateTimeFormatter(f fVar, Locale locale, y yVar, j$.time.chrono.v vVar) {
        w wVar = w.a;
        this.a = fVar;
        this.e = null;
        if (locale == null) {
            throw new NullPointerException("locale");
        }
        this.b = locale;
        this.c = wVar;
        if (yVar == null) {
            throw new NullPointerException("resolverStyle");
        }
        this.d = yVar;
        this.f = vVar;
        this.g = null;
    }

    private j$.time.temporal.l g(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        if (charSequence == null) {
            throw new NullPointerException("text");
        }
        s sVar = new s(this);
        int iK = this.a.k(sVar, charSequence, parsePosition.getIndex());
        if (iK < 0) {
            parsePosition.setErrorIndex(~iK);
            sVar = null;
        } else {
            parsePosition.setIndex(iK);
        }
        if (sVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            return sVar.s(this.d, this.e);
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new DateTimeParseException(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new DateTimeParseException(str2, charSequence);
    }

    public final String a(j$.time.temporal.l lVar) {
        StringBuilder sb = new StringBuilder(32);
        if (lVar == null) {
            throw new NullPointerException("temporal");
        }
        try {
            this.a.j(new u(lVar, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public final j$.time.chrono.o b() {
        return this.f;
    }

    public final w c() {
        return this.c;
    }

    public final Locale d() {
        return this.b;
    }

    public final ZoneId e() {
        return this.g;
    }

    public final Object f(CharSequence charSequence, j$.time.i iVar) {
        String string;
        if (charSequence == null) {
            throw new NullPointerException("text");
        }
        try {
            return ((x) g(charSequence)).G(iVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            throw new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), charSequence, e2);
        }
    }

    final f h() {
        return this.a.a();
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
