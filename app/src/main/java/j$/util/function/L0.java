package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L0 implements java.util.function.ToDoubleFunction {
    public final /* synthetic */ ToDoubleFunction a;

    private /* synthetic */ L0(ToDoubleFunction toDoubleFunction) {
        this.a = toDoubleFunction;
    }

    public static /* synthetic */ java.util.function.ToDoubleFunction a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return toDoubleFunction instanceof ToDoubleFunction.VivifiedWrapper ? ((ToDoubleFunction.VivifiedWrapper) toDoubleFunction).a : new L0(toDoubleFunction);
    }

    @Override // java.util.function.ToDoubleFunction
    public final /* synthetic */ double applyAsDouble(Object obj) {
        return this.a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToDoubleFunction toDoubleFunction = this.a;
        if (obj instanceof L0) {
            obj = ((L0) obj).a;
        }
        return toDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
