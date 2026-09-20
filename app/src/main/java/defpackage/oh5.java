package defpackage;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oh5 {
    public final v83[] a;
    public int b;
    public final boolean c;

    public oh5() {
        v83[] v83VarArr = new v83[20];
        for (int i = 0; i < 20; i++) {
            v83VarArr[i] = null;
        }
        this.a = v83VarArr;
        this.c = true;
    }

    public final long a() {
        long j;
        ArrayList arrayList;
        int i;
        nh5 nh5Var;
        v83 v83Var;
        int i2 = 1;
        boolean z = this.c;
        v83[] v83VarArr = this.a;
        int i3 = 20;
        if (!z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i4 = this.b;
            v83 v83Var2 = v83VarArr[i4];
            if (v83Var2 == null) {
                nh5Var = nh5.e;
            } else {
                v83 v83Var3 = v83Var2;
                int i5 = 0;
                while (true) {
                    v83 v83Var4 = v83VarArr[i4];
                    j = v83Var2.b;
                    if (v83Var4 == null) {
                        arrayList = arrayList2;
                    } else {
                        long j2 = v83Var4.b;
                        float f = j - j2;
                        ArrayList arrayList5 = arrayList2;
                        float fAbs = Math.abs(j2 - v83Var3.b);
                        if (f > 100.0f || fAbs > 40.0f) {
                            arrayList = arrayList5;
                        } else {
                            long j3 = v83Var4.a;
                            arrayList = arrayList5;
                            arrayList.add(Float.valueOf(kt2.c(j3)));
                            arrayList3.add(Float.valueOf(kt2.d(j3)));
                            arrayList4.add(Float.valueOf(-f));
                            i4 = (i4 == 0 ? 20 : i4) - 1;
                            i = i5 + 1;
                            if (i >= 20) {
                                v83Var3 = v83Var4;
                                break;
                            }
                            i5 = i;
                            v83Var3 = v83Var4;
                            arrayList2 = arrayList;
                        }
                    }
                    i = i5;
                    break;
                }
                long j4 = v83Var2.a;
                long j5 = v83Var3.b;
                long j6 = v83Var3.a;
                if (i >= 3) {
                    try {
                        u93 u93VarZ = Cz.z(arrayList4, arrayList);
                        u93 u93VarZ2 = Cz.z(arrayList4, arrayList3);
                        float fFloatValue = u93VarZ.a.get(1).floatValue();
                        float fFloatValue2 = u93VarZ2.a.get(1).floatValue();
                        float f2 = AdError.NETWORK_ERROR_CODE;
                        nh5Var = new nh5(X.a(fFloatValue * f2, fFloatValue2 * f2), u93VarZ.b * u93VarZ2.b, j - j5, kt2.f(j4, j6));
                    } catch (IllegalArgumentException unused) {
                        nh5Var = nh5.e;
                    }
                } else {
                    nh5Var = new nh5(kt2.b, 1.0f, j - j5, kt2.f(j4, j6));
                }
            }
            long j7 = nh5Var.a;
            return XTd3.c(kt2.c(j7), kt2.d(j7));
        }
        int i6 = this.b;
        v83 v83Var5 = v83VarArr[i6];
        if (v83Var5 == null) {
            return XTd3.c(0.0f, 0.0f);
        }
        long j8 = Long.MAX_VALUE;
        v83 v83Var6 = v83Var5;
        long j9 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        int i7 = 0;
        float f3 = Float.NaN;
        float fAbs2 = 0.0f;
        boolean z2 = true;
        float f4 = Float.NaN;
        float fAbs3 = 0.0f;
        boolean z3 = true;
        while (true) {
            int i8 = (i6 + i2) % i3;
            v83 v83Var7 = v83VarArr[i8];
            if (v83Var7 == null) {
                v83Var = v83Var5;
            } else {
                long j11 = v83Var5.b;
                v83Var = v83Var5;
                long j12 = v83Var7.b;
                long j13 = j11 - j12;
                long jAbs = Math.abs(j12 - v83Var6.b);
                if (j13 <= 100) {
                    if (jAbs > 40) {
                        j9 = j8;
                        j10 = j9;
                        f3 = Float.NaN;
                        fAbs2 = 0.0f;
                        z2 = true;
                        f4 = Float.NaN;
                        fAbs3 = 0.0f;
                        z3 = true;
                    }
                    long j14 = -j13;
                    long j15 = v83Var7.a;
                    float fC = kt2.c(j15);
                    if (j9 == j8 || Float.isNaN(f3)) {
                        j9 = j14;
                    } else if (j14 != j9) {
                        float f5 = (fC - f3) / ((j14 - j9) * 0.001f);
                        fAbs2 = (Math.abs(f5) * (f5 - Cz.e(fAbs2))) + fAbs2;
                        if (z2) {
                            fAbs2 *= 0.5f;
                            z2 = false;
                        }
                        j9 = j14;
                    }
                    float fD = kt2.d(j15);
                    if (j10 == j8 || Float.isNaN(f4)) {
                        j10 = j14;
                    } else if (j14 != j10) {
                        float f6 = (fD - f4) / ((j14 - j10) * 0.001f);
                        fAbs3 = (Math.abs(f6) * (f6 - Cz.e(fAbs3))) + fAbs3;
                        if (z3) {
                            fAbs3 *= 0.5f;
                            z3 = false;
                        }
                        j10 = j14;
                    }
                    i7++;
                    f3 = fC;
                    f4 = fD;
                }
                v83Var6 = v83Var;
            }
            i6 = i8;
            if (i6 == this.b || i7 >= 20) {
                break;
            }
            v83Var5 = v83Var;
            i2 = 1;
            i3 = 20;
            j8 = Long.MAX_VALUE;
        }
        return i7 < 3 ? XTd3.c(0.0f, 0.0f) : XTd3.c(Cz.e(fAbs2), Cz.e(fAbs3));
    }
}
