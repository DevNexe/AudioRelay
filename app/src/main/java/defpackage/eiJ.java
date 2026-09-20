package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class eiJ implements nq4 {
    public final /* synthetic */ oj.w w;
    public final /* synthetic */ nq4 x;

    public eiJ(eq4 eq4Var, so1 so1Var) {
        this.w = eq4Var;
        this.x = so1Var;
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        nq4 nq4Var = this.x;
        oj.w wVar = this.w;
        wVar.i();
        try {
            try {
                nq4Var.close();
                sd5 sd5Var = sd5.a;
                if (wVar.j()) {
                    throw wVar.k(null);
                }
            } catch (IOException e) {
                if (!wVar.j()) {
                    throw e;
                }
                throw wVar.k(e);
            }
        } catch (Throwable th) {
            wVar.j();
            throw th;
        }
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return this.w;
    }

    @Override // defpackage.nq4
    public final long p(gg ggVar, long j) throws IOException {
        nq4 nq4Var = this.x;
        oj.w wVar = this.w;
        wVar.i();
        try {
            try {
                long jP = nq4Var.p(ggVar, j);
                if (wVar.j()) {
                    throw wVar.k(null);
                }
                return jP;
            } catch (IOException e) {
                if (wVar.j()) {
                    throw wVar.k(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            wVar.j();
            throw th;
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.x + ')';
    }
}
