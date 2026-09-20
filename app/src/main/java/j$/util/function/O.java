package j$.util.function;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O implements IntPredicate {
    public final /* synthetic */ P a;

    private /* synthetic */ O(P p) {
        this.a = p;
    }

    public static /* synthetic */ IntPredicate a(P p) {
        if (p == null) {
            return null;
        }
        return p instanceof N ? ((N) p).a : new O(p);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return a(((N) this.a).a(N.b(intPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        P p = this.a;
        if (obj instanceof O) {
            obj = ((O) obj).a;
        }
        return p.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate negate() {
        return a(((N) this.a).c());
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return a(((N) this.a).d(N.b(intPredicate)));
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return ((N) this.a).e(i);
    }
}
