package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EQ<T> extends ss1 implements z80<T>, ua0 {
    public final la0 x;

    public EQ(la0 la0Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            E0((ms1) la0Var.j(ms1.CQf.w));
        }
        this.x = la0Var.g0(this);
    }

    @Override // defpackage.ss1
    public final void D0(CompletionHandlerException completionHandlerException) {
        ps0.K(this.x, completionHandlerException);
    }

    @Override // defpackage.ss1
    public String I0() {
        return super.I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ss1
    public final void M0(Object obj) {
        if (!(obj instanceof iy)) {
            V0(obj);
        } else {
            iy iyVar = (iy) obj;
            U0(iyVar.a, iyVar.a());
        }
    }

    public void T0(Object obj) {
        S(obj);
    }

    public void U0(Throwable th, boolean z) {
    }

    public void V0(T t) {
    }

    public final void W0(int i, EQ eq, x81 x81Var) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            try {
                kd.w(ps0.L(ps0.v(eq, this, x81Var)), sd5.a, null);
                return;
            } catch (Throwable th) {
                x(new fq3.QnHx(th));
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ps0.L(ps0.v(eq, this, x81Var)).x(sd5.a);
                return;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                la0 la0Var = this.x;
                Object objB = e75.b(la0Var, null);
                try {
                    sb5.d(2, x81Var);
                    Object objInvoke = x81Var.invoke(eq, this);
                    e75.a(la0Var, objB);
                    if (objInvoke != va0.COROUTINE_SUSPENDED) {
                        x(objInvoke);
                    }
                } catch (Throwable th2) {
                    e75.a(la0Var, objB);
                    throw th2;
                }
            } catch (Throwable th3) {
                x(new fq3.QnHx(th3));
            }
        }
    }

    @Override // defpackage.ss1
    public final String Y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.ss1, defpackage.ms1
    public boolean c() {
        return super.c();
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.x;
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return this.x;
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        Throwable thA = fq3.a(obj);
        if (thA != null) {
            obj = new iy(thA, false);
        }
        Object objH0 = H0(obj);
        if (objH0 == ym.y) {
            return;
        }
        T0(objH0);
    }
}
