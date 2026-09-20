package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class y9I implements bm4 {
    public final /* synthetic */ oj.w w;
    public final /* synthetic */ bm4 x;

    public y9I(eq4 eq4Var, qw2 qw2Var) {
        this.w = eq4Var;
        this.x = qw2Var;
    }

    @Override // defpackage.bm4
    public final void V(gg ggVar, long j) throws IOException {
        cp5.a(ggVar.x, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            g74 g74Var = ggVar.w;
            while (j2 < 65536) {
                j2 += (long) (g74Var.c - g74Var.b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                g74Var = g74Var.f;
            }
            bm4 bm4Var = this.x;
            oj.w wVar = this.w;
            wVar.i();
            try {
                try {
                    bm4Var.V(ggVar, j2);
                    sd5 sd5Var = sd5.a;
                    if (wVar.j()) {
                        throw wVar.k(null);
                    }
                    j -= j2;
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
    }

    @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        bm4 bm4Var = this.x;
        oj.w wVar = this.w;
        wVar.i();
        try {
            try {
                bm4Var.close();
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

    @Override // defpackage.bm4
    public final z75 d() {
        return this.w;
    }

    @Override // defpackage.bm4, java.io.Flushable
    public final void flush() throws IOException {
        bm4 bm4Var = this.x;
        oj.w wVar = this.w;
        wVar.i();
        try {
            try {
                bm4Var.flush();
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

    public final String toString() {
        return "AsyncTimeout.sink(" + this.x + ')';
    }
}
