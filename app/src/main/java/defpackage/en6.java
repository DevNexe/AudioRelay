package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class en6 extends FutureTask implements Comparable {
    public final long w;
    public final boolean x;
    public final String y;
    public final /* synthetic */ ro6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en6(ro6 ro6Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.z = ro6Var;
        long andIncrement = ro6.k.getAndIncrement();
        this.w = andIncrement;
        this.y = str;
        this.x = z;
        if (andIncrement == Long.MAX_VALUE) {
            bi6 bi6Var = ro6Var.a.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        en6 en6Var = (en6) obj;
        boolean z = en6Var.x;
        boolean z2 = this.x;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = en6Var.w;
        long j2 = this.w;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        bi6 bi6Var = this.z.a.i;
        dq6.h(bi6Var);
        bi6Var.g.c(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        bi6 bi6Var = this.z.a.i;
        dq6.h(bi6Var);
        bi6Var.f.c(th, this.y);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en6(ro6 ro6Var, Callable callable, boolean z) {
        super(callable);
        this.z = ro6Var;
        long andIncrement = ro6.k.getAndIncrement();
        this.w = andIncrement;
        this.y = "Task exception on worker thread";
        this.x = z;
        if (andIncrement == Long.MAX_VALUE) {
            bi6 bi6Var = ro6Var.a.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Tasks index overflow");
        }
    }
}
