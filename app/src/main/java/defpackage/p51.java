package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p51 implements nq4 {
    public final nq4 w;

    public p51(nq4 nq4Var) {
        this.w = nq4Var;
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.w.close();
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return this.w.d();
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
