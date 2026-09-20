package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* JADX INFO: renamed from: j$.util.function.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1503v implements DoubleToIntFunction {
    public final /* synthetic */ InterfaceC1504w a;

    private /* synthetic */ C1503v(InterfaceC1504w interfaceC1504w) {
        this.a = interfaceC1504w;
    }

    public static /* synthetic */ DoubleToIntFunction a(InterfaceC1504w interfaceC1504w) {
        if (interfaceC1504w == null) {
            return null;
        }
        return interfaceC1504w instanceof C1502u ? ((C1502u) interfaceC1504w).a : new C1503v(interfaceC1504w);
    }

    @Override // java.util.function.DoubleToIntFunction
    public final /* synthetic */ int applyAsInt(double d) {
        return ((C1502u) this.a).a(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1504w interfaceC1504w = this.a;
        if (obj instanceof C1503v) {
            obj = ((C1503v) obj).a;
        }
        return interfaceC1504w.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
