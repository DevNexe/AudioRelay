package j$.util.function;

import java.util.function.LongToDoubleFunction;

/* JADX INFO: renamed from: j$.util.function.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1497o0 implements LongToDoubleFunction {
    public final /* synthetic */ p0 a;

    private /* synthetic */ C1497o0(p0 p0Var) {
        this.a = p0Var;
    }

    public static /* synthetic */ LongToDoubleFunction a(p0 p0Var) {
        if (p0Var == null) {
            return null;
        }
        return p0Var instanceof C1495n0 ? ((C1495n0) p0Var).a : new C1497o0(p0Var);
    }

    @Override // java.util.function.LongToDoubleFunction
    public final /* synthetic */ double applyAsDouble(long j) {
        return ((C1495n0) this.a).a(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        p0 p0Var = this.a;
        if (obj instanceof C1497o0) {
            obj = ((C1497o0) obj).a;
        }
        return p0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
