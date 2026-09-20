package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g33 implements rg2 {
    public final j81<f33, sd5> w;

    public g33(q31 q31Var) {
        this.w = q31Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        this.w.invoke((f33) vg2Var.a(h33.a));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g33) && ur1.a(((g33) obj).w, this.w);
    }

    public final int hashCode() {
        return this.w.hashCode();
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
