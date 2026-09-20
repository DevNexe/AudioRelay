package j$.util.function;

import java.util.function.IntToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class V implements IntToLongFunction {
    public final /* synthetic */ W a;

    private /* synthetic */ V(W w) {
        this.a = w;
    }

    public static /* synthetic */ IntToLongFunction a(W w) {
        if (w == null) {
            return null;
        }
        return w instanceof U ? ((U) w).a : new V(w);
    }

    @Override // java.util.function.IntToLongFunction
    public final /* synthetic */ long applyAsLong(int i) {
        return this.a.applyAsLong(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        W w = this.a;
        if (obj instanceof V) {
            obj = ((V) obj).a;
        }
        return w.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
