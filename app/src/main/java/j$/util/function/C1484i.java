package j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: renamed from: j$.util.function.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1484i implements DoubleBinaryOperator {
    public final /* synthetic */ InterfaceC1486j a;

    private /* synthetic */ C1484i(InterfaceC1486j interfaceC1486j) {
        this.a = interfaceC1486j;
    }

    public static /* synthetic */ DoubleBinaryOperator a(InterfaceC1486j interfaceC1486j) {
        if (interfaceC1486j == null) {
            return null;
        }
        return interfaceC1486j instanceof C1482h ? ((C1482h) interfaceC1486j).a : new C1484i(interfaceC1486j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1486j interfaceC1486j = this.a;
        if (obj instanceof C1484i) {
            obj = ((C1484i) obj).a;
        }
        return interfaceC1486j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
