package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class wo3 implements uw2 {
    public static final QnHx I = QnHx.w;
    public final fw2 A;
    public boolean B;
    public boolean C;
    public jtf D;
    public final hy1<jk0> E = new hy1<>(I);
    public final pq2 F = new pq2(1);
    public long G = m95.b;
    public final jk0 H;
    public final AndroidComposeView w;
    public j81<? super dn, sd5> x;
    public h81<sd5> y;
    public boolean z;

    public static final class QnHx extends cx1 implements x81<jk0, Matrix, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(jk0 jk0Var, Matrix matrix) {
            jk0Var.M(matrix);
            return sd5.a;
        }
    }

    public wo3(AndroidComposeView androidComposeView, j81 j81Var, kz1.T23 t23) {
        this.w = androidComposeView;
        this.x = j81Var;
        this.y = t23;
        this.A = new fw2(androidComposeView.getDensity());
        jk0 to3Var = Build.VERSION.SDK_INT >= 29 ? new to3() : new oo3(androidComposeView);
        to3Var.E();
        this.H = to3Var;
    }

    @Override // defpackage.uw2
    public final void a(oi2 oi2Var, boolean z) {
        jk0 jk0Var = this.H;
        hy1<jk0> hy1Var = this.E;
        if (!z) {
            eu.f(hy1Var.b(jk0Var), oi2Var);
            return;
        }
        float[] fArrA = hy1Var.a(jk0Var);
        if (fArrA != null) {
            eu.f(fArrA, oi2Var);
            return;
        }
        oi2Var.a = 0.0f;
        oi2Var.b = 0.0f;
        oi2Var.c = 0.0f;
        oi2Var.d = 0.0f;
    }

    @Override // defpackage.uw2
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, dj4 dj4Var, boolean z, long j2, long j3, jy1 jy1Var, ij0 ij0Var) {
        h81<sd5> h81Var;
        this.G = j;
        jk0 jk0Var = this.H;
        boolean zJ = jk0Var.J();
        fw2 fw2Var = this.A;
        boolean z2 = false;
        boolean z3 = zJ && !(fw2Var.i ^ true);
        jk0Var.k(f);
        jk0Var.i(f2);
        jk0Var.b(f3);
        jk0Var.m(f4);
        jk0Var.h(f5);
        jk0Var.z(f6);
        jk0Var.H(hH.A(j2));
        jk0Var.L(hH.A(j3));
        jk0Var.g(f9);
        jk0Var.p(f7);
        jk0Var.e(f8);
        jk0Var.o(f10);
        int i = m95.c;
        jk0Var.u(Float.intBitsToFloat((int) (j >> 32)) * jk0Var.getWidth());
        jk0Var.y(m95.a(j) * jk0Var.getHeight());
        el3.QnHx qnHx = el3.a;
        jk0Var.K(z && dj4Var != qnHx);
        jk0Var.v(z && dj4Var == qnHx);
        jk0Var.f();
        boolean zD = this.A.d(dj4Var, jk0Var.n(), jk0Var.J(), jk0Var.N(), jy1Var, ij0Var);
        jk0Var.C(fw2Var.b());
        if (jk0Var.J() && !(!fw2Var.i)) {
            z2 = true;
        }
        AndroidComposeView androidComposeView = this.w;
        if (z3 != z2 || (z2 && zD)) {
            if (!this.z && !this.B) {
                androidComposeView.invalidate();
                j(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            po5.a.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        if (!this.C && jk0Var.N() > 0.0f && (h81Var = this.y) != null) {
            h81Var.invoke();
        }
        this.E.c();
    }

    @Override // defpackage.uw2
    public final boolean c(long j) {
        float fC = kt2.c(j);
        float fD = kt2.d(j);
        jk0 jk0Var = this.H;
        if (jk0Var.F()) {
            return 0.0f <= fC && fC < ((float) jk0Var.getWidth()) && 0.0f <= fD && fD < ((float) jk0Var.getHeight());
        }
        if (jk0Var.J()) {
            return this.A.c(j);
        }
        return true;
    }

    @Override // defpackage.uw2
    public final void d(dn dnVar) {
        Canvas canvas = F6mt.a;
        Canvas canvas2 = ((ZCR) dnVar).a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        jk0 jk0Var = this.H;
        if (zIsHardwareAccelerated) {
            i();
            boolean z = jk0Var.N() > 0.0f;
            this.C = z;
            if (z) {
                dnVar.v();
            }
            jk0Var.s(canvas2);
            if (this.C) {
                dnVar.h();
                return;
            }
            return;
        }
        float fT = jk0Var.t();
        float fG = jk0Var.G();
        float fI = jk0Var.I();
        float fR = jk0Var.r();
        if (jk0Var.n() < 1.0f) {
            jtf jtfVar = this.D;
            if (jtfVar == null) {
                jtfVar = new jtf();
                this.D = jtfVar;
            }
            jtfVar.b(jk0Var.n());
            canvas2.saveLayer(fT, fG, fI, fR, jtfVar.a);
        } else {
            dnVar.e();
        }
        dnVar.o(fT, fG);
        dnVar.k(this.E.b(jk0Var));
        if (jk0Var.J() || jk0Var.F()) {
            this.A.a(dnVar);
        }
        j81<? super dn, sd5> j81Var = this.x;
        if (j81Var != null) {
            j81Var.invoke(dnVar);
        }
        dnVar.r();
        j(false);
    }

    @Override // defpackage.uw2
    public final void destroy() {
        jk0 jk0Var = this.H;
        if (jk0Var.B()) {
            jk0Var.x();
        }
        this.x = null;
        this.y = null;
        this.B = true;
        j(false);
        AndroidComposeView androidComposeView = this.w;
        androidComposeView.R = true;
        androidComposeView.D(this);
    }

    @Override // defpackage.uw2
    public final long e(long j, boolean z) {
        jk0 jk0Var = this.H;
        hy1<jk0> hy1Var = this.E;
        if (!z) {
            return eu.e(hy1Var.b(jk0Var), j);
        }
        float[] fArrA = hy1Var.a(jk0Var);
        if (fArrA != null) {
            return eu.e(fArrA, j);
        }
        int i = kt2.e;
        return kt2.c;
    }

    @Override // defpackage.uw2
    public final void f(long j) {
        int i = (int) (j >> 32);
        int iB = sp1.b(j);
        long j2 = this.G;
        int i2 = m95.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float f = i;
        jk0 jk0Var = this.H;
        jk0Var.u(fIntBitsToFloat * f);
        float f2 = iB;
        jk0Var.y(m95.a(this.G) * f2);
        if (jk0Var.w(jk0Var.t(), jk0Var.G(), jk0Var.t() + i, jk0Var.G() + iB)) {
            long jE = ps0.e(f, f2);
            fw2 fw2Var = this.A;
            if (!cm4.b(fw2Var.d, jE)) {
                fw2Var.d = jE;
                fw2Var.h = true;
            }
            jk0Var.C(fw2Var.b());
            if (!this.z && !this.B) {
                this.w.invalidate();
                j(true);
            }
            this.E.c();
        }
    }

    @Override // defpackage.uw2
    public final void g(kz1.T23 t23, j81 j81Var) {
        j(false);
        this.B = false;
        this.C = false;
        this.G = m95.b;
        this.x = j81Var;
        this.y = t23;
    }

    @Override // defpackage.uw2
    public final void h(long j) {
        jk0 jk0Var = this.H;
        int iT = jk0Var.t();
        int iG = jk0Var.G();
        int i = (int) (j >> 32);
        int iA = mp1.a(j);
        if (iT == i && iG == iA) {
            return;
        }
        jk0Var.q(i - iT);
        jk0Var.A(iA - iG);
        int i2 = Build.VERSION.SDK_INT;
        AndroidComposeView androidComposeView = this.w;
        if (i2 >= 26) {
            po5.a.a(androidComposeView);
        } else {
            androidComposeView.invalidate();
        }
        this.E.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // defpackage.uw2
    public final void i() {
        qz2 qz2Var;
        boolean z = this.z;
        jk0 jk0Var = this.H;
        if (z || !jk0Var.B()) {
            j(false);
            if (jk0Var.J()) {
                fw2 fw2Var = this.A;
                if (!fw2Var.i) {
                    qz2Var = null;
                } else {
                    fw2Var.e();
                    qz2Var = fw2Var.g;
                }
            } else {
                qz2Var = null;
            }
            j81<? super dn, sd5> j81Var = this.x;
            if (j81Var != null) {
                jk0Var.D(this.F, qz2Var, j81Var);
            }
        }
    }

    @Override // defpackage.uw2
    public final void invalidate() {
        if (this.z || this.B) {
            return;
        }
        this.w.invalidate();
        j(true);
    }

    public final void j(boolean z) {
        if (z != this.z) {
            this.z = z;
            this.w.B(this, z);
        }
    }
}
