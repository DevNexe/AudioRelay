package j$.util.function;

import java.util.function.DoubleToLongFunction;

/* JADX INFO: renamed from: j$.util.function.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1505x implements InterfaceC1507z {
    public final /* synthetic */ DoubleToLongFunction a;

    private /* synthetic */ C1505x(DoubleToLongFunction doubleToLongFunction) {
        this.a = doubleToLongFunction;
    }

    public static /* synthetic */ InterfaceC1507z a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C1506y ? ((C1506y) doubleToLongFunction).a : new C1505x(doubleToLongFunction);
    }

    @Override // j$.util.function.InterfaceC1507z
    public final /* synthetic */ long applyAsLong(double d) {
        return this.a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1505x) {
            obj = ((C1505x) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
