package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 {
    public volatile boolean a;
    public y73 b = y73.CQf.b;
    public int c = 1;
    public int d = 1;
    public final ry4 e = new ry4(QnHx.w);

    public static final class QnHx extends cx1 implements h81<w9<y73>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final w9<y73> invoke() {
            return w9.H(y73.CQf.b);
        }
    }

    public final boolean a() {
        boolean zA;
        boolean z;
        synchronized (this) {
            synchronized (this) {
                zA = ur1.a(this.b, y73.CQf.b);
            }
            return z;
        }
        if (!zA) {
            synchronized (this) {
                z = this.b instanceof y73.NUlFixed;
            }
        }
        return z;
    }

    public final void b(y73 y73Var) {
        a62 a62Var = a62.a;
        if (ur1.a(this.b.getClass(), y73Var.getClass())) {
            return;
        }
        this.b = y73Var;
        ((w9) this.e.getValue()).g(y73Var);
    }

    public final void c(e61 e61Var, zt4 zt4Var) {
        y73 y73Var = this.b;
        if (y73Var instanceof y73.CQf) {
            if (this.a) {
                b(new y73.QnHx(((mn2) e61Var.a).b));
                return;
            }
            return;
        }
        if (y73Var instanceof y73.QnHx) {
            if (this.a) {
                if (this.c == 3) {
                    b(new y73.LPt8Fixed(((mn2) e61Var.a).b));
                    return;
                }
                return;
            } else {
                b73 b73Var = (b73) e61Var.c;
                b73Var.getClass();
                b(new y73.NUlFixed(zt4Var, zs.QnHx.a.c() - b73Var.a));
                return;
            }
        }
        if (y73Var instanceof y73.LPt8Fixed) {
            if (this.a) {
                if (this.c == 4) {
                    b(new y73.F1(((mn2) e61Var.a).b));
                    return;
                }
                return;
            } else {
                b73 b73Var2 = (b73) e61Var.c;
                b73Var2.getClass();
                b(new y73.NUlFixed(zt4Var, zs.QnHx.a.c() - b73Var2.a));
                return;
            }
        }
        if (y73Var instanceof y73.F1) {
            if (this.a) {
                if (this.c == 3) {
                    b(new y73.LPt8Fixed(((mn2) e61Var.a).b));
                    return;
                }
                return;
            } else {
                b73 b73Var3 = (b73) e61Var.c;
                b73Var3.getClass();
                b(new y73.NUlFixed(zt4Var, zs.QnHx.a.c() - b73Var3.a));
                return;
            }
        }
        if (!(y73Var instanceof y73.NUlFixed)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = this.d == 1;
        boolean z2 = this.c == 1;
        if (z && z2) {
            b(y73.CQf.b);
        }
    }
}
