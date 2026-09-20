package j$.util.function;

import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: j$.util.function.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1500s implements DoublePredicate {
    public final /* synthetic */ InterfaceC1501t a;

    private /* synthetic */ C1500s(InterfaceC1501t interfaceC1501t) {
        this.a = interfaceC1501t;
    }

    public static /* synthetic */ DoublePredicate a(InterfaceC1501t interfaceC1501t) {
        if (interfaceC1501t == null) {
            return null;
        }
        return interfaceC1501t instanceof r ? ((r) interfaceC1501t).a : new C1500s(interfaceC1501t);
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return a(((r) this.a).a(r.b(doublePredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1501t interfaceC1501t = this.a;
        if (obj instanceof C1500s) {
            obj = ((C1500s) obj).a;
        }
        return interfaceC1501t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate negate() {
        return a(((r) this.a).c());
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return a(((r) this.a).d(r.b(doublePredicate)));
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d) {
        return ((r) this.a).e(d);
    }
}
