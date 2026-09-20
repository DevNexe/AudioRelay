package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class lu4 extends B8C implements tt1 {
    public int A = -1;
    public QnHx B;
    public final mt1 C;
    public final wt1 D;
    public final ws1 w;
    public final int x;
    public final LPt9Fixed y;
    public final lb4 z;

    public static final class QnHx {
        public String a;

        public QnHx(String str) {
            this.a = str;
        }
    }

    public lu4(ws1 ws1Var, int i, LPt9Fixed lPt9, pa4 pa4Var, QnHx qnHx) {
        this.w = ws1Var;
        this.x = i;
        this.y = lPt9;
        this.z = ws1Var.b;
        this.B = qnHx;
        mt1 mt1Var = ws1Var.a;
        this.C = mt1Var;
        this.D = mt1Var.f ? null : new wt1(pa4Var);
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final int C() {
        LPt9Fixed lPt9 = this.y;
        long j = lPt9.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        LPt9Fixed.o(lPt9, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.B8C, defpackage.g40
    public final void G(pa4 pa4Var) {
        if (this.w.a.b && pa4Var.f() == 0) {
            while (p(pa4Var) != -1) {
            }
        }
        char c = o5.c(this.x);
        LPt9Fixed lPt9 = this.y;
        lPt9.i(c);
        ru1 ru1Var = lPt9.b;
        int i = ru1Var.c;
        int[] iArr = ru1Var.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            ru1Var.c = i - 1;
        }
        int i2 = ru1Var.c;
        if (i2 != -1) {
            ru1Var.c = i2 - 1;
        }
    }

    @Override // defpackage.B8C, defpackage.g40
    public final <T> T J(pa4 pa4Var, int i, zj0<T> zj0Var, T t) {
        boolean z = this.x == 3 && (i & 1) == 0;
        LPt9Fixed lPt9 = this.y;
        if (z) {
            ru1 ru1Var = lPt9.b;
            int[] iArr = ru1Var.b;
            int i2 = ru1Var.c;
            if (iArr[i2] == -2) {
                ru1Var.a[i2] = ru1.QnHx.a;
            }
        }
        T t2 = (T) O(zj0Var);
        if (z) {
            ru1 ru1Var2 = lPt9.b;
            int[] iArr2 = ru1Var2.b;
            int i3 = ru1Var2.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                ru1Var2.c = i4;
                Object[] objArr = ru1Var2.a;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    ru1Var2.a = Arrays.copyOf(objArr, i5);
                    ru1Var2.b = Arrays.copyOf(ru1Var2.b, i5);
                }
            }
            Object[] objArr2 = ru1Var2.a;
            int i6 = ru1Var2.c;
            objArr2[i6] = t2;
            ru1Var2.b[i6] = -2;
        }
        return t2;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final void L() {
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final <T> T O(zj0<T> zj0Var) {
        ws1 ws1Var = this.w;
        LPt9Fixed lPt9 = this.y;
        try {
            if ((zj0Var instanceof QX) && !ws1Var.a.i) {
                String strD = kd.d(zj0Var.a(), ws1Var);
                String strF = lPt9.f(strD, this.C.c);
                zj0<? extends T> zj0VarF = strF != null ? ((QX) zj0Var).f(this, strF) : null;
                if (zj0VarF == null) {
                    return (T) kd.h(this, zj0Var);
                }
                this.B = new QnHx(strD);
                return zj0VarF.c(this);
            }
            return zj0Var.c(this);
        } catch (MissingFieldException e) {
            throw new MissingFieldException(e.w, e.getMessage() + " at path: " + lPt9.b.a(), e);
        }
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final String Q() {
        boolean z = this.C.c;
        LPt9Fixed lPt9 = this.y;
        return z ? lPt9.m() : lPt9.k();
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final int S(pa4 pa4Var) {
        return S12N.i(pa4Var, this.w, Q(), " at path ".concat(this.y.b.a()));
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final long V() {
        return this.y.j();
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final boolean X() {
        wt1 wt1Var = this.D;
        return !(wt1Var != null ? wt1Var.b : false) && this.y.w();
    }

    @Override // defpackage.g40
    public final lb4 a() {
        return this.z;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final g40 b(pa4 pa4Var) {
        ws1 ws1Var = this.w;
        int iN = AY.N(pa4Var, ws1Var);
        LPt9Fixed lPt9 = this.y;
        ru1 ru1Var = lPt9.b;
        int i = ru1Var.c + 1;
        ru1Var.c = i;
        Object[] objArr = ru1Var.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            ru1Var.a = Arrays.copyOf(objArr, i2);
            ru1Var.b = Arrays.copyOf(ru1Var.b, i2);
        }
        ru1Var.a[i] = pa4Var;
        lPt9.i(o5.b(iN));
        if (lPt9.s() == 4) {
            LPt9Fixed.o(lPt9, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iH = O.h(iN);
        if (iH == 1 || iH == 2 || iH == 3) {
            return new lu4(this.w, iN, this.y, pa4Var, this.B);
        }
        return (this.x == iN && ws1Var.a.f) ? this : new lu4(this.w, iN, this.y, pa4Var, this.B);
    }

    @Override // defpackage.tt1
    public final ws1 e0() {
        return this.w;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final pf0 g0(mn1 mn1Var) {
        return nu4.a(mn1Var) ? new ut1(this.y, this.w) : this;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final boolean i() {
        boolean z;
        boolean z2 = this.C.c;
        LPt9Fixed lPt9 = this.y;
        if (!z2) {
            return lPt9.c(lPt9.u());
        }
        int iU = lPt9.u();
        if (iU == lPt9.r().length()) {
            LPt9Fixed.o(lPt9, "EOF", 0, null, 6);
            throw null;
        }
        if (lPt9.r().charAt(iU) == '\"') {
            iU++;
            z = true;
        } else {
            z = false;
        }
        boolean zC = lPt9.c(iU);
        if (!z) {
            return zC;
        }
        if (lPt9.a == lPt9.r().length()) {
            LPt9Fixed.o(lPt9, "EOF", 0, null, 6);
            throw null;
        }
        if (lPt9.r().charAt(lPt9.a) == '\"') {
            lPt9.a++;
            return zC;
        }
        LPt9Fixed.o(lPt9, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final char j() {
        LPt9Fixed lPt9 = this.y;
        String strL = lPt9.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        LPt9Fixed.o(lPt9, "Expected single char, but got '" + strL + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final byte j0() {
        LPt9Fixed lPt9 = this.y;
        long j = lPt9.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        LPt9Fixed.o(lPt9, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final short l0() {
        LPt9Fixed lPt9 = this.y;
        long j = lPt9.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        LPt9Fixed.o(lPt9, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final float n0() {
        LPt9Fixed lPt9 = this.y;
        String strL = lPt9.l();
        boolean z = false;
        try {
            float f = Float.parseFloat(strL);
            if (!this.w.a.k) {
                if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                    z = true;
                }
                if (!z) {
                    AY.O(lPt9, Float.valueOf(f));
                    throw null;
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            LPt9Fixed.o(lPt9, "Failed to parse type 'float' for input '" + strL + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    @Override // defpackage.g40
    public final int p(pa4 pa4Var) {
        boolean zV;
        boolean z;
        boolean z2;
        boolean z3;
        String strK;
        boolean zV2;
        int i;
        boolean z4;
        int i2;
        int i3 = this.x;
        int iH = O.h(i3);
        char c = ':';
        LPt9Fixed lPt9 = this.y;
        int i4 = -1;
        if (iH == 0) {
            boolean zV3 = lPt9.v();
            while (true) {
                boolean zB = lPt9.b();
                wt1 wt1Var = this.D;
                if (zB) {
                    mt1 mt1Var = this.C;
                    String strM = mt1Var.c ? lPt9.m() : lPt9.e();
                    lPt9.i(c);
                    ws1 ws1Var = this.w;
                    int iH2 = S12N.h(pa4Var, ws1Var, strM);
                    boolean z5 = mt1Var.c;
                    if (iH2 != -3) {
                        if (mt1Var.h) {
                            pa4 pa4VarJ = pa4Var.j(iH2);
                            if (pa4VarJ.c() || !(!lPt9.w())) {
                                if (ur1.a(pa4VarJ.e(), xa4.CQf.a)) {
                                    byte bS = lPt9.s();
                                    if (z5) {
                                        if (bS == 1 || bS == 0) {
                                            strK = lPt9.l();
                                            lPt9.c = strK;
                                        } else {
                                            strK = null;
                                        }
                                    } else if (bS != 1) {
                                        strK = null;
                                    } else {
                                        strK = lPt9.k();
                                        lPt9.c = strK;
                                    }
                                    if (strK != null && S12N.h(pa4VarJ, ws1Var, strK) == -3) {
                                        lPt9.k();
                                        z3 = true;
                                    }
                                }
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                zV = lPt9.v();
                                z = false;
                                i4 = -1;
                            }
                        }
                        if (wt1Var != null) {
                            yq0 yq0Var = wt1Var.a;
                            if (iH2 < 64) {
                                yq0Var.c |= 1 << iH2;
                            } else {
                                int i5 = (iH2 >>> 6) - 1;
                                long[] jArr = yq0Var.d;
                                jArr[i5] = (1 << (iH2 & 63)) | jArr[i5];
                            }
                        }
                        i4 = iH2;
                    } else {
                        i4 = -1;
                        zV = false;
                        z = true;
                    }
                    if (z) {
                        if (!mt1Var.b) {
                            QnHx qnHx = this.B;
                            if (qnHx != null && ur1.a(qnHx.a, strM)) {
                                qnHx.a = null;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                lPt9.n(mv4.I(lPt9.r().subSequence(0, lPt9.a).toString(), strM, 6), "Encountered an unknown key '" + strM + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                throw null;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bS2 = lPt9.s();
                        if (bS2 == 8 || bS2 == 6) {
                            while (true) {
                                byte bS3 = lPt9.s();
                                if (bS3 != 1) {
                                    if (bS3 == 8 || bS3 == 6) {
                                        arrayList.add(Byte.valueOf(bS3));
                                    } else {
                                        ru1 ru1Var = lPt9.b;
                                        if (bS3 == 9) {
                                            if (((Number) wu.N0(arrayList)).byteValue() != 8) {
                                                throw AY.h("found ] instead of } at path: " + ru1Var, lPt9.r(), lPt9.a);
                                            }
                                            su.A0(arrayList);
                                        } else if (bS3 == 7) {
                                            if (((Number) wu.N0(arrayList)).byteValue() != 6) {
                                                throw AY.h("found } instead of ] at path: " + ru1Var, lPt9.r(), lPt9.a);
                                            }
                                            su.A0(arrayList);
                                        } else if (bS3 == 10) {
                                            LPt9Fixed.o(lPt9, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                    }
                                    lPt9.g();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z5) {
                                    lPt9.l();
                                } else {
                                    lPt9.e();
                                }
                            }
                        } else {
                            lPt9.l();
                        }
                        zV3 = lPt9.v();
                    } else {
                        zV3 = zV;
                    }
                    c = ':';
                } else if (!zV3) {
                    if (wt1Var != null) {
                        yq0 yq0Var2 = wt1Var.a;
                        pa4 pa4Var2 = yq0Var2.a;
                        int iF = pa4Var2.f();
                        while (true) {
                            long j = yq0Var2.c;
                            long j2 = -1;
                            x81<pa4, Integer, Boolean> x81Var = yq0Var2.b;
                            if (j == -1) {
                                if (iF <= 64) {
                                    break;
                                }
                                long[] jArr2 = yq0Var2.d;
                                int length = jArr2.length;
                                int i6 = 0;
                                loop3: while (i6 < length) {
                                    int i7 = i6 + 1;
                                    int i8 = i7 * 64;
                                    long j3 = jArr2[i6];
                                    while (true) {
                                        if (j3 != j2) {
                                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                            j3 |= 1 << iNumberOfTrailingZeros;
                                            int i9 = iNumberOfTrailingZeros + i8;
                                            if (x81Var.invoke(pa4Var2, Integer.valueOf(i9)).booleanValue()) {
                                                jArr2[i6] = j3;
                                                i4 = i9;
                                                break;
                                            }
                                            j2 = -1;
                                        } else {
                                            jArr2[i6] = j3;
                                            i6 = i7;
                                            j2 = -1;
                                        }
                                    }
                                }
                                break;
                            }
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            yq0Var2.c |= 1 << iNumberOfTrailingZeros2;
                            if (x81Var.invoke(pa4Var2, Integer.valueOf(iNumberOfTrailingZeros2)).booleanValue()) {
                                i4 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    LPt9Fixed.o(lPt9, "Unexpected trailing comma", 0, null, 6);
                    throw null;
                }
            }
        } else if (iH != 2) {
            boolean zV4 = lPt9.v();
            if (lPt9.b()) {
                int i10 = this.A;
                if (i10 != -1 && !zV4) {
                    LPt9Fixed.o(lPt9, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i10 + 1;
                this.A = i4;
            } else if (zV4) {
                LPt9Fixed.o(lPt9, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
        } else {
            int i11 = this.A;
            boolean z6 = i11 % 2 != 0;
            if (z6) {
                zV2 = i11 != -1 ? lPt9.v() : false;
                if (lPt9.b()) {
                    if (z6) {
                        if (this.A == -1) {
                            z4 = !zV2;
                            i2 = lPt9.a;
                            if (!z4) {
                                LPt9Fixed.o(lPt9, "Unexpected trailing comma", i2, null, 4);
                                throw null;
                            }
                        } else {
                            i = lPt9.a;
                            if (!zV2) {
                                LPt9Fixed.o(lPt9, "Expected comma after the key-value pair", i, null, 4);
                                throw null;
                            }
                        }
                    }
                    i4 = this.A + 1;
                    this.A = i4;
                } else if (zV2) {
                    LPt9Fixed.o(lPt9, "Expected '}', but had ',' instead", 0, null, 6);
                    throw null;
                }
            } else {
                lPt9.i(':');
            }
            if (lPt9.b()) {
                if (z6) {
                    if (this.A == -1) {
                        z4 = !zV2;
                        i2 = lPt9.a;
                        if (!z4) {
                            LPt9Fixed.o(lPt9, "Unexpected trailing comma", i2, null, 4);
                            throw null;
                        }
                    } else {
                        i = lPt9.a;
                        if (!zV2) {
                            LPt9Fixed.o(lPt9, "Expected comma after the key-value pair", i, null, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.A + 1;
                this.A = i4;
            } else if (zV2) {
                LPt9Fixed.o(lPt9, "Expected '}', but had ',' instead", 0, null, 6);
                throw null;
            }
        }
        if (i3 != 3) {
            ru1 ru1Var2 = lPt9.b;
            ru1Var2.b[ru1Var2.c] = i4;
        }
        return i4;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final double s0() {
        LPt9Fixed lPt9 = this.y;
        String strL = lPt9.l();
        boolean z = false;
        try {
            double d = Double.parseDouble(strL);
            if (!this.w.a.k) {
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    z = true;
                }
                if (!z) {
                    AY.O(lPt9, Double.valueOf(d));
                    throw null;
                }
            }
            return d;
        } catch (IllegalArgumentException unused) {
            LPt9Fixed.o(lPt9, "Failed to parse type 'double' for input '" + strL + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.tt1
    public final vt1 y() {
        return new bv1(this.w.a, this.y).b();
    }
}
