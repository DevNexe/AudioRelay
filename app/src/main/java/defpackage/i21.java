package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i21 implements tg2<i21>, rg2 {
    public final j81<f31, sd5> w;
    public i21 x;
    public final ui2<i21> y = new ui2<>(new i21[16]);
    public final ui2<r21> z = new ui2<>(new r21[16]);

    /* JADX WARN: Multi-variable type inference failed */
    public i21(j81<? super f31, sd5> j81Var) {
        this.w = j81Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final void a(r21 r21Var) {
        this.z.b(r21Var);
        i21 i21Var = this.x;
        if (i21Var != null) {
            i21Var.a(r21Var);
        }
    }

    public final void b(ui2<r21> ui2Var) {
        ui2<r21> ui2Var2 = this.z;
        ui2Var2.c(ui2Var2.y, ui2Var);
        i21 i21Var = this.x;
        if (i21Var != null) {
            i21Var.b(ui2Var);
        }
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        mg3<i21> mg3Var = f21.a;
        i21 i21Var = (i21) vg2Var.a(mg3Var);
        if (!ur1.a(i21Var, this.x)) {
            i21 i21Var2 = this.x;
            ui2<r21> ui2Var = this.z;
            if (i21Var2 != null) {
                i21Var2.y.l(this);
                i21Var2.f(ui2Var);
            }
            this.x = i21Var;
            if (i21Var != null) {
                i21Var.y.b(this);
                i21Var.b(ui2Var);
            }
        }
        this.x = (i21) vg2Var.a(mg3Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    public final void d() {
        Boolean bool;
        g31 g31Var;
        ui2<r21> ui2Var = this.z;
        int i = ui2Var.y;
        g31 g31Var2 = g31.Inactive;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                r21 r21Var = null;
                Boolean bool2 = null;
                if (i > 0) {
                    r21[] r21VarArr = ui2Var.w;
                    r21 r21Var2 = null;
                    do {
                        r21 r21Var3 = r21VarArr[i2];
                        int iOrdinal = r21Var3.z.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                            bool2 = Boolean.FALSE;
                            r21Var2 = r21Var3;
                        } else if (iOrdinal != 3) {
                            if (iOrdinal == 4) {
                                bool2 = Boolean.FALSE;
                                r21Var2 = r21Var3;
                            } else if (iOrdinal == 5) {
                                bool2 = Boolean.FALSE;
                            }
                        } else if (bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i2++;
                    } while (i2 < i);
                    bool = bool2;
                    r21Var = r21Var2;
                } else {
                    bool = null;
                }
                if (r21Var != null && (g31Var = r21Var.z) != null) {
                    g31Var2 = g31Var;
                } else if (ur1.a(bool, Boolean.TRUE)) {
                    g31Var2 = g31.Deactivated;
                }
            } else {
                g31Var2 = ui2Var.w[0].z;
            }
        }
        this.w.invoke(g31Var2);
        i21 i21Var = this.x;
        if (i21Var != null) {
            i21Var.d();
        }
    }

    public final void e(r21 r21Var) {
        this.z.l(r21Var);
        i21 i21Var = this.x;
        if (i21Var != null) {
            i21Var.e(r21Var);
        }
    }

    public final void f(ui2<r21> ui2Var) {
        this.z.m(ui2Var);
        i21 i21Var = this.x;
        if (i21Var != null) {
            i21Var.f(ui2Var);
        }
    }

    @Override // defpackage.tg2
    public final mg3<i21> getKey() {
        return f21.a;
    }

    @Override // defpackage.tg2
    public final i21 getValue() {
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
