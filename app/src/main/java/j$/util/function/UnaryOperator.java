package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface UnaryOperator<T> extends Function<T, T> {

    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {
        public final /* synthetic */ java.util.function.UnaryOperator a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return unaryOperator instanceof O0 ? ((O0) unaryOperator).a : new VivifiedWrapper(unaryOperator);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return Function.VivifiedWrapper.convert(this.a.andThen(E.a(function)));
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.a.apply(obj);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function compose(Function function) {
            return Function.VivifiedWrapper.convert(this.a.compose(E.a(function)));
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
}
