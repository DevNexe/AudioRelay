package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1470b implements java.util.function.BiFunction {
    public final /* synthetic */ BiFunction a;

    private /* synthetic */ C1470b(BiFunction biFunction) {
        this.a = biFunction;
    }

    public static /* synthetic */ java.util.function.BiFunction a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        if (biFunction instanceof BiFunction.VivifiedWrapper) {
            return ((BiFunction.VivifiedWrapper) biFunction).a;
        }
        return biFunction instanceof InterfaceC1478f ? C1476e.a((InterfaceC1478f) biFunction) : new C1470b(biFunction);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return a(this.a.andThen(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiFunction biFunction = this.a;
        if (obj instanceof C1470b) {
            obj = ((C1470b) obj).a;
        }
        return biFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
