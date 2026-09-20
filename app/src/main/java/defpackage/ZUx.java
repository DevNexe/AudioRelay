package defpackage;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.T23;
import androidx.lifecycle.YKK;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ZUx<Inputs, Events, State> extends jj5 implements s7<Inputs, Events, State> {
    public final v7<Inputs, Events, State> d;
    public final String e;

    public ZUx() {
        throw null;
    }

    public ZUx(gi0 gi0Var) {
        v7<Inputs, Events, State> v7Var = new v7<>(gi0Var);
        this.d = v7Var;
        this.e = "AndroidViewModel";
        v7Var.p(FWT.C(this), new o4(this));
    }

    public static void e(ZUx zUx, w20 w20Var, bu0 bu0Var) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z;
        YKK.F1 f1 = YKK.F1.RESUMED;
        zUx.getClass();
        T23 t23 = w20Var.w;
        while (true) {
            AtomicReference<Object> atomicReference = t23.a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                break;
            }
            xw4 xw4VarD = ddf.d();
            qh0 qh0Var = rl0.a;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(t23, la0.QnHx.a(xw4VarD, n72.a.I()));
            while (true) {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                qh0 qh0Var2 = rl0.a;
                fp1.k0(lifecycleCoroutineScopeImpl, n72.a.I(), 0, new z22(lifecycleCoroutineScopeImpl, null), 2);
                break;
            }
        }
        fp1.k0(lifecycleCoroutineScopeImpl, null, 0, new gt(w20Var, f1, zUx, bu0Var, null), 3);
    }

    public final ii3 f() {
        return this.d.o();
    }

    public final Object g(Inputs inputs) {
        return this.d.q(inputs);
    }

    @Override // defpackage.s7
    public final String getName() {
        return this.d.getName();
    }

    @Override // defpackage.s7
    public final String getType() {
        return this.e;
    }
}
