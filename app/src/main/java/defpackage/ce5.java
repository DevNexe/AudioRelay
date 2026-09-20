package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ce5<T> implements oz1<T>, Serializable {
    public h81<? extends T> w;
    public Object x = ddf.x;

    public ce5(h81<? extends T> h81Var) {
        this.w = h81Var;
    }

    @Override // defpackage.oz1
    public final T getValue() {
        if (this.x == ddf.x) {
            this.x = this.w.invoke();
            this.w = null;
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
