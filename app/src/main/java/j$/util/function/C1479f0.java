package j$.util.function;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.function.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1479f0 implements LongConsumer {
    public final /* synthetic */ InterfaceC1481g0 a;

    private /* synthetic */ C1479f0(InterfaceC1481g0 interfaceC1481g0) {
        this.a = interfaceC1481g0;
    }

    public static /* synthetic */ LongConsumer a(InterfaceC1481g0 interfaceC1481g0) {
        if (interfaceC1481g0 == null) {
            return null;
        }
        return interfaceC1481g0 instanceof C1477e0 ? ((C1477e0) interfaceC1481g0).a : new C1479f0(interfaceC1481g0);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return a(this.a.i(C1477e0.a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1481g0 interfaceC1481g0 = this.a;
        if (obj instanceof C1479f0) {
            obj = ((C1479f0) obj).a;
        }
        return interfaceC1481g0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
