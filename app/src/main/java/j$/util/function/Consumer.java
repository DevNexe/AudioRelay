package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface Consumer<T> {

    /* JADX INFO: renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
            consumer2.getClass();
            return new j$.util.concurrent.u(3, consumer, consumer2);
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements Consumer {
        public final /* synthetic */ java.util.function.Consumer a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof C1480g ? ((C1480g) consumer).a : new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.a.accept(obj);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.a.andThen(C1480g.a(consumer)));
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

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
