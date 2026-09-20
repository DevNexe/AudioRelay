package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class JHf {
    public static final QnHx a = new QnHx();
    public static final pg2 b;

    public static final class CQf extends cx1 implements y81<vb2, ob2, g70, sb2> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final sb2 invoke(vb2 vb2Var, ob2 ob2Var, g70 g70Var) {
            vb2 vb2Var2 = vb2Var;
            b43 b43VarY = ob2Var.y(g70Var.a);
            int iP0 = vb2Var2.p0(C1645xs.a * 2);
            return vb2Var2.K(b43VarY.k0() - iP0, b43VarY.h0() - iP0, ds0.w, new zf1M(iP0, b43VarY));
        }
    }

    public static final class F1 extends cx1 implements y81<vb2, ob2, g70, sb2> {
        public static final F1 w = new F1();

        public F1() {
            super(3);
        }

        @Override // defpackage.y81
        public final sb2 invoke(vb2 vb2Var, ob2 ob2Var, g70 g70Var) {
            vb2 vb2Var2 = vb2Var;
            b43 b43VarY = ob2Var.y(g70Var.a);
            int iP0 = vb2Var2.p0(C1645xs.a * 2);
            return vb2Var2.K(b43VarY.w + iP0, b43VarY.x + iP0, ds0.w, new a(iP0, b43VarY));
        }
    }

    public static final class QnHx implements tw2 {
        public boolean a;

        @Override // defpackage.tw2
        public final long a(long j, kt2 kt2Var) {
            return kt2.b;
        }

        @Override // defpackage.tw2
        public final mh5 b(long j) {
            return new mh5(mh5.b);
        }

        @Override // defpackage.tw2
        public final pg2 c() {
            int i = pg2.k;
            return pg2.QnHx.w;
        }

        @Override // defpackage.tw2
        public final void d(long j, long j2, kt2 kt2Var, int i) {
        }

        @Override // defpackage.tw2
        public final boolean e() {
            return false;
        }

        @Override // defpackage.tw2
        public final sd5 f(long j) {
            return sd5.a;
        }

        @Override // defpackage.tw2
        public final boolean isEnabled() {
            return this.a;
        }

        @Override // defpackage.tw2
        public final void setEnabled(boolean z) {
            this.a = z;
        }
    }

    static {
        pg2 pg2VarB;
        if (Build.VERSION.SDK_INT >= 31) {
            wo1.QnHx qnHx = wo1.a;
            pg2VarB = hj0.b(new vy1(CQf.w), new vy1(F1.w));
        } else {
            pg2VarB = pg2.QnHx.w;
        }
        b = pg2VarB;
    }
}
