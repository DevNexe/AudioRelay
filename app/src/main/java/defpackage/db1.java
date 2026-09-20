package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class db1 implements nq4 {
    public final CRC32 A;
    public byte w;
    public final aj3 x;
    public final Inflater y;
    public final fk1 z;

    public db1(nq4 nq4Var) {
        aj3 aj3Var = new aj3(nq4Var);
        this.x = aj3Var;
        Inflater inflater = new Inflater(true);
        this.y = inflater;
        this.z = new fk1(aj3Var, inflater);
        this.A = new CRC32();
    }

    public static void b(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void c(gg ggVar, long j, long j2) {
        g74 g74Var = ggVar.w;
        while (true) {
            int i = g74Var.c;
            int i2 = g74Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            g74Var = g74Var.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) g74Var.b) + j);
            int iMin = (int) Math.min(g74Var.c - i3, j2);
            this.A.update(g74Var.a, i3, iMin);
            j2 -= (long) iMin;
            g74Var = g74Var.f;
            j = 0;
        }
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.z.close();
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return this.x.d();
    }

    @Override // defpackage.nq4
    public final long p(gg ggVar, long j) throws IOException {
        aj3 aj3Var;
        long j2;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.w;
        CRC32 crc32 = this.A;
        aj3 aj3Var2 = this.x;
        if (b == 0) {
            aj3Var2.v0(10L);
            gg ggVar2 = aj3Var2.x;
            byte bH = ggVar2.h(3L);
            boolean z = ((bH >> 1) & 1) == 1;
            if (z) {
                c(aj3Var2.x, 0L, 10L);
            }
            b(8075, aj3Var2.readShort(), "ID1ID2");
            aj3Var2.skip(8L);
            if (((bH >> 2) & 1) == 1) {
                aj3Var2.v0(2L);
                if (z) {
                    c(aj3Var2.x, 0L, 2L);
                }
                short s = ggVar2.readShort();
                gg.QnHx qnHx = cp5.a;
                int i = s & 65535;
                long j3 = (short) (((i & 255) << 8) | ((i & 65280) >>> 8));
                aj3Var2.v0(j3);
                if (z) {
                    c(aj3Var2.x, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                aj3Var2.skip(j2);
            }
            if (((bH >> 3) & 1) == 1) {
                aj3Var = aj3Var2;
                long jB = aj3Var2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c(aj3Var.x, 0L, jB + 1);
                }
                aj3Var.skip(jB + 1);
            } else {
                aj3Var = aj3Var2;
            }
            if (((bH >> 4) & 1) == 1) {
                long jB2 = aj3Var.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c(aj3Var.x, 0L, jB2 + 1);
                }
                aj3Var.skip(jB2 + 1);
            }
            if (z) {
                aj3Var.v0(2L);
                short s2 = ggVar2.readShort();
                gg.QnHx qnHx2 = cp5.a;
                int i2 = s2 & 65535;
                b((short) (((i2 & 255) << 8) | ((i2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.w = (byte) 1;
        } else {
            aj3Var = aj3Var2;
        }
        if (this.w == 1) {
            long j4 = ggVar.x;
            long jP = this.z.p(ggVar, j);
            if (jP != -1) {
                c(ggVar, j4, jP);
                return jP;
            }
            this.w = (byte) 2;
        }
        if (this.w == 2) {
            b(aj3Var.c(), (int) crc32.getValue(), "CRC");
            b(aj3Var.c(), (int) this.y.getBytesWritten(), "ISIZE");
            this.w = (byte) 3;
            if (!aj3Var.E()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
