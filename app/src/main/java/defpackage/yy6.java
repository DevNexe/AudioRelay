package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yy6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ kj6 y;

    public /* synthetic */ yy6(kj6 kj6Var, long j, int i) {
        this.w = i;
        this.y = kj6Var;
        this.x = j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        long j = this.x;
        kj6 kj6Var = this.y;
        switch (i) {
            case 0:
                dz6 dz6Var = (dz6) kj6Var;
                dz6Var.a.j().h(j);
                dz6Var.e = null;
                break;
            default:
                w17 w17Var = (w17) kj6Var;
                w17Var.e();
                w17Var.i();
                dq6 dq6Var = w17Var.a;
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.n.c(Long.valueOf(j), "Activity resumed, time");
                if (dq6Var.g.o()) {
                    t17 t17Var = w17Var.e;
                    t17Var.d.e();
                    t17Var.c.a();
                    t17Var.a = j;
                    t17Var.b = j;
                } else {
                    xj6 xj6Var = dq6Var.h;
                    dq6.f(xj6Var);
                    if (xj6Var.p.b()) {
                        t17 t17Var2 = w17Var.e;
                        t17Var2.d.e();
                        t17Var2.c.a();
                        t17Var2.a = j;
                        t17Var2.b = j;
                    }
                }
                cq4 cq4Var = w17Var.f;
                ((w17) cq4Var.y).e();
                r17 r17Var = (r17) cq4Var.x;
                if (r17Var != null) {
                    ((w17) cq4Var.y).c.removeCallbacks(r17Var);
                }
                xj6 xj6Var2 = ((w17) cq4Var.y).a.h;
                dq6.f(xj6Var2);
                xj6Var2.p.a(false);
                u17 u17Var = w17Var.d;
                u17Var.a.e();
                w17 w17Var2 = u17Var.a;
                if (w17Var2.a.d()) {
                    w17Var2.a.n.getClass();
                    u17Var.b(System.currentTimeMillis(), false);
                    break;
                }
                break;
        }
    }
}
