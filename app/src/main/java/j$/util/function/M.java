package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M implements java.util.function.IntFunction {
    public final /* synthetic */ IntFunction a;

    private /* synthetic */ M(IntFunction intFunction) {
        this.a = intFunction;
    }

    public static /* synthetic */ java.util.function.IntFunction a(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return intFunction instanceof IntFunction.VivifiedWrapper ? ((IntFunction.VivifiedWrapper) intFunction).a : new M(intFunction);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return this.a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntFunction intFunction = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return intFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
