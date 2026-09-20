package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ry4<T> implements oz1<T>, Serializable {
    public h81<? extends T> w;
    public volatile Object x = ddf.x;
    public final Object y = this;

    public ry4(h81 h81Var) {
        this.w = h81Var;
    }

    @Override // defpackage.oz1
    public final T getValue() {
        T tInvoke;
        T t = (T) this.x;
        ddf ddfVar = ddf.x;
        if (t != ddfVar) {
            return t;
        }
        synchronized (this.y) {
            tInvoke = (T) this.x;
            if (tInvoke == ddfVar) {
                tInvoke = this.w.invoke();
                this.x = tInvoke;
                this.w = null;
            }
        }
        return tInvoke;
    }

    @Override // defpackage.oz1
    public final boolean isInitialized() {
        return this.x != ddf.x;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
