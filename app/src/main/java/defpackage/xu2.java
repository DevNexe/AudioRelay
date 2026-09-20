package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu2 extends zo1 implements vu2 {
    public final j81<sp1, sd5> x;
    public long y;

    public xu2(j81 j81Var) {
        super(wo1.a);
        this.x = j81Var;
        this.y = C0239D.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu2)) {
            return false;
        }
        return ur1.a(this.x, ((xu2) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.vu2
    public final void q(long j) {
        if (sp1.a(this.y, j)) {
            return;
        }
        this.x.invoke(new sp1(j));
        this.y = j;
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
