package j$.util.function;

import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    public final /* synthetic */ class VivifiedWrapper implements BiFunction {
        public final /* synthetic */ java.util.function.BiFunction a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            if (biFunction instanceof C1470b) {
                return ((C1470b) biFunction).a;
            }
            return biFunction instanceof BinaryOperator ? C1474d.a((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ BiFunction andThen(Function function) {
            return convert(this.a.andThen(E.a(function)));
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.a.apply(obj, obj2);
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

    BiFunction andThen(Function function);

    Object apply(Object obj, Object obj2);
}
