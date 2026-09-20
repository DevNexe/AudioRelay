package j$.util.function;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N implements P {
    public final /* synthetic */ IntPredicate a;

    private /* synthetic */ N(IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    public static /* synthetic */ P b(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return intPredicate instanceof O ? ((O) intPredicate).a : new N(intPredicate);
    }

    public final /* synthetic */ P a(P p) {
        return b(this.a.and(O.a(p)));
    }

    public final /* synthetic */ P c() {
        return b(this.a.negate());
    }

    public final /* synthetic */ P d(P p) {
        return b(this.a.or(O.a(p)));
    }

    public final /* synthetic */ boolean e(int i) {
        return this.a.test(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof N) {
            obj = ((N) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
