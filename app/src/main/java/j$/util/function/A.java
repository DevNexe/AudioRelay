package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements C {
    public final /* synthetic */ DoubleUnaryOperator a;

    private /* synthetic */ A(DoubleUnaryOperator doubleUnaryOperator) {
        this.a = doubleUnaryOperator;
    }

    public static /* synthetic */ C d(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof B ? ((B) doubleUnaryOperator).a : new A(doubleUnaryOperator);
    }

    public final /* synthetic */ C a(C c) {
        return d(this.a.andThen(B.a(c)));
    }

    public final /* synthetic */ double b(double d) {
        return this.a.applyAsDouble(d);
    }

    public final /* synthetic */ C c(C c) {
        return d(this.a.compose(B.a(c)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
