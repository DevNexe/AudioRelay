package com.google.protobuf;

import defpackage.ai3;
import defpackage.de5;
import defpackage.eg3;
import defpackage.ev2;
import defpackage.fo2;
import defpackage.hd2;
import defpackage.j92;
import defpackage.lk;
import defpackage.n54;
import defpackage.pj0;
import defpackage.zw0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class z2n<T> implements n54<T> {
    public static final int[] n = new int[0];
    public static final Unsafe o = de5.p();
    public final int[] a;
    public final Object[] b;
    public final DzVS c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final fo2 i;
    public final qc j;
    public final lpT2Fixed<?, ?> k;
    public final y<?> l;
    public final j92 m;

    public z2n(int[] iArr, Object[] objArr, int i, int i2, DzVS dzVS, boolean z, int[] iArr2, int i3, int i4, fo2 fo2Var, qc qcVar, lpT2Fixed lpt2, y yVar, j92 j92Var) {
        this.a = iArr;
        this.b = objArr;
        boolean z2 = dzVS instanceof LPt9Fixed;
        this.e = z;
        this.d = yVar != null && yVar.c(dzVS);
        this.f = true;
        this.g = iArr2;
        this.h = i3;
        this.i = fo2Var;
        this.j = qcVar;
        this.k = lpt2;
        this.l = yVar;
        this.c = dzVS;
        this.m = j92Var;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((obj instanceof LPt9Fixed) && (((LPt9Fixed) obj).x & Integer.MIN_VALUE) == 0) ? false : true;
    }

    public static List o(long j, Object obj) {
        return (List) de5.o(j, obj);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:93:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public static z2n p(hd2 hd2Var, fo2 fo2Var, qc qcVar, lpT2Fixed lpt2, y yVar, j92 j92Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iQ;
        int i5;
        long jQ;
        int i6;
        int iNumberOfTrailingZeros;
        int i7;
        int iQ2;
        int i8;
        int i9;
        int iOrdinal;
        Class<?> type;
        SjP.CQf cQf;
        Object obj;
        int i10;
        int i11;
        if (hd2Var instanceof ai3) {
            throw null;
        }
        F f = (F) hd2Var;
        boolean z = f.a == 2;
        LPt6Fixed[] lPt6Arr = f.d;
        if (lPt6Arr.length == 0) {
            i = 0;
            i2 = 0;
        } else {
            i = lPt6Arr[0].z;
            i2 = lPt6Arr[lPt6Arr.length - 1].z;
        }
        int length = lPt6Arr.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i12 = 0;
        int i13 = 0;
        for (LPt6Fixed lPt6 : lPt6Arr) {
            zw0 zw0Var = lPt6.x;
            if (zw0Var == zw0.x0) {
                i12++;
            } else {
                int i14 = zw0Var.x;
                if (i14 >= 18 && i14 <= 49) {
                    i13++;
                }
            }
        }
        int[] iArr2 = i12 > 0 ? new int[i12] : null;
        int[] iArr3 = i13 > 0 ? new int[i13] : null;
        int[] iArr4 = n;
        int[] iArr5 = f.c;
        if (iArr5 == null) {
            iArr5 = iArr4;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i15 < lPt6Arr.length) {
            LPt6Fixed lPt7 = lPt6Arr[i15];
            int i20 = lPt7.z;
            LPt6Fixed[] lPt6Arr2 = lPt6Arr;
            zw0 zw0Var2 = lPt7.x;
            int[] iArr6 = iArr4;
            Field field = lPt7.w;
            boolean z2 = z;
            ev2 ev2Var = lPt7.E;
            if (ev2Var != null) {
                i4 = i2;
                i5 = zw0Var2.x + 51;
                i3 = i;
                int iQ3 = (int) de5.q(ev2Var.b);
                Field field2 = ev2Var.a;
                iQ = iQ3;
                jQ = de5.q(field2);
            } else {
                i3 = i;
                i4 = i2;
                iQ = (int) de5.q(field);
                int i21 = zw0Var2.x;
                int i22 = zw0Var2.y;
                if (pj0.b(i22)) {
                    i5 = i21;
                } else {
                    i5 = i21;
                    if (!(i22 == 4)) {
                        Field field3 = lPt7.A;
                        iQ2 = field3 == null ? 1048575 : (int) de5.q(field3);
                        iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(lPt7.B);
                        int i23 = i5;
                        i7 = iQ2;
                        i6 = i23;
                    }
                    iArr[i16] = lPt7.z;
                    int i24 = i16 + 1;
                    int i25 = i15;
                    if (lPt7.D) {
                        i8 = 536870912;
                    } else {
                        i8 = 0;
                    }
                    if (lPt7.C) {
                        i9 = 268435456;
                    } else {
                        i9 = 0;
                    }
                    iArr[i24] = i9 | i8 | (i6 << 20) | iQ;
                    iArr[i16 + 2] = (iNumberOfTrailingZeros << 20) | i7;
                    iOrdinal = zw0Var2.ordinal();
                    if (iOrdinal == 9 && iOrdinal != 17) {
                        type = (iOrdinal == 27 || iOrdinal == 49) ? lPt7.y : null;
                    } else if (field != null) {
                        type = field.getType();
                    } else {
                        type = lPt7.G;
                    }
                    cQf = lPt7.I;
                    obj = lPt7.H;
                    if (obj != null) {
                        i11 = (i16 / 3) * 2;
                        objArr[i11] = obj;
                        if (type != null) {
                            objArr[i11 + 1] = type;
                        } else if (cQf != null) {
                            objArr[i11 + 1] = cQf;
                        }
                    } else if (type != null) {
                        objArr[((i16 / 3) * 2) + 1] = type;
                    } else if (cQf != null) {
                        objArr[((i16 / 3) * 2) + 1] = cQf;
                    }
                    if (i17 < iArr5.length && iArr5[i17] == i20) {
                        iArr5[i17] = i16;
                        i17++;
                    }
                    if (zw0Var2 == zw0.x0) {
                        iArr2[i18] = i16;
                        i18++;
                    } else {
                        i10 = zw0Var2.x;
                        if (i10 >= 18) {
                            if (i10 <= 49) {
                                iArr3[i19] = (int) de5.q(field);
                                i19++;
                            }
                        }
                        i15 = i25 + 1;
                        i16 += 3;
                        lPt6Arr = lPt6Arr2;
                        iArr4 = iArr6;
                        z = z2;
                        i2 = i4;
                        i = i3;
                        f = f;
                        iArr3 = iArr3;
                    }
                    i15 = i25 + 1;
                    i16 += 3;
                    lPt6Arr = lPt6Arr2;
                    iArr4 = iArr6;
                    z = z2;
                    i2 = i4;
                    i = i3;
                    f = f;
                    iArr3 = iArr3;
                }
                iQ = iQ;
                Field field4 = lPt7.F;
                if (field4 == null) {
                    f = f;
                    i6 = i5;
                    iNumberOfTrailingZeros = 0;
                    i7 = 0;
                } else {
                    jQ = de5.q(field4);
                }
                iArr[i16] = lPt7.z;
                int i26 = i16 + 1;
                int i27 = i15;
                if (lPt7.D) {
                    i8 = 536870912;
                } else {
                    i8 = 0;
                }
                if (lPt7.C) {
                    i9 = 268435456;
                } else {
                    i9 = 0;
                }
                iArr[i26] = i9 | i8 | (i6 << 20) | iQ;
                iArr[i16 + 2] = (iNumberOfTrailingZeros << 20) | i7;
                iOrdinal = zw0Var2.ordinal();
                if (iOrdinal == 9) {
                    if (field != null) {
                        type = field.getType();
                    } else {
                        type = lPt7.G;
                    }
                } else if (field != null) {
                    type = field.getType();
                } else {
                    type = lPt7.G;
                }
                cQf = lPt7.I;
                obj = lPt7.H;
                if (obj != null) {
                    i11 = (i16 / 3) * 2;
                    objArr[i11] = obj;
                    if (type != null) {
                        objArr[i11 + 1] = type;
                    } else if (cQf != null) {
                        objArr[i11 + 1] = cQf;
                    }
                } else if (type != null) {
                    objArr[((i16 / 3) * 2) + 1] = type;
                } else if (cQf != null) {
                    objArr[((i16 / 3) * 2) + 1] = cQf;
                }
                if (i17 < iArr5.length) {
                    iArr5[i17] = i16;
                    i17++;
                }
                if (zw0Var2 == zw0.x0) {
                    iArr2[i18] = i16;
                    i18++;
                } else {
                    i10 = zw0Var2.x;
                    if (i10 >= 18) {
                        if (i10 <= 49) {
                            iArr3[i19] = (int) de5.q(field);
                            i19++;
                        }
                    }
                    i15 = i27 + 1;
                    i16 += 3;
                    lPt6Arr = lPt6Arr2;
                    iArr4 = iArr6;
                    z = z2;
                    i2 = i4;
                    i = i3;
                    f = f;
                    iArr3 = iArr3;
                }
                i15 = i27 + 1;
                i16 += 3;
                lPt6Arr = lPt6Arr2;
                iArr4 = iArr6;
                z = z2;
                i2 = i4;
                i = i3;
                f = f;
                iArr3 = iArr3;
            }
            iQ2 = (int) jQ;
            iNumberOfTrailingZeros = 0;
            int i28 = i5;
            i7 = iQ2;
            i6 = i28;
            iArr[i16] = lPt7.z;
            int i29 = i16 + 1;
            int i210 = i15;
            if (lPt7.D) {
                i8 = 536870912;
            } else {
                i8 = 0;
            }
            if (lPt7.C) {
                i9 = 268435456;
            } else {
                i9 = 0;
            }
            iArr[i29] = i9 | i8 | (i6 << 20) | iQ;
            iArr[i16 + 2] = (iNumberOfTrailingZeros << 20) | i7;
            iOrdinal = zw0Var2.ordinal();
            if (iOrdinal == 9) {
                if (field != null) {
                    type = field.getType();
                } else {
                    type = lPt7.G;
                }
            } else if (field != null) {
                type = field.getType();
            } else {
                type = lPt7.G;
            }
            cQf = lPt7.I;
            obj = lPt7.H;
            if (obj != null) {
                i11 = (i16 / 3) * 2;
                objArr[i11] = obj;
                if (type != null) {
                    objArr[i11 + 1] = type;
                } else if (cQf != null) {
                    objArr[i11 + 1] = cQf;
                }
            } else if (type != null) {
                objArr[((i16 / 3) * 2) + 1] = type;
            } else if (cQf != null) {
                objArr[((i16 / 3) * 2) + 1] = cQf;
            }
            if (i17 < iArr5.length) {
                iArr5[i17] = i16;
                i17++;
            }
            if (zw0Var2 == zw0.x0) {
                iArr2[i18] = i16;
                i18++;
            } else {
                i10 = zw0Var2.x;
                if (i10 >= 18) {
                    if (i10 <= 49) {
                        iArr3[i19] = (int) de5.q(field);
                        i19++;
                    }
                }
                i15 = i210 + 1;
                i16 += 3;
                lPt6Arr = lPt6Arr2;
                iArr4 = iArr6;
                z = z2;
                i2 = i4;
                i = i3;
                f = f;
                iArr3 = iArr3;
            }
            i15 = i210 + 1;
            i16 += 3;
            lPt6Arr = lPt6Arr2;
            iArr4 = iArr6;
            z = z2;
            i2 = i4;
            i = i3;
            f = f;
            iArr3 = iArr3;
        }
        F f2 = f;
        int[] iArr7 = iArr3;
        int[] iArr8 = iArr4;
        int i30 = i;
        int i31 = i2;
        boolean z3 = z;
        if (iArr2 == null) {
            iArr2 = iArr8;
        }
        int[] iArr9 = iArr7 == null ? iArr8 : iArr7;
        int[] iArr10 = new int[iArr5.length + iArr2.length + iArr9.length];
        System.arraycopy(iArr5, 0, iArr10, 0, iArr5.length);
        System.arraycopy(iArr2, 0, iArr10, iArr5.length, iArr2.length);
        System.arraycopy(iArr9, 0, iArr10, iArr5.length + iArr2.length, iArr9.length);
        return new z2n(iArr, objArr, i30, i31, f2.e, z3, iArr10, iArr5.length, iArr5.length + iArr2.length, fo2Var, qcVar, lpt2, yVar, j92Var);
    }

    public static int q(long j, Object obj) {
        return ((Integer) de5.o(j, obj)).intValue();
    }

    public static long r(long j, Object obj) {
        return ((Long) de5.o(j, obj)).longValue();
    }

    public static void v(int i, Object obj, YKK ykk) {
        if (!(obj instanceof String)) {
            ykk.b(i, (lk) obj);
        } else {
            ykk.a.L1(i, (String) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // defpackage.n54
    public final void a(Object obj, YKK ykk) {
        Iterator itQ;
        Map.Entry<?, ?> entry;
        Iterator it;
        ykk.getClass();
        if (!this.e) {
            t(obj, ykk);
            return;
        }
        boolean z = this.d;
        y<?> yVar = this.l;
        if (z) {
            Xn1<T> xn1B = yVar.b(obj);
            if (xn1B.m()) {
                itQ = null;
                entry = null;
            } else {
                itQ = xn1B.q();
                entry = (Map.Entry) itQ.next();
            }
        } else {
            itQ = null;
            entry = null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int iS = s(i);
            int i2 = iArr[i];
            while (entry != null && yVar.a(entry) <= i2) {
                yVar.e(ykk, entry);
                entry = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
            }
            switch ((267386880 & iS) >>> 20) {
                case 0:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.c(de5.k(iS & 1048575, obj), i2);
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 1:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.i(de5.l(iS & 1048575, obj), i2);
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 2:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.l(i2, de5.n(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 3:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.u(i2, de5.n(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 4:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.k(i2, de5.m(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 5:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.g(i2, de5.n(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 6:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.e(i2, de5.m(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 7:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.a(i2, de5.g(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 8:
                    it = itQ;
                    if (l(i, obj)) {
                        v(i2, de5.o(iS & 1048575, obj), ykk);
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 9:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.n(i2, i(i), de5.o(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 10:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.b(i2, (lk) de5.o(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 11:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.t(i2, de5.m(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 12:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.d(i2, de5.m(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 13:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.p(i2, de5.m(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 14:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.q(i2, de5.n(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 15:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.r(i2, de5.m(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 16:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.s(i2, de5.n(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 17:
                    it = itQ;
                    if (l(i, obj)) {
                        ykk.j(i2, i(i), de5.o(iS & 1048575, obj));
                    } else {
                        continue;
                    }
                    i += 3;
                    itQ = it;
                    break;
                case 18:
                    it = itQ;
                    n8V_.E(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 19:
                    it = itQ;
                    n8V_.I(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 20:
                    it = itQ;
                    n8V_.L(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 21:
                    it = itQ;
                    n8V_.T(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 22:
                    it = itQ;
                    n8V_.K(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 23:
                    it = itQ;
                    n8V_.H(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 24:
                    it = itQ;
                    n8V_.G(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 25:
                    it = itQ;
                    n8V_.C(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 26:
                    it = itQ;
                    n8V_.R(iArr[i], (List) de5.o(iS & 1048575, obj), ykk);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 27:
                    it = itQ;
                    n8V_.M(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, i(i));
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 28:
                    it = itQ;
                    n8V_.D(iArr[i], (List) de5.o(iS & 1048575, obj), ykk);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 29:
                    it = itQ;
                    n8V_.S(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 30:
                    it = itQ;
                    n8V_.F(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 31:
                    it = itQ;
                    n8V_.N(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 32:
                    it = itQ;
                    n8V_.O(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 33:
                    it = itQ;
                    n8V_.P(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 34:
                    it = itQ;
                    n8V_.Q(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, false);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 35:
                    it = itQ;
                    n8V_.E(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 36:
                    it = itQ;
                    n8V_.I(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 37:
                    it = itQ;
                    n8V_.L(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 38:
                    it = itQ;
                    n8V_.T(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 39:
                    it = itQ;
                    n8V_.K(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 40:
                    it = itQ;
                    n8V_.H(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 41:
                    it = itQ;
                    n8V_.G(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 42:
                    it = itQ;
                    n8V_.C(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 43:
                    it = itQ;
                    n8V_.S(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 44:
                    it = itQ;
                    n8V_.F(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 45:
                    it = itQ;
                    n8V_.N(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 46:
                    it = itQ;
                    n8V_.O(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 47:
                    it = itQ;
                    n8V_.P(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 48:
                    it = itQ;
                    n8V_.Q(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, true);
                    continue;
                    i += 3;
                    itQ = it;
                    break;
                case 49:
                    n8V_.J(iArr[i], (List) de5.o(iS & 1048575, obj), ykk, i(i));
                    break;
                case 50:
                    u(ykk, i2, de5.o(iS & 1048575, obj), i);
                    break;
                case 51:
                    if (n(i2, i, obj)) {
                        ykk.c(((Double) de5.o(iS & 1048575, obj)).doubleValue(), i2);
                    }
                    break;
                case 52:
                    if (n(i2, i, obj)) {
                        ykk.i(((Float) de5.o(iS & 1048575, obj)).floatValue(), i2);
                    }
                    break;
                case 53:
                    if (n(i2, i, obj)) {
                        ykk.l(i2, r(iS & 1048575, obj));
                    }
                    break;
                case 54:
                    if (n(i2, i, obj)) {
                        ykk.u(i2, r(iS & 1048575, obj));
                    }
                    break;
                case 55:
                    if (n(i2, i, obj)) {
                        ykk.k(i2, q(iS & 1048575, obj));
                    }
                    break;
                case 56:
                    if (n(i2, i, obj)) {
                        ykk.g(i2, r(iS & 1048575, obj));
                    }
                    break;
                case 57:
                    if (n(i2, i, obj)) {
                        ykk.e(i2, q(iS & 1048575, obj));
                    }
                    break;
                case 58:
                    if (n(i2, i, obj)) {
                        ykk.a(i2, ((Boolean) de5.o(iS & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (n(i2, i, obj)) {
                        v(i2, de5.o(iS & 1048575, obj), ykk);
                    }
                    break;
                case 60:
                    if (n(i2, i, obj)) {
                        ykk.n(i2, i(i), de5.o(iS & 1048575, obj));
                    }
                    break;
                case 61:
                    if (n(i2, i, obj)) {
                        ykk.b(i2, (lk) de5.o(iS & 1048575, obj));
                    }
                    break;
                case 62:
                    if (n(i2, i, obj)) {
                        ykk.t(i2, q(iS & 1048575, obj));
                    }
                    break;
                case 63:
                    if (n(i2, i, obj)) {
                        ykk.d(i2, q(iS & 1048575, obj));
                    }
                    break;
                case 64:
                    if (n(i2, i, obj)) {
                        ykk.p(i2, q(iS & 1048575, obj));
                    }
                    break;
                case 65:
                    if (n(i2, i, obj)) {
                        ykk.q(i2, r(iS & 1048575, obj));
                    }
                    break;
                case 66:
                    if (n(i2, i, obj)) {
                        ykk.r(i2, q(iS & 1048575, obj));
                    }
                    break;
                case 67:
                    if (n(i2, i, obj)) {
                        ykk.s(i2, r(iS & 1048575, obj));
                    }
                    break;
                case 68:
                    if (n(i2, i, obj)) {
                        ykk.j(i2, i(i), de5.o(iS & 1048575, obj));
                    }
                    break;
            }
            it = itQ;
            i += 3;
            itQ = it;
        }
        Iterator it2 = itQ;
        while (entry != null) {
            yVar.e(ykk, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        lpT2Fixed<?, ?> lpt2 = this.k;
        lpt2.f(lpt2.a(obj), ykk);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n54
    public final void b(T t) {
        if (m(t)) {
            if (t instanceof LPt9Fixed) {
                LPt9Fixed lPt9 = (LPt9Fixed) t;
                lPt9.C();
                lPt9.B();
                lPt9.H();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int iS = s(i);
                long j = 1048575 & iS;
                int i2 = (iS & 267386880) >>> 20;
                Unsafe unsafe = o;
                if (i2 != 9) {
                    switch (i2) {
                        case 17:
                            if (l(i, t)) {
                                i(i).b(unsafe.getObject(t, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.j.a(j, t);
                            break;
                        case 50:
                            Object object = unsafe.getObject(t, j);
                            if (object != null) {
                                unsafe.putObject(t, j, this.m.a(object));
                            }
                            break;
                    }
                } else if (l(i, t)) {
                    i(i).b(unsafe.getObject(t, j));
                }
            }
            this.k.d(t);
            if (this.d) {
                this.l.d(t);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb A[LOOP:1: B:52:0x00b9->B:57:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n54
    public final boolean c(T t) {
        List list;
        n54 n54VarI;
        int i;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        while (true) {
            boolean zL = true;
            if (i2 >= this.h) {
                return !this.d || this.l.b(t).n();
            }
            int i5 = this.g[i2];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int iS = s(i5);
            int i7 = iArr[i5 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = o.getInt(t, i8);
                }
                i3 = i8;
            }
            if ((268435456 & iS) != 0) {
                if (!(i3 == 1048575 ? l(i5, t) : (i4 & i9) != 0)) {
                    return false;
                }
            }
            int i10 = (267386880 & iS) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (i3 == 1048575) {
                    zL = l(i5, t);
                } else if ((i9 & i4) == 0) {
                    zL = false;
                }
                if (zL && !i(i5).c(de5.o(iS & 1048575, t))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (List) de5.o(iS & 1048575, t);
                if (!list.isEmpty()) {
                    n54VarI = i(i5);
                    for (i = 0; i < list.size(); i++) {
                        if (!n54VarI.c(list.get(i))) {
                            zL = false;
                            break;
                        }
                    }
                }
                if (!zL) {
                    return false;
                }
            } else if (i10 == 60 || i10 == 68) {
                if (n(i6, i5, t) && !i(i5).c(de5.o(iS & 1048575, t))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (List) de5.o(iS & 1048575, t);
                if (!list.isEmpty()) {
                    n54VarI = i(i5);
                    while (i < list.size()) {
                        if (!n54VarI.c(list.get(i))) {
                            zL = false;
                            break;
                        }
                    }
                }
                if (!zL) {
                    return false;
                }
            } else if (i10 != 50) {
                continue;
            } else {
                Object objO = de5.o(iS & 1048575, t);
                j92 j92Var = this.m;
                if (!j92Var.d(objO).isEmpty()) {
                    j92Var.b(h(i5));
                    throw null;
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01c8  */
    @Override // defpackage.n54
    public final boolean d(T t, T t2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zB = true;
            if (i >= length) {
                lpT2Fixed<?, ?> lpt2 = this.k;
                if (!lpt2.a(t).equals(lpt2.a(t2))) {
                    return false;
                }
                if (!this.d) {
                    return true;
                }
                y<?> yVar = this.l;
                return yVar.b(t).equals(yVar.b(t2));
            }
            int iS = s(i);
            long j = iS & 1048575;
            switch ((iS & 267386880) >>> 20) {
                case 0:
                    if (!g(i, t, t2) || Double.doubleToLongBits(de5.k(j, t)) != Double.doubleToLongBits(de5.k(j, t2))) {
                        zB = false;
                    }
                    break;
                case 1:
                    if (!g(i, t, t2) || Float.floatToIntBits(de5.l(j, t)) != Float.floatToIntBits(de5.l(j, t2))) {
                        zB = false;
                    }
                    break;
                case 2:
                    if (!g(i, t, t2) || de5.n(j, t) != de5.n(j, t2)) {
                        zB = false;
                    }
                    break;
                case 3:
                    if (!g(i, t, t2) || de5.n(j, t) != de5.n(j, t2)) {
                        zB = false;
                    }
                    break;
                case 4:
                    if (!g(i, t, t2) || de5.m(j, t) != de5.m(j, t2)) {
                        zB = false;
                    }
                    break;
                case 5:
                    if (!g(i, t, t2) || de5.n(j, t) != de5.n(j, t2)) {
                        zB = false;
                    }
                    break;
                case 6:
                    if (!g(i, t, t2) || de5.m(j, t) != de5.m(j, t2)) {
                        zB = false;
                    }
                    break;
                case 7:
                    if (!g(i, t, t2) || de5.g(j, t) != de5.g(j, t2)) {
                        zB = false;
                    }
                    break;
                case 8:
                    if (!g(i, t, t2) || !n8V_.B(de5.o(j, t), de5.o(j, t2))) {
                        zB = false;
                    }
                    break;
                case 9:
                    if (!g(i, t, t2) || !n8V_.B(de5.o(j, t), de5.o(j, t2))) {
                        zB = false;
                    }
                    break;
                case 10:
                    if (!g(i, t, t2) || !n8V_.B(de5.o(j, t), de5.o(j, t2))) {
                        zB = false;
                    }
                    break;
                case 11:
                    if (!g(i, t, t2) || de5.m(j, t) != de5.m(j, t2)) {
                        zB = false;
                    }
                    break;
                case 12:
                    if (!g(i, t, t2) || de5.m(j, t) != de5.m(j, t2)) {
                        zB = false;
                    }
                    break;
                case 13:
                    if (!g(i, t, t2) || de5.m(j, t) != de5.m(j, t2)) {
                        zB = false;
                    }
                    break;
                case 14:
                    if (!g(i, t, t2) || de5.n(j, t) != de5.n(j, t2)) {
                        zB = false;
                    }
                    break;
                case 15:
                    if (!g(i, t, t2) || de5.m(j, t) != de5.m(j, t2)) {
                        zB = false;
                    }
                    break;
                case 16:
                    if (!g(i, t, t2) || de5.n(j, t) != de5.n(j, t2)) {
                        zB = false;
                    }
                    break;
                case 17:
                    if (!g(i, t, t2) || !n8V_.B(de5.o(j, t), de5.o(j, t2))) {
                        zB = false;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zB = n8V_.B(de5.o(j, t), de5.o(j, t2));
                    break;
                case 50:
                    zB = n8V_.B(de5.o(j, t), de5.o(j, t2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    if (!(de5.m(j2, t) == de5.m(j2, t2)) || !n8V_.B(de5.o(j, t), de5.o(j, t2))) {
                        zB = false;
                    }
                    break;
            }
            if (!zB) {
                return false;
            }
            i += 3;
        }
    }

    @Override // defpackage.n54
    public final int e(T t) {
        return this.e ? k(t) : j(t);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    @Override // defpackage.n54
    public final int f(T t) {
        int i;
        int iB;
        int iHashCode;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iS = s(i3);
            int i4 = iArr[i3];
            long j = 1048575 & iS;
            switch ((iS & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iB = SjP.b(Double.doubleToLongBits(de5.k(j, t)));
                    i2 = iB + i;
                    break;
                case 1:
                    i = i2 * 53;
                    iB = Float.floatToIntBits(de5.l(j, t));
                    i2 = iB + i;
                    break;
                case 2:
                    i = i2 * 53;
                    iB = SjP.b(de5.n(j, t));
                    i2 = iB + i;
                    break;
                case 3:
                    i = i2 * 53;
                    iB = SjP.b(de5.n(j, t));
                    i2 = iB + i;
                    break;
                case 4:
                    i = i2 * 53;
                    iB = de5.m(j, t);
                    i2 = iB + i;
                    break;
                case 5:
                    i = i2 * 53;
                    iB = SjP.b(de5.n(j, t));
                    i2 = iB + i;
                    break;
                case 6:
                    i = i2 * 53;
                    iB = de5.m(j, t);
                    i2 = iB + i;
                    break;
                case 7:
                    i = i2 * 53;
                    iB = SjP.a(de5.g(j, t));
                    i2 = iB + i;
                    break;
                case 8:
                    i = i2 * 53;
                    iB = ((String) de5.o(j, t)).hashCode();
                    i2 = iB + i;
                    break;
                case 9:
                    Object objO = de5.o(j, t);
                    if (objO != null) {
                        iHashCode = objO.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iB = de5.o(j, t).hashCode();
                    i2 = iB + i;
                    break;
                case 11:
                    i = i2 * 53;
                    iB = de5.m(j, t);
                    i2 = iB + i;
                    break;
                case 12:
                    i = i2 * 53;
                    iB = de5.m(j, t);
                    i2 = iB + i;
                    break;
                case 13:
                    i = i2 * 53;
                    iB = de5.m(j, t);
                    i2 = iB + i;
                    break;
                case 14:
                    i = i2 * 53;
                    iB = SjP.b(de5.n(j, t));
                    i2 = iB + i;
                    break;
                case 15:
                    i = i2 * 53;
                    iB = de5.m(j, t);
                    i2 = iB + i;
                    break;
                case 16:
                    i = i2 * 53;
                    iB = SjP.b(de5.n(j, t));
                    i2 = iB + i;
                    break;
                case 17:
                    Object objO2 = de5.o(j, t);
                    if (objO2 != null) {
                        iHashCode = objO2.hashCode();
                    } else {
                        iHashCode = 37;
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iB = de5.o(j, t).hashCode();
                    i2 = iB + i;
                    break;
                case 50:
                    i = i2 * 53;
                    iB = de5.o(j, t).hashCode();
                    i2 = iB + i;
                    break;
                case 51:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.b(Double.doubleToLongBits(((Double) de5.o(j, t)).doubleValue()));
                        i2 = iB + i;
                    }
                    break;
                case 52:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = Float.floatToIntBits(((Float) de5.o(j, t)).floatValue());
                        i2 = iB + i;
                    }
                    break;
                case 53:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.b(r(j, t));
                        i2 = iB + i;
                    }
                    break;
                case 54:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.b(r(j, t));
                        i2 = iB + i;
                    }
                    break;
                case 55:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = q(j, t);
                        i2 = iB + i;
                    }
                    break;
                case 56:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.b(r(j, t));
                        i2 = iB + i;
                    }
                    break;
                case 57:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = q(j, t);
                        i2 = iB + i;
                    }
                    break;
                case 58:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.a(((Boolean) de5.o(j, t)).booleanValue());
                        i2 = iB + i;
                    }
                    break;
                case 59:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = ((String) de5.o(j, t)).hashCode();
                        i2 = iB + i;
                    }
                    break;
                case 60:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = de5.o(j, t).hashCode();
                        i2 = iB + i;
                    }
                    break;
                case 61:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = de5.o(j, t).hashCode();
                        i2 = iB + i;
                    }
                    break;
                case 62:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = q(j, t);
                        i2 = iB + i;
                    }
                    break;
                case 63:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = q(j, t);
                        i2 = iB + i;
                    }
                    break;
                case 64:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = q(j, t);
                        i2 = iB + i;
                    }
                    break;
                case 65:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.b(r(j, t));
                        i2 = iB + i;
                    }
                    break;
                case 66:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = q(j, t);
                        i2 = iB + i;
                    }
                    break;
                case 67:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = SjP.b(r(j, t));
                        i2 = iB + i;
                    }
                    break;
                case 68:
                    if (n(i4, i3, t)) {
                        i = i2 * 53;
                        iB = de5.o(j, t).hashCode();
                        i2 = iB + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.k.a(t).hashCode() + (i2 * 53);
        return this.d ? (iHashCode2 * 53) + this.l.b(t).hashCode() : iHashCode2;
    }

    public final boolean g(int i, Object obj, Object obj2) {
        return l(i, obj) == l(i, obj2);
    }

    public final Object h(int i) {
        return this.b[(i / 3) * 2];
    }

    public final n54 i(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        n54 n54Var = (n54) objArr[i2];
        if (n54Var != null) {
            return n54Var;
        }
        n54<T> n54VarA = eg3.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = n54VarA;
        return n54VarA;
    }

    public final int j(T t) {
        int i;
        int i2;
        int iY0;
        int iW0;
        int i3;
        int iP1;
        int iR1;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                lpT2Fixed<?, ?> lpt2 = this.k;
                int iB = lpt2.b(lpt2.a(t)) + i6;
                return this.d ? iB + this.l.b(t).k() : iB;
            }
            int iS = s(i5);
            int i9 = iArr[i5];
            int i10 = (267386880 & iS) >>> 20;
            boolean z = this.f;
            Unsafe unsafe = o;
            if (i10 <= 17) {
                i = iArr[i5 + 2];
                int i11 = i & i4;
                i2 = 1 << (i >>> 20);
                if (i11 != i7) {
                    i8 = unsafe.getInt(t, i11);
                    i7 = i11;
                }
            } else {
                i = (!z || i10 < zw0.i0.a() || i10 > zw0.v0.a()) ? 0 : iArr[i5 + 2] & i4;
                i2 = 0;
            }
            long j = iS & i4;
            switch (i10) {
                case 0:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.Y0(i9);
                        i6 += iY0;
                    }
                    break;
                case 1:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.c1(i9);
                        i6 += iY0;
                    }
                    break;
                case 2:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.g1(i9, unsafe.getLong(t, j));
                        i6 += iY0;
                    }
                    break;
                case 3:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.s1(i9, unsafe.getLong(t, j));
                        i6 += iY0;
                    }
                    break;
                case 4:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.e1(i9, unsafe.getInt(t, j));
                        i6 += iY0;
                    }
                    break;
                case 5:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.b1(i9);
                        i6 += iY0;
                    }
                    break;
                case 6:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.a1(i9);
                        i6 += iY0;
                    }
                    break;
                case 7:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.V0(i9);
                        i6 += iY0;
                    }
                    break;
                case 8:
                    if ((i8 & i2) != 0) {
                        Object object = unsafe.getObject(t, j);
                        iW0 = object instanceof lk ? CodedOutputStream.W0(i9, (lk) object) : CodedOutputStream.n1(i9, (String) object);
                        i6 = iW0 + i6;
                    }
                    break;
                case 9:
                    if ((i8 & i2) != 0) {
                        iY0 = n8V_.o(i9, i(i5), unsafe.getObject(t, j));
                        i6 += iY0;
                    }
                    break;
                case 10:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.W0(i9, (lk) unsafe.getObject(t, j));
                        i6 += iY0;
                    }
                    break;
                case 11:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.q1(i9, unsafe.getInt(t, j));
                        i6 += iY0;
                    }
                    break;
                case 12:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.Z0(i9, unsafe.getInt(t, j));
                        i6 += iY0;
                    }
                    break;
                case 13:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.j1(i9);
                        i6 += iY0;
                    }
                    break;
                case 14:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.k1(i9);
                        i6 += iY0;
                    }
                    break;
                case 15:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.l1(i9, unsafe.getInt(t, j));
                        i6 += iY0;
                    }
                    break;
                case 16:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.m1(i9, unsafe.getLong(t, j));
                        i6 += iY0;
                    }
                    break;
                case 17:
                    if ((i8 & i2) != 0) {
                        iY0 = CodedOutputStream.d1(i9, (DzVS) unsafe.getObject(t, j), i(i5));
                        i6 += iY0;
                    }
                    break;
                case 18:
                    iY0 = n8V_.h(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 19:
                    iY0 = n8V_.f(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 20:
                    iY0 = n8V_.m(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 21:
                    iY0 = n8V_.x(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 22:
                    iY0 = n8V_.k(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 23:
                    iY0 = n8V_.h(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 24:
                    iY0 = n8V_.f(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 25:
                    iY0 = n8V_.a(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 26:
                    iY0 = n8V_.u((List) unsafe.getObject(t, j), i9);
                    i6 += iY0;
                    break;
                case 27:
                    iY0 = n8V_.p(i9, (List) unsafe.getObject(t, j), i(i5));
                    i6 += iY0;
                    break;
                case 28:
                    iY0 = n8V_.c((List) unsafe.getObject(t, j), i9);
                    i6 += iY0;
                    break;
                case 29:
                    iY0 = n8V_.v(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 30:
                    iY0 = n8V_.d(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 31:
                    iY0 = n8V_.f(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 32:
                    iY0 = n8V_.h(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 33:
                    iY0 = n8V_.q(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 34:
                    iY0 = n8V_.s(i9, (List) unsafe.getObject(t, j));
                    i6 += iY0;
                    break;
                case 35:
                    i3 = n8V_.i((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 36:
                    i3 = n8V_.g((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 37:
                    i3 = n8V_.n((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 38:
                    i3 = n8V_.y((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 39:
                    i3 = n8V_.l((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 40:
                    i3 = n8V_.i((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 41:
                    i3 = n8V_.g((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 42:
                    i3 = n8V_.b((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 43:
                    i3 = n8V_.w((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 44:
                    i3 = n8V_.e((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 45:
                    i3 = n8V_.g((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 46:
                    i3 = n8V_.i((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 47:
                    i3 = n8V_.r((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 48:
                    i3 = n8V_.t((List) unsafe.getObject(t, j));
                    if (i3 > 0) {
                        if (z) {
                            unsafe.putInt(t, i, i3);
                        }
                        iP1 = CodedOutputStream.p1(i9);
                        iR1 = CodedOutputStream.r1(i3);
                        i6 = iR1 + iP1 + i3 + i6;
                    }
                    break;
                case 49:
                    iY0 = n8V_.j(i9, (List) unsafe.getObject(t, j), i(i5));
                    i6 += iY0;
                    break;
                case 50:
                    this.m.c(i9, unsafe.getObject(t, j), h(i5));
                    iY0 = 0;
                    i6 += iY0;
                    break;
                case 51:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.Y0(i9);
                        i6 += iY0;
                    }
                    break;
                case 52:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.c1(i9);
                        i6 += iY0;
                    }
                    break;
                case 53:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.g1(i9, r(j, t));
                        i6 += iY0;
                    }
                    break;
                case 54:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.s1(i9, r(j, t));
                        i6 += iY0;
                    }
                    break;
                case 55:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.e1(i9, q(j, t));
                        i6 += iY0;
                    }
                    break;
                case 56:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.b1(i9);
                        i6 += iY0;
                    }
                    break;
                case 57:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.a1(i9);
                        i6 += iY0;
                    }
                    break;
                case 58:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.V0(i9);
                        i6 += iY0;
                    }
                    break;
                case 59:
                    if (n(i9, i5, t)) {
                        Object object2 = unsafe.getObject(t, j);
                        iW0 = object2 instanceof lk ? CodedOutputStream.W0(i9, (lk) object2) : CodedOutputStream.n1(i9, (String) object2);
                        i6 = iW0 + i6;
                    }
                    break;
                case 60:
                    if (n(i9, i5, t)) {
                        iY0 = n8V_.o(i9, i(i5), unsafe.getObject(t, j));
                        i6 += iY0;
                    }
                    break;
                case 61:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.W0(i9, (lk) unsafe.getObject(t, j));
                        i6 += iY0;
                    }
                    break;
                case 62:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.q1(i9, q(j, t));
                        i6 += iY0;
                    }
                    break;
                case 63:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.Z0(i9, q(j, t));
                        i6 += iY0;
                    }
                    break;
                case 64:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.j1(i9);
                        i6 += iY0;
                    }
                    break;
                case 65:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.k1(i9);
                        i6 += iY0;
                    }
                    break;
                case 66:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.l1(i9, q(j, t));
                        i6 += iY0;
                    }
                    break;
                case 67:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.m1(i9, r(j, t));
                        i6 += iY0;
                    }
                    break;
                case 68:
                    if (n(i9, i5, t)) {
                        iY0 = CodedOutputStream.d1(i9, (DzVS) unsafe.getObject(t, j), i(i5));
                        i6 += iY0;
                    }
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
    }

    public final int k(T t) {
        int iY0;
        int iW0;
        int i;
        int iP1;
        int iR1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                lpT2Fixed<?, ?> lpt2 = this.k;
                return lpt2.b(lpt2.a(t)) + i3;
            }
            int iS = s(i2);
            int i4 = (267386880 & iS) >>> 20;
            int i5 = iArr[i2];
            long j = iS & 1048575;
            int i6 = (i4 < zw0.i0.a() || i4 > zw0.v0.a()) ? 0 : iArr[i2 + 2] & 1048575;
            boolean z = this.f;
            Unsafe unsafe = o;
            switch (i4) {
                case 0:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.Y0(i5);
                        i3 += iY0;
                    }
                    break;
                case 1:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.c1(i5);
                        i3 += iY0;
                    }
                    break;
                case 2:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.g1(i5, de5.n(j, t));
                        i3 += iY0;
                    }
                    break;
                case 3:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.s1(i5, de5.n(j, t));
                        i3 += iY0;
                    }
                    break;
                case 4:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.e1(i5, de5.m(j, t));
                        i3 += iY0;
                    }
                    break;
                case 5:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.b1(i5);
                        i3 += iY0;
                    }
                    break;
                case 6:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.a1(i5);
                        i3 += iY0;
                    }
                    break;
                case 7:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.V0(i5);
                        i3 += iY0;
                    }
                    break;
                case 8:
                    if (l(i2, t)) {
                        Object objO = de5.o(j, t);
                        iW0 = objO instanceof lk ? CodedOutputStream.W0(i5, (lk) objO) : CodedOutputStream.n1(i5, (String) objO);
                        i3 += iW0;
                    }
                    break;
                case 9:
                    if (l(i2, t)) {
                        iY0 = n8V_.o(i5, i(i2), de5.o(j, t));
                        i3 += iY0;
                    }
                    break;
                case 10:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.W0(i5, (lk) de5.o(j, t));
                        i3 += iY0;
                    }
                    break;
                case 11:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.q1(i5, de5.m(j, t));
                        i3 += iY0;
                    }
                    break;
                case 12:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.Z0(i5, de5.m(j, t));
                        i3 += iY0;
                    }
                    break;
                case 13:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.j1(i5);
                        i3 += iY0;
                    }
                    break;
                case 14:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.k1(i5);
                        i3 += iY0;
                    }
                    break;
                case 15:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.l1(i5, de5.m(j, t));
                        i3 += iY0;
                    }
                    break;
                case 16:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.m1(i5, de5.n(j, t));
                        i3 += iY0;
                    }
                    break;
                case 17:
                    if (l(i2, t)) {
                        iY0 = CodedOutputStream.d1(i5, (DzVS) de5.o(j, t), i(i2));
                        i3 += iY0;
                    }
                    break;
                case 18:
                    iY0 = n8V_.h(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 19:
                    iY0 = n8V_.f(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 20:
                    iY0 = n8V_.m(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 21:
                    iY0 = n8V_.x(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 22:
                    iY0 = n8V_.k(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 23:
                    iY0 = n8V_.h(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 24:
                    iY0 = n8V_.f(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 25:
                    iY0 = n8V_.a(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 26:
                    iY0 = n8V_.u(o(j, t), i5);
                    i3 += iY0;
                    break;
                case 27:
                    iY0 = n8V_.p(i5, o(j, t), i(i2));
                    i3 += iY0;
                    break;
                case 28:
                    iY0 = n8V_.c(o(j, t), i5);
                    i3 += iY0;
                    break;
                case 29:
                    iY0 = n8V_.v(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 30:
                    iY0 = n8V_.d(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 31:
                    iY0 = n8V_.f(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 32:
                    iY0 = n8V_.h(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 33:
                    iY0 = n8V_.q(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 34:
                    iY0 = n8V_.s(i5, o(j, t));
                    i3 += iY0;
                    break;
                case 35:
                    i = n8V_.i((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 36:
                    i = n8V_.g((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 37:
                    i = n8V_.n((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 38:
                    i = n8V_.y((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 39:
                    i = n8V_.l((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 40:
                    i = n8V_.i((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 41:
                    i = n8V_.g((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 42:
                    i = n8V_.b((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 43:
                    i = n8V_.w((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 44:
                    i = n8V_.e((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 45:
                    i = n8V_.g((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 46:
                    i = n8V_.i((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 47:
                    i = n8V_.r((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 48:
                    i = n8V_.t((List) unsafe.getObject(t, j));
                    if (i > 0) {
                        if (z) {
                            unsafe.putInt(t, i6, i);
                        }
                        iP1 = CodedOutputStream.p1(i5);
                        iR1 = CodedOutputStream.r1(i);
                        i3 += iR1 + iP1 + i;
                    }
                    break;
                case 49:
                    iY0 = n8V_.j(i5, o(j, t), i(i2));
                    i3 += iY0;
                    break;
                case 50:
                    this.m.c(i5, de5.o(j, t), h(i2));
                    iY0 = 0;
                    i3 += iY0;
                    break;
                case 51:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.Y0(i5);
                        i3 += iY0;
                    }
                    break;
                case 52:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.c1(i5);
                        i3 += iY0;
                    }
                    break;
                case 53:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.g1(i5, r(j, t));
                        i3 += iY0;
                    }
                    break;
                case 54:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.s1(i5, r(j, t));
                        i3 += iY0;
                    }
                    break;
                case 55:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.e1(i5, q(j, t));
                        i3 += iY0;
                    }
                    break;
                case 56:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.b1(i5);
                        i3 += iY0;
                    }
                    break;
                case 57:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.a1(i5);
                        i3 += iY0;
                    }
                    break;
                case 58:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.V0(i5);
                        i3 += iY0;
                    }
                    break;
                case 59:
                    if (n(i5, i2, t)) {
                        Object objO2 = de5.o(j, t);
                        iW0 = objO2 instanceof lk ? CodedOutputStream.W0(i5, (lk) objO2) : CodedOutputStream.n1(i5, (String) objO2);
                        i3 += iW0;
                    }
                    break;
                case 60:
                    if (n(i5, i2, t)) {
                        iY0 = n8V_.o(i5, i(i2), de5.o(j, t));
                        i3 += iY0;
                    }
                    break;
                case 61:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.W0(i5, (lk) de5.o(j, t));
                        i3 += iY0;
                    }
                    break;
                case 62:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.q1(i5, q(j, t));
                        i3 += iY0;
                    }
                    break;
                case 63:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.Z0(i5, q(j, t));
                        i3 += iY0;
                    }
                    break;
                case 64:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.j1(i5);
                        i3 += iY0;
                    }
                    break;
                case 65:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.k1(i5);
                        i3 += iY0;
                    }
                    break;
                case 66:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.l1(i5, q(j, t));
                        i3 += iY0;
                    }
                    break;
                case 67:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.m1(i5, r(j, t));
                        i3 += iY0;
                    }
                    break;
                case 68:
                    if (n(i5, i2, t)) {
                        iY0 = CodedOutputStream.d1(i5, (DzVS) de5.o(j, t), i(i2));
                        i3 += iY0;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    public final boolean l(int i, Object obj) {
        boolean zEquals;
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & de5.m(j, obj)) != 0;
        }
        int iS = s(i);
        long j2 = iS & 1048575;
        switch ((iS & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(de5.k(j2, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(de5.l(j2, obj)) != 0;
            case 2:
                return de5.n(j2, obj) != 0;
            case 3:
                return de5.n(j2, obj) != 0;
            case 4:
                return de5.m(j2, obj) != 0;
            case 5:
                return de5.n(j2, obj) != 0;
            case 6:
                return de5.m(j2, obj) != 0;
            case 7:
                return de5.g(j2, obj);
            case 8:
                Object objO = de5.o(j2, obj);
                if (objO instanceof String) {
                    zEquals = ((String) objO).isEmpty();
                } else {
                    if (!(objO instanceof lk)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = lk.x.equals(objO);
                }
                break;
            case 9:
                return de5.o(j2, obj) != null;
            case 10:
                zEquals = lk.x.equals(de5.o(j2, obj));
                break;
            case 11:
                return de5.m(j2, obj) != 0;
            case 12:
                return de5.m(j2, obj) != 0;
            case 13:
                return de5.m(j2, obj) != 0;
            case 14:
                return de5.n(j2, obj) != 0;
            case 15:
                return de5.m(j2, obj) != 0;
            case 16:
                return de5.n(j2, obj) != 0;
            case 17:
                return de5.o(j2, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    public final boolean n(int i, int i2, Object obj) {
        return de5.m((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final int s(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void t(Object obj, YKK ykk) {
        Iterator itQ;
        Map.Entry<?, ?> entry;
        int i;
        int i2;
        boolean z = this.d;
        y<?> yVar = this.l;
        if (z) {
            Xn1<T> xn1B = yVar.b(obj);
            if (xn1B.m()) {
                itQ = null;
                entry = null;
            } else {
                itQ = xn1B.q();
                entry = (Map.Entry) itQ.next();
            }
        } else {
            itQ = null;
            entry = null;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iS = s(i3);
            int i6 = iArr[i3];
            int i7 = (iS & 267386880) >>> 20;
            Unsafe unsafe = o;
            if (i7 <= 17) {
                int i8 = iArr[i3 + 2];
                Map.Entry<?, ?> entry2 = entry;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
                entry = entry2;
            } else {
                i = 0;
            }
            while (true) {
                i2 = length;
                if (entry != null && yVar.a(entry) <= i6) {
                    yVar.e(ykk, entry);
                    entry = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
                    length = i2;
                }
            }
            long j = iS & 1048575;
            switch (i7) {
                case 0:
                    if ((i5 & i) != 0) {
                        ykk.c(de5.k(j, obj), i6);
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        ykk.i(de5.l(j, obj), i6);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        ykk.l(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        ykk.u(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        ykk.k(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        ykk.g(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        ykk.e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        ykk.a(i6, de5.g(j, obj));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        v(i6, unsafe.getObject(obj, j), ykk);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        ykk.n(i6, i(i3), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        ykk.b(i6, (lk) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        ykk.t(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        ykk.d(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        ykk.p(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        ykk.q(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        ykk.r(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        ykk.s(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        ykk.j(i6, i(i3), unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i2;
                    break;
                case 18:
                    n8V_.E(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 19:
                    n8V_.I(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 20:
                    n8V_.L(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 21:
                    n8V_.T(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 22:
                    n8V_.K(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 23:
                    n8V_.H(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 24:
                    n8V_.G(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 25:
                    n8V_.C(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 26:
                    n8V_.R(iArr[i3], (List) unsafe.getObject(obj, j), ykk);
                    break;
                case 27:
                    n8V_.M(iArr[i3], (List) unsafe.getObject(obj, j), ykk, i(i3));
                    break;
                case 28:
                    n8V_.D(iArr[i3], (List) unsafe.getObject(obj, j), ykk);
                    break;
                case 29:
                    n8V_.S(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 30:
                    n8V_.F(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 31:
                    n8V_.N(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 32:
                    n8V_.O(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 33:
                    n8V_.P(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 34:
                    n8V_.Q(iArr[i3], (List) unsafe.getObject(obj, j), ykk, false);
                    continue;
                    i3 += 3;
                    length = i2;
                    break;
                case 35:
                    n8V_.E(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 36:
                    n8V_.I(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 37:
                    n8V_.L(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 38:
                    n8V_.T(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 39:
                    n8V_.K(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 40:
                    n8V_.H(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 41:
                    n8V_.G(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 42:
                    n8V_.C(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 43:
                    n8V_.S(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 44:
                    n8V_.F(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 45:
                    n8V_.N(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 46:
                    n8V_.O(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 47:
                    n8V_.P(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 48:
                    n8V_.Q(iArr[i3], (List) unsafe.getObject(obj, j), ykk, true);
                    break;
                case 49:
                    n8V_.J(iArr[i3], (List) unsafe.getObject(obj, j), ykk, i(i3));
                    break;
                case 50:
                    u(ykk, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (n(i6, i3, obj)) {
                        ykk.c(((Double) de5.o(j, obj)).doubleValue(), i6);
                    }
                    break;
                case 52:
                    if (n(i6, i3, obj)) {
                        ykk.i(((Float) de5.o(j, obj)).floatValue(), i6);
                    }
                    break;
                case 53:
                    if (n(i6, i3, obj)) {
                        ykk.l(i6, r(j, obj));
                    }
                    break;
                case 54:
                    if (n(i6, i3, obj)) {
                        ykk.u(i6, r(j, obj));
                    }
                    break;
                case 55:
                    if (n(i6, i3, obj)) {
                        ykk.k(i6, q(j, obj));
                    }
                    break;
                case 56:
                    if (n(i6, i3, obj)) {
                        ykk.g(i6, r(j, obj));
                    }
                    break;
                case 57:
                    if (n(i6, i3, obj)) {
                        ykk.e(i6, q(j, obj));
                    }
                    break;
                case 58:
                    if (n(i6, i3, obj)) {
                        ykk.a(i6, ((Boolean) de5.o(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (n(i6, i3, obj)) {
                        v(i6, unsafe.getObject(obj, j), ykk);
                    }
                    break;
                case 60:
                    if (n(i6, i3, obj)) {
                        ykk.n(i6, i(i3), unsafe.getObject(obj, j));
                    }
                    break;
                case 61:
                    if (n(i6, i3, obj)) {
                        ykk.b(i6, (lk) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (n(i6, i3, obj)) {
                        ykk.t(i6, q(j, obj));
                    }
                    break;
                case 63:
                    if (n(i6, i3, obj)) {
                        ykk.d(i6, q(j, obj));
                    }
                    break;
                case 64:
                    if (n(i6, i3, obj)) {
                        ykk.p(i6, q(j, obj));
                    }
                    break;
                case 65:
                    if (n(i6, i3, obj)) {
                        ykk.q(i6, r(j, obj));
                    }
                    break;
                case 66:
                    if (n(i6, i3, obj)) {
                        ykk.r(i6, q(j, obj));
                    }
                    break;
                case 67:
                    if (n(i6, i3, obj)) {
                        ykk.s(i6, r(j, obj));
                    }
                    break;
                case 68:
                    if (n(i6, i3, obj)) {
                        ykk.j(i6, i(i3), unsafe.getObject(obj, j));
                    }
                    break;
            }
            i3 += 3;
            length = i2;
        }
        while (entry != null) {
            yVar.e(ykk, entry);
            entry = itQ.hasNext() ? (Map.Entry) itQ.next() : null;
        }
        lpT2Fixed<?, ?> lpt2 = this.k;
        lpt2.f(lpt2.a(obj), ykk);
    }

    public final void u(YKK ykk, int i, Object obj, int i2) {
        if (obj != null) {
            Object objH = h(i2);
            j92 j92Var = this.m;
            j92Var.b(objH);
            Map<?, ?> mapD = j92Var.d(obj);
            CodedOutputStream codedOutputStream = ykk.a;
            codedOutputStream.getClass();
            Iterator<Map.Entry<?, ?>> it = mapD.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                codedOutputStream.N1(i, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }
}
