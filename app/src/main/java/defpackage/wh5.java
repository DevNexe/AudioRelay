package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wh5 extends cm5 {
    public final qj0 k;
    public v8 l;

    public wh5(e70 e70Var) {
        super(e70Var);
        qj0 qj0Var = new qj0(this);
        this.k = qj0Var;
        this.l = null;
        this.h.e = 6;
        this.i.e = 7;
        qj0Var.e = 8;
        this.f = 1;
    }

    @Override // defpackage.cm5, defpackage.lj0
    public final void a(lj0 lj0Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (O.h(this.j) == 3) {
            e70 e70Var = this.b;
            l(e70Var.z, e70Var.B, 1);
            return;
        }
        zk0 zk0Var = this.e;
        if (zk0Var.c && !zk0Var.j && this.d == 3) {
            e70 e70Var2 = this.b;
            int i2 = e70Var2.k;
            if (i2 == 2) {
                e70 e70Var3 = e70Var2.K;
                if (e70Var3 != null) {
                    zk0 zk0Var2 = e70Var3.e.e;
                    if (zk0Var2.j) {
                        zk0Var.d((int) ((zk0Var2.g * e70Var2.r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                zk0 zk0Var3 = e70Var2.d.e;
                if (zk0Var3.j) {
                    int i3 = e70Var2.O;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = zk0Var3.g * e70Var2.N;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = zk0Var3.g;
                            f2 = e70Var2.N;
                        }
                        zk0Var.d(i);
                    } else {
                        f = zk0Var3.g;
                        f2 = e70Var2.N;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    zk0Var.d(i);
                }
            }
        }
        qj0 qj0Var = this.h;
        if (qj0Var.c) {
            qj0 qj0Var2 = this.i;
            if (qj0Var2.c) {
                if (qj0Var.j && qj0Var2.j && zk0Var.j) {
                    return;
                }
                boolean z = zk0Var.j;
                ArrayList arrayList = qj0Var.l;
                ArrayList arrayList2 = qj0Var2.l;
                if (!z && this.d == 3) {
                    e70 e70Var4 = this.b;
                    if (e70Var4.j == 0 && !e70Var4.p()) {
                        qj0 qj0Var3 = (qj0) arrayList.get(0);
                        qj0 qj0Var4 = (qj0) arrayList2.get(0);
                        int i4 = qj0Var3.g + qj0Var.f;
                        int i5 = qj0Var4.g + qj0Var2.f;
                        qj0Var.d(i4);
                        qj0Var2.d(i5);
                        zk0Var.d(i5 - i4);
                        return;
                    }
                }
                if (!zk0Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    qj0 qj0Var5 = (qj0) arrayList.get(0);
                    int i6 = (((qj0) arrayList2.get(0)).g + qj0Var2.f) - (qj0Var5.g + qj0Var.f);
                    int i7 = zk0Var.m;
                    if (i6 < i7) {
                        zk0Var.d(i6);
                    } else {
                        zk0Var.d(i7);
                    }
                }
                if (zk0Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    qj0 qj0Var6 = (qj0) arrayList.get(0);
                    qj0 qj0Var7 = (qj0) arrayList2.get(0);
                    int i8 = qj0Var6.g;
                    int i9 = qj0Var.f + i8;
                    int i10 = qj0Var7.g;
                    int i11 = qj0Var2.f + i10;
                    float f4 = this.b.V;
                    if (qj0Var6 == qj0Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    qj0Var.d((int) ((((i10 - i8) - zk0Var.g) * f4) + i8 + 0.5f));
                    qj0Var2.d(qj0Var.g + zk0Var.g);
                }
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
            zk0Var.d(e70Var5.g());
        }
        boolean z2 = zk0Var.j;
        qj0 qj0Var = this.i;
        qj0 qj0Var2 = this.h;
        if (!z2) {
            e70 e70Var6 = this.b;
            this.d = e70Var6.J[1];
            if (e70Var6.w) {
                this.l = new v8(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (e70Var4 = this.b.K) != null && e70Var4.J[1] == 1) {
                    int iG = (e70Var4.g() - this.b.z.b()) - this.b.B.b();
                    wh5 wh5Var = e70Var4.e;
                    cm5.b(qj0Var2, wh5Var.h, this.b.z.b());
                    cm5.b(qj0Var, wh5Var.i, -this.b.B.b());
                    zk0Var.d(iG);
                    return;
                }
                if (i == 1) {
                    zk0Var.d(this.b.g());
                }
            }
        } else if (this.d == 4 && (e70Var2 = (e70Var = this.b).K) != null && e70Var2.J[1] == 1) {
            wh5 wh5Var2 = e70Var2.e;
            cm5.b(qj0Var2, wh5Var2.h, e70Var.z.b());
            cm5.b(qj0Var, wh5Var2.i, -this.b.B.b());
            return;
        }
        boolean z3 = zk0Var.j;
        qj0 qj0Var3 = this.k;
        if (z3) {
            e70 e70Var7 = this.b;
            if (e70Var7.a) {
                w60[] w60VarArr = e70Var7.G;
                w60 w60Var = w60VarArr[2];
                w60 w60Var2 = w60Var.d;
                if (w60Var2 != null && w60VarArr[3].d != null) {
                    if (e70Var7.p()) {
                        qj0Var2.f = this.b.G[2].b();
                        qj0Var.f = -this.b.G[3].b();
                    } else {
                        qj0 qj0VarH = cm5.h(this.b.G[2]);
                        if (qj0VarH != null) {
                            cm5.b(qj0Var2, qj0VarH, this.b.G[2].b());
                        }
                        qj0 qj0VarH2 = cm5.h(this.b.G[3]);
                        if (qj0VarH2 != null) {
                            cm5.b(qj0Var, qj0VarH2, -this.b.G[3].b());
                        }
                        qj0Var2.b = true;
                        qj0Var.b = true;
                    }
                    e70 e70Var8 = this.b;
                    if (e70Var8.w) {
                        cm5.b(qj0Var3, qj0Var2, e70Var8.R);
                        return;
                    }
                    return;
                }
                if (w60Var2 != null) {
                    qj0 qj0VarH3 = cm5.h(w60Var);
                    if (qj0VarH3 != null) {
                        cm5.b(qj0Var2, qj0VarH3, this.b.G[2].b());
                        cm5.b(qj0Var, qj0Var2, zk0Var.g);
                        e70 e70Var9 = this.b;
                        if (e70Var9.w) {
                            cm5.b(qj0Var3, qj0Var2, e70Var9.R);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w60 w60Var3 = w60VarArr[3];
                if (w60Var3.d != null) {
                    qj0 qj0VarH4 = cm5.h(w60Var3);
                    if (qj0VarH4 != null) {
                        cm5.b(qj0Var, qj0VarH4, -this.b.G[3].b());
                        cm5.b(qj0Var2, qj0Var, -zk0Var.g);
                    }
                    e70 e70Var10 = this.b;
                    if (e70Var10.w) {
                        cm5.b(qj0Var3, qj0Var2, e70Var10.R);
                        return;
                    }
                    return;
                }
                w60 w60Var4 = w60VarArr[4];
                if (w60Var4.d != null) {
                    qj0 qj0VarH5 = cm5.h(w60Var4);
                    if (qj0VarH5 != null) {
                        cm5.b(qj0Var3, qj0VarH5, 0);
                        cm5.b(qj0Var2, qj0Var3, -this.b.R);
                        cm5.b(qj0Var, qj0Var2, zk0Var.g);
                        return;
                    }
                    return;
                }
                if ((e70Var7 instanceof wc1) || e70Var7.K == null || e70Var7.e(w60.QnHx.CENTER).d != null) {
                    return;
                }
                e70 e70Var11 = this.b;
                cm5.b(qj0Var2, e70Var11.K.e.h, e70Var11.l());
                cm5.b(qj0Var, qj0Var2, zk0Var.g);
                e70 e70Var12 = this.b;
                if (e70Var12.w) {
                    cm5.b(qj0Var3, qj0Var2, e70Var12.R);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = zk0Var.l;
        if (z3 || this.d != 3) {
            zk0Var.b(this);
        } else {
            e70 e70Var13 = this.b;
            int i2 = e70Var13.k;
            ArrayList arrayList2 = zk0Var.k;
            if (i2 == 2) {
                e70 e70Var14 = e70Var13.K;
                if (e70Var14 != null) {
                    zk0 zk0Var2 = e70Var14.e.e;
                    arrayList.add(zk0Var2);
                    zk0Var2.k.add(zk0Var);
                    zk0Var.b = true;
                    arrayList2.add(qj0Var2);
                    arrayList2.add(qj0Var);
                }
            } else if (i2 == 3 && !e70Var13.p()) {
                e70 e70Var15 = this.b;
                if (e70Var15.j != 3) {
                    zk0 zk0Var3 = e70Var15.d.e;
                    arrayList.add(zk0Var3);
                    zk0Var3.k.add(zk0Var);
                    zk0Var.b = true;
                    arrayList2.add(qj0Var2);
                    arrayList2.add(qj0Var);
                }
            }
        }
        e70 e70Var16 = this.b;
        w60[] w60VarArr2 = e70Var16.G;
        w60 w60Var5 = w60VarArr2[2];
        w60 w60Var6 = w60Var5.d;
        if (w60Var6 != null && w60VarArr2[3].d != null) {
            if (e70Var16.p()) {
                qj0Var2.f = this.b.G[2].b();
                qj0Var.f = -this.b.G[3].b();
            } else {
                qj0 qj0VarH6 = cm5.h(this.b.G[2]);
                qj0 qj0VarH7 = cm5.h(this.b.G[3]);
                qj0VarH6.b(this);
                qj0VarH7.b(this);
                this.j = 4;
            }
            if (this.b.w) {
                c(qj0Var3, qj0Var2, 1, this.l);
            }
        } else if (w60Var6 != null) {
            qj0 qj0VarH8 = cm5.h(w60Var5);
            if (qj0VarH8 != null) {
                cm5.b(qj0Var2, qj0VarH8, this.b.G[2].b());
                c(qj0Var, qj0Var2, 1, zk0Var);
                if (this.b.w) {
                    c(qj0Var3, qj0Var2, 1, this.l);
                }
                if (this.d == 3) {
                    e70 e70Var17 = this.b;
                    if (e70Var17.N > 0.0f) {
                        gd1 gd1Var = e70Var17.d;
                        if (gd1Var.d == 3) {
                            gd1Var.e.k.add(zk0Var);
                            arrayList.add(this.b.d.e);
                            zk0Var.a = this;
                        }
                    }
                }
            }
        } else {
            w60 w60Var7 = w60VarArr2[3];
            if (w60Var7.d != null) {
                qj0 qj0VarH9 = cm5.h(w60Var7);
                if (qj0VarH9 != null) {
                    cm5.b(qj0Var, qj0VarH9, -this.b.G[3].b());
                    c(qj0Var2, qj0Var, -1, zk0Var);
                    if (this.b.w) {
                        c(qj0Var3, qj0Var2, 1, this.l);
                    }
                }
            } else {
                w60 w60Var8 = w60VarArr2[4];
                if (w60Var8.d != null) {
                    qj0 qj0VarH10 = cm5.h(w60Var8);
                    if (qj0VarH10 != null) {
                        cm5.b(qj0Var3, qj0VarH10, 0);
                        c(qj0Var2, qj0Var3, -1, this.l);
                        c(qj0Var, qj0Var2, 1, zk0Var);
                    }
                } else if (!(e70Var16 instanceof wc1) && (e70Var3 = e70Var16.K) != null) {
                    cm5.b(qj0Var2, e70Var3.e.h, e70Var16.l());
                    c(qj0Var, qj0Var2, 1, zk0Var);
                    if (this.b.w) {
                        c(qj0Var3, qj0Var2, 1, this.l);
                    }
                    if (this.d == 3) {
                        e70 e70Var18 = this.b;
                        if (e70Var18.N > 0.0f) {
                            gd1 gd1Var2 = e70Var18.d;
                            if (gd1Var2.d == 3) {
                                gd1Var2.e.k.add(zk0Var);
                                arrayList.add(this.b.d.e);
                                zk0Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            zk0Var.c = true;
        }
    }

    @Override // defpackage.cm5
    public final void e() {
        qj0 qj0Var = this.h;
        if (qj0Var.j) {
            this.b.Q = qj0Var.g;
        }
    }

    @Override // defpackage.cm5
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.cm5
    public final boolean k() {
        return this.d != 3 || this.b.k == 0;
    }

    public final void m() {
        this.g = false;
        qj0 qj0Var = this.h;
        qj0Var.c();
        qj0Var.j = false;
        qj0 qj0Var2 = this.i;
        qj0Var2.c();
        qj0Var2.j = false;
        qj0 qj0Var3 = this.k;
        qj0Var3.c();
        qj0Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.Y;
    }
}
