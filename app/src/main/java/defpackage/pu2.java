package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu2 extends zo1 implements ou2 {
    public final j81<iy1, sd5> x;

    public pu2(j81 j81Var) {
        super(wo1.a);
        this.x = j81Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.ou2
    public final void G(iy1 iy1Var) {
        this.x.invoke(iy1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu2)) {
            return false;
        }
        return ur1.a(this.x, ((pu2) obj).x);
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
