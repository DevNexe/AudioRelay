package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1468a implements java.util.function.BiConsumer {
    public final /* synthetic */ BiConsumer a;

    private /* synthetic */ C1468a(BiConsumer biConsumer) {
        this.a = biConsumer;
    }

    public static /* synthetic */ java.util.function.BiConsumer a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).a : new C1468a(biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.a.accept(obj, obj2);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return a(this.a.c(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.a;
        if (obj instanceof C1468a) {
            obj = ((C1468a) obj).a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
