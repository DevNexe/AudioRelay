package defpackage;

import io.ktor.utils.io.jvm.javaio.CQf;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class rn1 extends InputStream {
    public final fk w;
    public final os1 x;
    public final CQf y;
    public byte[] z;

    public rn1(fk fkVar, ms1 ms1Var) {
        this.w = fkVar;
        this.x = new os1(ms1Var);
        this.y = new CQf(ms1Var, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.w.o();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.w.l(null);
        if (!(!(this.x.B0() instanceof pj1))) {
            this.x.m(null);
        }
        CQf cQf = this.y;
        am0 am0Var = cQf.c;
        if (am0Var != null) {
            am0Var.a();
        }
        cQf.b.x(new fq3.QnHx(new CancellationException("Stream closed")));
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.z;
        if (bArr == null) {
            bArr = new byte[1];
            this.z = bArr;
        }
        int iB = this.y.b(bArr, 0, 1);
        if (iB == -1) {
            return -1;
        }
        if (iB == 1) {
            return bArr[0] & 255;
        }
        throw new IllegalStateException(("Expected a single byte or EOF. Got " + iB + " bytes.").toString());
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        return this.y.b(bArr, i, i2);
    }
}
