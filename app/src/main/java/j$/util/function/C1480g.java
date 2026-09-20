package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1480g implements java.util.function.Consumer {
    public final /* synthetic */ Consumer a;

    private /* synthetic */ C1480g(Consumer consumer) {
        this.a = consumer;
    }

    public static /* synthetic */ java.util.function.Consumer a(Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.VivifiedWrapper ? ((Consumer.VivifiedWrapper) consumer).a : new C1480g(consumer);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.a.accept(obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return a(this.a.andThen(Consumer.VivifiedWrapper.convert(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Consumer consumer = this.a;
        if (obj instanceof C1480g) {
            obj = ((C1480g) obj).a;
        }
        return consumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
