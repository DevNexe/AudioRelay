package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M0 implements java.util.function.ToIntFunction {
    public final /* synthetic */ ToIntFunction a;

    private /* synthetic */ M0(ToIntFunction toIntFunction) {
        this.a = toIntFunction;
    }

    public static /* synthetic */ java.util.function.ToIntFunction a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return toIntFunction instanceof ToIntFunction.VivifiedWrapper ? ((ToIntFunction.VivifiedWrapper) toIntFunction).a : new M0(toIntFunction);
    }

    @Override // java.util.function.ToIntFunction
    public final /* synthetic */ int applyAsInt(Object obj) {
        return this.a.applyAsInt(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.a;
        if (obj instanceof M0) {
            obj = ((M0) obj).a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
