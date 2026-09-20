package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface Predicate<T> {

    public final /* synthetic */ class VivifiedWrapper implements Predicate {
        public final /* synthetic */ java.util.function.Predicate a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof I0 ? ((I0) predicate).a : new VivifiedWrapper(predicate);
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate a(Predicate predicate) {
            return convert(this.a.and(I0.a(predicate)));
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate b(Predicate predicate) {
            return convert(this.a.or(I0.a(predicate)));
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

        @Override // j$.util.function.Predicate
        public final /* synthetic */ Predicate negate() {
            return convert(this.a.negate());
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ boolean test(Object obj) {
            return this.a.test(obj);
        }
    }

    Predicate a(Predicate predicate);

    Predicate b(Predicate predicate);

    Predicate negate();

    boolean test(Object obj);
}
