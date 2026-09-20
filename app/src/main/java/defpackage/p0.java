package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final r0 a;
    public final yv0 b;
    public final i74 c = new i74();
    public final i74 d = new i74();
    public volatile long e;

    public p0(r0 r0Var, m1 m1Var) {
        this.a = r0Var;
        this.b = m1Var;
    }

    public final void a(ck4 ck4Var) {
        boolean z;
        long jA = this.b.a() + this.d.a.get() + this.c.a.get();
        int iH = O.h(this.a.b(jA));
        if (iH != 0) {
            z = true;
            if (iH == 1) {
                this.d.a(ck4Var);
            } else if (iH == 2) {
                i74 i74Var = this.c;
                i74 i74Var2 = this.d;
                AtomicLong atomicLong = i74Var.a;
                AtomicLong atomicLong2 = i74Var2.a;
                i74Var.b.drainTo(i74Var2.b);
                long j = atomicLong.get();
                atomicLong.addAndGet(-j);
                atomicLong2.addAndGet(j);
                this.d.a(ck4Var);
            } else if (iH == 3) {
                i74 i74Var3 = this.d;
                i74 i74Var4 = this.c;
                AtomicLong atomicLong3 = i74Var3.a;
                AtomicLong atomicLong4 = i74Var4.a;
                i74Var3.b.drainTo(i74Var4.b);
                long j2 = atomicLong3.get();
                atomicLong3.addAndGet(-j2);
                atomicLong4.addAndGet(j2);
                this.c.a(ck4Var);
            } else {
                if (iH != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.a(ck4Var);
            }
        } else {
            z = false;
        }
        if (z) {
            jA += (long) ck4Var.b;
        }
        if (jA > this.e) {
            this.e = jA;
        }
    }
}
