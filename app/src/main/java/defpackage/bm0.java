package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public enum bm0 implements vl0 {
    DISPOSED;

    public static boolean c(AtomicReference<vl0> atomicReference) {
        vl0 andSet;
        vl0 vl0Var = atomicReference.get();
        bm0 bm0Var = DISPOSED;
        if (vl0Var == bm0Var || (andSet = atomicReference.getAndSet(bm0Var)) == bm0Var) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.a();
        return true;
    }

    public static boolean d(vl0 vl0Var) {
        return vl0Var == DISPOSED;
    }

    public static boolean g(AtomicReference<vl0> atomicReference, vl0 vl0Var) {
        boolean z;
        do {
            vl0 vl0Var2 = atomicReference.get();
            z = false;
            if (vl0Var2 == DISPOSED) {
                if (vl0Var != null) {
                    vl0Var.a();
                }
                return false;
            }
            do {
                if (atomicReference.compareAndSet(vl0Var2, vl0Var)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == vl0Var2);
        } while (!z);
        return true;
    }

    public static void l() {
        m14.b(new ProtocolViolationException("Disposable already set!"));
    }

    public static void m(AtomicReference atomicReference, av3 av3Var) {
        vl0 vl0Var;
        boolean z;
        do {
            vl0Var = (vl0) atomicReference.get();
            if (vl0Var == DISPOSED) {
                av3Var.a();
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(vl0Var, av3Var)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != vl0Var) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (vl0Var != null) {
            vl0Var.a();
        }
    }

    public static boolean n(AtomicReference<vl0> atomicReference, vl0 vl0Var) {
        boolean z;
        if (vl0Var == null) {
            throw new NullPointerException("d is null");
        }
        while (true) {
            if (atomicReference.compareAndSet(null, vl0Var)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        vl0Var.a();
        if (atomicReference.get() != DISPOSED) {
            l();
        }
        return false;
    }

    public static void o(AtomicReference atomicReference, vl0 vl0Var) {
        boolean z;
        while (true) {
            if (atomicReference.compareAndSet(null, vl0Var)) {
                z = true;
                break;
            } else if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z || atomicReference.get() != DISPOSED) {
            return;
        }
        vl0Var.a();
    }

    public static boolean p(vl0 vl0Var, vl0 vl0Var2) {
        if (vl0Var2 == null) {
            m14.b(new NullPointerException("next is null"));
            return false;
        }
        if (vl0Var == null) {
            return true;
        }
        vl0Var2.a();
        l();
        return false;
    }

    @Override // defpackage.vl0
    public final void a() {
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return true;
    }
}
