package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    private static final C1459a f = new j$.time.temporal.r() { // from class: j$.time.format.a
        @Override // j$.time.temporal.r
        public final Object g(j$.time.temporal.l lVar) {
            int i = r.g;
            ZoneId zoneId = (ZoneId) lVar.G(j$.time.temporal.p.k());
            if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                return null;
            }
            return zoneId;
        }
    };
    public static final /* synthetic */ int g = 0;
    private r a;
    private final r b;
    private final ArrayList c;
    private final boolean d;
    private int e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.q qVar = j$.time.temporal.j.a;
        map.put('Q', qVar);
        map.put('q', qVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
    }

    public r() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    private r(r rVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = rVar;
        this.d = true;
    }

    private int d(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("pp");
        }
        r rVar = this.a;
        rVar.getClass();
        rVar.c.add(gVar);
        r rVar2 = this.a;
        rVar2.e = -1;
        return rVar2.c.size() - 1;
    }

    private void k(j jVar) {
        j jVarB;
        r rVar = this.a;
        int i = rVar.e;
        if (i < 0) {
            rVar.e = d(jVar);
            return;
        }
        j jVar2 = (j) rVar.c.get(i);
        int i2 = jVar.b;
        int i3 = jVar.c;
        if (i2 == i3 && jVar.d == z.NOT_NEGATIVE) {
            jVarB = jVar2.c(i3);
            d(jVar.b());
            this.a.e = i;
        } else {
            jVarB = jVar2.b();
            this.a.e = d(jVar);
        }
        this.a.c.set(i, jVarB);
    }

    private DateTimeFormatter u(Locale locale, y yVar, j$.time.chrono.v vVar) {
        if (locale == null) {
            throw new NullPointerException("locale");
        }
        while (this.a.b != null) {
            n();
        }
        f fVar = new f(this.c, false);
        w wVar = w.a;
        return new DateTimeFormatter(fVar, locale, yVar, vVar);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            throw new NullPointerException("formatter");
        }
        d(dateTimeFormatter.h());
    }

    public final void b(j$.time.temporal.a aVar) {
        d(new h(aVar));
    }

    public final void c() {
        d(new i());
    }

    public final void e(char c) {
        d(new e(c));
    }

    public final void f(String str) {
        if (str.length() > 0) {
            d(str.length() == 1 ? new e(str.charAt(0)) : new o(str));
        }
    }

    public final void g(String str, String str2) {
        d(new k(str, str2));
    }

    public final void h() {
        d(k.d);
    }

    public final void i(j$.time.temporal.a aVar, HashMap map) {
        if (aVar == null) {
            throw new NullPointerException("field");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        A a = A.FULL;
        d(new p(aVar, a, new b(new v(Collections.singletonMap(a, linkedHashMap)))));
    }

    public final r j(j$.time.temporal.q qVar, int i, int i2, z zVar) {
        if (i == i2 && zVar == z.NOT_NEGATIVE) {
            l(qVar, i2);
            return this;
        }
        if (qVar == null) {
            throw new NullPointerException("field");
        }
        if (zVar == null) {
            throw new NullPointerException("signStyle");
        }
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            k(new j(qVar, i, i2, zVar));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public final void l(j$.time.temporal.q qVar, int i) {
        if (qVar == null) {
            throw new NullPointerException("field");
        }
        if (i >= 1 && i <= 19) {
            k(new j(qVar, i, i, z.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
    }

    public final void m() {
        d(new q(f));
    }

    public final void n() {
        r rVar = this.a;
        if (rVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (rVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        r rVar2 = this.a;
        f fVar = new f(rVar2.c, rVar2.d);
        this.a = this.a.b;
        d(fVar);
    }

    public final void o() {
        r rVar = this.a;
        rVar.e = -1;
        this.a = new r(rVar);
    }

    public final void p() {
        d(n.INSENSITIVE);
    }

    public final void q() {
        d(n.SENSITIVE);
    }

    public final void r() {
        d(n.LENIENT);
    }

    public final DateTimeFormatter s() {
        return u(Locale.getDefault(), y.SMART, null);
    }

    final DateTimeFormatter t(y yVar, j$.time.chrono.v vVar) {
        return u(Locale.getDefault(), yVar, vVar);
    }
}
