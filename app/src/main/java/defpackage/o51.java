package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o51 implements bm4 {
    public final bm4 w;

    public o51(bm4 bm4Var) {
        this.w = bm4Var;
    }

    @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.w.close();
    }

    @Override // defpackage.bm4
    public final z75 d() {
        return this.w.d();
    }

    @Override // defpackage.bm4, java.io.Flushable
    public void flush() {
        this.w.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.w);
        sb.append(')');
        return sb.toString();
    }
}
