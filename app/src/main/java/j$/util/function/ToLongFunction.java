package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface ToLongFunction<T> {

    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {
        public final /* synthetic */ java.util.function.ToLongFunction a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return toLongFunction instanceof N0 ? ((N0) toLongFunction).a : new VivifiedWrapper(toLongFunction);
        }

        @Override // j$.util.function.ToLongFunction
        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.a.applyAsLong(obj);
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

    long applyAsLong(Object obj);
}
