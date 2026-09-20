package j$.util.function;

import java.util.function.DoubleFunction;

/* JADX INFO: renamed from: j$.util.function.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1496o implements InterfaceC1499q {
    public final /* synthetic */ DoubleFunction a;

    private /* synthetic */ C1496o(DoubleFunction doubleFunction) {
        this.a = doubleFunction;
    }

    public static /* synthetic */ InterfaceC1499q a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C1498p ? ((C1498p) doubleFunction).a : new C1496o(doubleFunction);
    }

    @Override // j$.util.function.InterfaceC1499q
    public final /* synthetic */ Object apply(double d) {
        return this.a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1496o) {
            obj = ((C1496o) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
