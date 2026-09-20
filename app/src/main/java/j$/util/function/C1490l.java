package j$.util.function;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.function.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1490l implements InterfaceC1494n {
    public final /* synthetic */ DoubleConsumer a;

    private /* synthetic */ C1490l(DoubleConsumer doubleConsumer) {
        this.a = doubleConsumer;
    }

    public static /* synthetic */ InterfaceC1494n a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C1492m ? ((C1492m) doubleConsumer).a : new C1490l(doubleConsumer);
    }

    @Override // j$.util.function.InterfaceC1494n
    public final /* synthetic */ void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1490l) {
            obj = ((C1490l) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.InterfaceC1494n
    public final /* synthetic */ InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        return a(this.a.andThen(C1492m.a(interfaceC1494n)));
    }
}
