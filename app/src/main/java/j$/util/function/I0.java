package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I0 implements java.util.function.Predicate {
    public final /* synthetic */ Predicate a;

    private /* synthetic */ I0(Predicate predicate) {
        this.a = predicate;
    }

    public static /* synthetic */ java.util.function.Predicate a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof Predicate.VivifiedWrapper ? ((Predicate.VivifiedWrapper) predicate).a : new I0(predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return a(this.a.a(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Predicate predicate = this.a;
        if (obj instanceof I0) {
            obj = ((I0) obj).a;
        }
        return predicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        return a(this.a.negate());
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return a(this.a.b(Predicate.VivifiedWrapper.convert(predicate)));
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.a.test(obj);
    }
}
