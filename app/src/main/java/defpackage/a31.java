package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a31 extends zo1 implements rg2, tg2<a31> {
    public final j81<x21, sd5> x;
    public final kz2 y;
    public final mg3<a31> z;

    public a31(j81 j81Var) {
        super(wo1.a);
        this.x = j81Var;
        this.y = ps0.R(null);
        this.z = z21.a;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(y21 y21Var) {
        this.x.invoke(y21Var);
        a31 a31Var = (a31) this.y.getValue();
        if (a31Var != null) {
            a31Var.b(y21Var);
        }
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        this.y.setValue((a31) vg2Var.a(z21.a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a31) {
            if (ur1.a(this.x, ((a31) obj).x)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tg2
    public final mg3<a31> getKey() {
        return this.z;
    }

    @Override // defpackage.tg2
    public final a31 getValue() {
        return this;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
