package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zi3 implements xh {
    public final bm4 w;
    public final gg x = new gg();
    public boolean y;

    public zi3(bm4 bm4Var) {
        this.w = bm4Var;
    }

    @Override // defpackage.xh
    public final xh O() {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        gg ggVar = this.x;
        long j = ggVar.x;
        if (j == 0) {
            j = 0;
        } else {
            g74 g74Var = ggVar.w.g;
            int i = g74Var.c;
            if (i < 8192 && g74Var.e) {
                j -= (long) (i - g74Var.b);
            }
        }
        if (j > 0) {
            this.w.V(ggVar, j);
        }
        return this;
    }

    @Override // defpackage.xh
    public final xh S(String str) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        gg ggVar = this.x;
        ggVar.getClass();
        ggVar.T(0, str.length(), str);
        O();
        return this;
    }

    @Override // defpackage.bm4
    public final void V(gg ggVar, long j) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.V(ggVar, j);
        O();
    }

    @Override // defpackage.xh
    public final xh W(mk mkVar) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.I(mkVar);
        O();
        return this;
    }

    @Override // defpackage.xh
    public final xh X(long j) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.M(j);
        O();
        return this;
    }

    @Override // defpackage.xh
    public final gg a() {
        return this.x;
    }

    public final xh b(byte[] bArr, int i, int i2) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.write(bArr, i, i2);
        O();
        return this;
    }

    public final long c(nq4 nq4Var) {
        long j = 0;
        while (true) {
            long jP = ((so1) nq4Var).p(this.x, 8192L);
            if (jP == -1) {
                return j;
            }
            j += jP;
            O();
        }
    }

    @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        bm4 bm4Var = this.w;
        if (this.y) {
            return;
        }
        gg ggVar = this.x;
        long j = ggVar.x;
        if (j > 0) {
            bm4Var.V(ggVar, j);
        }
        th = null;
        try {
            bm4Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.y = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.bm4
    public final z75 d() {
        return this.w.d();
    }

    @Override // defpackage.xh, defpackage.bm4, java.io.Flushable
    public final void flush() {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        gg ggVar = this.x;
        long j = ggVar.x;
        bm4 bm4Var = this.w;
        if (j > 0) {
            bm4Var.V(ggVar, j);
        }
        bm4Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.y;
    }

    public final String toString() {
        return "buffer(" + this.w + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.x.write(byteBuffer);
        O();
        return iWrite;
    }

    @Override // defpackage.xh
    public final xh writeByte(int i) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.L(i);
        O();
        return this;
    }

    @Override // defpackage.xh
    public final xh writeInt(int i) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.P(i);
        O();
        return this;
    }

    @Override // defpackage.xh
    public final xh writeShort(int i) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.x.R(i);
        O();
        return this;
    }

    @Override // defpackage.xh
    public final xh x() {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        gg ggVar = this.x;
        long j = ggVar.x;
        if (j > 0) {
            this.w.V(ggVar, j);
        }
        return this;
    }

    @Override // defpackage.xh
    public final xh write(byte[] bArr) {
        if (!this.y) {
            gg ggVar = this.x;
            ggVar.getClass();
            ggVar.write(bArr, 0, bArr.length);
            O();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
