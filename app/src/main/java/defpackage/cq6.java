package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class cq6 extends jq6 {
    public final Callable A;
    public final /* synthetic */ eq6 B;
    public final Executor y;
    public final /* synthetic */ eq6 z;

    public cq6(eq6 eq6Var, Callable callable, Executor executor) {
        this.B = eq6Var;
        this.z = eq6Var;
        executor.getClass();
        this.y = executor;
        callable.getClass();
        this.A = callable;
    }

    @Override // defpackage.jq6
    public final Object a() {
        return this.A.call();
    }

    @Override // defpackage.jq6
    public final String b() {
        return this.A.toString();
    }

    @Override // defpackage.jq6
    public final void d(Throwable th) {
        eq6 eq6Var = this.z;
        eq6Var.L = null;
        if (th instanceof ExecutionException) {
            eq6Var.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            eq6Var.cancel(false);
        } else {
            eq6Var.zze(th);
        }
    }

    @Override // defpackage.jq6
    public final void e(Object obj) {
        this.z.L = null;
        this.B.zzd(obj);
    }

    @Override // defpackage.jq6
    public final boolean f() {
        return this.z.isDone();
    }
}
