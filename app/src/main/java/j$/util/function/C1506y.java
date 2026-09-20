package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* JADX INFO: renamed from: j$.util.function.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1506y implements DoubleToLongFunction {
    public final /* synthetic */ InterfaceC1507z a;

    private /* synthetic */ C1506y(InterfaceC1507z interfaceC1507z) {
        this.a = interfaceC1507z;
    }

    public static /* synthetic */ DoubleToLongFunction a(InterfaceC1507z interfaceC1507z) {
        if (interfaceC1507z == null) {
            return null;
        }
        return interfaceC1507z instanceof C1505x ? ((C1505x) interfaceC1507z).a : new C1506y(interfaceC1507z);
    }

    @Override // java.util.function.DoubleToLongFunction
    public final /* synthetic */ long applyAsLong(double d) {
        return this.a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1507z interfaceC1507z = this.a;
        if (obj instanceof C1506y) {
            obj = ((C1506y) obj).a;
        }
        return interfaceC1507z.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
