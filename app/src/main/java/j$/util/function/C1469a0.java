package j$.util.function;

import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.function.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1469a0 implements InterfaceC1473c0 {
    public final /* synthetic */ LongBinaryOperator a;

    private /* synthetic */ C1469a0(LongBinaryOperator longBinaryOperator) {
        this.a = longBinaryOperator;
    }

    public static /* synthetic */ InterfaceC1473c0 a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C1471b0 ? ((C1471b0) longBinaryOperator).a : new C1469a0(longBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC1473c0
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C1469a0) {
            obj = ((C1469a0) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
