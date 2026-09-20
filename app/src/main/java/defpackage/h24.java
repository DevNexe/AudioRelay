package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class h24<T> implements oz1<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<h24<?>, Object> y = AtomicReferenceFieldUpdater.newUpdater(h24.class, Object.class, "x");
    public volatile h81<? extends T> w;
    public volatile Object x = ddf.x;

    public h24(h81<? extends T> h81Var) {
        this.w = h81Var;
    }

    @Override // defpackage.oz1
    public final T getValue() {
        boolean z;
        T t = (T) this.x;
        ddf ddfVar = ddf.x;
        if (t != ddfVar) {
            return t;
        }
        h81<? extends T> h81Var = this.w;
        if (h81Var != null) {
            T tInvoke = h81Var.invoke();
            AtomicReferenceFieldUpdater<h24<?>, Object> atomicReferenceFieldUpdater = y;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, ddfVar, tInvoke)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != ddfVar) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.w = null;
                return tInvoke;
            }
        }
        return (T) this.x;
    }

    @Override // defpackage.oz1
    public final boolean isInitialized() {
        return this.x != ddf.x;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
