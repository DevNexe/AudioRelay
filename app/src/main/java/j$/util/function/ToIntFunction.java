package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface ToIntFunction<T> {

    public final /* synthetic */ class VivifiedWrapper implements ToIntFunction {
        public final /* synthetic */ java.util.function.ToIntFunction a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.a = toIntFunction;
        }

        public static /* synthetic */ ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return toIntFunction instanceof M0 ? ((M0) toIntFunction).a : new VivifiedWrapper(toIntFunction);
        }

        @Override // j$.util.function.ToIntFunction
        public final /* synthetic */ int applyAsInt(Object obj) {
            return this.a.applyAsInt(obj);
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

    int applyAsInt(Object obj);
}
