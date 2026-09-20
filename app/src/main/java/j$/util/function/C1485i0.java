package j$.util.function;

import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.function.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1485i0 implements LongFunction {
    public final /* synthetic */ InterfaceC1487j0 a;

    private /* synthetic */ C1485i0(InterfaceC1487j0 interfaceC1487j0) {
        this.a = interfaceC1487j0;
    }

    public static /* synthetic */ LongFunction a(InterfaceC1487j0 interfaceC1487j0) {
        if (interfaceC1487j0 == null) {
            return null;
        }
        return interfaceC1487j0 instanceof C1483h0 ? ((C1483h0) interfaceC1487j0).a : new C1485i0(interfaceC1487j0);
    }

    @Override // java.util.function.LongFunction
    public final /* synthetic */ Object apply(long j) {
        return this.a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1487j0 interfaceC1487j0 = this.a;
        if (obj instanceof C1485i0) {
            obj = ((C1485i0) obj).a;
        }
        return interfaceC1487j0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
