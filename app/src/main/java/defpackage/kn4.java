package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kn4 {
    public final ln4 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public kn4(ln4 ln4Var) {
        this.a = ln4Var;
        this.b = ln4Var.w;
        int i = ln4Var.x;
        this.c = i;
        this.d = ln4Var.y;
        this.e = ln4Var.z;
        this.g = i;
        this.h = -1;
    }

    public final Z1 a(int i) {
        ArrayList<Z1> arrayList = this.a.D;
        int iT0 = fp1.t0(arrayList, i, this.c);
        if (iT0 >= 0) {
            return arrayList.get(iT0);
        }
        Z1 z1 = new Z1(i);
        arrayList.add(-(iT0 + 1), z1);
        return z1;
    }

    public final Object b(int[] iArr, int i) {
        int iS;
        if (!fp1.t(iArr, i)) {
            return g30.QnHx.a;
        }
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            iS = iArr.length;
        } else {
            iS = fp1.S(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
        }
        return this.d[iS];
    }

    public final void c() {
        ln4 ln4Var = this.a;
        ln4Var.getClass();
        if (!(ln4Var.A > 0)) {
            throw new IllegalArgumentException("Unexpected reader close()".toString());
        }
        ln4Var.A--;
    }

    public final void d() {
        if (this.i == 0) {
            if (!(this.f == this.g)) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            int i = (this.h * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.h = i2;
            this.g = i2 < 0 ? this.c : i2 + iArr[(i2 * 5) + 3];
        }
    }

    public final Object e() {
        int i = this.f;
        if (i < this.g) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int f() {
        int i = this.f;
        if (i >= this.g) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object g(int i, int i2) {
        int[] iArr = this.b;
        int iY = fp1.y(iArr, i);
        int i3 = i + 1;
        int i4 = iY + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : g30.QnHx.a;
    }

    public final int h(int i) {
        return fp1.s(this.b, i);
    }

    public final boolean i(int i) {
        return fp1.u(this.b, i);
    }

    public final Object j(int i) {
        int[] iArr = this.b;
        if (!fp1.u(iArr, i)) {
            return null;
        }
        if (!fp1.u(iArr, i)) {
            return g30.QnHx.a;
        }
        return this.d[iArr[(i * 5) + 4]];
    }

    public final Object k(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.d[fp1.S(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final int l(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void m(int i) {
        if (!(this.i == 0)) {
            throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
        }
        this.f = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        this.h = i3;
        if (i3 < 0) {
            this.g = i2;
        } else {
            this.g = fp1.s(iArr, i3) + i3;
        }
        this.j = 0;
        this.k = 0;
    }

    public final int n() {
        if (!(this.i == 0)) {
            throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
        }
        int i = this.f;
        int[] iArr = this.b;
        int iX = fp1.u(iArr, i) ? 1 : fp1.x(iArr, this.f);
        int i2 = this.f;
        this.f = fp1.s(iArr, i2) + i2;
        return iX;
    }

    public final void o() {
        if (!(this.i == 0)) {
            throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
        }
        this.f = this.g;
    }

    public final void p() {
        if (this.i <= 0) {
            int i = this.f;
            int[] iArr = this.b;
            if (!(iArr[(i * 5) + 2] == this.h)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.h = i;
            this.g = iArr[(i * 5) + 3] + i;
            int i2 = i + 1;
            this.f = i2;
            this.j = fp1.y(iArr, i);
            this.k = i >= this.c - 1 ? this.e : iArr[(i2 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.h);
        sb.append(", end=");
        return qc0.a(sb, this.g, ')');
    }
}
