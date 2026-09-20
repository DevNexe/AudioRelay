package j$.util.function;

import java.util.function.DoubleToIntFunction;

/* JADX INFO: renamed from: j$.util.function.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1502u implements InterfaceC1504w {
    public final /* synthetic */ DoubleToIntFunction a;

    private /* synthetic */ C1502u(DoubleToIntFunction doubleToIntFunction) {
        this.a = doubleToIntFunction;
    }

    public static /* synthetic */ InterfaceC1504w b(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return doubleToIntFunction instanceof C1503v ? ((C1503v) doubleToIntFunction).a : new C1502u(doubleToIntFunction);
    }

    public final /* synthetic */ int a(double d) {
        return this.a.applyAsInt(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1502u) {
            obj = ((C1502u) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
