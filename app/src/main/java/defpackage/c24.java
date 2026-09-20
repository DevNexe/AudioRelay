package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class c24<T> implements z80<T>, wa0 {

    @Deprecated
    public static final AtomicReferenceFieldUpdater<c24<?>, Object> x = AtomicReferenceFieldUpdater.newUpdater(c24.class, Object.class, "result");
    private volatile Object result;
    public final z80<T> w;

    public c24(va0 va0Var, z80 z80Var) {
        this.w = z80Var;
        this.result = va0Var;
    }

    public final Object a() throws Throwable {
        boolean z;
        Object obj = this.result;
        va0 va0Var = va0.UNDECIDED;
        va0 va0Var2 = va0.COROUTINE_SUSPENDED;
        if (obj == va0Var) {
            AtomicReferenceFieldUpdater<c24<?>, Object> atomicReferenceFieldUpdater = x;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, va0Var, va0Var2)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != va0Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return va0Var2;
            }
            obj = this.result;
        }
        if (obj == va0.RESUMED) {
            return va0Var2;
        }
        if (obj instanceof fq3.QnHx) {
            throw ((fq3.QnHx) obj).w;
        }
        return obj;
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return this.w.getContext();
    }

    @Override // defpackage.wa0
    public final wa0 k() {
        z80<T> z80Var = this.w;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }

    public final String toString() {
        return "SafeContinuation for " + this.w;
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        while (true) {
            Object obj2 = this.result;
            va0 va0Var = va0.UNDECIDED;
            boolean z = false;
            if (obj2 == va0Var) {
                AtomicReferenceFieldUpdater<c24<?>, Object> atomicReferenceFieldUpdater = x;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, va0Var, obj)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == va0Var);
                if (z) {
                    return;
                }
            } else {
                va0 va0Var2 = va0.COROUTINE_SUSPENDED;
                if (obj2 != va0Var2) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<c24<?>, Object> atomicReferenceFieldUpdater2 = x;
                va0 va0Var3 = va0.RESUMED;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, va0Var2, va0Var3)) {
                        z = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == va0Var2);
                if (z) {
                    this.w.x(obj);
                    return;
                }
            }
        }
    }

    public c24(z80<? super T> z80Var) {
        this(va0.UNDECIDED, z80Var);
    }
}
