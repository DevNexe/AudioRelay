package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f70 extends bm5 {
    public int k0;
    public int l0;
    public final f9 f0 = new f9(this);
    public final oj0 g0 = new oj0(this);
    public f9.CQf h0 = null;
    public boolean i0 = false;
    public final o32 j0 = new o32();
    public int m0 = 0;
    public int n0 = 0;
    public yn[] o0 = new yn[4];
    public yn[] p0 = new yn[4];
    public int q0 = 263;
    public boolean r0 = false;
    public boolean s0 = false;

    public final void A(o32 o32Var) {
        a(o32Var);
        int size = this.e0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e70 e70Var = this.e0.get(i);
            boolean[] zArr = e70Var.I;
            zArr[0] = false;
            zArr[1] = false;
            if (e70Var instanceof k8) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e70 e70Var2 = this.e0.get(i2);
                if (e70Var2 instanceof k8) {
                    k8 k8Var = (k8) e70Var2;
                    for (int i3 = 0; i3 < k8Var.f0; i3++) {
                        e70 e70Var3 = k8Var.e0[i3];
                        int i4 = k8Var.g0;
                        if (i4 == 0 || i4 == 1) {
                            e70Var3.I[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            e70Var3.I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            e70 e70Var4 = this.e0.get(i5);
            e70Var4.getClass();
            if ((e70Var4 instanceof gk5) || (e70Var4 instanceof bb1)) {
                e70Var4.a(o32Var);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            e70 e70Var5 = this.e0.get(i6);
            if (e70Var5 instanceof f70) {
                int[] iArr = e70Var5.J;
                int i7 = iArr[0];
                int i8 = iArr[1];
                if (i7 == 2) {
                    e70Var5.t(1);
                }
                if (i8 == 2) {
                    e70Var5.u(1);
                }
                e70Var5.a(o32Var);
                if (i7 == 2) {
                    e70Var5.t(i7);
                }
                if (i8 == 2) {
                    e70Var5.u(i8);
                }
            } else {
                e70Var5.h = -1;
                e70Var5.i = -1;
                int[] iArr2 = this.J;
                int i9 = iArr2[0];
                int[] iArr3 = e70Var5.J;
                if (i9 != 2 && iArr3[0] == 4) {
                    w60 w60Var = e70Var5.y;
                    int i10 = w60Var.e;
                    int iJ = j();
                    w60 w60Var2 = e70Var5.A;
                    int i11 = iJ - w60Var2.e;
                    w60Var.g = o32Var.j(w60Var);
                    w60Var2.g = o32Var.j(w60Var2);
                    o32Var.d(w60Var.g, i10);
                    o32Var.d(w60Var2.g, i11);
                    e70Var5.h = 2;
                    e70Var5.P = i10;
                    int i12 = i11 - i10;
                    e70Var5.L = i12;
                    int i13 = e70Var5.S;
                    if (i12 < i13) {
                        e70Var5.L = i13;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    w60 w60Var3 = e70Var5.z;
                    int i14 = w60Var3.e;
                    int iG = g();
                    w60 w60Var4 = e70Var5.B;
                    int i15 = iG - w60Var4.e;
                    w60Var3.g = o32Var.j(w60Var3);
                    w60Var4.g = o32Var.j(w60Var4);
                    o32Var.d(w60Var3.g, i14);
                    o32Var.d(w60Var4.g, i15);
                    if (e70Var5.R > 0 || e70Var5.X == 8) {
                        w60 w60Var5 = e70Var5.C;
                        kq4 kq4VarJ = o32Var.j(w60Var5);
                        w60Var5.g = kq4VarJ;
                        o32Var.d(kq4VarJ, e70Var5.R + i14);
                    }
                    e70Var5.i = 2;
                    e70Var5.Q = i14;
                    int i16 = i15 - i14;
                    e70Var5.M = i16;
                    int i17 = e70Var5.T;
                    if (i16 < i17) {
                        e70Var5.M = i17;
                    }
                }
                if (!((e70Var5 instanceof gk5) || (e70Var5 instanceof bb1))) {
                    e70Var5.a(o32Var);
                }
            }
        }
        if (this.m0 > 0) {
            CXJ.a(this, o32Var, 0);
        }
        if (this.n0 > 0) {
            CXJ.a(this, o32Var, 1);
        }
    }

    public final boolean B(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = z & true;
        oj0 oj0Var = this.g0;
        f70 f70Var = oj0Var.a;
        int iF = f70Var.f(0);
        int iF2 = f70Var.f(1);
        int iK = f70Var.k();
        int iL = f70Var.l();
        ArrayList<cm5> arrayList = oj0Var.e;
        gd1 gd1Var = f70Var.d;
        wh5 wh5Var = f70Var.e;
        if (z4 && (iF == 2 || iF2 == 2)) {
            for (cm5 cm5Var : arrayList) {
                if (cm5Var.f == i && !cm5Var.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iF == 2) {
                    f70Var.t(1);
                    f70Var.v(oj0Var.d(f70Var, 0));
                    gd1Var.e.d(f70Var.j());
                }
            } else if (z4 && iF2 == 2) {
                f70Var.u(1);
                f70Var.s(oj0Var.d(f70Var, 1));
                wh5Var.e.d(f70Var.g());
            }
        }
        int[] iArr = f70Var.J;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iJ = f70Var.j() + iK;
                gd1Var.i.d(iJ);
                gd1Var.e.d(iJ - iK);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iG = f70Var.g() + iL;
                wh5Var.i.d(iG);
                wh5Var.e.d(iG - iL);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        oj0Var.g();
        for (cm5 cm5Var2 : arrayList) {
            if (cm5Var2.f == i && (cm5Var2.b != f70Var || cm5Var2.g)) {
                cm5Var2.e();
            }
        }
        for (cm5 cm5Var3 : arrayList) {
            if (cm5Var3.f == i && (z2 || cm5Var3.b != f70Var)) {
                if (!cm5Var3.h.j || !cm5Var3.i.j || (!(cm5Var3 instanceof zn) && !cm5Var3.e.j)) {
                    z3 = false;
                    f70Var.t(iF);
                    f70Var.u(iF2);
                    return z3;
                }
            }
        }
        z3 = true;
        f70Var.t(iF);
        f70Var.u(iF2);
        return z3;
    }

    @Override // defpackage.bm5, defpackage.e70
    public final void q() {
        this.j0.r();
        this.k0 = 0;
        this.l0 = 0;
        super.q();
    }

    @Override // defpackage.e70
    public final void w(boolean z, boolean z2) {
        super.w(z, z2);
        int size = this.e0.size();
        for (int i = 0; i < size; i++) {
            this.e0.get(i).w(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // defpackage.bm5
    public final void y() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        ?? r2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2 = 0;
        this.P = 0;
        this.Q = 0;
        int iMax = Math.max(0, j());
        int iMax2 = Math.max(0, g());
        this.r0 = false;
        this.s0 = false;
        int i3 = this.q0;
        if ((i3 & 64) == 64) {
            z = true;
        } else if ((i3 & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        o32 o32Var = this.j0;
        o32Var.getClass();
        o32Var.f = false;
        if (this.q0 != 0 && z) {
            o32Var.f = true;
        }
        int[] iArr = this.J;
        byte b = iArr[1];
        byte b2 = iArr[0];
        ArrayList<e70> arrayList = this.e0;
        boolean z8 = b2 == 2 || b == 2;
        this.m0 = 0;
        this.n0 = 0;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            e70 e70Var = this.e0.get(i4);
            if (e70Var instanceof bm5) {
                ((bm5) e70Var).y();
            }
        }
        int i5 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (z9) {
            int i6 = i5 + 1;
            try {
                o32Var.r();
                this.m0 = i2;
                this.n0 = i2;
                d(o32Var);
                for (int i7 = 0; i7 < size; i7++) {
                    this.e0.get(i7).d(o32Var);
                }
                A(o32Var);
                try {
                    je3 je3Var = o32Var.b;
                    if (o32Var.f) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= o32Var.i) {
                                z7 = true;
                                break;
                            } else {
                                if (!o32Var.e[i8].e) {
                                    z7 = false;
                                    break;
                                }
                                i8++;
                            }
                        }
                        if (z7) {
                            for (int i9 = 0; i9 < o32Var.i; i9++) {
                                Cpj cpj = o32Var.e[i9];
                                cpj.a.e = cpj.b;
                            }
                        } else {
                            o32Var.o(je3Var);
                        }
                    } else {
                        o32Var.o(je3Var);
                    }
                    z2 = true;
                } catch (Exception e) {
                    e = e;
                    z9 = true;
                    e.printStackTrace();
                    z2 = z9;
                    System.out.println("EXCEPTION : " + e);
                }
            } catch (Exception e2) {
                e = e2;
            }
            boolean[] zArr = JUCk.b;
            if (z2) {
                zArr[2] = false;
                x(o32Var);
                int size2 = this.e0.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    this.e0.get(i10).x(o32Var);
                }
            } else {
                x(o32Var);
                for (int i11 = 0; i11 < size; i11++) {
                    this.e0.get(i11).x(o32Var);
                }
            }
            if (z8 && i6 < 8 && zArr[2]) {
                int i12 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i12 < size) {
                    e70 e70Var2 = this.e0.get(i12);
                    iMax3 = Math.max(iMax3, e70Var2.j() + e70Var2.P);
                    iMax4 = Math.max(iMax4, e70Var2.g() + e70Var2.Q);
                    i12++;
                    i6 = i6;
                }
                i = i6;
                int iMax5 = Math.max(this.S, iMax3);
                int iMax6 = Math.max(this.T, iMax4);
                if (b2 != 2 || j() >= iMax5) {
                    z3 = false;
                } else {
                    v(iMax5);
                    iArr[0] = 2;
                    z3 = true;
                    z10 = true;
                }
                if (b == 2 && g() < iMax6) {
                    s(iMax6);
                    iArr[1] = 2;
                    z3 = true;
                    z10 = true;
                }
            } else {
                i = i6;
                z3 = false;
            }
            int iMax7 = Math.max(this.S, j());
            if (iMax7 > j()) {
                v(iMax7);
                r2 = 1;
                iArr[0] = 1;
                z3 = true;
                z4 = true;
            } else {
                r2 = 1;
                z4 = z10;
            }
            int iMax8 = Math.max(this.T, g());
            if (iMax8 > g()) {
                s(iMax8);
                iArr[r2] = r2;
                z6 = true;
                z5 = true;
            } else {
                z5 = z3;
                z6 = z4;
            }
            if (!z6) {
                if (iArr[0] == 2 && iMax > 0 && j() > iMax) {
                    this.r0 = r2;
                    iArr[0] = r2;
                    v(iMax);
                    z6 = true;
                    z5 = true;
                }
                if (iArr[r2] == 2 && iMax2 > 0 && g() > iMax2) {
                    this.s0 = r2;
                    iArr[r2] = r2;
                    s(iMax2);
                    z5 = true;
                    z10 = true;
                }
                z9 = z5;
                i5 = i;
                i2 = 0;
            }
            z10 = z6;
            z9 = z5;
            i5 = i;
            i2 = 0;
        }
        this.e0 = arrayList;
        if (z10) {
            iArr[0] = b2;
            iArr[1] = b;
        }
        r(o32Var.k);
    }

    public final void z(e70 e70Var, int i) {
        if (i == 0) {
            int i2 = this.m0 + 1;
            yn[] ynVarArr = this.p0;
            if (i2 >= ynVarArr.length) {
                this.p0 = (yn[]) Arrays.copyOf(ynVarArr, ynVarArr.length * 2);
            }
            yn[] ynVarArr2 = this.p0;
            int i3 = this.m0;
            ynVarArr2[i3] = new yn(e70Var, 0, this.i0);
            this.m0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.n0 + 1;
            yn[] ynVarArr3 = this.o0;
            if (i4 >= ynVarArr3.length) {
                this.o0 = (yn[]) Arrays.copyOf(ynVarArr3, ynVarArr3.length * 2);
            }
            yn[] ynVarArr4 = this.o0;
            int i5 = this.n0;
            ynVarArr4[i5] = new yn(e70Var, 1, this.i0);
            this.n0 = i5 + 1;
        }
    }
}
