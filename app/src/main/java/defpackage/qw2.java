package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class qw2 implements bm4 {
    public final OutputStream w;
    public final z75 x;

    public qw2(OutputStream outputStream, eq4 eq4Var) {
        this.w = outputStream;
        this.x = eq4Var;
    }

    @Override // defpackage.bm4
    public final void V(gg ggVar, long j) throws IOException {
        cp5.a(ggVar.x, 0L, j);
        while (j > 0) {
            this.x.f();
            g74 g74Var = ggVar.w;
            int iMin = (int) Math.min(j, g74Var.c - g74Var.b);
            this.w.write(g74Var.a, g74Var.b, iMin);
            int i = g74Var.b + iMin;
            g74Var.b = i;
            long j2 = iMin;
            j -= j2;
            ggVar.x -= j2;
            if (i == g74Var.c) {
                ggVar.w = g74Var.a();
                h74.a(g74Var);
            }
        }
    }

    @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.w.close();
    }

    @Override // defpackage.bm4
    public final z75 d() {
        return this.x;
    }

    @Override // defpackage.bm4, java.io.Flushable
    public final void flush() throws IOException {
        this.w.flush();
    }

    public final String toString() {
        return "sink(" + this.w + ')';
    }
}
