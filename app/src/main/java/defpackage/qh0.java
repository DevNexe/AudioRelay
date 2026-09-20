package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qh0 extends g54 {
    public static final qh0 z = new qh0();

    public qh0() {
        super(l15.b, l15.c, l15.d);
    }

    @Override // defpackage.gv0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.oa0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
