package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H0 implements Predicate {
    public final /* synthetic */ Predicate a;

    public /* synthetic */ H0(Predicate predicate) {
        this.a = predicate;
    }

    @Override // j$.util.function.Predicate
    public final Predicate a(Predicate predicate) {
        predicate.getClass();
        return new G0(this, predicate, 0);
    }

    @Override // j$.util.function.Predicate
    public final Predicate b(Predicate predicate) {
        predicate.getClass();
        return new G0(this, predicate, 1);
    }

    @Override // j$.util.function.Predicate
    public final Predicate negate() {
        return new H0(this);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return !this.a.test(obj);
    }
}
