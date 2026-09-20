package j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Y implements IntUnaryOperator {
    public final /* synthetic */ Z a;

    private /* synthetic */ Y(Z z) {
        this.a = z;
    }

    public static /* synthetic */ IntUnaryOperator a(Z z) {
        if (z == null) {
            return null;
        }
        return z instanceof X ? ((X) z).a : new Y(z);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return a(((X) this.a).a(X.d(intUnaryOperator)));
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ int applyAsInt(int i) {
        return ((X) this.a).b(i);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return a(((X) this.a).c(X.d(intUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Z z = this.a;
        if (obj instanceof Y) {
            obj = ((Y) obj).a;
        }
        return z.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
