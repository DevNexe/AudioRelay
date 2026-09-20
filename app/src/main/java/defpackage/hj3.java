package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hj3 extends jk3.F1 {
    public final /* synthetic */ av0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj3(yh yhVar, xh xhVar, av0 av0Var) {
        super(yhVar, xhVar);
        this.z = av0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.a(true, true, null);
    }
}
