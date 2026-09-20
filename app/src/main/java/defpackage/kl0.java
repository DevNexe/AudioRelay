package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kl0<T> extends u05 {
    public int y;

    public kl0(int i) {
        this.y = i;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }

    public abstract z80<T> b();

    public Throwable d(Object obj) {
        iy iyVar = obj instanceof iy ? (iy) obj : null;
        if (iyVar != null) {
            return iyVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            Th.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ps0.K(b().getContext(), new xa0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // java.lang.Runnable
    public final void run() {
        Object qnHx;
        ms1 ms1Var;
        Object qnHx2;
        a15 a15Var = this.x;
        try {
            il0 il0Var = (il0) b();
            z80<T> z80Var = il0Var.A;
            Object obj = il0Var.C;
            la0 context = z80Var.getContext();
            Object objB = e75.b(context, obj);
            od5<?> od5VarC = objB != e75.a ? ma0.c(z80Var, context, objB) : null;
            try {
                la0 context2 = z80Var.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null) {
                    int i = this.y;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        ms1Var = (ms1) context2.j(ms1.CQf.w);
                    } else {
                        ms1Var = null;
                    }
                } else {
                    ms1Var = null;
                }
                if (ms1Var != null && !ms1Var.c()) {
                    CancellationException cancellationExceptionP = ms1Var.P();
                    a(objG, cancellationExceptionP);
                    z80Var.x(new fq3.QnHx(cancellationExceptionP));
                } else if (thD != null) {
                    z80Var.x(new fq3.QnHx(thD));
                } else {
                    z80Var.x(e(objG));
                }
                sd5 sd5Var = sd5.a;
                if (od5VarC == null || od5VarC.X0()) {
                    e75.a(context, objB);
                }
                try {
                    a15Var.a();
                    qnHx2 = sd5.a;
                } catch (Throwable th) {
                    qnHx2 = new fq3.QnHx(th);
                }
                f(null, fq3.a(qnHx2));
            } catch (Throwable th2) {
                if (od5VarC == null || od5VarC.X0()) {
                    e75.a(context, objB);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                a15Var.a();
                qnHx = sd5.a;
            } catch (Throwable th4) {
                qnHx = new fq3.QnHx(th4);
            }
            f(th3, fq3.a(qnHx));
        }
    }
}
