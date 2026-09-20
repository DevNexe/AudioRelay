package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* JADX INFO: renamed from: j$.util.function.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1495n0 implements p0 {
    public final /* synthetic */ LongToDoubleFunction a;

    private /* synthetic */ C1495n0(LongToDoubleFunction longToDoubleFunction) {
        this.a = longToDoubleFunction;
    }

    public static /* synthetic */ p0 b(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return longToDoubleFunction instanceof C1497o0 ? ((C1497o0) longToDoubleFunction).a : new C1495n0(longToDoubleFunction);
    }

    public final /* synthetic */ double a(long j) {
        return this.a.applyAsDouble(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1495n0) {
            obj = ((C1495n0) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
