package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k8 extends yc1 {
    public int g0 = 0;
    public boolean h0 = true;
    public int i0 = 0;

    @Override // defpackage.e70
    public final void a(o32 o32Var) {
        boolean z;
        int i;
        int i2;
        w60[] w60VarArr = this.G;
        w60 w60Var = this.y;
        w60VarArr[0] = w60Var;
        int i3 = 2;
        w60 w60Var2 = this.z;
        w60VarArr[2] = w60Var2;
        w60 w60Var3 = this.A;
        w60VarArr[1] = w60Var3;
        w60 w60Var4 = this.B;
        w60VarArr[3] = w60Var4;
        for (w60 w60Var5 : w60VarArr) {
            w60Var5.g = o32Var.j(w60Var5);
        }
        int i4 = this.g0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        w60 w60Var6 = w60VarArr[i4];
        int i5 = 0;
        while (true) {
            if (i5 >= this.f0) {
                z = false;
                break;
            }
            e70 e70Var = this.e0[i5];
            if ((this.h0 || e70Var.b()) && ((((i2 = this.g0) == 0 || i2 == 1) && e70Var.J[0] == 3 && e70Var.y.d != null && e70Var.A.d != null) || ((i2 == 2 || i2 == 3) && e70Var.J[1] == 3 && e70Var.z.d != null && e70Var.B.d != null))) {
                z = true;
                break;
            }
            i5++;
        }
        boolean z2 = w60Var.c() || w60Var3.c();
        boolean z3 = w60Var2.c() || w60Var4.c();
        int i6 = !(!z && (((i = this.g0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.f0) {
            e70 e70Var2 = this.e0[i7];
            if (this.h0 || e70Var2.b()) {
                kq4 kq4VarJ = o32Var.j(e70Var2.G[this.g0]);
                int i8 = this.g0;
                w60 w60Var7 = e70Var2.G[i8];
                w60Var7.g = kq4VarJ;
                w60 w60Var8 = w60Var7.d;
                int i9 = (w60Var8 == null || w60Var8.b != this) ? 0 : w60Var7.e + 0;
                if (i8 == 0 || i8 == i3) {
                    kq4 kq4Var = w60Var6.g;
                    int i10 = this.i0 - i9;
                    Cpj cpjK = o32Var.k();
                    kq4 kq4VarL = o32Var.l();
                    kq4VarL.d = 0;
                    cpjK.d(kq4Var, kq4VarJ, kq4VarL, i10);
                    o32Var.c(cpjK);
                } else {
                    kq4 kq4Var2 = w60Var6.g;
                    int i11 = this.i0 + i9;
                    Cpj cpjK2 = o32Var.k();
                    kq4 kq4VarL2 = o32Var.l();
                    kq4VarL2.d = 0;
                    cpjK2.c(kq4Var2, kq4VarJ, kq4VarL2, i11);
                    o32Var.c(cpjK2);
                }
                o32Var.e(w60Var6.g, kq4VarJ, this.i0 + i9, i6);
            }
            i7++;
            i3 = 2;
        }
        int i12 = this.g0;
        if (i12 == 0) {
            o32Var.e(w60Var3.g, w60Var.g, 0, 8);
            o32Var.e(w60Var.g, this.K.A.g, 0, 4);
            o32Var.e(w60Var.g, this.K.y.g, 0, 0);
            return;
        }
        if (i12 == 1) {
            o32Var.e(w60Var.g, w60Var3.g, 0, 8);
            o32Var.e(w60Var.g, this.K.y.g, 0, 4);
            o32Var.e(w60Var.g, this.K.A.g, 0, 0);
        } else if (i12 == 2) {
            o32Var.e(w60Var4.g, w60Var2.g, 0, 8);
            o32Var.e(w60Var2.g, this.K.B.g, 0, 4);
            o32Var.e(w60Var2.g, this.K.z.g, 0, 0);
        } else if (i12 == 3) {
            o32Var.e(w60Var2.g, w60Var4.g, 0, 8);
            o32Var.e(w60Var2.g, this.K.z.g, 0, 4);
            o32Var.e(w60Var2.g, this.K.B.g, 0, 0);
        }
    }

    @Override // defpackage.e70
    public final boolean b() {
        return true;
    }

    @Override // defpackage.e70
    public final String toString() {
        String strB = i5.b(new StringBuilder("[Barrier] "), this.Y, " {");
        for (int i = 0; i < this.f0; i++) {
            e70 e70Var = this.e0[i];
            if (i > 0) {
                strB = rz.a(strB, ", ");
            }
            StringBuilder sbG = Md5A.g(strB);
            sbG.append(e70Var.Y);
            strB = sbG.toString();
        }
        return rz.a(strB, "}");
    }
}
