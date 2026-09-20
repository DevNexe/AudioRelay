package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ic1 {
    public final String a;
    public final List<jc1> b;
    public final double c;

    public ic1(String str, List<jc1> list) {
        Object next;
        String str2;
        Double dValueOf;
        this.a = str;
        this.b = list;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ur1.a(((jc1) next).a, "q"));
        jc1 jc1Var = (jc1) next;
        double dDoubleValue = 1.0d;
        if (jc1Var != null && (str2 = jc1Var.b) != null) {
            try {
                dValueOf = v54.a.w.matcher(str2).matches() ? Double.valueOf(Double.parseDouble(str2)) : null;
            } catch (NumberFormatException unused) {
            }
            if (dValueOf != null) {
                double dDoubleValue2 = dValueOf.doubleValue();
                Double d = (0.0d > dDoubleValue2 ? 1 : (0.0d == dDoubleValue2 ? 0 : -1)) <= 0 && (dDoubleValue2 > 1.0d ? 1 : (dDoubleValue2 == 1.0d ? 0 : -1)) <= 0 ? dValueOf : null;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                }
            }
        }
        this.c = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic1)) {
            return false;
        }
        ic1 ic1Var = (ic1) obj;
        return ur1.a(this.a, ic1Var.a) && ur1.a(this.b, ic1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}
