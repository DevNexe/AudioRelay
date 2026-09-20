package j$.util.function;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.function.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1491l0 implements LongPredicate {
    public final /* synthetic */ InterfaceC1493m0 a;

    private /* synthetic */ C1491l0(InterfaceC1493m0 interfaceC1493m0) {
        this.a = interfaceC1493m0;
    }

    public static /* synthetic */ LongPredicate a(InterfaceC1493m0 interfaceC1493m0) {
        if (interfaceC1493m0 == null) {
            return null;
        }
        return interfaceC1493m0 instanceof C1489k0 ? ((C1489k0) interfaceC1493m0).a : new C1491l0(interfaceC1493m0);
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return a(((C1489k0) this.a).a(C1489k0.b(longPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1493m0 interfaceC1493m0 = this.a;
        if (obj instanceof C1491l0) {
            obj = ((C1491l0) obj).a;
        }
        return interfaceC1493m0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate negate() {
        return a(((C1489k0) this.a).c());
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return a(((C1489k0) this.a).d(C1489k0.b(longPredicate)));
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ boolean test(long j) {
        return ((C1489k0) this.a).e(j);
    }
}
