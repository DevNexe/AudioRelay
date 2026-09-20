package j$.util.function;

import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements H {
    public final /* synthetic */ IntBinaryOperator a;

    private /* synthetic */ F(IntBinaryOperator intBinaryOperator) {
        this.a = intBinaryOperator;
    }

    public static /* synthetic */ H a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof G ? ((G) intBinaryOperator).a : new F(intBinaryOperator);
    }

    @Override // j$.util.function.H
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
