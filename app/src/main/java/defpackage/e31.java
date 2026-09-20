package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e31 implements rg2, tg2<e31> {
    public e31 w;
    public final ui2<r21> x = new ui2<>(new r21[16]);

    public e31(b31 b31Var) {
        b31Var.a.b(this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final void a(r21 r21Var) {
        this.x.b(r21Var);
        e31 e31Var = this.w;
        if (e31Var != null) {
            e31Var.a(r21Var);
        }
    }

    public final void b(ui2<r21> ui2Var) {
        ui2<r21> ui2Var2 = this.x;
        ui2Var2.c(ui2Var2.y, ui2Var);
        e31 e31Var = this.w;
        if (e31Var != null) {
            e31Var.b(ui2Var);
        }
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        e31 e31Var = (e31) vg2Var.a(d31.a);
        if (ur1.a(e31Var, this.w)) {
            return;
        }
        e31 e31Var2 = this.w;
        ui2<r21> ui2Var = this.x;
        if (e31Var2 != null) {
            e31Var2.e(ui2Var);
        }
        if (e31Var != null) {
            e31Var.b(ui2Var);
        }
        this.w = e31Var;
    }

    public final void d(r21 r21Var) {
        this.x.l(r21Var);
        e31 e31Var = this.w;
        if (e31Var != null) {
            e31Var.d(r21Var);
        }
    }

    public final void e(ui2<r21> ui2Var) {
        this.x.m(ui2Var);
        e31 e31Var = this.w;
        if (e31Var != null) {
            e31Var.e(ui2Var);
        }
    }

    @Override // defpackage.tg2
    public final mg3<e31> getKey() {
        return d31.a;
    }

    @Override // defpackage.tg2
    public final e31 getValue() {
        return this;
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
