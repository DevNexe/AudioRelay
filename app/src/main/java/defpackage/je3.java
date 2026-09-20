package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class je3 extends Cpj {
    public kq4[] f;
    public kq4[] g;
    public int h;
    public final CQf i;

    public class CQf implements Comparable {
        public kq4 w;

        public CQf() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.w.b - ((kq4) obj).b;
        }

        public final String toString() {
            String string = "[ ";
            if (this.w != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbG = Md5A.g(string);
                    sbG.append(this.w.h[i]);
                    sbG.append(" ");
                    string = sbG.toString();
                }
            }
            return string + "] " + this.w;
        }
    }

    public class QnHx implements Comparator<kq4> {
        @Override // java.util.Comparator
        public final int compare(kq4 kq4Var, kq4 kq4Var2) {
            return kq4Var.b - kq4Var2.b;
        }
    }

    public je3(j95 j95Var) {
        super(j95Var);
        this.f = new kq4[128];
        this.g = new kq4[128];
        this.h = 0;
        this.i = new CQf();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    @Override // defpackage.Cpj, o32.QnHx
    public final kq4 a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            kq4[] kq4VarArr = this.f;
            kq4 kq4Var = kq4VarArr[i2];
            if (!zArr[kq4Var.b]) {
                CQf cQf = this.i;
                cQf.w = kq4Var;
                boolean z = true;
                int i3 = 8;
                if (i == -1) {
                    while (true) {
                        if (i3 >= 0) {
                            float f = cQf.w.h[i3];
                            if (f <= 0.0f) {
                                if (f < 0.0f) {
                                    break;
                                }
                                i3--;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        i = i2;
                    }
                } else {
                    kq4 kq4Var2 = kq4VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = kq4Var2.h[i3];
                            float f3 = cQf.w.h[i3];
                            if (f3 != f2) {
                                if (f3 < f2) {
                                    break;
                                }
                                break;
                            }
                            i3--;
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        i = i2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.Cpj
    public final void h(Cpj cpj, boolean z) {
        boolean z2;
        kq4 kq4Var = cpj.a;
        if (kq4Var == null) {
            return;
        }
        Cpj.QnHx qnHx = cpj.d;
        int iC = qnHx.c();
        for (int i = 0; i < iC; i++) {
            kq4 kq4VarD = qnHx.d(i);
            float fG = qnHx.g(i);
            CQf cQf = this.i;
            cQf.w = kq4VarD;
            boolean z3 = kq4VarD.a;
            float[] fArr = kq4Var.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = cQf.w.h;
                    float f = (fArr[i2] * fG) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        cQf.w.h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    je3.this.j(cQf.w);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fG;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        cQf.w.h[i3] = f3;
                    } else {
                        cQf.w.h[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                i(kq4VarD);
            }
            this.b = (cpj.b * fG) + this.b;
        }
        j(kq4Var);
    }

    public final void i(kq4 kq4Var) {
        int i;
        int i2 = this.h + 1;
        kq4[] kq4VarArr = this.f;
        if (i2 > kq4VarArr.length) {
            kq4[] kq4VarArr2 = (kq4[]) Arrays.copyOf(kq4VarArr, kq4VarArr.length * 2);
            this.f = kq4VarArr2;
            this.g = (kq4[]) Arrays.copyOf(kq4VarArr2, kq4VarArr2.length * 2);
        }
        kq4[] kq4VarArr3 = this.f;
        int i3 = this.h;
        kq4VarArr3[i3] = kq4Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && kq4VarArr3[i4 - 1].b > kq4Var.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new QnHx());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        kq4Var.a = true;
        kq4Var.a(this);
    }

    public final void j(kq4 kq4Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == kq4Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        kq4Var.a = false;
                        return;
                    } else {
                        kq4[] kq4VarArr = this.f;
                        int i3 = i + 1;
                        kq4VarArr[i] = kq4VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.Cpj
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            kq4 kq4Var = this.f[i];
            CQf cQf = this.i;
            cQf.w = kq4Var;
            str = str + cQf + " ";
        }
        return str;
    }
}
