package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O0 implements java.util.function.UnaryOperator {
    public final /* synthetic */ UnaryOperator a;

    private /* synthetic */ O0(UnaryOperator unaryOperator) {
        this.a = unaryOperator;
    }

    public static /* synthetic */ java.util.function.UnaryOperator a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof UnaryOperator.VivifiedWrapper ? ((UnaryOperator.VivifiedWrapper) unaryOperator).a : new O0(unaryOperator);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return E.a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return E.a(this.a.compose(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UnaryOperator unaryOperator = this.a;
        if (obj instanceof O0) {
            obj = ((O0) obj).a;
        }
        return unaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
