package j$.util.function;

import java.util.function.IntToDoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class S implements IntToDoubleFunction {
    public final /* synthetic */ T a;

    private /* synthetic */ S(T t) {
        this.a = t;
    }

    public static /* synthetic */ IntToDoubleFunction a(T t) {
        if (t == null) {
            return null;
        }
        return t instanceof Q ? ((Q) t).a : new S(t);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final /* synthetic */ double applyAsDouble(int i) {
        return ((Q) this.a).a(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        T t = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
