package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class kc7<TResult> extends w05<TResult> {
    public final Object a = new Object();
    public final ga7<TResult> b = new ga7<>();

    @GuardedBy("mLock")
    public boolean c;
    public volatile boolean d;

    @GuardedBy("mLock")
    public TResult e;

    @GuardedBy("mLock")
    public Exception f;

    @Override // defpackage.w05
    public final void a(Executor executor, ju2 ju2Var) {
        this.b.a(new pw6(executor, ju2Var));
        v();
    }

    @Override // defpackage.w05
    public final void b(Executor executor, ku2 ku2Var) {
        this.b.a(new tz6(executor, ku2Var));
        v();
    }

    @Override // defpackage.w05
    public final kc7 c(nu2 nu2Var) {
        d(d15.a, nu2Var);
        return this;
    }

    @Override // defpackage.w05
    public final kc7 d(Executor executor, nu2 nu2Var) {
        this.b.a(new x27(executor, nu2Var));
        v();
        return this;
    }

    @Override // defpackage.w05
    public final kc7 e(Executor executor, yu2 yu2Var) {
        this.b.a(new n57(executor, yu2Var));
        v();
        return this;
    }

    @Override // defpackage.w05
    public final <TContinuationResult> w05<TContinuationResult> f(Executor executor, a90<TResult, TContinuationResult> a90Var) {
        kc7 kc7Var = new kc7();
        this.b.a(new jd6(executor, a90Var, kc7Var));
        v();
        return kc7Var;
    }

    @Override // defpackage.w05
    public final void g(a90 a90Var) {
        f(d15.a, a90Var);
    }

    @Override // defpackage.w05
    public final w05 h(ta2 ta2Var) {
        return i(d15.a, ta2Var);
    }

    @Override // defpackage.w05
    public final <TContinuationResult> w05<TContinuationResult> i(Executor executor, a90<TResult, w05<TContinuationResult>> a90Var) {
        kc7 kc7Var = new kc7();
        this.b.a(new lj6(executor, a90Var, kc7Var, 0));
        v();
        return kc7Var;
    }

    @Override // defpackage.w05
    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.w05
    public final TResult k() {
        TResult tresult;
        synchronized (this.a) {
            oa3.j("Task is not yet complete", this.c);
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = this.e;
        }
        return tresult;
    }

    @Override // defpackage.w05
    public final boolean l() {
        return this.d;
    }

    @Override // defpackage.w05
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.w05
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.w05
    public final <TContinuationResult> w05<TContinuationResult> o(uw4<TResult, TContinuationResult> uw4Var) {
        sb7 sb7Var = d15.a;
        kc7 kc7Var = new kc7();
        this.b.a(new lj6(sb7Var, uw4Var, kc7Var, 1));
        v();
        return kc7Var;
    }

    @Override // defpackage.w05
    public final <TContinuationResult> w05<TContinuationResult> p(Executor executor, uw4<TResult, TContinuationResult> uw4Var) {
        kc7 kc7Var = new kc7();
        this.b.a(new lj6(executor, uw4Var, kc7Var, 1));
        v();
        return kc7Var;
    }

    public final kc7 q(yu2 yu2Var) {
        e(d15.a, yu2Var);
        return this;
    }

    public final void r(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.a) {
            u();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void s(TResult tresult) {
        synchronized (this.a) {
            u();
            this.c = true;
            this.e = tresult;
        }
        this.b.b(this);
    }

    public final void t() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.d = true;
            this.b.b(this);
        }
    }

    @GuardedBy("mLock")
    public final void u() {
        String strConcat;
        if (this.c) {
            int i = DuplicateTaskCompletionException.w;
            if (!m()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excJ = j();
            if (excJ != null) {
                strConcat = "failure";
            } else if (n()) {
                strConcat = "result ".concat(String.valueOf(k()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void v() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }
}
