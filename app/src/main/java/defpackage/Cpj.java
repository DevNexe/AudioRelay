package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Cpj implements o32.QnHx {
    public QnHx d;
    public kq4 a = null;
    public float b = 0.0f;
    public final ArrayList<kq4> c = new ArrayList<>();
    public boolean e = false;

    public interface QnHx {
        float a(kq4 kq4Var);

        boolean b(kq4 kq4Var);

        int c();

        void clear();

        kq4 d(int i);

        void e(kq4 kq4Var, float f, boolean z);

        void f();

        float g(int i);

        float h(kq4 kq4Var, boolean z);

        float i(Cpj cpj, boolean z);

        void j(float f);

        void k(kq4 kq4Var, float f);
    }

    public Cpj() {
    }

    @Override // o32.QnHx
    public kq4 a(boolean[] zArr) {
        return e(zArr, null);
    }

    public final void b(o32 o32Var, int i) {
        this.d.k(o32Var.i(i), 1.0f);
        this.d.k(o32Var.i(i), -1.0f);
    }

    public final void c(kq4 kq4Var, kq4 kq4Var2, kq4 kq4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.k(kq4Var, 1.0f);
            this.d.k(kq4Var2, -1.0f);
            this.d.k(kq4Var3, -1.0f);
        } else {
            this.d.k(kq4Var, -1.0f);
            this.d.k(kq4Var2, 1.0f);
            this.d.k(kq4Var3, 1.0f);
        }
    }

    public final void d(kq4 kq4Var, kq4 kq4Var2, kq4 kq4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.k(kq4Var, 1.0f);
            this.d.k(kq4Var2, -1.0f);
            this.d.k(kq4Var3, 1.0f);
        } else {
            this.d.k(kq4Var, -1.0f);
            this.d.k(kq4Var2, 1.0f);
            this.d.k(kq4Var3, -1.0f);
        }
    }

    public final kq4 e(boolean[] zArr, kq4 kq4Var) {
        int i;
        int iC = this.d.c();
        kq4 kq4Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iC; i2++) {
            float fG = this.d.g(i2);
            if (fG < 0.0f) {
                kq4 kq4VarD = this.d.d(i2);
                if ((zArr == null || !zArr[kq4VarD.b]) && kq4VarD != kq4Var && (((i = kq4VarD.i) == 3 || i == 4) && fG < f)) {
                    f = fG;
                    kq4Var2 = kq4VarD;
                }
            }
        }
        return kq4Var2;
    }

    public final void f(kq4 kq4Var) {
        kq4 kq4Var2 = this.a;
        if (kq4Var2 != null) {
            this.d.k(kq4Var2, -1.0f);
            this.a = null;
        }
        float fH = this.d.h(kq4Var, true) * (-1.0f);
        this.a = kq4Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        this.d.j(fH);
    }

    public final void g(kq4 kq4Var, boolean z) {
        if (kq4Var.f) {
            float fA = this.d.a(kq4Var);
            this.b = (kq4Var.e * fA) + this.b;
            this.d.h(kq4Var, z);
            if (z) {
                kq4Var.b(this);
            }
        }
    }

    public void h(Cpj cpj, boolean z) {
        float fI = this.d.i(cpj, z);
        this.b = (cpj.b * fI) + this.b;
        if (z) {
            cpj.a.b(this);
        }
    }

    public String toString() {
        boolean z;
        String strA = rz.a(this.a == null ? "0" : "" + this.a, " = ");
        if (this.b != 0.0f) {
            StringBuilder sbG = Md5A.g(strA);
            sbG.append(this.b);
            strA = sbG.toString();
            z = true;
        } else {
            z = false;
        }
        int iC = this.d.c();
        for (int i = 0; i < iC; i++) {
            kq4 kq4VarD = this.d.d(i);
            if (kq4VarD != null) {
                float fG = this.d.g(i);
                if (fG != 0.0f) {
                    String string = kq4VarD.toString();
                    if (z) {
                        if (fG > 0.0f) {
                            strA = rz.a(strA, " + ");
                        } else {
                            strA = rz.a(strA, " - ");
                            fG *= -1.0f;
                        }
                    } else if (fG < 0.0f) {
                        strA = rz.a(strA, "- ");
                        fG *= -1.0f;
                    }
                    strA = fG == 1.0f ? rz.a(strA, string) : strA + fG + " " + string;
                    z = true;
                }
            }
        }
        return !z ? rz.a(strA, "0.0") : strA;
    }

    public Cpj(j95 j95Var) {
        this.d = new kQm(this, j95Var);
    }
}
