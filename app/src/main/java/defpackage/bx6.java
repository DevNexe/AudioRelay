package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class bx6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ kj6 y;

    public /* synthetic */ bx6(kj6 kj6Var, long j, int i) {
        this.w = i;
        this.y = kj6Var;
        this.x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.x;
        int i = this.w;
        kj6 kj6Var = this.y;
        switch (i) {
            case 0:
                dy6 dy6Var = (dy6) kj6Var;
                xj6 xj6Var = dy6Var.a.h;
                dq6.f(xj6Var);
                xj6Var.j.b(j);
                bi6 bi6Var = dy6Var.a.i;
                dq6.h(bi6Var);
                bi6Var.m.c(Long.valueOf(j), "Session timeout duration set");
                break;
            case 1:
                dy6 dy6Var2 = (dy6) kj6Var;
                dy6Var2.o(j, true);
                dy6Var2.a.q().v(new AtomicReference());
                break;
            default:
                w17 w17Var = (w17) kj6Var;
                w17Var.e();
                w17Var.i();
                dq6 dq6Var = w17Var.a;
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.n.c(Long.valueOf(j), "Activity paused, time");
                cq4 cq4Var = w17Var.f;
                ((w17) cq4Var.y).a.n.getClass();
                r17 r17Var = new r17(cq4Var, System.currentTimeMillis(), j);
                cq4Var.x = r17Var;
                ((w17) cq4Var.y).c.postDelayed(r17Var, 2000L);
                if (dq6Var.g.o()) {
                    w17Var.e.c.a();
                }
                break;
        }
    }
}
