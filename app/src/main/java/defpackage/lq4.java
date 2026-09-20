package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lq4 implements Cpj.QnHx {
    public int a = 16;
    public final int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d = new int[16];
    public float[] e = new float[16];
    public int[] f = new int[16];
    public int[] g = new int[16];
    public int h = 0;
    public int i = -1;
    public final Cpj j;
    public final j95 k;

    public lq4(Cpj cpj, j95 j95Var) {
        this.j = cpj;
        this.k = j95Var;
        clear();
    }

    @Override // Cpj.QnHx
    public final float a(kq4 kq4Var) {
        int iN = n(kq4Var);
        if (iN != -1) {
            return this.e[iN];
        }
        return 0.0f;
    }

    @Override // Cpj.QnHx
    public final boolean b(kq4 kq4Var) {
        return n(kq4Var) != -1;
    }

    @Override // Cpj.QnHx
    public final int c() {
        return this.h;
    }

    @Override // Cpj.QnHx
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            kq4 kq4VarD = d(i2);
            if (kq4VarD != null) {
                kq4VarD.b(this.j);
            }
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            this.d[i3] = -1;
            this.c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.b[i4] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    @Override // Cpj.QnHx
    public final kq4 d(int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((kq4[]) this.k.d)[this.d[i3]];
            }
            i3 = this.g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // Cpj.QnHx
    public final void e(kq4 kq4Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iN = n(kq4Var);
            if (iN == -1) {
                k(kq4Var, f);
                return;
            }
            float[] fArr = this.e;
            float f2 = fArr[iN] + f;
            fArr[iN] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            h(kq4Var, z);
        }
    }

    @Override // Cpj.QnHx
    public final void f() {
        int i = this.h;
        int i2 = this.i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // Cpj.QnHx
    public final float g(int i) {
        int i2 = this.h;
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.e[i3];
            }
            i3 = this.g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // Cpj.QnHx
    public final float h(kq4 kq4Var, boolean z) {
        int[] iArr;
        int i;
        int iN = n(kq4Var);
        if (iN == -1) {
            return 0.0f;
        }
        int i2 = kq4Var.b;
        int i3 = i2 % 16;
        int[] iArr2 = this.b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.d[i4] == i2) {
                int[] iArr3 = this.c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.c;
                    i = iArr[i4];
                    if (i == -1 || this.d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.e[iN];
        if (this.i == iN) {
            this.i = this.g[iN];
        }
        this.d[iN] = -1;
        int[] iArr4 = this.f;
        int i5 = iArr4[iN];
        if (i5 != -1) {
            int[] iArr5 = this.g;
            iArr5[i5] = iArr5[iN];
        }
        int i6 = this.g[iN];
        if (i6 != -1) {
            iArr4[i6] = iArr4[iN];
        }
        this.h--;
        kq4Var.l--;
        if (z) {
            kq4Var.b(this.j);
        }
        return f;
    }

    @Override // Cpj.QnHx
    public final float i(Cpj cpj, boolean z) {
        float fA = a(cpj.a);
        h(cpj.a, z);
        lq4 lq4Var = (lq4) cpj.d;
        int i = lq4Var.h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = lq4Var.d[i3];
            if (i4 != -1) {
                e(((kq4[]) this.k.d)[i4], lq4Var.e[i3] * fA, z);
                i2++;
            }
            i3++;
        }
        return fA;
    }

    @Override // Cpj.QnHx
    public final void j(float f) {
        int i = this.h;
        int i2 = this.i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // Cpj.QnHx
    public final void k(kq4 kq4Var, float f) {
        if (f > -0.001f && f < 0.001f) {
            h(kq4Var, true);
            return;
        }
        int i = 0;
        if (this.h == 0) {
            m(0, kq4Var, f);
            l(kq4Var, 0);
            this.i = 0;
            return;
        }
        int iN = n(kq4Var);
        if (iN != -1) {
            this.e[iN] = f;
            return;
        }
        int i2 = this.h + 1;
        int i3 = this.a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.d = Arrays.copyOf(this.d, i4);
            this.e = Arrays.copyOf(this.e, i4);
            this.f = Arrays.copyOf(this.f, i4);
            this.g = Arrays.copyOf(this.g, i4);
            this.c = Arrays.copyOf(this.c, i4);
            for (int i5 = this.a; i5 < i4; i5++) {
                this.d[i5] = -1;
                this.c[i5] = -1;
            }
            this.a = i4;
        }
        int i6 = this.h;
        int i7 = this.i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.d[i7];
            int i11 = kq4Var.b;
            if (i10 == i11) {
                this.e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.a) {
                i = -1;
                break;
            } else if (this.d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m(i, kq4Var, f);
        if (i8 != -1) {
            this.f[i] = i8;
            int[] iArr = this.g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f[i] = -1;
            if (this.h > 0) {
                this.g[i] = this.i;
                this.i = i;
            } else {
                this.g[i] = -1;
            }
        }
        int i12 = this.g[i];
        if (i12 != -1) {
            this.f[i12] = i;
        }
        l(kq4Var, i);
    }

    public final void l(kq4 kq4Var, int i) {
        int[] iArr;
        int i2 = kq4Var.b % 16;
        int[] iArr2 = this.b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.c[i] = -1;
    }

    public final void m(int i, kq4 kq4Var, float f) {
        this.d[i] = kq4Var.b;
        this.e[i] = f;
        this.f[i] = -1;
        this.g[i] = -1;
        kq4Var.a(this.j);
        kq4Var.l++;
        this.h++;
    }

    public final int n(kq4 kq4Var) {
        if (this.h == 0) {
            return -1;
        }
        int i = kq4Var.b;
        int i2 = this.b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.d[i2] != i);
        if (i2 != -1 && this.d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final String toString() {
        String strA;
        String strA2;
        String strA3 = hashCode() + " { ";
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            kq4 kq4VarD = d(i2);
            if (kq4VarD != null) {
                String str = strA3 + kq4VarD + " = " + g(i2) + " ";
                int iN = n(kq4VarD);
                String strA4 = rz.a(str, "[p: ");
                int i3 = this.f[iN];
                j95 j95Var = this.k;
                if (i3 != -1) {
                    StringBuilder sbG = Md5A.g(strA4);
                    sbG.append(((kq4[]) j95Var.d)[this.d[this.f[iN]]]);
                    strA = sbG.toString();
                } else {
                    strA = rz.a(strA4, "none");
                }
                String strA5 = rz.a(strA, ", n: ");
                if (this.g[iN] != -1) {
                    StringBuilder sbG2 = Md5A.g(strA5);
                    sbG2.append(((kq4[]) j95Var.d)[this.d[this.g[iN]]]);
                    strA2 = sbG2.toString();
                } else {
                    strA2 = rz.a(strA5, "none");
                }
                strA3 = rz.a(strA2, "]");
            }
        }
        return rz.a(strA3, " }");
    }
}
