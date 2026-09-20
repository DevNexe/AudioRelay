package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cm5 implements lj0 {
    public int a;
    public e70 b;
    public zu3 c;
    public int d;
    public final zk0 e = new zk0(this);
    public int f = 0;
    public boolean g = false;
    public final qj0 h = new qj0(this);
    public final qj0 i = new qj0(this);
    public int j = 1;

    public cm5(e70 e70Var) {
        this.b = e70Var;
    }

    public static void b(qj0 qj0Var, qj0 qj0Var2, int i) {
        qj0Var.l.add(qj0Var2);
        qj0Var.f = i;
        qj0Var2.k.add(qj0Var);
    }

    public static qj0 h(w60 w60Var) {
        w60 w60Var2 = w60Var.d;
        if (w60Var2 == null) {
            return null;
        }
        int iOrdinal = w60Var2.c.ordinal();
        e70 e70Var = w60Var2.b;
        if (iOrdinal == 1) {
            return e70Var.d.h;
        }
        if (iOrdinal == 2) {
            return e70Var.e.h;
        }
        if (iOrdinal == 3) {
            return e70Var.d.i;
        }
        if (iOrdinal == 4) {
            return e70Var.e.i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return e70Var.e.k;
    }

    public static qj0 i(w60 w60Var, int i) {
        w60 w60Var2 = w60Var.d;
        if (w60Var2 == null) {
            return null;
        }
        e70 e70Var = w60Var2.b;
        cm5 cm5Var = i == 0 ? e70Var.d : e70Var.e;
        int iOrdinal = w60Var2.c.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return cm5Var.h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return cm5Var.i;
        }
        return null;
    }

    @Override // defpackage.lj0
    public void a(lj0 lj0Var) {
    }

    public final void c(qj0 qj0Var, qj0 qj0Var2, int i, zk0 zk0Var) {
        qj0Var.l.add(qj0Var2);
        qj0Var.l.add(this.e);
        qj0Var.h = i;
        qj0Var.i = zk0Var;
        qj0Var2.k.add(qj0Var);
        zk0Var.k.add(qj0Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            e70 e70Var = this.b;
            int i3 = e70Var.n;
            iMax = Math.max(e70Var.m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            e70 e70Var2 = this.b;
            int i4 = e70Var2.q;
            iMax = Math.max(e70Var2.p, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        zk0 zk0Var = this.e;
        if (zk0Var.j) {
            return zk0Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(w60 w60Var, w60 w60Var2, int i) {
        qj0 qj0VarH = h(w60Var);
        qj0 qj0VarH2 = h(w60Var2);
        if (qj0VarH.j && qj0VarH2.j) {
            int iB = w60Var.b() + qj0VarH.g;
            int iB2 = qj0VarH2.g - w60Var2.b();
            int i2 = iB2 - iB;
            zk0 zk0Var = this.e;
            if (!zk0Var.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    zk0Var.d(g(i2, i));
                } else if (i3 == 1) {
                    zk0Var.d(Math.min(g(zk0Var.m, i), i2));
                } else if (i3 == 2) {
                    e70 e70Var = this.b;
                    e70 e70Var2 = e70Var.K;
                    if (e70Var2 != null) {
                        zk0 zk0Var2 = (i == 0 ? e70Var2.d : e70Var2.e).e;
                        if (zk0Var2.j) {
                            zk0Var.d(g((int) ((zk0Var2.g * (i == 0 ? e70Var.o : e70Var.r)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    e70 e70Var3 = this.b;
                    cm5 cm5Var = e70Var3.d;
                    int i4 = cm5Var.d;
                    wh5 wh5Var = e70Var3.e;
                    if (i4 != 3 || cm5Var.a != 3 || wh5Var.d != 3 || wh5Var.a != 3) {
                        if (i == 0) {
                            cm5Var = wh5Var;
                        }
                        zk0 zk0Var3 = cm5Var.e;
                        if (zk0Var3.j) {
                            float f = e70Var3.N;
                            zk0Var.d(i == 1 ? (int) ((zk0Var3.g / f) + 0.5f) : (int) ((f * zk0Var3.g) + 0.5f));
                        }
                    }
                }
            }
            if (zk0Var.j) {
                int i5 = zk0Var.g;
                qj0 qj0Var = this.i;
                qj0 qj0Var2 = this.h;
                if (i5 == i2) {
                    qj0Var2.d(iB);
                    qj0Var.d(iB2);
                    return;
                }
                e70 e70Var4 = this.b;
                float f2 = i == 0 ? e70Var4.U : e70Var4.V;
                if (qj0VarH == qj0VarH2) {
                    iB = qj0VarH.g;
                    iB2 = qj0VarH2.g;
                    f2 = 0.5f;
                }
                qj0Var2.d((int) ((((iB2 - iB) - i5) * f2) + iB + 0.5f));
                qj0Var.d(qj0Var2.g + zk0Var.g);
            }
        }
    }
}
