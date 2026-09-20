package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b41 implements rg2, ou2 {
    public j81<? super iy1, sd5> w;
    public iy1 x;

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.ou2
    public final void G(iy1 iy1Var) {
        j81<? super iy1, sd5> j81Var;
        this.x = iy1Var;
        if (!iy1Var.q()) {
            j81<? super iy1, sd5> j81Var2 = this.w;
            if (j81Var2 != null) {
                j81Var2.invoke(null);
                return;
            }
            return;
        }
        iy1 iy1Var2 = this.x;
        if (iy1Var2 == null || !iy1Var2.q() || (j81Var = this.w) == null) {
            return;
        }
        j81Var.invoke(this.x);
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        j81<? super iy1, sd5> j81Var;
        j81<? super iy1, sd5> j81Var2 = (j81) vg2Var.a(z31.a);
        if (j81Var2 == null && (j81Var = this.w) != null) {
            j81Var.invoke(null);
        }
        this.w = j81Var2;
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
