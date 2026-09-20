package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface ToDoubleFunction<T> {

    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {
        public final /* synthetic */ java.util.function.ToDoubleFunction a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return toDoubleFunction instanceof L0 ? ((L0) toDoubleFunction).a : new VivifiedWrapper(toDoubleFunction);
        }

        @Override // j$.util.function.ToDoubleFunction
        public final /* synthetic */ double applyAsDouble(Object obj) {
            return this.a.applyAsDouble(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return this.a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }
    }

    double applyAsDouble(Object obj);
}
