package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r21 extends zo1 implements rg2, tg2<r21>, xw2, qu2 {
    public static final QnHx L = QnHx.w;
    public r21 A;
    public i21 B;
    public a21<ju3> C;
    public x9 D;
    public a31 E;
    public final y21 F;
    public e31 G;
    public kz1 H;
    public boolean I;
    public bw1 J;
    public final ui2<bw1> K;
    public r21 x;
    public final ui2<r21> y;
    public g31 z;

    public static final class QnHx extends cx1 implements j81<r21, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(r21 r21Var) {
            z21.a(r21Var);
            return sd5.a;
        }
    }

    public r21() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(int i) {
        super(wo1.a);
        g31 g31Var = g31.Inactive;
        this.y = new ui2<>(new r21[16]);
        this.z = g31Var;
        this.F = new y21();
        this.K = new ui2<>(new bw1[16]);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final void b(g31 g31Var) {
        this.z = g31Var;
        i21 i21Var = this.B;
        if (i21Var != null) {
            i21Var.d();
        }
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        ui2<r21> ui2Var;
        ui2<r21> ui2Var2;
        int iOrdinal;
        kz1 kz1Var;
        yy1 yy1Var;
        ww2 ww2Var;
        p21 focusManager;
        r21 r21Var = (r21) vg2Var.a(s21.a);
        if (!ur1.a(r21Var, this.x)) {
            if (r21Var == null && (((iOrdinal = this.z.ordinal()) == 0 || iOrdinal == 2) && (kz1Var = this.H) != null && (yy1Var = kz1Var.A) != null && (ww2Var = yy1Var.C) != null && (focusManager = ww2Var.getFocusManager()) != null)) {
                focusManager.b(true);
            }
            r21 r21Var2 = this.x;
            if (r21Var2 != null && (ui2Var2 = r21Var2.y) != null) {
                ui2Var2.l(this);
            }
            if (r21Var != null && (ui2Var = r21Var.y) != null) {
                ui2Var.b(this);
            }
        }
        this.x = r21Var;
        i21 i21Var = (i21) vg2Var.a(f21.a);
        if (!ur1.a(i21Var, this.B)) {
            i21 i21Var2 = this.B;
            if (i21Var2 != null) {
                i21Var2.e(this);
            }
            if (i21Var != null) {
                i21Var.a(this);
            }
        }
        this.B = i21Var;
        e31 e31Var = (e31) vg2Var.a(d31.a);
        if (!ur1.a(e31Var, this.G)) {
            e31 e31Var2 = this.G;
            if (e31Var2 != null) {
                e31Var2.d(this);
            }
            if (e31Var != null) {
                e31Var.a(this);
            }
        }
        this.G = e31Var;
        this.C = (a21) vg2Var.a(hu3.a);
        this.D = (x9) vg2Var.a(y9.a);
        this.J = (bw1) vg2Var.a(cw1.a);
        this.E = (a31) vg2Var.a(z21.a);
        z21.a(this);
    }

    @Override // defpackage.tg2
    public final mg3<r21> getKey() {
        return s21.a;
    }

    @Override // defpackage.tg2
    public final r21 getValue() {
        return this;
    }

    @Override // defpackage.xw2
    public final boolean isValid() {
        return this.x != null;
    }

    @Override // defpackage.qu2
    public final void l(iy1 iy1Var) {
        boolean z = this.H == null;
        this.H = (kz1) iy1Var;
        if (z) {
            z21.a(this);
        }
        if (this.I) {
            this.I = false;
            OW8.t(this);
        }
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
