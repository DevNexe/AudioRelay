package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jq2<T> implements rv1<T> {
    public final rv1<T> a;
    public final qa4 b;

    public jq2(rv1<T> rv1Var) {
        this.a = rv1Var;
        this.b = new qa4(rv1Var.a());
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.b;
    }

    @Override // defpackage.zj0
    public final T c(pf0 pf0Var) {
        if (pf0Var.X()) {
            return (T) pf0Var.O(this.a);
        }
        pf0Var.L();
        return null;
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, T t) {
        if (t == null) {
            ls0Var.h();
        } else {
            ls0Var.P();
            ls0Var.F(this.a, t);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ur1.a(nl3.a(jq2.class), nl3.a(obj.getClass())) && ur1.a(this.a, ((jq2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
