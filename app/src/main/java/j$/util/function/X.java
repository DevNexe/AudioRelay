package j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class X implements Z {
    public final /* synthetic */ IntUnaryOperator a;

    private /* synthetic */ X(IntUnaryOperator intUnaryOperator) {
        this.a = intUnaryOperator;
    }

    public static /* synthetic */ Z d(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof Y ? ((Y) intUnaryOperator).a : new X(intUnaryOperator);
    }

    public final /* synthetic */ Z a(Z z) {
        return d(this.a.andThen(Y.a(z)));
    }

    public final /* synthetic */ int b(int i) {
        return this.a.applyAsInt(i);
    }

    public final /* synthetic */ Z c(Z z) {
        return d(this.a.compose(Y.a(z)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof X) {
            obj = ((X) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
