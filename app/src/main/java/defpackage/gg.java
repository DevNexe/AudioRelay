package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gg implements yh, xh, Cloneable, ByteChannel {
    public g74 w;
    public long x;

    public static final class QnHx implements Closeable {
        public byte[] A;
        public gg w;
        public boolean x;
        public g74 y;
        public long z = -1;
        public int B = -1;
        public int C = -1;

        public final void b(long j) {
            gg ggVar = this.w;
            if (ggVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.x) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j2 = ggVar.x;
            int i = 1;
            if (j <= j2) {
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    g74 g74Var = ggVar.w.g;
                    int i2 = g74Var.c;
                    long j4 = i2 - g74Var.b;
                    if (j4 > j3) {
                        g74Var.c = i2 - ((int) j3);
                        break;
                    } else {
                        ggVar.w = g74Var.a();
                        h74.a(g74Var);
                        j3 -= j4;
                    }
                }
                this.y = null;
                this.z = j;
                this.A = null;
                this.B = -1;
                this.C = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    g74 g74VarF = ggVar.F(i);
                    int iMin = (int) Math.min(j5, 8192 - g74VarF.c);
                    int i3 = g74VarF.c + iMin;
                    g74VarF.c = i3;
                    j5 -= (long) iMin;
                    if (z) {
                        this.y = g74VarF;
                        this.z = j2;
                        this.A = g74VarF.a;
                        this.B = i3 - iMin;
                        this.C = i3;
                        i = 1;
                        z = false;
                    } else {
                        i = 1;
                    }
                }
            }
            ggVar.x = j;
        }

        public final int c(long j) {
            gg ggVar = this.w;
            if (ggVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j >= -1) {
                long j2 = ggVar.x;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.y = null;
                        this.z = j;
                        this.A = null;
                        this.B = -1;
                        this.C = -1;
                        return -1;
                    }
                    g74 g74Var = ggVar.w;
                    g74 g74Var2 = this.y;
                    long j3 = 0;
                    if (g74Var2 != null) {
                        long j4 = this.z - ((long) (this.B - g74Var2.b));
                        if (j4 > j) {
                            j2 = j4;
                        } else {
                            j3 = j4;
                            g74Var2 = g74Var;
                            g74Var = g74Var2;
                        }
                    } else {
                        g74Var2 = g74Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = ((long) (g74Var.c - g74Var.b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            g74Var = g74Var.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            g74Var2 = g74Var2.g;
                            j2 -= (long) (g74Var2.c - g74Var2.b);
                        }
                        j3 = j2;
                        g74Var = g74Var2;
                    }
                    if (this.x && g74Var.d) {
                        byte[] bArr = g74Var.a;
                        g74 g74Var3 = new g74(Arrays.copyOf(bArr, bArr.length), g74Var.b, g74Var.c, false, true);
                        if (ggVar.w == g74Var) {
                            ggVar.w = g74Var3;
                        }
                        g74Var.b(g74Var3);
                        g74Var3.g.a();
                        g74Var = g74Var3;
                    }
                    this.y = g74Var;
                    this.z = j;
                    this.A = g74Var.a;
                    int i = g74Var.b + ((int) (j - j3));
                    this.B = i;
                    int i2 = g74Var.c;
                    this.C = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbB = qc0.b("offset=", j, " > size=");
            sbB.append(ggVar.x);
            throw new ArrayIndexOutOfBoundsException(sbB.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!(this.w != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.w = null;
            this.y = null;
            this.z = -1L;
            this.A = null;
            this.B = -1;
            this.C = -1;
        }
    }

    public final String A() {
        return w(this.x, up.a);
    }

    public final mk C(int i) {
        if (i == 0) {
            return mk.z;
        }
        cp5.a(this.x, 0L, i);
        g74 g74Var = this.w;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = g74Var.c;
            int i6 = g74Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            g74Var = g74Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        g74 g74Var2 = this.w;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = g74Var2.a;
            i2 += g74Var2.c - g74Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = g74Var2.b;
            g74Var2.d = true;
            i7++;
            g74Var2 = g74Var2.f;
        }
        return new j74(bArr, iArr);
    }

    @Override // defpackage.yh
    public final boolean E() {
        return this.x == 0;
    }

    public final g74 F(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        g74 g74Var = this.w;
        if (g74Var == null) {
            g74 g74VarB = h74.b();
            this.w = g74VarB;
            g74VarB.g = g74VarB;
            g74VarB.f = g74VarB;
            return g74VarB;
        }
        g74 g74Var2 = g74Var.g;
        if (g74Var2.c + i <= 8192 && g74Var2.e) {
            return g74Var2;
        }
        g74 g74VarB2 = h74.b();
        g74Var2.b(g74VarB2);
        return g74VarB2;
    }

    public final void I(mk mkVar) {
        mkVar.q(this, mkVar.c());
    }

    public final long K(nq4 nq4Var) {
        long j = 0;
        while (true) {
            long jP = nq4Var.p(this, 8192L);
            if (jP == -1) {
                return j;
            }
            j += jP;
        }
    }

    public final void L(int i) {
        g74 g74VarF = F(1);
        int i2 = g74VarF.c;
        g74VarF.c = i2 + 1;
        g74VarF.a[i2] = (byte) i;
        this.x++;
    }

    public final gg M(long j) {
        if (j == 0) {
            L(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            g74 g74VarF = F(i);
            int i2 = g74VarF.c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                g74VarF.a[i3] = bp5.a[(int) (15 & j)];
                j >>>= 4;
            }
            g74VarF.c += i;
            this.x += (long) i;
        }
        return this;
    }

    @Override // defpackage.xh
    public final xh O() {
        return this;
    }

    public final void P(int i) {
        g74 g74VarF = F(4);
        int i2 = g74VarF.c;
        int i3 = i2 + 1;
        byte[] bArr = g74VarF.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        g74VarF.c = i5 + 1;
        this.x += 4;
    }

    @Override // defpackage.yh
    public final String Q(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jI = i(b, 0L, j2);
        if (jI != -1) {
            return bp5.a(this, jI);
        }
        if (j2 < this.x && h(j2 - 1) == ((byte) 13) && h(j2) == b) {
            return bp5.a(this, j2);
        }
        gg ggVar = new gg();
        c(ggVar, 0L, Math.min(32, this.x));
        throw new EOFException("\\n not found: limit=" + Math.min(this.x, j) + " content=" + ggVar.o().d() + (char) 8230);
    }

    public final void R(int i) {
        g74 g74VarF = F(2);
        int i2 = g74VarF.c;
        int i3 = i2 + 1;
        byte[] bArr = g74VarF.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        g74VarF.c = i3 + 1;
        this.x += 2;
    }

    @Override // defpackage.xh
    public final xh S(String str) {
        T(0, str.length(), str);
        return this;
    }

    public final void T(int i, int i2, String str) {
        char cCharAt;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(ur1.d(Integer.valueOf(i), "beginIndex < 0: ").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(Md5A.e("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= str.length())) {
            StringBuilder sbC = iZUl.c("endIndex > string.length: ", i2, " > ");
            sbC.append(str.length());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                g74 g74VarF = F(1);
                int i3 = g74VarF.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = g74VarF.a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = g74VarF.c;
                int i6 = (i3 + i) - i5;
                g74VarF.c = i5 + i6;
                this.x += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    g74 g74VarF2 = F(2);
                    int i7 = g74VarF2.c;
                    byte[] bArr2 = g74VarF2.a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    g74VarF2.c = i7 + 2;
                    this.x += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    g74 g74VarF3 = F(3);
                    int i8 = g74VarF3.c;
                    byte[] bArr3 = g74VarF3.a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    g74VarF3.c = i8 + 3;
                    this.x += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 <= 57343) {
                            int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            g74 g74VarF4 = F(4);
                            int i11 = g74VarF4.c;
                            byte[] bArr4 = g74VarF4.a;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            g74VarF4.c = i11 + 4;
                            this.x += 4;
                            i += 2;
                        }
                    }
                    L(63);
                    i = i9;
                }
                i++;
            }
        }
    }

    @Override // defpackage.bm4
    public final void V(gg ggVar, long j) {
        g74 g74VarB;
        if (!(ggVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        cp5.a(ggVar.x, 0L, j);
        while (j > 0) {
            g74 g74Var = ggVar.w;
            int i = g74Var.c - g74Var.b;
            if (j < i) {
                g74 g74Var2 = this.w;
                g74 g74Var3 = g74Var2 != null ? g74Var2.g : null;
                if (g74Var3 != null && g74Var3.e) {
                    if ((((long) g74Var3.c) + j) - ((long) (g74Var3.d ? 0 : g74Var3.b)) <= 8192) {
                        g74Var.d(g74Var3, (int) j);
                        ggVar.x -= j;
                        this.x += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (!(i2 > 0 && i2 <= i)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i2 >= 1024) {
                    g74VarB = g74Var.c();
                } else {
                    g74VarB = h74.b();
                    int i3 = g74Var.b;
                    System.arraycopy(g74Var.a, i3, g74VarB.a, 0, (i3 + i2) - i3);
                }
                g74VarB.c = g74VarB.b + i2;
                g74Var.b += i2;
                g74Var.g.b(g74VarB);
                ggVar.w = g74VarB;
            }
            g74 g74Var4 = ggVar.w;
            long j2 = g74Var4.c - g74Var4.b;
            ggVar.w = g74Var4.a();
            g74 g74Var5 = this.w;
            if (g74Var5 == null) {
                this.w = g74Var4;
                g74Var4.g = g74Var4;
                g74Var4.f = g74Var4;
            } else {
                g74Var5.g.b(g74Var4);
                g74 g74Var6 = g74Var4.g;
                if (!(g74Var6 != g74Var4)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                if (g74Var6.e) {
                    int i4 = g74Var4.c - g74Var4.b;
                    if (i4 <= (8192 - g74Var6.c) + (g74Var6.d ? 0 : g74Var6.b)) {
                        g74Var4.d(g74Var6, i4);
                        g74Var4.a();
                        h74.a(g74Var4);
                    }
                }
            }
            ggVar.x -= j2;
            this.x += j2;
            j -= j2;
        }
    }

    @Override // defpackage.xh
    public final /* bridge */ /* synthetic */ xh W(mk mkVar) {
        I(mkVar);
        return this;
    }

    @Override // defpackage.xh
    public final /* bridge */ /* synthetic */ xh X(long j) {
        M(j);
        return this;
    }

    @Override // defpackage.yh
    public final void Y(gg ggVar, long j) throws EOFException {
        long j2 = this.x;
        if (j2 >= j) {
            ggVar.V(this, j);
        } else {
            ggVar.V(this, j2);
            throw new EOFException();
        }
    }

    public final void Z(int i) {
        String strQ;
        if (i < 128) {
            L(i);
            return;
        }
        if (i < 2048) {
            g74 g74VarF = F(2);
            int i2 = g74VarF.c;
            byte[] bArr = g74VarF.a;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            g74VarF.c = i2 + 2;
            this.x += 2;
            return;
        }
        int i3 = 0;
        if (55296 <= i && i <= 57343) {
            L(63);
            return;
        }
        if (i < 65536) {
            g74 g74VarF2 = F(3);
            int i4 = g74VarF2.c;
            byte[] bArr2 = g74VarF2.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i & 63) | 128);
            g74VarF2.c = i4 + 3;
            this.x += 3;
            return;
        }
        if (i <= 1114111) {
            g74 g74VarF3 = F(4);
            int i5 = g74VarF3.c;
            byte[] bArr3 = g74VarF3.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i & 63) | 128);
            g74VarF3.c = i5 + 4;
            this.x += 4;
            return;
        }
        QnHx qnHx = cp5.a;
        if (i != 0) {
            char[] cArr = m57.D;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            strQ = iv4.q(cArr2, i3, 8);
        } else {
            strQ = "0";
        }
        throw new IllegalArgumentException(ur1.d(strQ, "Unexpected code point: 0x"));
    }

    @Override // defpackage.yh
    public final gg a() {
        return this;
    }

    public final void c(gg ggVar, long j, long j2) {
        cp5.a(this.x, j, j2);
        if (j2 == 0) {
            return;
        }
        ggVar.x += j2;
        g74 g74Var = this.w;
        while (true) {
            long j3 = g74Var.c - g74Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            g74Var = g74Var.f;
        }
        while (j2 > 0) {
            g74 g74VarC = g74Var.c();
            int i = g74VarC.b + ((int) j);
            g74VarC.b = i;
            g74VarC.c = Math.min(i + ((int) j2), g74VarC.c);
            g74 g74Var2 = ggVar.w;
            if (g74Var2 == null) {
                g74VarC.g = g74VarC;
                g74VarC.f = g74VarC;
                ggVar.w = g74VarC;
            } else {
                g74Var2.g.b(g74VarC);
            }
            j2 -= (long) (g74VarC.c - g74VarC.b);
            g74Var = g74Var.f;
            j = 0;
        }
    }

    @Override // defpackage.yh
    public final String c0() {
        return Q(Long.MAX_VALUE);
    }

    public final Object clone() {
        gg ggVar = new gg();
        if (this.x != 0) {
            g74 g74Var = this.w;
            g74 g74VarC = g74Var.c();
            ggVar.w = g74VarC;
            g74VarC.g = g74VarC;
            g74VarC.f = g74VarC;
            for (g74 g74Var2 = g74Var.f; g74Var2 != g74Var; g74Var2 = g74Var2.f) {
                g74VarC.g.b(g74Var2.c());
            }
            ggVar.x = this.x;
        }
        return ggVar;
    }

    @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // defpackage.nq4
    public final z75 d() {
        return z75.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gg) {
                long j = this.x;
                gg ggVar = (gg) obj;
                if (j == ggVar.x) {
                    if (j != 0) {
                        g74 g74Var = this.w;
                        g74 g74Var2 = ggVar.w;
                        int i = g74Var.b;
                        int i2 = g74Var2.b;
                        long j2 = 0;
                        while (j2 < this.x) {
                            long jMin = Math.min(g74Var.c - i, g74Var2.c - i2);
                            if (0 < jMin) {
                                long j3 = 0;
                                do {
                                    j3++;
                                    int i3 = i + 1;
                                    byte b = g74Var.a[i];
                                    int i4 = i2 + 1;
                                    if (b == g74Var2.a[i2]) {
                                        i2 = i4;
                                        i = i3;
                                    }
                                } while (j3 < jMin);
                            }
                            if (i == g74Var.c) {
                                g74 g74Var3 = g74Var.f;
                                i = g74Var3.b;
                                g74Var = g74Var3;
                            }
                            if (i2 == g74Var2.c) {
                                g74Var2 = g74Var2.f;
                                i2 = g74Var2.b;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.xh, defpackage.bm4, java.io.Flushable
    public final void flush() {
    }

    public final byte h(long j) {
        cp5.a(this.x, j, 1L);
        g74 g74Var = this.w;
        g74Var.getClass();
        long j2 = this.x;
        if (j2 - j < j) {
            while (j2 > j) {
                g74Var = g74Var.g;
                j2 -= (long) (g74Var.c - g74Var.b);
            }
            return g74Var.a[(int) ((((long) g74Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = g74Var.c;
            int i2 = g74Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return g74Var.a[(int) ((((long) i2) + j) - j3)];
            }
            g74Var = g74Var.f;
            j3 = j4;
        }
    }

    public final int hashCode() {
        g74 g74Var = this.w;
        if (g74Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = g74Var.c;
            for (int i3 = g74Var.b; i3 < i2; i3++) {
                i = (i * 31) + g74Var.a[i3];
            }
            g74Var = g74Var.f;
        } while (g74Var != this.w);
        return i;
    }

    public final long i(byte b, long j, long j2) {
        g74 g74Var;
        long j3 = j;
        boolean z = false;
        long j4 = 0;
        if (0 <= j3 && j3 <= j2) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("size=" + this.x + " fromIndex=" + j3 + " toIndex=" + j2).toString());
        }
        long j5 = this.x;
        long j6 = j2 > j5 ? j5 : j2;
        if (j3 == j6 || (g74Var = this.w) == null) {
            return -1L;
        }
        if (j5 - j3 < j3) {
            while (j5 > j3) {
                g74Var = g74Var.g;
                j5 -= (long) (g74Var.c - g74Var.b);
            }
            while (j5 < j6) {
                int iMin = (int) Math.min(g74Var.c, (((long) g74Var.b) + j6) - j5);
                for (int i = (int) ((((long) g74Var.b) + j3) - j5); i < iMin; i++) {
                    if (g74Var.a[i] == b) {
                        return ((long) (i - g74Var.b)) + j5;
                    }
                }
                j5 += (long) (g74Var.c - g74Var.b);
                g74Var = g74Var.f;
                j3 = j5;
            }
            return -1L;
        }
        while (true) {
            long j7 = ((long) (g74Var.c - g74Var.b)) + j4;
            if (j7 > j3) {
                break;
            }
            g74Var = g74Var.f;
            j4 = j7;
        }
        while (j4 < j6) {
            int iMin2 = (int) Math.min(g74Var.c, (((long) g74Var.b) + j6) - j4);
            for (int i2 = (int) ((((long) g74Var.b) + j3) - j4); i2 < iMin2; i2++) {
                if (g74Var.a[i2] == b) {
                    return ((long) (i2 - g74Var.b)) + j4;
                }
            }
            j4 += (long) (g74Var.c - g74Var.b);
            g74Var = g74Var.f;
            j3 = j4;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final QnHx j(QnHx qnHx) {
        byte[] bArr = bp5.a;
        if (qnHx == cp5.a) {
            qnHx = new QnHx();
        }
        if (!(qnHx.w == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        qnHx.w = this;
        qnHx.x = true;
        return qnHx;
    }

    public final byte[] n(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.x < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final mk o() {
        return u(this.x);
    }

    @Override // defpackage.nq4
    public final long p(gg ggVar, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
        }
        long j2 = this.x;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        ggVar.V(this, j);
        return j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        g74 g74Var = this.w;
        if (g74Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), g74Var.c - g74Var.b);
        byteBuffer.put(g74Var.a, g74Var.b, iMin);
        int i = g74Var.b + iMin;
        g74Var.b = i;
        this.x -= (long) iMin;
        if (i == g74Var.c) {
            this.w = g74Var.a();
            h74.a(g74Var);
        }
        return iMin;
    }

    @Override // defpackage.yh
    public final byte readByte() throws EOFException {
        long j = this.x;
        if (j == 0) {
            throw new EOFException();
        }
        g74 g74Var = this.w;
        int i = g74Var.b;
        int i2 = g74Var.c;
        int i3 = i + 1;
        byte b = g74Var.a[i];
        this.x = j - 1;
        if (i3 == i2) {
            this.w = g74Var.a();
            h74.a(g74Var);
        } else {
            g74Var.b = i3;
        }
        return b;
    }

    @Override // defpackage.yh
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // defpackage.yh
    public final int readInt() throws EOFException {
        long j = this.x;
        if (j < 4) {
            throw new EOFException();
        }
        g74 g74Var = this.w;
        int i = g74Var.b;
        int i2 = g74Var.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        int i3 = i + 1;
        byte[] bArr = g74Var.a;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.x = j - 4;
        if (i8 == i2) {
            this.w = g74Var.a();
            h74.a(g74Var);
        } else {
            g74Var.b = i8;
        }
        return i9;
    }

    @Override // defpackage.yh
    public final long readLong() throws EOFException {
        long j = this.x;
        if (j < 8) {
            throw new EOFException();
        }
        g74 g74Var = this.w;
        int i = g74Var.b;
        int i2 = g74Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        int i3 = i + 1;
        byte[] bArr = g74Var.a;
        long j2 = (((long) bArr[i]) & 255) << 56;
        int i4 = i3 + 1;
        long j3 = ((((long) bArr[i3]) & 255) << 48) | j2;
        int i5 = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        long j8 = j7 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j9 = j8 | (((long) bArr[i9]) & 255);
        this.x = j - 8;
        if (i10 == i2) {
            this.w = g74Var.a();
            h74.a(g74Var);
        } else {
            g74Var.b = i10;
        }
        return j9;
    }

    @Override // defpackage.yh
    public final short readShort() throws EOFException {
        long j = this.x;
        if (j < 2) {
            throw new EOFException();
        }
        g74 g74Var = this.w;
        int i = g74Var.b;
        int i2 = g74Var.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = g74Var.a;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.x = j - 2;
        if (i4 == i2) {
            this.w = g74Var.a();
            h74.a(g74Var);
        } else {
            g74Var.b = i4;
        }
        return (short) i5;
    }

    @Override // defpackage.yh
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            g74 g74Var = this.w;
            if (g74Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, g74Var.c - g74Var.b);
            long j2 = iMin;
            this.x -= j2;
            j -= j2;
            int i = g74Var.b + iMin;
            g74Var.b = i;
            if (i == g74Var.c) {
                this.w = g74Var.a();
                h74.a(g74Var);
            }
        }
    }

    public final String toString() {
        long j = this.x;
        if (j <= 2147483647L) {
            return C((int) j).toString();
        }
        throw new IllegalStateException(ur1.d(Long.valueOf(j), "size > Int.MAX_VALUE: ").toString());
    }

    @Override // defpackage.yh
    public final mk u(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.x < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new mk(n(j));
        }
        mk mkVarC = C((int) j);
        skip(j);
        return mkVarC;
    }

    @Override // defpackage.yh
    public final void v0(long j) throws EOFException {
        if (this.x < j) {
            throw new EOFException();
        }
    }

    public final String w(long j, Charset charset) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.x < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        g74 g74Var = this.w;
        int i = g74Var.b;
        if (((long) i) + j > g74Var.c) {
            return new String(n(j), charset);
        }
        int i2 = (int) j;
        String str = new String(g74Var.a, i, i2, charset);
        int i3 = g74Var.b + i2;
        g74Var.b = i3;
        this.x -= j;
        if (i3 == g74Var.c) {
            this.w = g74Var.a();
            h74.a(g74Var);
        }
        return str;
    }

    @Override // defpackage.yh
    public final long w0() throws EOFException {
        int i;
        if (this.x == 0) {
            throw new EOFException();
        }
        long j = 0;
        int i2 = 0;
        boolean z = false;
        do {
            g74 g74Var = this.w;
            int i3 = g74Var.b;
            int i4 = g74Var.c;
            while (i3 < i4) {
                byte b = g74Var.a[i3];
                byte b2 = (byte) 48;
                if (b < b2 || b > ((byte) 57)) {
                    byte b3 = (byte) 97;
                    if ((b < b3 || b > ((byte) 102)) && (b < (b3 = (byte) 65) || b > ((byte) 70))) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        QnHx qnHx = cp5.a;
                        char[] cArr = m57.D;
                        throw new NumberFormatException(ur1.d(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]}), "Expected leading [0-9a-fA-F] character but was 0x"));
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    gg ggVar = new gg();
                    ggVar.M(j);
                    ggVar.L(b);
                    throw new NumberFormatException(ur1.d(ggVar.A(), "Number too large: "));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.w = g74Var.a();
                h74.a(g74Var);
            } else {
                g74Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.w != null);
        this.x -= (long) i2;
        return j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            g74 g74VarF = F(1);
            int iMin = Math.min(i, 8192 - g74VarF.c);
            byteBuffer.get(g74VarF.a, g74VarF.c, iMin);
            i -= iMin;
            g74VarF.c += iMin;
        }
        this.x += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.xh
    public final /* bridge */ /* synthetic */ xh writeByte(int i) {
        L(i);
        return this;
    }

    @Override // defpackage.xh
    public final /* bridge */ /* synthetic */ xh writeInt(int i) {
        P(i);
        return this;
    }

    @Override // defpackage.xh
    public final /* bridge */ /* synthetic */ xh writeShort(int i) {
        R(i);
        return this;
    }

    @Override // defpackage.xh
    public final xh x() {
        return this;
    }

    @Override // defpackage.xh
    public final xh write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        cp5.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            g74 g74VarF = F(1);
            int iMin = Math.min(i3 - i, 8192 - g74VarF.c);
            int i4 = i + iMin;
            System.arraycopy(bArr, i, g74VarF.a, g74VarF.c, i4 - i);
            g74VarF.c += iMin;
            i = i4;
        }
        this.x += j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        cp5.a(bArr.length, i, i2);
        g74 g74Var = this.w;
        if (g74Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, g74Var.c - g74Var.b);
        int i3 = g74Var.b;
        System.arraycopy(g74Var.a, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = g74Var.b + iMin;
        g74Var.b = i4;
        this.x -= (long) iMin;
        if (i4 == g74Var.c) {
            this.w = g74Var.a();
            h74.a(g74Var);
        }
        return iMin;
    }
}
