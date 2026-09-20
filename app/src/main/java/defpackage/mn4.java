package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mn4 {
    public final ln4 a;
    public int[] b;
    public Object[] c;
    public ArrayList<Z1> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final tp1 o;
    public final tp1 p;
    public final tp1 q;
    public int r;
    public int s;
    public boolean t;
    public le3 u;

    public static final class QnHx {
        /* JADX WARN: Code duplicated, block: B:10:0x003c  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public static final List a(mn4 mn4Var, int i, mn4 mn4Var2, boolean z, boolean z2) {
            boolean z3;
            List list;
            boolean zB;
            int iO = mn4Var.o(i);
            int i2 = i + iO;
            int iG = mn4Var.g(mn4Var.b, mn4Var.n(i));
            int iG2 = mn4Var.g(mn4Var.b, mn4Var.n(i2));
            int i3 = iG2 - iG;
            if (i < 0) {
                z3 = false;
            } else if ((mn4Var.b[(mn4Var.n(i) * 5) + 1] & 201326592) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            mn4Var2.q(iO);
            mn4Var2.r(i3, mn4Var2.r);
            if (mn4Var.e < i2) {
                mn4Var.u(i2);
            }
            if (mn4Var.j < iG2) {
                mn4Var.v(iG2, i2);
            }
            int[] iArr = mn4Var2.b;
            int i4 = mn4Var2.r;
            int i5 = i4 * 5;
            int i6 = i * 5;
            System.arraycopy(mn4Var.b, i6, iArr, i5, (i2 * 5) - i6);
            Object[] objArr = mn4Var2.c;
            int i7 = mn4Var2.h;
            System.arraycopy(mn4Var.c, iG, objArr, i7, i3);
            int i8 = mn4Var2.s;
            iArr[i5 + 2] = i8;
            int i9 = i4 - i;
            int i10 = i4 + iO;
            int iG3 = i7 - mn4Var2.g(iArr, i4);
            int i11 = mn4Var2.l;
            int i12 = mn4Var2.k;
            int length = objArr.length;
            int i13 = i11;
            boolean z4 = z3;
            int i14 = i4;
            while (i14 < i10) {
                if (i14 != i4) {
                    int i15 = (i14 * 5) + 2;
                    iArr[i15] = iArr[i15] + i9;
                }
                int i16 = i7;
                int iG4 = mn4Var2.g(iArr, i14) + iG3;
                if (iG4 > (i13 < i14 ? 0 : mn4Var2.j)) {
                    iG4 = -(((length - i12) - iG4) + 1);
                }
                iArr[(i14 * 5) + 4] = iG4;
                if (i14 == i13) {
                    i13++;
                }
                i14++;
                i10 = i10;
                i7 = i16;
            }
            int i17 = i10;
            int i18 = i7;
            mn4Var2.l = i13;
            int iV = fp1.v(mn4Var.d, i, mn4Var.m());
            int iV2 = fp1.v(mn4Var.d, i2, mn4Var.m());
            if (iV < iV2) {
                ArrayList<Z1> arrayList = mn4Var.d;
                ArrayList arrayList2 = new ArrayList(iV2 - iV);
                for (int i19 = iV; i19 < iV2; i19++) {
                    Z1 z1 = arrayList.get(i19);
                    z1.a += i9;
                    arrayList2.add(z1);
                }
                mn4Var2.d.addAll(fp1.v(mn4Var2.d, mn4Var2.r, mn4Var2.m()), arrayList2);
                arrayList.subList(iV, iV2).clear();
                list = arrayList2;
            } else {
                list = cs0.w;
            }
            int iY = mn4Var.y(i);
            if (z) {
                boolean z5 = iY >= 0;
                if (z5) {
                    mn4Var.J();
                    mn4Var.a(iY - mn4Var.r);
                    mn4Var.J();
                }
                mn4Var.a(i - mn4Var.r);
                zB = mn4Var.B();
                if (z5) {
                    mn4Var.G();
                    mn4Var.i();
                    mn4Var.G();
                    mn4Var.i();
                }
            } else {
                boolean zC = mn4Var.C(i, iO);
                mn4Var.D(iG, i3, i - 1);
                zB = zC;
            }
            if (!(!zB)) {
                e40.c("Unexpectedly removed anchors".toString());
                throw null;
            }
            mn4Var2.n += fp1.u(iArr, i4) ? 1 : fp1.x(iArr, i4);
            if (z2) {
                mn4Var2.r = i17;
                mn4Var2.h = i18 + i3;
            }
            if (z4) {
                mn4Var2.M(i8);
            }
            return list;
        }
    }

    static {
        new QnHx();
    }

    public mn4(ln4 ln4Var) {
        this.a = ln4Var;
        int[] iArr = ln4Var.w;
        this.b = iArr;
        Object[] objArr = ln4Var.y;
        this.c = objArr;
        this.d = ln4Var.D;
        int i = ln4Var.x;
        this.e = i;
        this.f = (iArr.length / 5) - i;
        this.g = i;
        int i2 = ln4Var.z;
        this.j = i2;
        this.k = objArr.length - i2;
        this.l = i;
        this.o = new tp1(0);
        this.p = new tp1(0);
        this.q = new tp1(0);
        this.s = -1;
    }

    public final void A() {
        boolean z;
        le3 le3Var = this.u;
        if (le3Var != null) {
            while (!le3Var.a.isEmpty()) {
                int iL = le3Var.l();
                int iN = n(iL);
                int iO = iL + 1;
                int iO2 = o(iL) + iL;
                while (true) {
                    if (iO >= iO2) {
                        z = false;
                        break;
                    }
                    if ((this.b[(n(iO) * 5) + 1] & 201326592) != 0) {
                        z = true;
                        break;
                    }
                    iO += o(iO);
                }
                if (fp1.q(this.b, iN) != z) {
                    int[] iArr = this.b;
                    int i = (iN * 5) + 1;
                    if (z) {
                        iArr[i] = iArr[i] | 67108864;
                    } else {
                        iArr[i] = iArr[i] & (-67108865);
                    }
                    int iY = y(iL);
                    if (iY >= 0) {
                        le3Var.a(iY);
                    }
                }
            }
        }
    }

    public final boolean B() {
        if (!(this.m == 0)) {
            throw new IllegalArgumentException("Cannot remove group while inserting".toString());
        }
        int i = this.r;
        int i2 = this.h;
        int iF = F();
        le3 le3Var = this.u;
        if (le3Var != null) {
            while (true) {
                List list = le3Var.a;
                if (!(!list.isEmpty()) || ((Number) wu.H0(list)).intValue() < i) {
                    break;
                }
                le3Var.l();
            }
        }
        boolean zC = C(i, this.r - i);
        D(i2, this.h - i2, i - 1);
        this.r = i;
        this.h = i2;
        this.n -= iF;
        return zC;
    }

    public final boolean C(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i2 <= 0) {
            return false;
        }
        ArrayList<Z1> arrayList = this.d;
        u(i);
        if (!arrayList.isEmpty()) {
            int i3 = i2 + i;
            int iV = fp1.v(this.d, i3, (this.b.length / 5) - this.f);
            if (iV >= this.d.size()) {
                iV--;
            }
            int i4 = iV + 1;
            int i5 = 0;
            while (iV >= 0) {
                Z1 z1 = this.d.get(iV);
                int iC = c(z1);
                if (iC < i) {
                    break;
                }
                if (iC < i3) {
                    z1.a = Integer.MIN_VALUE;
                    if (i5 == 0) {
                        i5 = iV + 1;
                    }
                    i4 = iV;
                }
                iV--;
            }
            z = i4 < i5;
            if (z) {
                this.d.subList(i4, i5).clear();
            }
        } else {
            z = false;
        }
        this.e = i;
        this.f += i2;
        int i6 = this.l;
        if (i6 > i) {
            this.l = Math.max(i, i6 - i2);
        }
        int i7 = this.g;
        if (i7 >= this.e) {
            this.g = i7 - i2;
        }
        int i8 = this.s;
        if (i8 >= 0 && fp1.q(this.b, n(i8))) {
            z2 = true;
        }
        if (z2) {
            M(this.s);
        }
        return z;
    }

    public final void D(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            v(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final Object E(int i, Object obj) {
        int I = I(this.b, n(this.r));
        int i2 = I + i;
        if (!(i2 >= I && i2 < g(this.b, n(this.r + 1)))) {
            StringBuilder sbC = iZUl.c("Write to an invalid slot index ", i, " for group ");
            sbC.append(this.r);
            e40.c(sbC.toString().toString());
            throw null;
        }
        int iH = h(i2);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int F() {
        int iN = n(this.r);
        int iS = fp1.s(this.b, iN) + this.r;
        this.r = iS;
        this.h = g(this.b, n(iS));
        if (fp1.u(this.b, iN)) {
            return 1;
        }
        return fp1.x(this.b, iN);
    }

    public final void G() {
        int i = this.g;
        this.r = i;
        this.h = g(this.b, n(i));
    }

    public final Object H(int i, int i2) {
        int I = I(this.b, n(i));
        int i3 = i2 + I;
        if (I <= i3 && i3 < g(this.b, n(i + 1))) {
            return this.c[h(i3)];
        }
        return g30.QnHx.a;
    }

    public final int I(int[] iArr, int i) {
        if (i >= this.b.length / 5) {
            return this.c.length - this.k;
        }
        int iY = fp1.y(iArr, i);
        return iY < 0 ? (this.c.length - this.k) + iY + 1 : iY;
    }

    public final void J() {
        if (!(this.m == 0)) {
            throw new IllegalArgumentException("Key must be supplied when inserting".toString());
        }
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        K(0, c0132QnHx, false, c0132QnHx);
    }

    public final void K(int i, Object obj, boolean z, Object obj2) {
        int iS;
        boolean z2 = this.m > 0;
        this.q.e(this.n);
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (z2) {
            q(1);
            int i2 = this.r;
            int iN = n(i2);
            int i3 = obj != c0132QnHx ? 1 : 0;
            int i4 = (z || obj2 == c0132QnHx) ? 0 : 1;
            int[] iArr = this.b;
            int i5 = this.s;
            int i6 = this.h;
            int i7 = z ? 1073741824 : 0;
            int i8 = i3 != 0 ? 536870912 : 0;
            int i9 = i4 != 0 ? 268435456 : 0;
            int i10 = iN * 5;
            iArr[i10 + 0] = i;
            iArr[i10 + 1] = i7 | i8 | i9;
            iArr[i10 + 2] = i5;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = i6;
            this.i = i6;
            int i11 = (z ? 1 : 0) + i3 + i4;
            if (i11 > 0) {
                r(i11, i2);
                Object[] objArr = this.c;
                int i12 = this.h;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i3 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i4 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.h = i12;
            }
            this.n = 0;
            iS = i2 + 1;
            this.s = i2;
            this.r = iS;
        } else {
            this.o.e(this.s);
            this.p.e(((this.b.length / 5) - this.f) - this.g);
            int i13 = this.r;
            int iN2 = n(i13);
            if (!ur1.a(obj2, c0132QnHx)) {
                if (z) {
                    N(this.r, obj2);
                } else {
                    L(obj2);
                }
            }
            this.h = I(this.b, iN2);
            this.i = g(this.b, n(this.r + 1));
            this.n = fp1.x(this.b, iN2);
            this.s = i13;
            this.r = i13 + 1;
            iS = i13 + fp1.s(this.b, iN2);
        }
        this.g = iS;
    }

    public final void L(Object obj) {
        int iN = n(this.r);
        if (fp1.t(this.b, iN)) {
            this.c[h(d(this.b, iN))] = obj;
        } else {
            e40.c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void M(int i) {
        if (i >= 0) {
            le3 le3Var = this.u;
            if (le3Var == null) {
                le3Var = new le3(0);
                this.u = le3Var;
            }
            le3Var.a(i);
        }
    }

    public final void N(int i, Object obj) {
        int iN = n(i);
        int[] iArr = this.b;
        if (iN < iArr.length && fp1.u(iArr, iN)) {
            this.c[h(g(this.b, iN))] = obj;
            return;
        }
        e40.c(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (!(this.m <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i == 0) {
            return;
        }
        int i2 = this.r + i;
        if (i2 >= this.s && i2 <= this.g) {
            z = true;
        }
        if (z) {
            this.r = i2;
            int iG = g(this.b, n(i2));
            this.h = iG;
            this.i = iG;
            return;
        }
        e40.c(("Cannot seek outside the current group (" + this.s + '-' + this.g + ')').toString());
        throw null;
    }

    public final Z1 b(int i) {
        ArrayList<Z1> arrayList = this.d;
        int iT0 = fp1.t0(arrayList, i, m());
        if (iT0 >= 0) {
            return arrayList.get(iT0);
        }
        if (i > this.e) {
            i = -(m() - i);
        }
        Z1 z1 = new Z1(i);
        arrayList.add(-(iT0 + 1), z1);
        return z1;
    }

    public final int c(Z1 z1) {
        int i = z1.a;
        return i < 0 ? i + m() : i;
    }

    public final int d(int[] iArr, int i) {
        return fp1.S(iArr[(i * 5) + 1] >> 29) + g(iArr, i);
    }

    public final void e() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            this.p.e(((this.b.length / 5) - this.f) - this.g);
        }
    }

    public final void f() {
        this.t = true;
        if (this.o.a == 0) {
            u(m());
            v(this.c.length - this.k, this.e);
            A();
        }
        int[] iArr = this.b;
        int i = this.e;
        Object[] objArr = this.c;
        int i2 = this.j;
        ArrayList<Z1> arrayList = this.d;
        ln4 ln4Var = this.a;
        ln4Var.getClass();
        if (!ln4Var.B) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        ln4Var.B = false;
        ln4Var.w = iArr;
        ln4Var.x = i;
        ln4Var.y = objArr;
        ln4Var.z = i2;
        ln4Var.D = arrayList;
    }

    public final int g(int[] iArr, int i) {
        if (i >= this.b.length / 5) {
            return this.c.length - this.k;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.k) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return i < this.j ? i : i + this.k;
    }

    public final void i() {
        boolean z = this.m > 0;
        int i = this.r;
        int i2 = this.g;
        int i3 = this.s;
        int iN = n(i3);
        int i4 = this.n;
        int i5 = i - i3;
        boolean zU = fp1.u(this.b, iN);
        tp1 tp1Var = this.q;
        if (z) {
            fp1.z(iN, i5, this.b);
            fp1.A(iN, i4, this.b);
            this.n = tp1Var.d() + (zU ? 1 : i4);
            this.s = z(this.b, i3);
            return;
        }
        if ((i != i2 ? 0 : 1) == 0) {
            throw new IllegalArgumentException("Expected to be at the end of a group".toString());
        }
        int iS = fp1.s(this.b, iN);
        int iX = fp1.x(this.b, iN);
        fp1.z(iN, i5, this.b);
        fp1.A(iN, i4, this.b);
        int iD = this.o.d();
        this.g = ((this.b.length / 5) - this.f) - this.p.d();
        this.s = iD;
        int iZ = z(this.b, i3);
        int iD2 = tp1Var.d();
        this.n = iD2;
        if (iZ == iD) {
            this.n = iD2 + (zU ? 0 : i4 - iX);
            return;
        }
        int i6 = i5 - iS;
        int i7 = zU ? 0 : i4 - iX;
        if (i6 != 0 || i7 != 0) {
            while (iZ != 0 && iZ != iD && (i7 != 0 || i6 != 0)) {
                int iN2 = n(iZ);
                if (i6 != 0) {
                    fp1.z(iN2, fp1.s(this.b, iN2) + i6, this.b);
                }
                if (i7 != 0) {
                    int[] iArr = this.b;
                    fp1.A(iN2, fp1.x(iArr, iN2) + i7, iArr);
                }
                if (fp1.u(this.b, iN2)) {
                    i7 = 0;
                }
                iZ = z(this.b, iZ);
            }
        }
        this.n += i7;
    }

    public final void j() {
        int i = this.m;
        if (!(i > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.m = i2;
        if (i2 == 0) {
            if (this.q.a == this.o.a) {
                this.g = ((this.b.length / 5) - this.f) - this.p.d();
            } else {
                e40.c("startGroup/endGroup mismatch while inserting".toString());
                throw null;
            }
        }
    }

    public final void k(int i) {
        if (!(this.m <= 0)) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
        }
        int i2 = this.s;
        if (i2 != i) {
            if (!(i >= i2 && i < this.g)) {
                throw new IllegalArgumentException(Md5A.e("Started group at ", i, " must be a subgroup of the group at ", i2).toString());
            }
            int i3 = this.r;
            int i4 = this.h;
            int i5 = this.i;
            this.r = i;
            J();
            this.r = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.e) {
            i = -((m() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(n(i3) * 5) + 2] = i;
            int iS = fp1.s(this.b, n(i3)) + i3;
            l(i3, iS, i3 + 1);
            i3 = iS;
        }
    }

    public final int m() {
        return (this.b.length / 5) - this.f;
    }

    public final int n(int i) {
        return i < this.e ? i : i + this.f;
    }

    public final int o(int i) {
        return fp1.s(this.b, n(i));
    }

    public final boolean p(int i, int i2) {
        int length;
        int iO;
        if (i2 == this.s) {
            length = this.g;
        } else {
            tp1 tp1Var = this.o;
            int i3 = tp1Var.a;
            if (i2 > (i3 > 0 ? ((int[]) tp1Var.b)[i3 - 1] : 0)) {
                iO = o(i2);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        i4 = -1;
                        break;
                    }
                    if (((int[]) tp1Var.b)[i4] == i2) {
                        break;
                    }
                    i4++;
                }
                if (i4 < 0) {
                    iO = o(i2);
                } else {
                    length = ((this.b.length / 5) - this.f) - ((int[]) this.p.b)[i4];
                }
            }
            length = iO + i2;
        }
        return i > i2 && i < length;
    }

    public final void q(int i) {
        if (i > 0) {
            int i2 = this.r;
            u(i2);
            int i3 = this.e;
            int i4 = this.f;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                System.arraycopy(iArr, 0, iArr2, 0, (i3 * 5) - 0);
                int i7 = (i4 + i3) * 5;
                System.arraycopy(iArr, i7, iArr2, (i3 + i6) * 5, (length * 5) - i7);
                this.b = iArr2;
                i4 = i6;
            }
            int i8 = this.g;
            if (i8 >= i3) {
                this.g = i8 + i;
            }
            int i9 = i3 + i;
            this.e = i9;
            this.f = i4 - i;
            int iG = i5 > 0 ? g(this.b, n(i2 + i)) : 0;
            int i10 = this.l >= i3 ? this.j : 0;
            int i11 = this.k;
            int length2 = this.c.length;
            if (iG > i10) {
                iG = -(((length2 - i11) - iG) + 1);
            }
            for (int i12 = i3; i12 < i9; i12++) {
                this.b[(i12 * 5) + 4] = iG;
            }
            int i13 = this.l;
            if (i13 >= i3) {
                this.l = i13 + i;
            }
        }
    }

    public final void r(int i, int i2) {
        if (i > 0) {
            v(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3 + 0);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.i;
            if (i9 >= i3) {
                this.i = i9 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final boolean s(int i) {
        return fp1.u(this.b, n(i));
    }

    public final void t(ln4 ln4Var, int i) {
        if (!(this.m > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i != 0 || this.r != 0 || this.a.x != 0) {
            mn4 mn4VarC = ln4Var.c();
            try {
                QnHx.a(mn4VarC, i, this, true, true);
                return;
            } finally {
                mn4VarC.f();
            }
        }
        int[] iArr = this.b;
        Object[] objArr = this.c;
        ArrayList<Z1> arrayList = this.d;
        int[] iArr2 = ln4Var.w;
        int i2 = ln4Var.x;
        Object[] objArr2 = ln4Var.y;
        int i3 = ln4Var.z;
        this.b = iArr2;
        this.c = objArr2;
        this.d = ln4Var.D;
        this.e = i2;
        this.f = (iArr2.length / 5) - i2;
        this.j = i3;
        this.k = objArr2.length - i3;
        this.l = i2;
        ln4Var.w = iArr;
        ln4Var.x = 0;
        ln4Var.y = objArr;
        ln4Var.z = 0;
        ln4Var.D = arrayList;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.g + " size = " + m() + " gap=" + this.e + '-' + (this.e + this.f) + ')';
    }

    public final void u(int i) {
        Z1 z1;
        int i2;
        Z1 z2;
        int i3;
        int i4;
        int i5 = this.f;
        int i6 = this.e;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int length = (this.b.length / 5) - this.f;
                if (i6 < i) {
                    for (int iV = fp1.v(this.d, i6, length); iV < this.d.size() && (i3 = (z2 = this.d.get(iV)).a) < 0 && (i4 = i3 + length) < i; iV++) {
                        z2.a = i4;
                    }
                } else {
                    for (int iV2 = fp1.v(this.d, i, length); iV2 < this.d.size() && (i2 = (z1 = this.d.get(iV2)).a) >= 0; iV2++) {
                        z1.a = -(length - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    System.arraycopy(iArr, i7, iArr, i8 + i7, i9 - i7);
                } else {
                    int i10 = i9 + i8;
                    System.arraycopy(iArr, i10, iArr, i9, (i7 + i8) - i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int length2 = this.b.length / 5;
            e40.f(i6 < length2);
            while (i6 < length2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.b[i11];
                int iM = i12 > -2 ? i12 : m() + i12 + 2;
                if (iM >= i) {
                    iM = -((m() - iM) + 2);
                }
                if (iM != i12) {
                    this.b[i11] = iM;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.e = i;
    }

    public final void v(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
            Arrays.fill(objArr, i, i + i3, (Object) null);
        }
        int iMin = Math.min(i2 + 1, m());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iN = n(iMin);
                int iN2 = n(i5);
                int i7 = this.e;
                while (iN < iN2) {
                    int[] iArr = this.b;
                    int i8 = (iN * 5) + 4;
                    int i9 = iArr[i8];
                    if (!(i9 >= 0)) {
                        e40.c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                    iArr[i8] = -((length - i9) + 1);
                    iN++;
                    if (iN == i7) {
                        iN += this.f;
                    }
                }
            } else {
                int iN3 = n(i5);
                int iN4 = n(iMin);
                while (iN3 < iN4) {
                    int[] iArr2 = this.b;
                    int i10 = (iN3 * 5) + 4;
                    int i11 = iArr2[i10];
                    if (!(i11 < 0)) {
                        e40.c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    iArr2[i10] = i11 + length + 1;
                    iN3++;
                    if (iN3 == this.e) {
                        iN3 += this.f;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final void w(Z1 z1, mn4 mn4Var) {
        if (!(mn4Var.m > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(this.m == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!z1.a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iC = c(z1) + 1;
        int i = this.r;
        if (!(i <= iC && iC < this.g)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iY = y(iC);
        int iO = o(iC);
        int iX = s(iC) ? 1 : fp1.x(this.b, n(iC));
        QnHx.a(this, iC, mn4Var, false, false);
        M(iY);
        boolean z = iX > 0;
        while (iY >= i) {
            int iN = n(iY);
            int[] iArr = this.b;
            fp1.z(iN, fp1.s(iArr, iN) - iO, iArr);
            if (z) {
                if (fp1.u(this.b, iN)) {
                    z = false;
                } else {
                    int[] iArr2 = this.b;
                    fp1.A(iN, fp1.x(iArr2, iN) - iX, iArr2);
                }
            }
            iY = y(iY);
        }
        if (z) {
            e40.f(this.n >= iX);
            this.n -= iX;
        }
    }

    public final Object x(int i) {
        int iN = n(i);
        if (fp1.u(this.b, iN)) {
            return this.c[h(g(this.b, iN))];
        }
        return null;
    }

    public final int y(int i) {
        return z(this.b, i);
    }

    public final int z(int[] iArr, int i) {
        int i2 = iArr[(n(i) * 5) + 2];
        return i2 > -2 ? i2 : m() + i2 + 2;
    }
}
