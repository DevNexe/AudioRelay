package defpackage;

import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class si0 implements bm4 {
    public final xh w;
    public final Deflater x;
    public boolean y;

    public si0(gg ggVar, Deflater deflater) {
        this.w = new zi3(ggVar);
        this.x = deflater;
    }

    @Override // defpackage.bm4
    public final void V(gg ggVar, long j) {
        cp5.a(ggVar.x, 0L, j);
        while (j > 0) {
            g74 g74Var = ggVar.w;
            int iMin = (int) Math.min(j, g74Var.c - g74Var.b);
            this.x.setInput(g74Var.a, g74Var.b, iMin);
            b(false);
            long j2 = iMin;
            ggVar.x -= j2;
            int i = g74Var.b + iMin;
            g74Var.b = i;
            if (i == g74Var.c) {
                ggVar.w = g74Var.a();
                h74.a(g74Var);
            }
            j -= j2;
        }
    }

    public final void b(boolean z) {
        g74 g74VarF;
        int iDeflate;
        xh xhVar = this.w;
        gg ggVarA = xhVar.a();
        while (true) {
            g74VarF = ggVarA.F(1);
            Deflater deflater = this.x;
            byte[] bArr = g74VarF.a;
            if (z) {
                int i = g74VarF.c;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = g74VarF.c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                g74VarF.c += iDeflate;
                ggVarA.x += (long) iDeflate;
                xhVar.O();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (g74VarF.b == g74VarF.c) {
            ggVarA.w = g74VarF.a();
            h74.a(g74VarF);
        }
    }

    @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.x;
        if (this.y) {
            return;
        }
        deflater.finish();
        b(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.w.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
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

    @Override // defpackage.bm4, java.io.Flushable
    public final void flush() {
        b(true);
        this.w.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.w + ')';
    }
}
