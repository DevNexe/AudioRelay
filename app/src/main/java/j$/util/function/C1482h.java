package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: renamed from: j$.util.function.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1482h implements InterfaceC1486j {
    public final /* synthetic */ DoubleBinaryOperator a;

    private /* synthetic */ C1482h(DoubleBinaryOperator doubleBinaryOperator) {
        this.a = doubleBinaryOperator;
    }

    public static /* synthetic */ InterfaceC1486j a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C1484i ? ((C1484i) doubleBinaryOperator).a : new C1482h(doubleBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC1486j
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1482h) {
            obj = ((C1482h) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
