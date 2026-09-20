package j$.util.function;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.function.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1477e0 implements InterfaceC1481g0 {
    public final /* synthetic */ LongConsumer a;

    private /* synthetic */ C1477e0(LongConsumer longConsumer) {
        this.a = longConsumer;
    }

    public static /* synthetic */ InterfaceC1481g0 a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C1479f0 ? ((C1479f0) longConsumer).a : new C1477e0(longConsumer);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final /* synthetic */ void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1477e0) {
            obj = ((C1477e0) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final /* synthetic */ InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        return a(this.a.andThen(C1479f0.a(interfaceC1481g0)));
    }
}
