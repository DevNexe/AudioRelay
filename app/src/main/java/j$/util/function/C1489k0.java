package j$.util.function;

import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.function.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1489k0 implements InterfaceC1493m0 {
    public final /* synthetic */ LongPredicate a;

    private /* synthetic */ C1489k0(LongPredicate longPredicate) {
        this.a = longPredicate;
    }

    public static /* synthetic */ InterfaceC1493m0 b(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C1491l0 ? ((C1491l0) longPredicate).a : new C1489k0(longPredicate);
    }

    public final /* synthetic */ InterfaceC1493m0 a(InterfaceC1493m0 interfaceC1493m0) {
        return b(this.a.and(C1491l0.a(interfaceC1493m0)));
    }

    public final /* synthetic */ InterfaceC1493m0 c() {
        return b(this.a.negate());
    }

    public final /* synthetic */ InterfaceC1493m0 d(InterfaceC1493m0 interfaceC1493m0) {
        return b(this.a.or(C1491l0.a(interfaceC1493m0)));
    }

    public final /* synthetic */ boolean e(long j) {
        return this.a.test(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1489k0) {
            obj = ((C1489k0) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
