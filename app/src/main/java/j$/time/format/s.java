package j$.time.format;

import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class s {
    private DateTimeFormatter a;
    private boolean b = true;
    private boolean c = true;
    private final ArrayList d;

    s(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = dateTimeFormatter;
        arrayList.add(new x());
    }

    static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private x d() {
        ArrayList arrayList = this.d;
        return (x) arrayList.get(arrayList.size() - 1);
    }

    final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    final s c() {
        s sVar = new s(this.a);
        sVar.b = this.b;
        sVar.c = this.c;
        return sVar;
    }

    final void e(boolean z) {
        ArrayList arrayList = this.d;
        arrayList.remove(z ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    final w f() {
        return this.a.c();
    }

    final j$.time.chrono.o g() {
        j$.time.chrono.o oVar = d().c;
        if (oVar != null) {
            return oVar;
        }
        j$.time.chrono.o oVarB = this.a.b();
        return oVarB == null ? j$.time.chrono.v.d : oVarB;
    }

    final Locale h() {
        return this.a.d();
    }

    final Long i(j$.time.temporal.a aVar) {
        return (Long) d().a.get(aVar);
    }

    final boolean j() {
        return this.b;
    }

    final boolean k() {
        return this.c;
    }

    final void l(boolean z) {
        this.b = z;
    }

    final void m(ZoneId zoneId) {
        if (zoneId == null) {
            throw new NullPointerException("zone");
        }
        d().b = zoneId;
    }

    final int n(j$.time.temporal.q qVar, long j, int i, int i2) {
        if (qVar == null) {
            throw new NullPointerException("field");
        }
        Long l = (Long) d().a.put(qVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    final void o() {
        d().getClass();
    }

    final void p(boolean z) {
        this.c = z;
    }

    final void q() {
        ArrayList arrayList = this.d;
        x xVarD = d();
        xVarD.getClass();
        x xVar = new x();
        xVar.a.putAll(xVarD.a);
        xVar.b = xVarD.b;
        xVar.c = xVarD.c;
        arrayList.add(xVar);
    }

    final boolean r(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char cCharAt = charSequence.charAt(i + i5);
            char cCharAt2 = charSequence2.charAt(i2 + i5);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    final j$.time.temporal.l s(y yVar, Set set) {
        x xVarD = d();
        xVarD.c = g();
        ZoneId zoneIdE = xVarD.b;
        if (zoneIdE == null) {
            zoneIdE = this.a.e();
        }
        xVarD.b = zoneIdE;
        xVarD.m(yVar, set);
        return xVarD;
    }

    public final String toString() {
        return d().toString();
    }
}
