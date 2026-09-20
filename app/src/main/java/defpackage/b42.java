package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b42 implements pa4 {
    public final pa4 a;
    public final int b = 1;

    public b42(pa4 pa4Var) {
        this.a = pa4Var;
    }

    @Override // defpackage.pa4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pa4
    public final int d(String str) {
        Integer numO = hv4.o(str);
        if (numO != null) {
            return numO.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // defpackage.pa4
    public final xa4 e() {
        return uv4.CQf.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b42)) {
            return false;
        }
        b42 b42Var = (b42) obj;
        return ur1.a(this.a, b42Var.a) && ur1.a(a(), b42Var.a());
    }

    @Override // defpackage.pa4
    public final int f() {
        return this.b;
    }

    @Override // defpackage.pa4
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.pa4
    public final List<Annotation> getAnnotations() {
        return cs0.w;
    }

    @Override // defpackage.pa4
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pa4
    public final List<Annotation> i(int i) {
        if (i >= 0) {
            return cs0.w;
        }
        StringBuilder sbC = iZUl.c("Illegal index ", i, ", ");
        sbC.append(a());
        sbC.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    @Override // defpackage.pa4
    public final pa4 j(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbC = iZUl.c("Illegal index ", i, ", ");
        sbC.append(a());
        sbC.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    @Override // defpackage.pa4
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbC = iZUl.c("Illegal index ", i, ", ");
        sbC.append(a());
        sbC.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
