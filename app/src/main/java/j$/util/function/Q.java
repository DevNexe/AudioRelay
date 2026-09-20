package j$.util.function;

import java.util.function.IntToDoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Q implements T {
    public final /* synthetic */ IntToDoubleFunction a;

    private /* synthetic */ Q(IntToDoubleFunction intToDoubleFunction) {
        this.a = intToDoubleFunction;
    }

    public static /* synthetic */ T b(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return intToDoubleFunction instanceof S ? ((S) intToDoubleFunction).a : new Q(intToDoubleFunction);
    }

    public final /* synthetic */ double a(int i) {
        return this.a.applyAsDouble(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof Q) {
            obj = ((Q) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
