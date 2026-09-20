package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends cm5 {
    public final ArrayList<cm5> k;
    public int l;

    public zn(e70 e70Var, int i) {
        e70 e70Var2;
        super(e70Var);
        this.k = new ArrayList<>();
        this.f = i;
        e70 e70Var3 = this.b;
        e70 e70VarI = e70Var3.i(i);
        while (true) {
            e70 e70Var4 = e70VarI;
            e70Var2 = e70Var3;
            e70Var3 = e70Var4;
            if (e70Var3 == null) {
                break;
            } else {
                e70VarI = e70Var3.i(this.f);
            }
        }
        this.b = e70Var2;
        int i2 = this.f;
        cm5 cm5Var = i2 == 0 ? e70Var2.d : i2 == 1 ? e70Var2.e : null;
        ArrayList<cm5> arrayList = this.k;
        arrayList.add(cm5Var);
        e70 e70VarH = e70Var2.h(this.f);
        while (e70VarH != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? e70VarH.d : i3 == 1 ? e70VarH.e : null);
            e70VarH = e70VarH.h(this.f);
        }
        for (cm5 cm5Var2 : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                cm5Var2.b.b = this;
            } else if (i4 == 1) {
                cm5Var2.b.c = this;
            }
        }
        if ((this.f == 0 && ((f70) this.b.K).i0) && arrayList.size() > 1) {
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.Z : this.b.a0;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01b9 A[PHI: r2 r25
  0x01b9: PHI (r2v74 int) = (r2v70 int), (r2v79 int) binds: [B:120:0x01b7, B:111:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x01b9: PHI (r25v3 float) = (r25v2 float), (r25v5 float) binds: [B:120:0x01b7, B:111:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:304:0x00e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df A[ADDED_TO_REGION] */
    @Override // defpackage.cm5, defpackage.lj0
    public final void a(lj0 lj0Var) {
        int i;
        int i2;
        ArrayList<cm5> arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        boolean z;
        ArrayList<cm5> arrayList2;
        int i8;
        int i9;
        int i10;
        float f2;
        int iMax;
        int i11;
        int i12;
        float f3;
        qj0 qj0Var = this.h;
        if (qj0Var.j) {
            qj0 qj0Var2 = this.i;
            if (qj0Var2.j) {
                e70 e70Var = this.b.K;
                boolean z2 = (e70Var == null || !(e70Var instanceof f70)) ? false : ((f70) e70Var).i0;
                int i13 = qj0Var2.g - qj0Var.g;
                ArrayList<cm5> arrayList3 = this.k;
                int size = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (arrayList3.get(i14).b.X != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (arrayList3.get(i16).b.X != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        arrayList = arrayList3;
                        i3 = i14;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        f = 0.0f;
                        break;
                    }
                    i6 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    f = 0.0f;
                    while (i18 < size) {
                        cm5 cm5Var = arrayList3.get(i18);
                        e70 e70Var2 = cm5Var.b;
                        ArrayList<cm5> arrayList4 = arrayList3;
                        if (e70Var2.X == i2) {
                            i11 = i14;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i6 += cm5Var.h.f;
                            }
                            zk0 zk0Var = cm5Var.e;
                            int i21 = zk0Var.g;
                            i11 = i14;
                            boolean z3 = cm5Var.d != 3;
                            if (z3) {
                                int i22 = this.f;
                                if (i22 == 0 && !e70Var2.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !e70Var2.e.e.j) {
                                    return;
                                }
                            } else {
                                if (cm5Var.a == 1 && i17 == 0) {
                                    i12 = zk0Var.m;
                                    i19++;
                                } else {
                                    if (zk0Var.j) {
                                        i12 = i21;
                                    }
                                    if (z3) {
                                        i6 += i12;
                                    } else {
                                        i19++;
                                        f3 = e70Var2.b0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i6 += -cm5Var.i.f;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i19++;
                                    f3 = e70Var2.b0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i6 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z3) {
                                i19++;
                                f3 = e70Var2.b0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i6 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        arrayList3 = arrayList4;
                        i14 = i11;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i14;
                    if (i6 < i13 || i19 == 0) {
                        i4 = i19;
                        i5 = i20;
                        break;
                    } else {
                        i17++;
                        arrayList3 = arrayList;
                        i14 = i3;
                        i2 = 8;
                    }
                }
                int i23 = qj0Var.g;
                if (z2) {
                    i23 = qj0Var2.g;
                }
                if (i6 > i13) {
                    int i24 = (int) (((i6 - i13) / 2.0f) + 0.5f);
                    i23 = z2 ? i23 + i24 : i23 - i24;
                }
                if (i4 > 0) {
                    float f4 = i13 - i6;
                    int i25 = (int) ((f4 / i4) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        ArrayList<cm5> arrayList5 = arrayList;
                        cm5 cm5Var2 = arrayList5.get(i26);
                        int i28 = i25;
                        e70 e70Var3 = cm5Var2.b;
                        int i29 = i6;
                        int i30 = i23;
                        if (e70Var3.X != 8 && cm5Var2.d == 3) {
                            zk0 zk0Var2 = cm5Var2.e;
                            if (zk0Var2.j) {
                                z2 = z2;
                                f2 = f4;
                            } else {
                                int i31 = f > 0.0f ? (int) (((e70Var3.b0[this.f] * f4) / f) + 0.5f) : i28;
                                if (this.f == 0) {
                                    int i32 = e70Var3.n;
                                    f2 = f4;
                                    iMax = Math.max(e70Var3.m, cm5Var2.a == 1 ? Math.min(i31, zk0Var2.m) : i31);
                                    if (i32 > 0) {
                                        iMax = Math.min(i32, iMax);
                                    }
                                    if (iMax != i31) {
                                        i27++;
                                        i31 = iMax;
                                    }
                                } else {
                                    f2 = f4;
                                    int i33 = e70Var3.q;
                                    iMax = Math.max(e70Var3.p, cm5Var2.a == 1 ? Math.min(i31, zk0Var2.m) : i31);
                                    if (i33 > 0) {
                                        iMax = Math.min(i33, iMax);
                                    }
                                    if (iMax != i31) {
                                        i27++;
                                        i31 = iMax;
                                    }
                                }
                                zk0Var2.d(i31);
                            }
                        } else {
                            z2 = z2;
                            f2 = f4;
                        }
                        i26++;
                        i25 = i28;
                        i6 = i29;
                        i23 = i30;
                        z2 = z2;
                        f4 = f2;
                        arrayList = arrayList5;
                    }
                    i7 = i23;
                    z = z2;
                    arrayList2 = arrayList;
                    int i34 = i6;
                    if (i27 > 0) {
                        i4 -= i27;
                        int i35 = 0;
                        int i36 = 0;
                        while (i35 < size) {
                            cm5 cm5Var3 = arrayList2.get(i35);
                            if (cm5Var3.b.X == 8) {
                                i10 = i3;
                            } else {
                                i10 = i3;
                                if (i35 > 0 && i35 >= i10) {
                                    i36 += cm5Var3.h.f;
                                }
                                i36 += cm5Var3.e.g;
                                if (i35 < i15 && i35 < i) {
                                    i36 += -cm5Var3.i.f;
                                }
                            }
                            i35++;
                            i3 = i10;
                        }
                        i8 = i3;
                        i6 = i36;
                    } else {
                        i8 = i3;
                        i6 = i34;
                    }
                    i9 = 2;
                    if (this.l == 2 && i27 == 0) {
                        this.l = 0;
                    }
                } else {
                    i7 = i23;
                    z = z2;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                }
                if (i6 > i13) {
                    this.l = i9;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.l = i9;
                }
                int i37 = this.l;
                if (i37 == 1) {
                    int i38 = i5 > 1 ? (i13 - i6) / (i5 - 1) : i5 == 1 ? (i13 - i6) / 2 : 0;
                    if (i4 > 0) {
                        i38 = 0;
                    }
                    int i39 = i7;
                    for (int i40 = 0; i40 < size; i40++) {
                        cm5 cm5Var4 = arrayList2.get(z ? size - (i40 + 1) : i40);
                        int i41 = cm5Var4.b.X;
                        qj0 qj0Var3 = cm5Var4.i;
                        qj0 qj0Var4 = cm5Var4.h;
                        if (i41 == 8) {
                            qj0Var4.d(i39);
                            qj0Var3.d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i8) {
                                i39 = z ? i39 - qj0Var4.f : i39 + qj0Var4.f;
                            }
                            if (z) {
                                qj0Var3.d(i39);
                            } else {
                                qj0Var4.d(i39);
                            }
                            zk0 zk0Var3 = cm5Var4.e;
                            int i42 = zk0Var3.g;
                            if (cm5Var4.d == 3 && cm5Var4.a == 1) {
                                i42 = zk0Var3.m;
                            }
                            i39 = z ? i39 - i42 : i39 + i42;
                            if (z) {
                                qj0Var4.d(i39);
                            } else {
                                qj0Var3.d(i39);
                            }
                            cm5Var4.g = true;
                            if (i40 < i15 && i40 < i) {
                                i39 = z ? i39 - (-qj0Var3.f) : i39 + (-qj0Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i43 = (i13 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i43 = 0;
                    }
                    int i44 = i7;
                    for (int i45 = 0; i45 < size; i45++) {
                        cm5 cm5Var5 = arrayList2.get(z ? size - (i45 + 1) : i45);
                        int i46 = cm5Var5.b.X;
                        qj0 qj0Var5 = cm5Var5.i;
                        qj0 qj0Var6 = cm5Var5.h;
                        if (i46 == 8) {
                            qj0Var6.d(i44);
                            qj0Var5.d(i44);
                        } else {
                            int i47 = z ? i44 - i43 : i44 + i43;
                            if (i45 > 0 && i45 >= i8) {
                                i47 = z ? i47 - qj0Var6.f : i47 + qj0Var6.f;
                            }
                            if (z) {
                                qj0Var5.d(i47);
                            } else {
                                qj0Var6.d(i47);
                            }
                            zk0 zk0Var4 = cm5Var5.e;
                            int iMin = zk0Var4.g;
                            if (cm5Var5.d == 3 && cm5Var5.a == 1) {
                                iMin = Math.min(iMin, zk0Var4.m);
                            }
                            i44 = z ? i47 - iMin : i47 + iMin;
                            if (z) {
                                qj0Var6.d(i44);
                            } else {
                                qj0Var5.d(i44);
                            }
                            if (i45 < i15 && i45 < i) {
                                i44 = z ? i44 - (-qj0Var5.f) : i44 + (-qj0Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f5 = this.f == 0 ? this.b.U : this.b.V;
                    if (z) {
                        f5 = 1.0f - f5;
                    }
                    int i48 = (int) (((i13 - i6) * f5) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = 0;
                    }
                    int i49 = z ? i7 - i48 : i7 + i48;
                    for (int i50 = 0; i50 < size; i50++) {
                        cm5 cm5Var6 = arrayList2.get(z ? size - (i50 + 1) : i50);
                        int i51 = cm5Var6.b.X;
                        qj0 qj0Var7 = cm5Var6.i;
                        qj0 qj0Var8 = cm5Var6.h;
                        if (i51 == 8) {
                            qj0Var8.d(i49);
                            qj0Var7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z ? i49 - qj0Var8.f : i49 + qj0Var8.f;
                            }
                            if (z) {
                                qj0Var7.d(i49);
                            } else {
                                qj0Var8.d(i49);
                            }
                            zk0 zk0Var5 = cm5Var6.e;
                            int i52 = zk0Var5.g;
                            if (cm5Var6.d == 3 && cm5Var6.a == 1) {
                                i52 = zk0Var5.m;
                            }
                            i49 = z ? i49 - i52 : i49 + i52;
                            if (z) {
                                qj0Var8.d(i49);
                            } else {
                                qj0Var7.d(i49);
                            }
                            if (i50 < i15 && i50 < i) {
                                i49 = z ? i49 - (-qj0Var7.f) : i49 + (-qj0Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.cm5
    public final void d() {
        ArrayList<cm5> arrayList = this.k;
        Iterator<cm5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        e70 e70Var = arrayList.get(0).b;
        e70 e70Var2 = arrayList.get(size - 1).b;
        int i = this.f;
        qj0 qj0Var = this.i;
        qj0 qj0Var2 = this.h;
        if (i == 0) {
            w60 w60Var = e70Var.y;
            w60 w60Var2 = e70Var2.A;
            qj0 qj0VarI = cm5.i(w60Var, 0);
            int iB = w60Var.b();
            e70 e70VarM = m();
            if (e70VarM != null) {
                iB = e70VarM.y.b();
            }
            if (qj0VarI != null) {
                cm5.b(qj0Var2, qj0VarI, iB);
            }
            qj0 qj0VarI2 = cm5.i(w60Var2, 0);
            int iB2 = w60Var2.b();
            e70 e70VarN = n();
            if (e70VarN != null) {
                iB2 = e70VarN.A.b();
            }
            if (qj0VarI2 != null) {
                cm5.b(qj0Var, qj0VarI2, -iB2);
            }
        } else {
            w60 w60Var3 = e70Var.z;
            w60 w60Var4 = e70Var2.B;
            qj0 qj0VarI3 = cm5.i(w60Var3, 1);
            int iB3 = w60Var3.b();
            e70 e70VarM2 = m();
            if (e70VarM2 != null) {
                iB3 = e70VarM2.z.b();
            }
            if (qj0VarI3 != null) {
                cm5.b(qj0Var2, qj0VarI3, iB3);
            }
            qj0 qj0VarI4 = cm5.i(w60Var4, 1);
            int iB4 = w60Var4.b();
            e70 e70VarN2 = n();
            if (e70VarN2 != null) {
                iB4 = e70VarN2.B.b();
            }
            if (qj0VarI4 != null) {
                cm5.b(qj0Var, qj0VarI4, -iB4);
            }
        }
        qj0Var2.a = this;
        qj0Var.a = this;
    }

    @Override // defpackage.cm5
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<cm5> arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // defpackage.cm5
    public final void f() {
        this.c = null;
        Iterator<cm5> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // defpackage.cm5
    public final long j() {
        ArrayList<cm5> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            cm5 cm5Var = arrayList.get(i);
            j = ((long) cm5Var.i.f) + cm5Var.j() + j + ((long) cm5Var.h.f);
        }
        return j;
    }

    @Override // defpackage.cm5
    public final boolean k() {
        ArrayList<cm5> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final e70 m() {
        int i = 0;
        while (true) {
            ArrayList<cm5> arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            e70 e70Var = arrayList.get(i).b;
            if (e70Var.X != 8) {
                return e70Var;
            }
            i++;
        }
    }

    public final e70 n() {
        ArrayList<cm5> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e70 e70Var = arrayList.get(size).b;
            if (e70Var.X != 8) {
                return e70Var;
            }
        }
        return null;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f == 0 ? "horizontal : " : "vertical : ");
        for (cm5 cm5Var : this.k) {
            strConcat = rz.a(rz.a(strConcat, "<") + cm5Var, "> ");
        }
        return strConcat;
    }
}
