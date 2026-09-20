package j$.util.function;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.function.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1492m implements DoubleConsumer {
    public final /* synthetic */ InterfaceC1494n a;

    private /* synthetic */ C1492m(InterfaceC1494n interfaceC1494n) {
        this.a = interfaceC1494n;
    }

    public static /* synthetic */ DoubleConsumer a(InterfaceC1494n interfaceC1494n) {
        if (interfaceC1494n == null) {
            return null;
        }
        return interfaceC1494n instanceof C1490l ? ((C1490l) interfaceC1494n).a : new C1492m(interfaceC1494n);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        this.a.accept(d);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return a(this.a.m(C1490l.a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1494n interfaceC1494n = this.a;
        if (obj instanceof C1492m) {
            obj = ((C1492m) obj).a;
        }
        return interfaceC1494n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
