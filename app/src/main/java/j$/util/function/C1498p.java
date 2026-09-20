package j$.util.function;

import java.util.function.DoubleFunction;

/* JADX INFO: renamed from: j$.util.function.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1498p implements DoubleFunction {
    public final /* synthetic */ InterfaceC1499q a;

    private /* synthetic */ C1498p(InterfaceC1499q interfaceC1499q) {
        this.a = interfaceC1499q;
    }

    public static /* synthetic */ DoubleFunction a(InterfaceC1499q interfaceC1499q) {
        if (interfaceC1499q == null) {
            return null;
        }
        return interfaceC1499q instanceof C1496o ? ((C1496o) interfaceC1499q).a : new C1498p(interfaceC1499q);
    }

    @Override // java.util.function.DoubleFunction
    public final /* synthetic */ Object apply(double d) {
        return this.a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1499q interfaceC1499q = this.a;
        if (obj instanceof C1498p) {
            obj = ((C1498p) obj).a;
        }
        return interfaceC1499q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
