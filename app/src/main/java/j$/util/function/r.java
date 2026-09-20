package j$.util.function;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements InterfaceC1501t {
    public final /* synthetic */ DoublePredicate a;

    private /* synthetic */ r(DoublePredicate doublePredicate) {
        this.a = doublePredicate;
    }

    public static /* synthetic */ InterfaceC1501t b(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof C1500s ? ((C1500s) doublePredicate).a : new r(doublePredicate);
    }

    public final /* synthetic */ InterfaceC1501t a(InterfaceC1501t interfaceC1501t) {
        return b(this.a.and(C1500s.a(interfaceC1501t)));
    }

    public final /* synthetic */ InterfaceC1501t c() {
        return b(this.a.negate());
    }

    public final /* synthetic */ InterfaceC1501t d(InterfaceC1501t interfaceC1501t) {
        return b(this.a.or(C1500s.a(interfaceC1501t)));
    }

    public final /* synthetic */ boolean e(double d) {
        return this.a.test(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
