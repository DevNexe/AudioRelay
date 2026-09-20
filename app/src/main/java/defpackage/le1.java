package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class le1 implements Closeable {
    public static final Logger C = Logger.getLogger(wd1.class.getName());
    public boolean A;
    public final rd1.CQf B;
    public final xh w;
    public final boolean x;
    public final gg y;
    public int z;

    public le1(xh xhVar, boolean z) {
        this.w = xhVar;
        this.x = z;
        gg ggVar = new gg();
        this.y = ggVar;
        this.z = 16384;
        this.B = new rd1.CQf(ggVar);
    }

    public final synchronized void b(rg4 rg4Var) {
        if (this.A) {
            throw new IOException("closed");
        }
        int i = this.z;
        int i2 = rg4Var.a;
        if ((i2 & 32) != 0) {
            i = rg4Var.b[5];
        }
        this.z = i;
        if (((i2 & 2) != 0 ? rg4Var.b[1] : -1) != -1) {
            rd1.CQf cQf = this.B;
            int i3 = (i2 & 2) != 0 ? rg4Var.b[1] : -1;
            cQf.getClass();
            int iMin = Math.min(i3, 16384);
            int i4 = cQf.e;
            if (i4 != iMin) {
                if (iMin < i4) {
                    cQf.c = Math.min(cQf.c, iMin);
                }
                cQf.d = true;
                cQf.e = iMin;
                int i5 = cQf.i;
                if (iMin < i5) {
                    if (iMin == 0) {
                        NPO.d0(cQf.f, null);
                        cQf.g = cQf.f.length - 1;
                        cQf.h = 0;
                        cQf.i = 0;
                    } else {
                        cQf.a(i5 - iMin);
                    }
                }
            }
        }
        e(0, 0, 4, 1);
        this.w.flush();
    }

    public final synchronized void c(boolean z, int i, gg ggVar, int i2) {
        if (this.A) {
            throw new IOException("closed");
        }
        e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.w.V(ggVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.A = true;
        this.w.close();
    }

    public final void e(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = C;
        if (logger.isLoggable(level)) {
            wd1.a.getClass();
            logger.fine(wd1.a(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.z)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.z + ": " + i2).toString());
        }
        if (!((Integer.MIN_VALUE & i) == 0)) {
            throw new IllegalArgumentException(ur1.d(Integer.valueOf(i), "reserved bit set: ").toString());
        }
        byte[] bArr = qf5.a;
        xh xhVar = this.w;
        xhVar.writeByte((i2 >>> 16) & 255);
        xhVar.writeByte((i2 >>> 8) & 255);
        xhVar.writeByte(i2 & 255);
        xhVar.writeByte(i3 & 255);
        xhVar.writeByte(i4 & 255);
        xhVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void f(int i, rt0 rt0Var, byte[] bArr) {
        if (this.A) {
            throw new IOException("closed");
        }
        if (!(rt0Var.w != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        e(0, bArr.length + 8, 7, 0);
        this.w.writeInt(i);
        this.w.writeInt(rt0Var.w);
        if (!(bArr.length == 0)) {
            this.w.write(bArr);
        }
        this.w.flush();
    }

    public final synchronized void g(int i, int i2, boolean z) {
        if (this.A) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        this.w.writeInt(i);
        this.w.writeInt(i2);
        this.w.flush();
    }

    public final synchronized void h(int i, rt0 rt0Var) {
        if (this.A) {
            throw new IOException("closed");
        }
        if (!(rt0Var.w != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        e(i, 4, 3, 0);
        this.w.writeInt(rt0Var.w);
        this.w.flush();
    }

    public final synchronized void i(int i, long j) {
        if (this.A) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        e(i, 4, 8, 0);
        this.w.writeInt((int) j);
        this.w.flush();
    }

    public final void j(int i, long j) {
        while (j > 0) {
            long jMin = Math.min(this.z, j);
            j -= jMin;
            e(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.w.V(this.y, jMin);
        }
    }
}
