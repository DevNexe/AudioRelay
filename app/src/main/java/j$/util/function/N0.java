package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N0 implements java.util.function.ToLongFunction {
    public final /* synthetic */ ToLongFunction a;

    private /* synthetic */ N0(ToLongFunction toLongFunction) {
        this.a = toLongFunction;
    }

    public static /* synthetic */ java.util.function.ToLongFunction a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return toLongFunction instanceof ToLongFunction.VivifiedWrapper ? ((ToLongFunction.VivifiedWrapper) toLongFunction).a : new N0(toLongFunction);
    }

    @Override // java.util.function.ToLongFunction
    public final /* synthetic */ long applyAsLong(Object obj) {
        return this.a.applyAsLong(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.a;
        if (obj instanceof N0) {
            obj = ((N0) obj).a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
