package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface BiConsumer<T, U> {

    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {
        public final /* synthetic */ java.util.function.BiConsumer a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C1468a ? ((C1468a) biConsumer).a : new VivifiedWrapper(biConsumer);
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.a.accept(obj, obj2);
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ BiConsumer c(BiConsumer biConsumer) {
            return convert(this.a.andThen(C1468a.a(biConsumer)));
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

    void accept(Object obj, Object obj2);

    BiConsumer c(BiConsumer biConsumer);
}
