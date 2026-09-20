package j$.util.function;

import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.function.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1483h0 implements InterfaceC1487j0 {
    public final /* synthetic */ LongFunction a;

    private /* synthetic */ C1483h0(LongFunction longFunction) {
        this.a = longFunction;
    }

    public static /* synthetic */ InterfaceC1487j0 a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return longFunction instanceof C1485i0 ? ((C1485i0) longFunction).a : new C1483h0(longFunction);
    }

    @Override // j$.util.function.InterfaceC1487j0
    public final /* synthetic */ Object apply(long j) {
        return this.a.apply(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1483h0) {
            obj = ((C1483h0) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
