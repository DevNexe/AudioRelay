package j$.util.function;

import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.function.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1471b0 implements LongBinaryOperator {
    public final /* synthetic */ InterfaceC1473c0 a;

    private /* synthetic */ C1471b0(InterfaceC1473c0 interfaceC1473c0) {
        this.a = interfaceC1473c0;
    }

    public static /* synthetic */ LongBinaryOperator a(InterfaceC1473c0 interfaceC1473c0) {
        if (interfaceC1473c0 == null) {
            return null;
        }
        return interfaceC1473c0 instanceof C1469a0 ? ((C1469a0) interfaceC1473c0).a : new C1471b0(interfaceC1473c0);
    }

    @Override // java.util.function.LongBinaryOperator
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1473c0 interfaceC1473c0 = this.a;
        if (obj instanceof C1471b0) {
            obj = ((C1471b0) obj).a;
        }
        return interfaceC1473c0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
