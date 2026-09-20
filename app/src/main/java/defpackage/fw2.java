package defpackage;

import android.graphics.Outline;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fw2 {
    public ij0 a;
    public boolean b = true;
    public final Outline c;
    public long d;
    public dj4 e;
    public TQ2_ f;
    public qz2 g;
    public boolean h;
    public boolean i;
    public qz2 j;
    public ku3 k;
    public float l;
    public long m;
    public long n;
    public boolean o;
    public jy1 p;
    public ew2 q;

    public fw2(ij0 ij0Var) {
        this.a = ij0Var;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        long j = cm4.b;
        this.d = j;
        this.e = el3.a;
        this.m = kt2.b;
        this.n = j;
        this.p = jy1.Ltr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    public final void a(dn dnVar) {
        e();
        qz2 qz2Var = this.g;
        if (qz2Var != null) {
            dnVar.d(qz2Var, 1);
            return;
        }
        float f = this.l;
        if (f <= 0.0f) {
            dnVar.n(kt2.c(this.m), kt2.d(this.m), cm4.e(this.n) + kt2.c(this.m), cm4.c(this.n) + kt2.d(this.m), 1);
            return;
        }
        qz2 qz2VarG = this.j;
        ku3 ku3Var = this.k;
        if (qz2VarG != null) {
            long j = this.m;
            long j2 = this.n;
            boolean z = false;
            if (ku3Var != null && fp1.i0(ku3Var)) {
                if (ku3Var.a == kt2.c(j)) {
                    if (ku3Var.b == kt2.d(j)) {
                        if (ku3Var.c == cm4.e(j2) + kt2.c(j)) {
                            if (ku3Var.d == cm4.c(j2) + kt2.d(j)) {
                                if (ha0.b(ku3Var.e) == f) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!z) {
                float fC = kt2.c(this.m);
                float fD = kt2.d(this.m);
                float fE = cm4.e(this.n) + kt2.c(this.m);
                float fC2 = cm4.c(this.n) + kt2.d(this.m);
                float f2 = this.l;
                ku3 ku3VarN = fp1.n(fC, fD, fE, fC2, hH.f(f2, f2));
                if (qz2VarG == null) {
                    qz2VarG = hH.g();
                } else {
                    qz2VarG.reset();
                }
                qz2VarG.i(ku3VarN);
                this.k = ku3VarN;
                this.j = qz2VarG;
            }
        } else {
            float fC3 = kt2.c(this.m);
            float fD2 = kt2.d(this.m);
            float fE2 = cm4.e(this.n) + kt2.c(this.m);
            float fC4 = cm4.c(this.n) + kt2.d(this.m);
            float f3 = this.l;
            ku3 ku3VarN2 = fp1.n(fC3, fD2, fE2, fC4, hH.f(f3, f3));
            if (qz2VarG == null) {
                qz2VarG = hH.g();
            } else {
                qz2VarG.reset();
            }
            qz2VarG.i(ku3VarN2);
            this.k = ku3VarN2;
            this.j = qz2VarG;
        }
        dnVar.d(qz2VarG, 1);
    }

    public final Outline b() {
        e();
        if (this.o && this.b) {
            return this.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    public final boolean c(long j) {
        ew2 ew2Var;
        boolean z;
        if (!this.o || (ew2Var = this.q) == null) {
            return true;
        }
        float fC = kt2.c(j);
        float fD = kt2.d(j);
        if (ew2Var instanceof ew2.CQf) {
            dl3 dl3Var = ((ew2.CQf) ew2Var).a;
            if (dl3Var.a <= fC && fC < dl3Var.c && dl3Var.b <= fD && fD < dl3Var.d) {
                return true;
            }
        } else {
            if (!(ew2Var instanceof ew2.F1)) {
                if (!(ew2Var instanceof ew2.QnHx)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Cz.u(null, fC, fD);
            }
            ku3 ku3Var = ((ew2.F1) ew2Var).a;
            if (fC >= ku3Var.a) {
                float f = ku3Var.c;
                if (fC < f) {
                    float f2 = ku3Var.b;
                    if (fD >= f2) {
                        float f3 = ku3Var.d;
                        if (fD < f3) {
                            long j2 = ku3Var.e;
                            float fB = ha0.b(j2);
                            long j3 = ku3Var.f;
                            float fB2 = ha0.b(j3) + fB;
                            float f4 = ku3Var.a;
                            float f5 = f - f4;
                            long j4 = ku3Var.g;
                            long j5 = ku3Var.h;
                            if (fB2 > f5) {
                                z = false;
                            } else if (ha0.b(j4) + ha0.b(j5) <= f5) {
                                float f6 = f3 - f2;
                                if (ha0.c(j5) + ha0.c(j2) > f6) {
                                    z = false;
                                } else if (ha0.c(j4) + ha0.c(j3) <= f6) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (!z) {
                                TQ2_ tq2_G = hH.g();
                                tq2_G.i(ku3Var);
                                return Cz.u(tq2_G, fC, fD);
                            }
                            float fB3 = ha0.b(j2) + f4;
                            float fC2 = ha0.c(j2) + f2;
                            float fB4 = f - ha0.b(j3);
                            float fC3 = ha0.c(j3) + f2;
                            float fB5 = f - ha0.b(j4);
                            float fC4 = f3 - ha0.c(j4);
                            float fC5 = f3 - ha0.c(j5);
                            float fB6 = ha0.b(j5) + f4;
                            if (fC < fB3 && fD < fC2) {
                                return Cz.y(fC, fD, fB3, fC2, ku3Var.e);
                            }
                            if (fC < fB6 && fD > fC5) {
                                return Cz.y(fC, fD, fB6, fC5, ku3Var.h);
                            }
                            if (fC > fB4 && fD < fC3) {
                                return Cz.y(fC, fD, fB4, fC3, ku3Var.f);
                            }
                            if (fC <= fB5 || fD <= fC4) {
                                return true;
                            }
                            return Cz.y(fC, fD, fB5, fC4, ku3Var.g);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean d(dj4 dj4Var, float f, boolean z, float f2, jy1 jy1Var, ij0 ij0Var) {
        this.c.setAlpha(f);
        boolean z2 = !ur1.a(this.e, dj4Var);
        if (z2) {
            this.e = dj4Var;
            this.h = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.o != z3) {
            this.o = z3;
            this.h = true;
        }
        if (this.p != jy1Var) {
            this.p = jy1Var;
            this.h = true;
        }
        if (!ur1.a(this.a, ij0Var)) {
            this.a = ij0Var;
            this.h = true;
        }
        return z2;
    }

    public final void e() {
        if (this.h) {
            this.m = kt2.b;
            long j = this.d;
            this.n = j;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            boolean z = this.o;
            Outline outline = this.c;
            if (!z || cm4.e(j) <= 0.0f || cm4.c(this.d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.b = true;
            ew2 ew2VarA = this.e.a(this.d, this.p, this.a);
            this.q = ew2VarA;
            if (ew2VarA instanceof ew2.CQf) {
                dl3 dl3Var = ((ew2.CQf) ew2VarA).a;
                float f = dl3Var.a;
                float f2 = dl3Var.b;
                this.m = X.a(f, f2);
                float f3 = dl3Var.c;
                float f4 = dl3Var.a;
                float f5 = dl3Var.d;
                this.n = ps0.e(f3 - f4, f5 - f2);
                outline.setRect(sy4.c(f4), sy4.c(f2), sy4.c(f3), sy4.c(f5));
                return;
            }
            if (!(ew2VarA instanceof ew2.F1)) {
                if (ew2VarA instanceof ew2.QnHx) {
                    ((ew2.QnHx) ew2VarA).getClass();
                    f(null);
                    return;
                }
                return;
            }
            ku3 ku3Var = ((ew2.F1) ew2VarA).a;
            float fB = ha0.b(ku3Var.e);
            float f6 = ku3Var.a;
            float f7 = ku3Var.b;
            this.m = X.a(f6, f7);
            float f8 = ku3Var.c;
            float f9 = ku3Var.d;
            this.n = ps0.e(f8 - f6, f9 - f7);
            if (fp1.i0(ku3Var)) {
                this.c.setRoundRect(sy4.c(f6), sy4.c(f7), sy4.c(f8), sy4.c(f9), fB);
                this.l = fB;
                return;
            }
            TQ2_ tq2_G = this.f;
            if (tq2_G == null) {
                tq2_G = hH.g();
                this.f = tq2_G;
            }
            tq2_G.reset();
            tq2_G.i(ku3Var);
            f(tq2_G);
        }
    }

    public final void f(qz2 qz2Var) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.c;
        if (i <= 28 && !qz2Var.a()) {
            this.b = false;
            outline.setEmpty();
            this.i = true;
        } else {
            if (!(qz2Var instanceof TQ2_)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((TQ2_) qz2Var).a);
            this.i = !outline.canClip();
        }
        this.g = qz2Var;
    }
}
