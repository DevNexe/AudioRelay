package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n92 implements pa4 {
    public final String a;
    public final pa4 b;
    public final pa4 c;
    public final int d = 2;

    public n92(String str, pa4 pa4Var, pa4 pa4Var2) {
        this.a = str;
        this.b = pa4Var;
        this.c = pa4Var2;
    }

    @Override // defpackage.pa4
    public final String a() {
        return this.a;
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
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // defpackage.pa4
    public final xa4 e() {
        return uv4.F1.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n92)) {
            return false;
        }
        n92 n92Var = (n92) obj;
        return ur1.a(this.a, n92Var.a) && ur1.a(this.b, n92Var.b) && ur1.a(this.c, n92Var.c);
    }

    @Override // defpackage.pa4
    public final int f() {
        return this.d;
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
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.pa4
    public final List<Annotation> i(int i) {
        if (i >= 0) {
            return cs0.w;
        }
        throw new IllegalArgumentException(i5.b(iZUl.c("Illegal index ", i, ", "), this.a, " expects only non-negative indices").toString());
    }

    @Override // defpackage.pa4
    public final pa4 j(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(i5.b(iZUl.c("Illegal index ", i, ", "), this.a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unreached".toString());
    }

    @Override // defpackage.pa4
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(i5.b(iZUl.c("Illegal index ", i, ", "), this.a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
