package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o32 {
    public static int o = 1000;
    public static boolean p = true;
    public final je3 b;
    public Cpj[] e;
    public final j95 k;
    public Cpj n;
    public int a = 0;
    public int c = 32;
    public int d = 32;
    public boolean f = false;
    public boolean[] g = new boolean[32];
    public int h = 1;
    public int i = 0;
    public int j = 32;
    public kq4[] l = new kq4[o];
    public int m = 0;

    public class CQf extends Cpj {
        public CQf(j95 j95Var) {
            this.d = new lq4(this, j95Var);
        }
    }

    public interface QnHx {
        kq4 a(boolean[] zArr);
    }

    public o32() {
        this.e = null;
        this.e = new Cpj[32];
        q();
        j95 j95Var = new j95(1);
        this.k = j95Var;
        this.b = new je3(j95Var);
        if (p) {
            this.n = new CQf(j95Var);
        } else {
            this.n = new Cpj(j95Var);
        }
    }

    public static int m(w60 w60Var) {
        kq4 kq4Var = w60Var.g;
        if (kq4Var != null) {
            return (int) (kq4Var.e + 0.5f);
        }
        return 0;
    }

    public final kq4 a(int i) {
        kq4 kq4Var = (kq4) ((x93) this.k.c).a();
        if (kq4Var == null) {
            kq4Var = new kq4(i);
            kq4Var.i = i;
        } else {
            kq4Var.c();
            kq4Var.i = i;
        }
        int i2 = this.m;
        int i3 = o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            o = i4;
            this.l = (kq4[]) Arrays.copyOf(this.l, i4);
        }
        kq4[] kq4VarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        kq4VarArr[i5] = kq4Var;
        return kq4Var;
    }

    public final void b(kq4 kq4Var, kq4 kq4Var2, int i, float f, kq4 kq4Var3, kq4 kq4Var4, int i2, int i3) {
        Cpj cpjK = k();
        if (kq4Var2 == kq4Var3) {
            cpjK.d.k(kq4Var, 1.0f);
            cpjK.d.k(kq4Var4, 1.0f);
            cpjK.d.k(kq4Var2, -2.0f);
        } else if (f == 0.5f) {
            cpjK.d.k(kq4Var, 1.0f);
            cpjK.d.k(kq4Var2, -1.0f);
            cpjK.d.k(kq4Var3, -1.0f);
            cpjK.d.k(kq4Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                cpjK.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            cpjK.d.k(kq4Var, -1.0f);
            cpjK.d.k(kq4Var2, 1.0f);
            cpjK.b = i;
        } else if (f >= 1.0f) {
            cpjK.d.k(kq4Var4, -1.0f);
            cpjK.d.k(kq4Var3, 1.0f);
            cpjK.b = -i2;
        } else {
            float f2 = 1.0f - f;
            cpjK.d.k(kq4Var, f2 * 1.0f);
            cpjK.d.k(kq4Var2, f2 * (-1.0f));
            cpjK.d.k(kq4Var3, (-1.0f) * f);
            cpjK.d.k(kq4Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                cpjK.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            cpjK.b(this, i3);
        }
        c(cpjK);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    public final void c(Cpj cpj) {
        boolean z;
        boolean z2;
        boolean z3;
        kq4 kq4VarE;
        ArrayList<kq4> arrayList;
        boolean z4 = true;
        if (this.i + 1 >= this.j || this.h + 1 >= this.d) {
            n();
        }
        if (cpj.e) {
            z = false;
        } else {
            if (this.e.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iC = cpj.d.c();
                    int i = 0;
                    while (true) {
                        arrayList = cpj.c;
                        if (i >= iC) {
                            break;
                        }
                        kq4 kq4VarD = cpj.d.d(i);
                        if (kq4VarD.c != -1 || kq4VarD.f) {
                            arrayList.add(kq4VarD);
                        }
                        i++;
                    }
                    if (arrayList.size() > 0) {
                        for (kq4 kq4Var : arrayList) {
                            if (kq4Var.f) {
                                cpj.g(kq4Var, true);
                            } else {
                                cpj.h(this.e[kq4Var.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            if (cpj.a == null && cpj.b == 0.0f && cpj.d.c() == 0) {
                return;
            }
            float f = cpj.b;
            if (f < 0.0f) {
                cpj.b = f * (-1.0f);
                cpj.d.f();
            }
            int iC2 = cpj.d.c();
            kq4 kq4Var2 = null;
            kq4 kq4Var3 = null;
            float f2 = 0.0f;
            boolean z6 = false;
            float f3 = 0.0f;
            boolean z7 = false;
            for (int i2 = 0; i2 < iC2; i2++) {
                float fG = cpj.d.g(i2);
                kq4 kq4VarD2 = cpj.d.d(i2);
                if (kq4VarD2.i == 1) {
                    if (kq4Var2 == null) {
                        if (kq4VarD2.l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        kq4Var2 = kq4VarD2;
                        f2 = fG;
                    } else if (f2 > fG) {
                        if (kq4VarD2.l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        kq4Var2 = kq4VarD2;
                        f2 = fG;
                    } else if (!z6) {
                        if (kq4VarD2.l <= 1) {
                            kq4Var2 = kq4VarD2;
                            f2 = fG;
                            z6 = true;
                        }
                    }
                } else if (kq4Var2 == null && fG < 0.0f) {
                    if (kq4Var3 == null) {
                        if (kq4VarD2.l <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        kq4Var3 = kq4VarD2;
                        f3 = fG;
                    } else if (f3 > fG) {
                        if (kq4VarD2.l <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        kq4Var3 = kq4VarD2;
                        f3 = fG;
                    } else if (!z7) {
                        if (kq4VarD2.l <= 1) {
                            kq4Var3 = kq4VarD2;
                            f3 = fG;
                            z7 = true;
                        }
                    }
                }
            }
            if (kq4Var2 == null) {
                kq4Var2 = kq4Var3;
            }
            if (kq4Var2 == null) {
                z2 = true;
            } else {
                cpj.f(kq4Var2);
                z2 = false;
            }
            if (cpj.d.c() == 0) {
                cpj.e = true;
            }
            if (z2) {
                if (this.h + 1 >= this.d) {
                    n();
                }
                kq4 kq4VarA = a(3);
                int i3 = this.a + 1;
                this.a = i3;
                this.h++;
                kq4VarA.b = i3;
                ((kq4[]) this.k.d)[i3] = kq4VarA;
                cpj.a = kq4VarA;
                h(cpj);
                Cpj cpj2 = this.n;
                cpj2.getClass();
                cpj2.a = null;
                cpj2.d.clear();
                for (int i4 = 0; i4 < cpj.d.c(); i4++) {
                    cpj2.d.e(cpj.d.d(i4), cpj.d.g(i4), true);
                }
                p(this.n);
                if (kq4VarA.c == -1) {
                    if (cpj.a == kq4VarA && (kq4VarE = cpj.e(null, kq4VarA)) != null) {
                        cpj.f(kq4VarE);
                    }
                    if (!cpj.e) {
                        cpj.a.d(cpj);
                    }
                    this.i--;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            kq4 kq4Var4 = cpj.a;
            if (kq4Var4 == null || (kq4Var4.i != 1 && cpj.b < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        h(cpj);
    }

    public final void d(kq4 kq4Var, int i) {
        int i2 = kq4Var.c;
        if (i2 == -1) {
            kq4Var.e = i;
            kq4Var.f = true;
            int i3 = kq4Var.k;
            for (int i4 = 0; i4 < i3; i4++) {
                kq4Var.j[i4].g(kq4Var, false);
            }
            kq4Var.k = 0;
            return;
        }
        if (i2 == -1) {
            Cpj cpjK = k();
            cpjK.a = kq4Var;
            float f = i;
            kq4Var.e = f;
            cpjK.b = f;
            cpjK.e = true;
            c(cpjK);
            return;
        }
        Cpj cpj = this.e[i2];
        if (cpj.e) {
            cpj.b = i;
            return;
        }
        if (cpj.d.c() == 0) {
            cpj.e = true;
            cpj.b = i;
            return;
        }
        Cpj cpjK2 = k();
        if (i < 0) {
            cpjK2.b = i * (-1);
            cpjK2.d.k(kq4Var, 1.0f);
        } else {
            cpjK2.b = i;
            cpjK2.d.k(kq4Var, -1.0f);
        }
        c(cpjK2);
    }

    public final void e(kq4 kq4Var, kq4 kq4Var2, int i, int i2) {
        boolean z = true;
        boolean z2 = false;
        if (i2 == 8 && kq4Var2.f && kq4Var.c == -1) {
            kq4Var.e = kq4Var2.e + i;
            kq4Var.f = true;
            int i3 = kq4Var.k;
            for (int i4 = 0; i4 < i3; i4++) {
                kq4Var.j[i4].g(kq4Var, false);
            }
            kq4Var.k = 0;
            return;
        }
        Cpj cpjK = k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
            } else {
                z = false;
            }
            cpjK.b = i;
            z2 = z;
        }
        if (z2) {
            cpjK.d.k(kq4Var, 1.0f);
            cpjK.d.k(kq4Var2, -1.0f);
        } else {
            cpjK.d.k(kq4Var, -1.0f);
            cpjK.d.k(kq4Var2, 1.0f);
        }
        if (i2 != 8) {
            cpjK.b(this, i2);
        }
        c(cpjK);
    }

    public final void f(kq4 kq4Var, kq4 kq4Var2, int i, int i2) {
        Cpj cpjK = k();
        kq4 kq4VarL = l();
        kq4VarL.d = 0;
        cpjK.c(kq4Var, kq4Var2, kq4VarL, i);
        if (i2 != 8) {
            cpjK.d.k(i(i2), (int) (cpjK.d.a(kq4VarL) * (-1.0f)));
        }
        c(cpjK);
    }

    public final void g(kq4 kq4Var, kq4 kq4Var2, int i, int i2) {
        Cpj cpjK = k();
        kq4 kq4VarL = l();
        kq4VarL.d = 0;
        cpjK.d(kq4Var, kq4Var2, kq4VarL, i);
        if (i2 != 8) {
            cpjK.d.k(i(i2), (int) (cpjK.d.a(kq4VarL) * (-1.0f)));
        }
        c(cpjK);
    }

    public final void h(Cpj cpj) {
        boolean z = p;
        j95 j95Var = this.k;
        if (z) {
            Cpj cpj2 = this.e[this.i];
            if (cpj2 != null) {
                ((x93) j95Var.a).b(cpj2);
            }
        } else {
            Cpj cpj3 = this.e[this.i];
            if (cpj3 != null) {
                ((x93) j95Var.b).b(cpj3);
            }
        }
        Cpj[] cpjArr = this.e;
        int i = this.i;
        cpjArr[i] = cpj;
        kq4 kq4Var = cpj.a;
        kq4Var.c = i;
        this.i = i + 1;
        kq4Var.d(cpj);
    }

    public final kq4 i(int i) {
        if (this.h + 1 >= this.d) {
            n();
        }
        kq4 kq4VarA = a(4);
        int i2 = this.a + 1;
        this.a = i2;
        this.h++;
        kq4VarA.b = i2;
        kq4VarA.d = i;
        ((kq4[]) this.k.d)[i2] = kq4VarA;
        je3 je3Var = this.b;
        je3Var.i.w = kq4VarA;
        float[] fArr = kq4VarA.h;
        Arrays.fill(fArr, 0.0f);
        fArr[kq4VarA.d] = 1.0f;
        je3Var.i(kq4VarA);
        return kq4VarA;
    }

    public final kq4 j(Object obj) {
        kq4 kq4Var = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.d) {
            n();
        }
        if (obj instanceof w60) {
            w60 w60Var = (w60) obj;
            kq4Var = w60Var.g;
            if (kq4Var == null) {
                w60Var.f();
                kq4Var = w60Var.g;
            }
            int i = kq4Var.b;
            j95 j95Var = this.k;
            if (i == -1 || i > this.a || ((kq4[]) j95Var.d)[i] == null) {
                if (i != -1) {
                    kq4Var.c();
                }
                int i2 = this.a + 1;
                this.a = i2;
                this.h++;
                kq4Var.b = i2;
                kq4Var.i = 1;
                ((kq4[]) j95Var.d)[i2] = kq4Var;
            }
        }
        return kq4Var;
    }

    public final Cpj k() {
        boolean z = p;
        j95 j95Var = this.k;
        if (z) {
            Cpj cpj = (Cpj) ((x93) j95Var.a).a();
            if (cpj == null) {
                return new CQf(j95Var);
            }
            cpj.a = null;
            cpj.d.clear();
            cpj.b = 0.0f;
            cpj.e = false;
            return cpj;
        }
        Cpj cpj2 = (Cpj) ((x93) j95Var.b).a();
        if (cpj2 == null) {
            return new Cpj(j95Var);
        }
        cpj2.a = null;
        cpj2.d.clear();
        cpj2.b = 0.0f;
        cpj2.e = false;
        return cpj2;
    }

    public final kq4 l() {
        if (this.h + 1 >= this.d) {
            n();
        }
        kq4 kq4VarA = a(3);
        int i = this.a + 1;
        this.a = i;
        this.h++;
        kq4VarA.b = i;
        ((kq4[]) this.k.d)[i] = kq4VarA;
        return kq4VarA;
    }

    public final void n() {
        int i = this.c * 2;
        this.c = i;
        this.e = (Cpj[]) Arrays.copyOf(this.e, i);
        j95 j95Var = this.k;
        j95Var.d = (kq4[]) Arrays.copyOf((kq4[]) j95Var.d, this.c);
        int i2 = this.c;
        this.g = new boolean[i2];
        this.d = i2;
        this.j = i2;
    }

    public final void o(je3 je3Var) {
        float f;
        int i;
        boolean z;
        j95 j95Var;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.i) {
                z = false;
                break;
            }
            Cpj cpj = this.e[i2];
            if (cpj.a.i != 1 && cpj.b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (true) {
                    int i8 = this.i;
                    j95Var = this.k;
                    if (i4 >= i8) {
                        break;
                    }
                    Cpj cpj2 = this.e[i4];
                    if (cpj2.a.i != i && !cpj2.e && cpj2.b < f) {
                        int i9 = 1;
                        while (i9 < this.h) {
                            kq4 kq4Var = ((kq4[]) j95Var.d)[i9];
                            float fA = cpj2.d.a(kq4Var);
                            if (fA > f) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f3 = kq4Var.g[i10] / fA;
                                    if ((f3 < f2 && i10 == i7) || i10 > i7) {
                                        i7 = i10;
                                        f2 = f3;
                                        i5 = i4;
                                        i6 = i9;
                                    }
                                }
                            }
                            i9++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                    i = 1;
                }
                if (i5 != -1) {
                    Cpj cpj3 = this.e[i5];
                    cpj3.a.c = -1;
                    cpj3.f(((kq4[]) j95Var.d)[i6]);
                    kq4 kq4Var2 = cpj3.a;
                    kq4Var2.c = i5;
                    kq4Var2.d(cpj3);
                } else {
                    z2 = true;
                }
                if (i3 > this.h / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        p(je3Var);
        for (int i11 = 0; i11 < this.i; i11++) {
            Cpj cpj4 = this.e[i11];
            cpj4.a.e = cpj4.b;
        }
    }

    public final void p(Cpj cpj) {
        for (int i = 0; i < this.h; i++) {
            this.g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.h * 2) {
                return;
            }
            kq4 kq4Var = cpj.a;
            if (kq4Var != null) {
                this.g[kq4Var.b] = true;
            }
            kq4 kq4VarA = cpj.a(this.g);
            if (kq4VarA != null) {
                boolean[] zArr = this.g;
                int i3 = kq4VarA.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (kq4VarA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.i; i5++) {
                    Cpj cpj2 = this.e[i5];
                    if (cpj2.a.i != 1 && !cpj2.e && cpj2.d.b(kq4VarA)) {
                        float fA = cpj2.d.a(kq4VarA);
                        if (fA < 0.0f) {
                            float f2 = (-cpj2.b) / fA;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    Cpj cpj3 = this.e[i4];
                    cpj3.a.c = -1;
                    cpj3.f(kq4VarA);
                    kq4 kq4Var2 = cpj3.a;
                    kq4Var2.c = i4;
                    kq4Var2.d(cpj3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void q() {
        boolean z = p;
        j95 j95Var = this.k;
        int i = 0;
        if (z) {
            while (true) {
                Cpj[] cpjArr = this.e;
                if (i >= cpjArr.length) {
                    return;
                }
                Cpj cpj = cpjArr[i];
                if (cpj != null) {
                    ((x93) j95Var.a).b(cpj);
                }
                this.e[i] = null;
                i++;
            }
        } else {
            while (true) {
                Cpj[] cpjArr2 = this.e;
                if (i >= cpjArr2.length) {
                    return;
                }
                Cpj cpj2 = cpjArr2[i];
                if (cpj2 != null) {
                    ((x93) j95Var.b).b(cpj2);
                }
                this.e[i] = null;
                i++;
            }
        }
    }

    public final void r() {
        j95 j95Var;
        int i = 0;
        while (true) {
            j95Var = this.k;
            kq4[] kq4VarArr = (kq4[]) j95Var.d;
            if (i >= kq4VarArr.length) {
                break;
            }
            kq4 kq4Var = kq4VarArr[i];
            if (kq4Var != null) {
                kq4Var.c();
            }
            i++;
        }
        x93 x93Var = (x93) j95Var.c;
        kq4[] kq4VarArr2 = this.l;
        int length = this.m;
        x93Var.getClass();
        if (length > kq4VarArr2.length) {
            length = kq4VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            kq4 kq4Var2 = kq4VarArr2[i2];
            int i3 = x93Var.b;
            Object[] objArr = x93Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = kq4Var2;
                x93Var.b = i3 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((kq4[]) j95Var.d, (Object) null);
        this.a = 0;
        je3 je3Var = this.b;
        je3Var.h = 0;
        je3Var.b = 0.0f;
        this.h = 1;
        for (int i4 = 0; i4 < this.i; i4++) {
            this.e[i4].getClass();
        }
        q();
        this.i = 0;
        if (p) {
            this.n = new CQf(j95Var);
        } else {
            this.n = new Cpj(j95Var);
        }
    }
}
