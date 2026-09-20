package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class fk1 implements nq4 {
    public final yh w;
    public final Inflater x;
    public int y;
    public boolean z;

    public fk1(aj3 aj3Var, Inflater inflater) {
        this.w = aj3Var;
        this.x = inflater;
    }

    public final long b(gg ggVar, long j) throws IOException {
        Inflater inflater = this.x;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (!(!this.z)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            g74 g74VarF = ggVar.F(1);
            int iMin = (int) Math.min(j, 8192 - g74VarF.c);
            boolean zNeedsInput = inflater.needsInput();
            yh yhVar = this.w;
            if (zNeedsInput && !yhVar.E()) {
                g74 g74Var = yhVar.a().w;
                int i = g74Var.c;
                int i2 = g74Var.b;
                int i3 = i - i2;
                this.y = i3;
                inflater.setInput(g74Var.a, i2, i3);
            }
            int iInflate = inflater.inflate(g74VarF.a, g74VarF.c, iMin);
            int i4 = this.y;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.y -= remaining;
                yhVar.skip(remaining);
            }
            if (iInflate > 0) {
                g74VarF.c += iInflate;
                long j2 = iInflate;
                ggVar.x += j2;
                return j2;
            }
            if (g74VarF.b == g74VarF.c) {
                ggVar.w = g74VarF.a();
                h74.a(g74VarF);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.z) {
            return;
        }
        this.x.end();
        this.z = true;
        this.w.close();
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return this.w.d();
    }

    @Override // defpackage.nq4
    public final long p(gg ggVar, long j) throws IOException {
        do {
            long jB = b(ggVar, j);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.x;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.w.E());
        throw new EOFException("source exhausted prematurely");
    }
}
