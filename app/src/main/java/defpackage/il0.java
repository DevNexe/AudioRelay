package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class il0<T> extends kl0<T> implements wa0, z80<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(il0.class, Object.class, "_reusableCancellableContinuation");
    public final z80<T> A;
    public Object B;
    public final Object C;
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    public final oa0 z;

    public il0(oa0 oa0Var, b90 b90Var) {
        super(-1);
        this.z = oa0Var;
        this.A = b90Var;
        this.B = kd.x;
        this.C = getContext().i(0, e75.b);
        this._reusableCancellableContinuation = null;
    }

    @Override // defpackage.kl0
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof jy) {
            ((jy) obj).b.invoke(cancellationException);
        }
    }

    @Override // defpackage.kl0
    public final z80<T> b() {
        return this;
    }

    @Override // defpackage.kl0
    public final Object g() {
        Object obj = this.B;
        this.B = kd.x;
        return obj;
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return this.A.getContext();
    }

    public final xm<T> h() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            py4 py4Var = kd.y;
            if (obj == null) {
                this._reusableCancellableContinuation = py4Var;
                return null;
            }
            if (obj instanceof xm) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, py4Var)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return (xm) obj;
                }
            } else if (obj != py4Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean i() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean j(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            py4 py4Var = kd.y;
            boolean z = false;
            boolean z2 = true;
            if (ur1.a(obj, py4Var)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, py4Var, th)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == py4Var);
                if (z) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }

    @Override // defpackage.wa0
    public final wa0 k() {
        z80<T> z80Var = this.A;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }

    public final void m() {
        Object obj = this._reusableCancellableContinuation;
        xm xmVar = obj instanceof xm ? (xm) obj : null;
        if (xmVar != null) {
            xmVar.m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x0035  */
    public final Throwable n(wm<?> wmVar) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            py4 py4Var = kd.y;
            z = false;
            if (obj != py4Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        if (z) {
                            return (Throwable) obj;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                z = true;
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, py4Var, wmVar)) {
                    z = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == py4Var);
        } while (!z);
        return null;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.z + ", " + lf0.b(this.A) + ']';
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        z80<T> z80Var = this.A;
        la0 context = z80Var.getContext();
        Throwable thA = fq3.a(obj);
        Object iyVar = thA == null ? obj : new iy(thA, false);
        oa0 oa0Var = this.z;
        if (oa0Var.o()) {
            this.B = iyVar;
            this.y = 0;
            oa0Var.g(context, this);
            return;
        }
        gu0 gu0VarA = f75.a();
        if (gu0VarA.h0()) {
            this.B = iyVar;
            this.y = 0;
            gu0VarA.T(this);
            return;
        }
        gu0VarA.Z(true);
        try {
            la0 context2 = getContext();
            Object objB = e75.b(context2, this.C);
            try {
                z80Var.x(obj);
                sd5 sd5Var = sd5.a;
                e75.a(context2, objB);
                while (gu0VarA.l0()) {
                }
            } catch (Throwable th) {
                e75.a(context2, objB);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                f(th2, null);
            } finally {
                gu0VarA.I(true);
            }
        }
    }
}
