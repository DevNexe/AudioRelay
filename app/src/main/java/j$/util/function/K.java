package j$.util.function;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K implements IntConsumer {
    public final /* synthetic */ L a;

    private /* synthetic */ K(L l) {
        this.a = l;
    }

    public static /* synthetic */ IntConsumer a(L l) {
        if (l == null) {
            return null;
        }
        return l instanceof J ? ((J) l).a : new K(l);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        this.a.accept(i);
    }

    @Override // java.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return a(this.a.n(J.a(intConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        L l = this.a;
        if (obj instanceof K) {
            obj = ((K) obj).a;
        }
        return l.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
