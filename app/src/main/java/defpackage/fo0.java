package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo0 extends zo1 implements mo0 {
    public final j81<ro0, sd5> x;

    public fo0(j81 j81Var) {
        super(wo1.a);
        this.x = j81Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo0)) {
            return false;
        }
        return ur1.a(this.x, ((fo0) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.mo0
    public final void o0(ez1 ez1Var) {
        this.x.invoke(ez1Var);
        ez1Var.B0();
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
