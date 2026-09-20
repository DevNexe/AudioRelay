package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B implements DoubleUnaryOperator {
    public final /* synthetic */ C a;

    private /* synthetic */ B(C c) {
        this.a = c;
    }

    public static /* synthetic */ DoubleUnaryOperator a(C c) {
        if (c == null) {
            return null;
        }
        return c instanceof A ? ((A) c).a : new B(c);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return a(((A) this.a).a(A.d(doubleUnaryOperator)));
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ double applyAsDouble(double d) {
        return ((A) this.a).b(d);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return a(((A) this.a).c(A.d(doubleUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C c = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return c.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
