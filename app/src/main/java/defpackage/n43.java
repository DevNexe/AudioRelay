package defpackage;

import com.revenuecat.purchases.Package;

/* JADX INFO: loaded from: classes.dex */
public abstract class n43 {
    public final o43 a;
    public final String b;
    public final p43 c;
    public final Package d;

    public static final class CQf extends n43 {
        public final String e;

        public CQf(String str, Package r3, String str2, p43 p43Var, String str3) {
            super(new o43(str), str2, p43Var, r3);
            this.e = str3;
        }
    }

    public static final class QnHx extends n43 {
        public QnHx(String str, Package r3, String str2, p43.F1 f1) {
            super(new o43(str), str2, f1, r3);
        }
    }

    public n43(o43 o43Var, String str, p43 p43Var, Package r4) {
        this.a = o43Var;
        this.b = str;
        this.c = p43Var;
        this.d = r4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ur1.a(getClass(), obj != null ? obj.getClass() : null) && ur1.a(this.a, ((n43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Plan(id=" + this.a + ")";
    }
}
