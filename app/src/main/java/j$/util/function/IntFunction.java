package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface IntFunction<R> {

    public final /* synthetic */ class VivifiedWrapper implements IntFunction {
        public final /* synthetic */ java.util.function.IntFunction a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntFunction intFunction) {
            this.a = intFunction;
        }

        public static /* synthetic */ IntFunction convert(java.util.function.IntFunction intFunction) {
            if (intFunction == null) {
                return null;
            }
            return intFunction instanceof M ? ((M) intFunction).a : new VivifiedWrapper(intFunction);
        }

        @Override // j$.util.function.IntFunction
        public final /* synthetic */ Object apply(int i) {
            return this.a.apply(i);
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

    Object apply(int i);
}
