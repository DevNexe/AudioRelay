package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class so1 implements nq4 {
    public final InputStream w;
    public final z75 x;

    public so1(InputStream inputStream, z75 z75Var) {
        this.w = inputStream;
        this.x = z75Var;
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        this.w.close();
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return this.x;
    }

    @Override // defpackage.nq4
    public final long p(gg ggVar, long j) {
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        try {
            this.x.f();
            g74 g74VarF = ggVar.F(1);
            int i = this.w.read(g74VarF.a, g74VarF.c, (int) Math.min(j, 8192 - g74VarF.c));
            if (i != -1) {
                g74VarF.c += i;
                long j2 = i;
                ggVar.x += j2;
                return j2;
            }
            if (g74VarF.b != g74VarF.c) {
                return -1L;
            }
            ggVar.w = g74VarF.a();
            h74.a(g74VarF);
            return -1L;
        } catch (AssertionError e) {
            if (fp1.f0(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "source(" + this.w + ')';
    }
}
