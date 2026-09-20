package j$.util.function;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J implements L {
    public final /* synthetic */ IntConsumer a;

    private /* synthetic */ J(IntConsumer intConsumer) {
        this.a = intConsumer;
    }

    public static /* synthetic */ L a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof K ? ((K) intConsumer).a : new J(intConsumer);
    }

    @Override // j$.util.function.L
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.function.L
    public final /* synthetic */ L n(L l) {
        return a(this.a.andThen(K.a(l)));
    }
}
