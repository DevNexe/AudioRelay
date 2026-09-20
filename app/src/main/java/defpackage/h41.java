package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h41 implements e41.QnHx {
    public final z43 a;
    public final o53 b;
    public final nc5 c;
    public final l41 d;
    public final ny1 e;

    public h41(fp1 fp1Var, audiorelay_net audiorelay_netVar) {
        nc5 nc5Var = i41.a;
        l41 l41Var = new l41(i41.b);
        ny1 ny1Var = new ny1(2);
        this.a = fp1Var;
        this.b = audiorelay_netVar;
        this.c = nc5Var;
        this.d = l41Var;
        this.e = ny1Var;
        new f41(this);
    }

    @Override // e41.QnHx
    public final oc5 a(e41 e41Var, x41 x41Var, int i, int i2) {
        o53 o53Var = this.b;
        e41 e41VarB = o53Var.b(e41Var);
        x41 x41VarD = o53Var.d(x41Var);
        int iA = o53Var.a(i);
        int iC = o53Var.c(i2);
        this.a.h();
        return b(new lc5(e41VarB, x41VarD, iA, iC, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final oc5 b(lc5 lc5Var) {
        oc5 oc5VarA;
        nc5 nc5Var = this.c;
        g41 g41Var = new g41(this, lc5Var);
        synchronized (nc5Var.a) {
            oc5VarA = nc5Var.b.a(lc5Var);
            if (oc5VarA == null) {
                try {
                    oc5VarA = (oc5) g41Var.invoke(new mc5(nc5Var, lc5Var));
                    synchronized (nc5Var.a) {
                        if (nc5Var.b.a(lc5Var) == null && oc5VarA.h()) {
                            nc5Var.b.b(lc5Var, oc5VarA);
                        }
                        sd5 sd5Var = sd5.a;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } else if (!oc5VarA.h()) {
                nc5Var.b.c(lc5Var);
                oc5VarA = (oc5) g41Var.invoke(new mc5(nc5Var, lc5Var));
                synchronized (nc5Var.a) {
                    if (nc5Var.b.a(lc5Var) == null) {
                        nc5Var.b.b(lc5Var, oc5VarA);
                    }
                    sd5 sd5Var2 = sd5.a;
                }
            }
        }
        return oc5VarA;
    }
}
