package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class aj3 implements yh {
    public final nq4 w;
    public final gg x = new gg();
    public boolean y;

    public aj3(nq4 nq4Var) {
        this.w = nq4Var;
    }

    @Override // defpackage.yh
    public final boolean E() {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        gg ggVar = this.x;
        return ggVar.E() && this.w.p(ggVar, 8192L) == -1;
    }

    @Override // defpackage.yh
    public final String Q(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jB = b(b, 0L, j2);
        gg ggVar = this.x;
        if (jB != -1) {
            return bp5.a(ggVar, jB);
        }
        if (j2 < Long.MAX_VALUE && e(j2) && ggVar.h(j2 - 1) == ((byte) 13) && e(1 + j2) && ggVar.h(j2) == b) {
            return bp5.a(ggVar, j2);
        }
        gg ggVar2 = new gg();
        ggVar.c(ggVar2, 0L, Math.min(32, ggVar.x));
        throw new EOFException("\\n not found: limit=" + Math.min(ggVar.x, j) + " content=" + ggVar2.o().d() + (char) 8230);
    }

    @Override // defpackage.yh
    public final void Y(gg ggVar, long j) throws EOFException {
        gg ggVar2 = this.x;
        try {
            v0(j);
            ggVar2.Y(ggVar, j);
        } catch (EOFException e) {
            ggVar.K(ggVar2);
            throw e;
        }
    }

    @Override // defpackage.yh
    public final gg a() {
        return this.x;
    }

    public final long b(byte b, long j, long j2) {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (!(0 <= j2)) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        while (jMax < j2) {
            long jI = this.x.i(b, jMax, j2);
            if (jI != -1) {
                return jI;
            }
            gg ggVar = this.x;
            long j3 = ggVar.x;
            if (j3 >= j2 || this.w.p(ggVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    public final int c() throws EOFException {
        v0(4L);
        int i = this.x.readInt();
        gg.QnHx qnHx = cp5.a;
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // defpackage.yh
    public final String c0() {
        return Q(Long.MAX_VALUE);
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws EOFException {
        if (this.y) {
            return;
        }
        this.y = true;
        this.w.close();
        gg ggVar = this.x;
        ggVar.skip(ggVar.x);
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return this.w.d();
    }

    public final boolean e(long j) {
        gg ggVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            ggVar = this.x;
            if (ggVar.x >= j) {
                return true;
            }
        } while (this.w.p(ggVar, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.y;
    }

    @Override // defpackage.nq4
    public final long p(gg ggVar, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        if (!(true ^ this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        gg ggVar2 = this.x;
        if (ggVar2.x == 0 && this.w.p(ggVar2, 8192L) == -1) {
            return -1L;
        }
        return ggVar2.p(ggVar, Math.min(j, ggVar2.x));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        gg ggVar = this.x;
        if (ggVar.x == 0 && this.w.p(ggVar, 8192L) == -1) {
            return -1;
        }
        return ggVar.read(byteBuffer);
    }

    @Override // defpackage.yh
    public final byte readByte() throws EOFException {
        v0(1L);
        return this.x.readByte();
    }

    @Override // defpackage.yh
    public final void readFully(byte[] bArr) throws EOFException {
        gg ggVar = this.x;
        try {
            v0(bArr.length);
            ggVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = ggVar.x;
                if (j <= 0) {
                    throw e;
                }
                int i2 = ggVar.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.yh
    public final int readInt() throws EOFException {
        v0(4L);
        return this.x.readInt();
    }

    @Override // defpackage.yh
    public final long readLong() throws EOFException {
        v0(8L);
        return this.x.readLong();
    }

    @Override // defpackage.yh
    public final short readShort() throws EOFException {
        v0(2L);
        return this.x.readShort();
    }

    @Override // defpackage.yh
    public final void skip(long j) throws EOFException {
        if (!(!this.y)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            gg ggVar = this.x;
            if (ggVar.x == 0 && this.w.p(ggVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, ggVar.x);
            ggVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.w + ')';
    }

    @Override // defpackage.yh
    public final mk u(long j) throws EOFException {
        v0(j);
        return this.x.u(j);
    }

    @Override // defpackage.yh
    public final void v0(long j) throws EOFException {
        if (!e(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.yh
    public final long w0() throws EOFException {
        gg ggVar;
        v0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zE = e(i2);
            ggVar = this.x;
            if (!zE) {
                break;
            }
            byte bH = ggVar.h(i);
            if ((bH < ((byte) 48) || bH > ((byte) 57)) && ((bH < ((byte) 97) || bH > ((byte) 102)) && (bH < ((byte) 65) || bH > ((byte) 70)))) {
                if (i != 0) {
                    break;
                }
                Th.c(16);
                Th.c(16);
                throw new NumberFormatException(ur1.d(Integer.toString(bH, 16), "Expected leading [0-9a-fA-F] character but was 0x"));
            }
            i = i2;
        }
        return ggVar.w0();
    }
}
