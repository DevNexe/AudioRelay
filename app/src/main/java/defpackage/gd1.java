package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gd1 extends cm5 {
    public static final int[] k = new int[2];

    public gd1(e70 e70Var) {
        super(e70Var);
        this.h.e = 4;
        this.i.e = 5;
        this.f = 0;
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0264  */
    /* JADX WARN: Code duplicated, block: B:120:0x0273  */
    @Override // defpackage.cm5, defpackage.lj0
    public final void a(lj0 lj0Var) {
        int iG;
        int i;
        int iG2;
        float f;
        float f2;
        float f3;
        int i2;
        if (O.h(this.j) == 3) {
            e70 e70Var = this.b;
            l(e70Var.y, e70Var.A, 0);
            return;
        }
        zk0 zk0Var = this.e;
        boolean z = zk0Var.j;
        qj0 qj0Var = this.h;
        qj0 qj0Var2 = this.i;
        if (!z && this.d == 3) {
            e70 e70Var2 = this.b;
            int i3 = e70Var2.j;
            if (i3 == 2) {
                e70 e70Var3 = e70Var2.K;
                if (e70Var3 != null) {
                    zk0 zk0Var2 = e70Var3.d.e;
                    if (zk0Var2.j) {
                        zk0Var.d((int) ((zk0Var2.g * e70Var2.o) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = e70Var2.k;
                wh5 wh5Var = e70Var2.e;
                if (i4 == 0 || i4 == 3) {
                    qj0 qj0Var3 = wh5Var.h;
                    qj0 qj0Var4 = wh5Var.i;
                    boolean z2 = e70Var2.y.d != null;
                    boolean z3 = e70Var2.z.d != null;
                    boolean z4 = e70Var2.A.d != null;
                    boolean z5 = e70Var2.B.d != null;
                    int i5 = e70Var2.O;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = e70Var2.N;
                        boolean z6 = qj0Var3.j;
                        int[] iArr = k;
                        if (z6 && qj0Var4.j) {
                            if (qj0Var.c && qj0Var2.c) {
                                m(iArr, ((qj0) qj0Var.l.get(0)).g + qj0Var.f, ((qj0) qj0Var2.l.get(0)).g - qj0Var2.f, qj0Var3.g + qj0Var3.f, qj0Var4.g - qj0Var4.f, f4, i5);
                                zk0Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = qj0Var.j;
                        ArrayList arrayList = qj0Var3.l;
                        if (z7 && qj0Var2.j) {
                            if (!qj0Var3.c || !qj0Var4.c) {
                                return;
                            }
                            m(iArr, qj0Var.g + qj0Var.f, qj0Var2.g - qj0Var2.f, ((qj0) arrayList.get(0)).g + qj0Var3.f, ((qj0) qj0Var4.l.get(0)).g - qj0Var4.f, f4, i5);
                            zk0Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!qj0Var.c || !qj0Var2.c || !qj0Var3.c || !qj0Var4.c) {
                            return;
                        }
                        m(iArr, ((qj0) qj0Var.l.get(0)).g + qj0Var.f, ((qj0) qj0Var2.l.get(0)).g - qj0Var2.f, ((qj0) arrayList.get(0)).g + qj0Var3.f, ((qj0) qj0Var4.l.get(0)).g - qj0Var4.f, f4, i5);
                        zk0Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!qj0Var.c || !qj0Var2.c) {
                            return;
                        }
                        float f5 = e70Var2.N;
                        int i6 = ((qj0) qj0Var.l.get(0)).g + qj0Var.f;
                        int i7 = ((qj0) qj0Var2.l.get(0)).g - qj0Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f5) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f5) + 0.5f);
                            }
                            zk0Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f5) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f5) + 0.5f);
                            }
                            zk0Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!qj0Var3.c || !qj0Var4.c) {
                            return;
                        }
                        float f6 = e70Var2.N;
                        int i10 = ((qj0) qj0Var3.l.get(0)).g + qj0Var3.f;
                        int i11 = ((qj0) qj0Var4.l.get(0)).g - qj0Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f6) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f6) + 0.5f);
                            }
                            zk0Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f6) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f6) + 0.5f);
                            }
                            zk0Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f6) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f6) + 0.5f);
                            }
                            zk0Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = e70Var2.O;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f3 = wh5Var.e.g / e70Var2.N;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f = wh5Var.e.g;
                            f2 = e70Var2.N;
                        }
                        zk0Var.d(i2);
                    } else {
                        f = wh5Var.e.g;
                        f2 = e70Var2.N;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    zk0Var.d(i2);
                }
            }
        }
        if (qj0Var.c && qj0Var2.c) {
            if (qj0Var.j && qj0Var2.j && zk0Var.j) {
                return;
            }
            boolean z8 = zk0Var.j;
            ArrayList arrayList2 = qj0Var.l;
            ArrayList arrayList3 = qj0Var2.l;
            if (!z8 && this.d == 3) {
                e70 e70Var4 = this.b;
                if (e70Var4.j == 0 && !e70Var4.o()) {
                    qj0 qj0Var5 = (qj0) arrayList2.get(0);
                    qj0 qj0Var6 = (qj0) arrayList3.get(0);
                    int i14 = qj0Var5.g + qj0Var.f;
                    int i15 = qj0Var6.g + qj0Var2.f;
                    qj0Var.d(i14);
                    qj0Var2.d(i15);
                    zk0Var.d(i15 - i14);
                    return;
                }
            }
            if (!zk0Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                int iMin = Math.min((((qj0) arrayList3.get(0)).g + qj0Var2.f) - (((qj0) arrayList2.get(0)).g + qj0Var.f), zk0Var.m);
                e70 e70Var5 = this.b;
                int i16 = e70Var5.n;
                int iMax = Math.max(e70Var5.m, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                zk0Var.d(iMax);
            }
            if (zk0Var.j) {
                qj0 qj0Var7 = (qj0) arrayList2.get(0);
                qj0 qj0Var8 = (qj0) arrayList3.get(0);
                int i17 = qj0Var7.g;
                int i18 = qj0Var.f + i17;
                int i19 = qj0Var8.g;
                int i20 = qj0Var2.f + i19;
                float f7 = this.b.U;
                if (qj0Var7 == qj0Var8) {
                    f7 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                qj0Var.d((int) ((((i19 - i17) - zk0Var.g) * f7) + i17 + 0.5f));
                qj0Var2.d(qj0Var.g + zk0Var.g);
            }
        }
    }

    @Override // defpackage.cm5
    public final void d() {
        e70 e70Var;
        e70 e70Var2;
        e70 e70Var3;
        e70 e70Var4;
        e70 e70Var5 = this.b;
        boolean z = e70Var5.a;
        zk0 zk0Var = this.e;
        if (z) {
            zk0Var.d(e70Var5.j());
        }
        boolean z2 = zk0Var.j;
        qj0 qj0Var = this.i;
        qj0 qj0Var2 = this.h;
        if (!z2) {
            e70 e70Var6 = this.b;
            int i = e70Var6.J[0];
            this.d = i;
            if (i != 3) {
                if (i == 4 && (((e70Var4 = e70Var6.K) != null && e70Var4.J[0] == 1) || e70Var4.J[0] == 4)) {
                    int iJ = (e70Var4.j() - this.b.y.b()) - this.b.A.b();
                    gd1 gd1Var = e70Var4.d;
                    cm5.b(qj0Var2, gd1Var.h, this.b.y.b());
                    cm5.b(qj0Var, gd1Var.i, -this.b.A.b());
                    zk0Var.d(iJ);
                    return;
                }
                if (i == 1) {
                    zk0Var.d(e70Var6.j());
                }
            }
        } else if (this.d == 4 && (((e70Var2 = (e70Var = this.b).K) != null && e70Var2.J[0] == 1) || e70Var2.J[0] == 4)) {
            cm5.b(qj0Var2, e70Var2.d.h, e70Var.y.b());
            cm5.b(qj0Var, e70Var2.d.i, -this.b.A.b());
            return;
        }
        if (zk0Var.j) {
            e70 e70Var7 = this.b;
            if (e70Var7.a) {
                w60[] w60VarArr = e70Var7.G;
                w60 w60Var = w60VarArr[0];
                w60 w60Var2 = w60Var.d;
                if (w60Var2 != null && w60VarArr[1].d != null) {
                    if (e70Var7.o()) {
                        qj0Var2.f = this.b.G[0].b();
                        qj0Var.f = -this.b.G[1].b();
                        return;
                    }
                    qj0 qj0VarH = cm5.h(this.b.G[0]);
                    if (qj0VarH != null) {
                        cm5.b(qj0Var2, qj0VarH, this.b.G[0].b());
                    }
                    qj0 qj0VarH2 = cm5.h(this.b.G[1]);
                    if (qj0VarH2 != null) {
                        cm5.b(qj0Var, qj0VarH2, -this.b.G[1].b());
                    }
                    qj0Var2.b = true;
                    qj0Var.b = true;
                    return;
                }
                if (w60Var2 != null) {
                    qj0 qj0VarH3 = cm5.h(w60Var);
                    if (qj0VarH3 != null) {
                        cm5.b(qj0Var2, qj0VarH3, this.b.G[0].b());
                        cm5.b(qj0Var, qj0Var2, zk0Var.g);
                        return;
                    }
                    return;
                }
                w60 w60Var3 = w60VarArr[1];
                if (w60Var3.d != null) {
                    qj0 qj0VarH4 = cm5.h(w60Var3);
                    if (qj0VarH4 != null) {
                        cm5.b(qj0Var, qj0VarH4, -this.b.G[1].b());
                        cm5.b(qj0Var2, qj0Var, -zk0Var.g);
                        return;
                    }
                    return;
                }
                if ((e70Var7 instanceof wc1) || e70Var7.K == null || e70Var7.e(w60.QnHx.CENTER).d != null) {
                    return;
                }
                e70 e70Var8 = this.b;
                cm5.b(qj0Var2, e70Var8.K.d.h, e70Var8.k());
                cm5.b(qj0Var, qj0Var2, zk0Var.g);
                return;
            }
        }
        if (this.d == 3) {
            e70 e70Var9 = this.b;
            int i2 = e70Var9.j;
            ArrayList arrayList = zk0Var.k;
            ArrayList arrayList2 = zk0Var.l;
            if (i2 == 2) {
                e70 e70Var10 = e70Var9.K;
                if (e70Var10 != null) {
                    zk0 zk0Var2 = e70Var10.e.e;
                    arrayList2.add(zk0Var2);
                    zk0Var2.k.add(zk0Var);
                    zk0Var.b = true;
                    arrayList.add(qj0Var2);
                    arrayList.add(qj0Var);
                }
            } else if (i2 == 3) {
                int i3 = e70Var9.k;
                wh5 wh5Var = e70Var9.e;
                if (i3 == 3) {
                    qj0Var2.a = this;
                    qj0Var.a = this;
                    wh5Var.h.a = this;
                    wh5Var.i.a = this;
                    zk0Var.a = this;
                    if (e70Var9.p()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(zk0Var);
                        wh5 wh5Var2 = this.b.e;
                        wh5Var2.e.a = this;
                        arrayList2.add(wh5Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(zk0Var);
                        this.b.e.i.k.add(zk0Var);
                    } else if (this.b.o()) {
                        this.b.e.e.l.add(zk0Var);
                        arrayList.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(zk0Var);
                    }
                } else {
                    zk0 zk0Var3 = wh5Var.e;
                    arrayList2.add(zk0Var3);
                    zk0Var3.k.add(zk0Var);
                    this.b.e.h.k.add(zk0Var);
                    this.b.e.i.k.add(zk0Var);
                    zk0Var.b = true;
                    arrayList.add(qj0Var2);
                    arrayList.add(qj0Var);
                    qj0Var2.l.add(zk0Var);
                    qj0Var.l.add(zk0Var);
                }
            }
        }
        e70 e70Var11 = this.b;
        w60[] w60VarArr2 = e70Var11.G;
        w60 w60Var4 = w60VarArr2[0];
        w60 w60Var5 = w60Var4.d;
        if (w60Var5 != null && w60VarArr2[1].d != null) {
            if (e70Var11.o()) {
                qj0Var2.f = this.b.G[0].b();
                qj0Var.f = -this.b.G[1].b();
                return;
            }
            qj0 qj0VarH5 = cm5.h(this.b.G[0]);
            qj0 qj0VarH6 = cm5.h(this.b.G[1]);
            qj0VarH5.b(this);
            qj0VarH6.b(this);
            this.j = 4;
            return;
        }
        if (w60Var5 != null) {
            qj0 qj0VarH7 = cm5.h(w60Var4);
            if (qj0VarH7 != null) {
                cm5.b(qj0Var2, qj0VarH7, this.b.G[0].b());
                c(qj0Var, qj0Var2, 1, zk0Var);
                return;
            }
            return;
        }
        w60 w60Var6 = w60VarArr2[1];
        if (w60Var6.d != null) {
            qj0 qj0VarH8 = cm5.h(w60Var6);
            if (qj0VarH8 != null) {
                cm5.b(qj0Var, qj0VarH8, -this.b.G[1].b());
                c(qj0Var2, qj0Var, -1, zk0Var);
                return;
            }
            return;
        }
        if ((e70Var11 instanceof wc1) || (e70Var3 = e70Var11.K) == null) {
            return;
        }
        cm5.b(qj0Var2, e70Var3.d.h, e70Var11.k());
        c(qj0Var, qj0Var2, 1, zk0Var);
    }

    @Override // defpackage.cm5
    public final void e() {
        qj0 qj0Var = this.h;
        if (qj0Var.j) {
            this.b.P = qj0Var.g;
        }
    }

    @Override // defpackage.cm5
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.cm5
    public final boolean k() {
        return this.d != 3 || this.b.j == 0;
    }

    public final void n() {
        this.g = false;
        qj0 qj0Var = this.h;
        qj0Var.c();
        qj0Var.j = false;
        qj0 qj0Var2 = this.i;
        qj0Var2.c();
        qj0Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.Y;
    }
}
