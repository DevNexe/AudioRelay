package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class sl5 implements Closeable {
    public final boolean A;
    public boolean B;
    public int C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final gg H = new gg();
    public final gg I = new gg();
    public gd2 J;
    public final byte[] K;
    public final gg.QnHx L;
    public final boolean w;
    public final yh x;
    public final QnHx y;
    public final boolean z;

    public interface QnHx {
        void b(String str);

        void d(mk mkVar);

        void f();

        void g(mk mkVar);

        void h(int i, String str);
    }

    public sl5(boolean z, yh yhVar, jk3 jk3Var, boolean z2, boolean z3) {
        this.w = z;
        this.x = yhVar;
        this.y = jk3Var;
        this.z = z2;
        this.A = z3;
        this.K = z ? null : new byte[4];
        this.L = z ? null : new gg.QnHx();
    }

    public final void b() throws ProtocolException, EOFException {
        short s;
        String strA;
        long j = this.D;
        gg ggVar = this.H;
        if (j > 0) {
            this.x.Y(ggVar, j);
            if (!this.w) {
                gg.QnHx qnHx = this.L;
                ggVar.j(qnHx);
                qnHx.c(0L);
                XTd3.x(qnHx, this.K);
                qnHx.close();
            }
        }
        int i = this.C;
        QnHx qnHx2 = this.y;
        switch (i) {
            case 8:
                long j2 = ggVar.x;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = ggVar.readShort();
                    strA = ggVar.A();
                    String strF = XTd3.f(s);
                    if (strF != null) {
                        throw new ProtocolException(strF);
                    }
                } else {
                    s = 1005;
                    strA = "";
                }
                qnHx2.h(s, strA);
                this.B = true;
                return;
            case 9:
                qnHx2.d(ggVar.o());
                return;
            case 10:
                ggVar.o();
                qnHx2.f();
                return;
            default:
                int i2 = this.C;
                byte[] bArr = qf5.a;
                throw new ProtocolException(ur1.d(Integer.toHexString(i2), "Unknown control opcode: "));
        }
    }

    public final void c() throws IOException {
        boolean z;
        if (this.B) {
            throw new IOException("closed");
        }
        yh yhVar = this.x;
        long jH = yhVar.d().h();
        yhVar.d().b();
        try {
            byte b = yhVar.readByte();
            byte[] bArr = qf5.a;
            int i = b & 255;
            yhVar.d().g(jH, TimeUnit.NANOSECONDS);
            int i2 = i & 15;
            this.C = i2;
            boolean z2 = (i & 128) != 0;
            this.E = z2;
            boolean z3 = (i & 8) != 0;
            this.F = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (i & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.z) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.G = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int i3 = yhVar.readByte() & 255;
            boolean z5 = (i3 & 128) != 0;
            boolean z6 = this.w;
            if (z5 == z6) {
                throw new ProtocolException(z6 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i3 & 127;
            this.D = j;
            if (j == 126) {
                this.D = yhVar.readShort() & 65535;
            } else if (j == 127) {
                long j2 = yhVar.readLong();
                this.D = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.D) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.F && this.D > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                yhVar.readFully(this.K);
            }
        } catch (Throwable th) {
            yhVar.d().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gd2 gd2Var = this.J;
        if (gd2Var == null) {
            return;
        }
        gd2Var.close();
    }
}
