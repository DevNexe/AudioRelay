package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class p implements g {
    private final j$.time.temporal.q a;
    private final A b;
    private final b c;
    private volatile j d;

    p(j$.time.temporal.a aVar, A a, b bVar) {
        this.a = aVar;
        this.b = a;
        this.c = bVar;
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        String strA;
        j$.time.chrono.v vVar;
        Long lE = uVar.e(this.a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.o oVar = (j$.time.chrono.o) uVar.d().G(j$.time.temporal.p.e());
        if (oVar == null || oVar == (vVar = j$.time.chrono.v.d)) {
            b bVar = this.c;
            long jLongValue = lE.longValue();
            A a = this.b;
            uVar.c();
            strA = bVar.a.a(jLongValue, a);
        } else {
            j$.time.temporal.q qVar = this.a;
            long jLongValue2 = lE.longValue();
            A a2 = this.b;
            uVar.c();
            b bVar2 = this.c;
            bVar2.getClass();
            strA = (oVar == vVar || !(qVar instanceof j$.time.temporal.a)) ? bVar2.a.a(jLongValue2, a2) : null;
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, z.NORMAL);
        }
        return this.d.j(uVar, sb);
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        j$.time.chrono.o oVar;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator itB = null;
        A a = sVar.k() ? this.b : null;
        j$.time.chrono.o oVarG = sVar.g();
        j$.time.temporal.q qVar = this.a;
        b bVar = this.c;
        if (oVarG == null || oVarG == (oVar = j$.time.chrono.v.d)) {
            sVar.h();
            itB = bVar.a.b(a);
        } else {
            sVar.h();
            bVar.getClass();
            if (oVarG == oVar || !(qVar instanceof j$.time.temporal.a)) {
                itB = bVar.a.b(a);
            }
        }
        if (itB != null) {
            while (itB.hasNext()) {
                Map.Entry entry = (Map.Entry) itB.next();
                String str = (String) entry.getKey();
                if (sVar.r(str, 0, charSequence, i, str.length())) {
                    return sVar.n(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (sVar.k()) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, z.NORMAL);
        }
        return this.d.k(sVar, charSequence, i);
    }

    public final String toString() {
        A a = A.FULL;
        j$.time.temporal.q qVar = this.a;
        A a2 = this.b;
        if (a2 == a) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + a2 + ")";
    }
}
