package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c41 implements rg2, tg2<j81<? super iy1, ? extends sd5>>, j81<iy1, sd5> {
    public final j81<iy1, sd5> w;
    public j81<? super iy1, sd5> x;
    public iy1 y;

    /* JADX WARN: Multi-variable type inference failed */
    public c41(j81<? super iy1, sd5> j81Var) {
        this.w = j81Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        j81<? super iy1, sd5> j81Var = (j81) vg2Var.a(z31.a);
        if (ur1.a(j81Var, this.x)) {
            return;
        }
        this.x = j81Var;
    }

    @Override // defpackage.tg2
    public final mg3<j81<? super iy1, ? extends sd5>> getKey() {
        return z31.a;
    }

    @Override // defpackage.tg2
    public final j81<? super iy1, ? extends sd5> getValue() {
        return this;
    }

    @Override // defpackage.j81
    public final sd5 invoke(iy1 iy1Var) {
        iy1 iy1Var2 = iy1Var;
        this.y = iy1Var2;
        this.w.invoke(iy1Var2);
        j81<? super iy1, sd5> j81Var = this.x;
        if (j81Var != null) {
            j81Var.invoke(iy1Var2);
        }
        return sd5.a;
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
