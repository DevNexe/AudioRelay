package com.google.protobuf;

import defpackage.ex0;
import defpackage.lk;
import defpackage.vv0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NUlFixed {
    public int a;
    public final int b = 100;
    public final int c = Integer.MAX_VALUE;

    public static final class CQf extends NUlFixed {
        public final InputStream d;
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public CQf(com.google.protobuf.CQf.QnHx.C0089QnHx c0089QnHx) {
            Charset charset = SjP.a;
            this.d = c0089QnHx;
            this.e = new byte[4096];
            this.f = 0;
            this.h = 0;
            this.j = 0;
        }

        @Override // com.google.protobuf.NUlFixed
        public final int A() {
            return s();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long B() {
            return J();
        }

        @Override // com.google.protobuf.NUlFixed
        public final boolean C(int i) throws InvalidProtocolBufferException {
            int iZ;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.f - this.h;
                byte[] bArr = this.e;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.h;
                        this.h = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.b();
                }
                while (i3 < 10) {
                    if (this.h == this.f) {
                        M(1);
                    }
                    int i6 = this.h;
                    this.h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.b();
                return true;
            }
            if (i2 == 1) {
                N(8);
                return true;
            }
            if (i2 == 2) {
                N(s());
                return true;
            }
            if (i2 == 3) {
                do {
                    iZ = z();
                    if (iZ == 0) {
                        break;
                    }
                } while (C(iZ));
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                N(4);
                return true;
            }
            int i7 = InvalidProtocolBufferException.x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }

        public final boolean D() {
            return this.h == this.f && !O(1);
        }

        public final byte[] E(int i) throws IOException {
            byte[] bArrF = F(i);
            if (bArrF != null) {
                return bArrF;
            }
            int i2 = this.h;
            int i3 = this.f;
            int length = i3 - i2;
            this.j += i3;
            this.h = 0;
            this.f = 0;
            ArrayList<byte[]> arrayListG = G(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.e, i2, bArr, 0, length);
            for (byte[] bArr2 : arrayListG) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] F(int i) throws IOException {
            if (i == 0) {
                return SjP.c;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.c();
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.k;
            if (i4 > i5) {
                N((i5 - i2) - i3);
                throw InvalidProtocolBufferException.f();
            }
            int i6 = this.f - i3;
            int i7 = i - i6;
            InputStream inputStream = this.d;
            if (i7 >= 4096) {
                try {
                    if (i7 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.e, this.h, bArr, 0, i6);
            this.j += this.f;
            this.h = 0;
            this.f = 0;
            while (i6 < i) {
                try {
                    int i8 = inputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw InvalidProtocolBufferException.f();
                    }
                    this.j += i8;
                    i6 += i8;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2;
                }
            }
            return bArr;
        }

        public final ArrayList G(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.f();
                    }
                    this.j += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int H() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 4) {
                M(4);
                i = this.h;
            }
            this.h = i + 4;
            byte[] bArr = this.e;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long I() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 8) {
                M(8);
                i = this.h;
            }
            this.h = i + 8;
            byte[] bArr = this.e;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final long J() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 < 0) {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = (((long) bArr[i5]) << 28) ^ j4;
                                if (j5 >= 0) {
                                    j2 = j5 ^ 266354560;
                                    i5 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j6 = j5 ^ (((long) bArr[i10]) << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i11 + 1;
                                        long j7 = j6 ^ (((long) bArr[i11]) << 42);
                                        if (j7 >= 0) {
                                            j = j7 ^ 4363953127296L;
                                        } else {
                                            i11 = i7 + 1;
                                            j6 = j7 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i11 + 1;
                                                j = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i11 = i7 + 1;
                                                    if (bArr[i7] >= 0) {
                                                        j2 = j;
                                                    }
                                                }
                                            }
                                            i5 = i11;
                                        }
                                    }
                                    j2 = j3 ^ j6;
                                    i5 = i11;
                                }
                            }
                            this.h = i5;
                            return j2;
                        }
                        j = i8 ^ 16256;
                        i5 = i7;
                        j2 = j;
                        this.h = i5;
                        return j2;
                    }
                    i = i6 ^ (-128);
                    j2 = i;
                    this.h = i5;
                    return j2;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.h == this.f) {
                    M(1);
                }
                int i2 = this.h;
                this.h = i2 + 1;
                byte b = this.e[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.b();
        }

        public final void L() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = this.j + i;
            int i3 = this.k;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final void M(int i) throws InvalidProtocolBufferException {
            if (O(i)) {
                return;
            }
            if (i <= (this.c - this.j) - this.h) {
                throw InvalidProtocolBufferException.f();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void N(int i) throws InvalidProtocolBufferException {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3 && i >= 0) {
                this.h = i3 + i;
                return;
            }
            InputStream inputStream = this.d;
            if (i < 0) {
                throw InvalidProtocolBufferException.c();
            }
            int i4 = this.j;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.k;
            if (i6 > i7) {
                N((i7 - i4) - i3);
                throw InvalidProtocolBufferException.f();
            }
            this.j = i5;
            int i8 = i2 - i3;
            this.f = 0;
            this.h = 0;
            while (i8 < i) {
                long j = i - i8;
                try {
                    try {
                        long jSkip = inputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i8 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    this.j += i8;
                    L();
                    throw th;
                }
            }
            this.j += i8;
            L();
            if (i8 >= i) {
                return;
            }
            int i9 = this.f;
            int i10 = i9 - this.h;
            this.h = i9;
            M(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.f;
                if (i11 <= i12) {
                    this.h = i11;
                    return;
                } else {
                    i10 += i12;
                    this.h = i12;
                    M(1);
                }
            }
        }

        public final boolean O(int i) throws IOException {
            int i2 = this.h;
            int i3 = i2 + i;
            int i4 = this.f;
            if (i3 <= i4) {
                throw new IllegalStateException(ex0.b("refillBuffer() called when ", i, " bytes were already available in buffer"));
            }
            int i5 = this.j;
            int i6 = this.c;
            if (i > (i6 - i5) - i2 || i5 + i2 + i > this.k) {
                return false;
            }
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.j += i2;
                this.f -= i2;
                this.h = 0;
            }
            int i7 = this.f;
            int iMin = Math.min(bArr.length - i7, (i6 - this.j) - i7);
            InputStream inputStream = this.d;
            try {
                int i8 = inputStream.read(bArr, i7, iMin);
                if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                }
                if (i8 <= 0) {
                    return false;
                }
                this.f += i8;
                L();
                if (this.f >= i) {
                    return true;
                }
                return O(i);
            } catch (InvalidProtocolBufferException e) {
                throw e;
            }
        }

        @Override // com.google.protobuf.NUlFixed
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.protobuf.NUlFixed
        public final int c() {
            int i = this.k;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.j + this.h);
        }

        @Override // com.google.protobuf.NUlFixed
        public final void e(int i) {
            this.k = i;
            L();
        }

        @Override // com.google.protobuf.NUlFixed
        public final int f(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.c();
            }
            int i2 = this.j + this.h + i;
            int i3 = this.k;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.f();
            }
            this.k = i2;
            L();
            return i3;
        }

        @Override // com.google.protobuf.NUlFixed
        public final boolean g() {
            return J() != 0;
        }

        @Override // com.google.protobuf.NUlFixed
        public final lk.YKK h() throws IOException {
            int iS = s();
            int i = this.f;
            int i2 = this.h;
            int i3 = i - i2;
            byte[] bArr = this.e;
            if (iS <= i3 && iS > 0) {
                lk.YKK ykkD = lk.d(bArr, i2, iS);
                this.h += iS;
                return ykkD;
            }
            if (iS == 0) {
                return lk.x;
            }
            byte[] bArrF = F(iS);
            if (bArrF != null) {
                return lk.d(bArrF, 0, bArrF.length);
            }
            int i4 = this.h;
            int i5 = this.f;
            int length = i5 - i4;
            this.j += i5;
            this.h = 0;
            this.f = 0;
            ArrayList<byte[]> arrayListG = G(iS - length);
            byte[] bArr2 = new byte[iS];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            for (byte[] bArr3 : arrayListG) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            lk.YKK ykk = lk.x;
            return new lk.YKK(bArr2);
        }

        @Override // com.google.protobuf.NUlFixed
        public final double i() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.protobuf.NUlFixed
        public final int j() {
            return s();
        }

        @Override // com.google.protobuf.NUlFixed
        public final int k() {
            return H();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long l() {
            return I();
        }

        @Override // com.google.protobuf.NUlFixed
        public final float m() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.protobuf.NUlFixed
        public final void n(int i, DzVS.QnHx qnHx, vv0 vv0Var) throws InvalidProtocolBufferException {
            b();
            this.a++;
            qnHx.v(this, vv0Var);
            a((i << 3) | 4);
            this.a--;
        }

        @Override // com.google.protobuf.NUlFixed
        public final int o() {
            return s();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long p() {
            return J();
        }

        @Override // com.google.protobuf.NUlFixed
        public final DzVS q(F1 f1, vv0 vv0Var) throws InvalidProtocolBufferException {
            int iS = s();
            b();
            int iF = f(iS);
            this.a++;
            DzVS dzVS = (DzVS) f1.b(this, vv0Var);
            a(0);
            this.a--;
            if (c() != 0) {
                throw InvalidProtocolBufferException.f();
            }
            e(iF);
            return dzVS;
        }

        @Override // com.google.protobuf.NUlFixed
        public final void r(DzVS.QnHx qnHx, vv0 vv0Var) throws InvalidProtocolBufferException {
            int iS = s();
            b();
            int iF = f(iS);
            this.a++;
            qnHx.v(this, vv0Var);
            a(0);
            this.a--;
            if (c() != 0) {
                throw InvalidProtocolBufferException.f();
            }
            e(iF);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r3[r2] < 0) goto L34;
         */
        @Override // com.google.protobuf.NUlFixed
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int s() {
            /*
                r5 = this;
                int r0 = r5.h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.e
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.h = r2
                return r0
            L12:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r2
                goto L70
            L31:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.K()
                int r1 = (int) r0
                return r1
            L70:
                r5.h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.NUlFixed.CQf.s():int");
        }

        @Override // com.google.protobuf.NUlFixed
        public final int t() {
            return H();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long u() {
            return I();
        }

        @Override // com.google.protobuf.NUlFixed
        public final int v() {
            int iS = s();
            return (-(iS & 1)) ^ (iS >>> 1);
        }

        @Override // com.google.protobuf.NUlFixed
        public final long w() {
            long J = J();
            return (-(J & 1)) ^ (J >>> 1);
        }

        @Override // com.google.protobuf.NUlFixed
        public final String x() throws InvalidProtocolBufferException {
            int iS = s();
            byte[] bArr = this.e;
            if (iS > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iS <= i - i2) {
                    String str = new String(bArr, i2, iS, SjP.a);
                    this.h += iS;
                    return str;
                }
            }
            if (iS == 0) {
                return "";
            }
            if (iS > this.f) {
                return new String(E(iS), SjP.a);
            }
            M(iS);
            String str2 = new String(bArr, this.h, iS, SjP.a);
            this.h += iS;
            return str2;
        }

        @Override // com.google.protobuf.NUlFixed
        public final String y() throws IOException {
            int iS = s();
            int i = this.h;
            int i2 = this.f;
            int i3 = i2 - i;
            byte[] bArrE = this.e;
            if (iS <= i3 && iS > 0) {
                this.h = i + iS;
            } else {
                if (iS == 0) {
                    return "";
                }
                i = 0;
                if (iS <= i2) {
                    M(iS);
                    this.h = iS + 0;
                } else {
                    bArrE = E(iS);
                }
            }
            return bm88.a.a(bArrE, i, iS);
        }

        @Override // com.google.protobuf.NUlFixed
        public final int z() throws InvalidProtocolBufferException {
            if (D()) {
                this.i = 0;
                return 0;
            }
            int iS = s();
            this.i = iS;
            if ((iS >>> 3) != 0) {
                return iS;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
    }

    public static final class QnHx extends NUlFixed {
        public final byte[] d;
        public final boolean e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;
        public boolean k;
        public int l = Integer.MAX_VALUE;

        public QnHx(byte[] bArr, int i, int i2, boolean z) {
            this.d = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = i;
            this.e = z;
        }

        @Override // com.google.protobuf.NUlFixed
        public final int A() {
            return s();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long B() {
            return G();
        }

        @Override // com.google.protobuf.NUlFixed
        public final boolean C(int i) throws InvalidProtocolBufferException {
            int iZ;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.f - this.h;
                byte[] bArr = this.d;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.h;
                        this.h = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.b();
                }
                while (i3 < 10) {
                    int i6 = this.h;
                    if (i6 == this.f) {
                        throw InvalidProtocolBufferException.f();
                    }
                    this.h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.b();
                return true;
            }
            if (i2 == 1) {
                I(8);
                return true;
            }
            if (i2 == 2) {
                I(s());
                return true;
            }
            if (i2 == 3) {
                do {
                    iZ = z();
                    if (iZ == 0) {
                        break;
                    }
                } while (C(iZ));
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                I(4);
                return true;
            }
            int i7 = InvalidProtocolBufferException.x;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }

        public final boolean D() {
            return this.h == this.f;
        }

        public final int E() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 4) {
                throw InvalidProtocolBufferException.f();
            }
            this.h = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long F() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 8) {
                throw InvalidProtocolBufferException.f();
            }
            this.h = i + 8;
            byte[] bArr = this.d;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final long G() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.d;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 < 0) {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = (((long) bArr[i5]) << 28) ^ j4;
                                if (j5 >= 0) {
                                    j2 = j5 ^ 266354560;
                                    i5 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j6 = j5 ^ (((long) bArr[i10]) << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i11 + 1;
                                        long j7 = j6 ^ (((long) bArr[i11]) << 42);
                                        if (j7 >= 0) {
                                            j = j7 ^ 4363953127296L;
                                        } else {
                                            i11 = i7 + 1;
                                            j6 = j7 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i11 + 1;
                                                j = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i11 = i7 + 1;
                                                    if (bArr[i7] >= 0) {
                                                        j2 = j;
                                                    }
                                                }
                                            }
                                            i5 = i11;
                                        }
                                    }
                                    j2 = j3 ^ j6;
                                    i5 = i11;
                                }
                            }
                            this.h = i5;
                            return j2;
                        }
                        j = i8 ^ 16256;
                        i5 = i7;
                        j2 = j;
                        this.h = i5;
                        return j2;
                    }
                    i = i6 ^ (-128);
                    j2 = i;
                    this.h = i5;
                    return j2;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.h;
                if (i2 == this.f) {
                    throw InvalidProtocolBufferException.f();
                }
                this.h = i2 + 1;
                byte b = this.d[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.b();
        }

        public final void I(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f;
                int i3 = this.h;
                if (i <= i2 - i3) {
                    this.h = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // com.google.protobuf.NUlFixed
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.j != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.protobuf.NUlFixed
        public final int c() {
            int i = this.l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.h - this.i);
        }

        @Override // com.google.protobuf.NUlFixed
        public final void e(int i) {
            this.l = i;
            int i2 = this.f + this.g;
            this.f = i2;
            int i3 = i2 - this.i;
            if (i3 <= i) {
                this.g = 0;
                return;
            }
            int i4 = i3 - i;
            this.g = i4;
            this.f = i2 - i4;
        }

        @Override // com.google.protobuf.NUlFixed
        public final int f(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.c();
            }
            int i2 = this.h;
            int i3 = this.i;
            int i4 = (i2 - i3) + i;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.d();
            }
            int i5 = this.l;
            if (i4 > i5) {
                throw InvalidProtocolBufferException.f();
            }
            this.l = i4;
            int i6 = this.f + this.g;
            this.f = i6;
            int i7 = i6 - i3;
            if (i7 > i4) {
                int i8 = i7 - i4;
                this.g = i8;
                this.f = i6 - i8;
            } else {
                this.g = 0;
            }
            return i5;
        }

        @Override // com.google.protobuf.NUlFixed
        public final boolean g() {
            return G() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0041 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0043  */
        /* JADX WARN: Code duplicated, block: B:26:0x004d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0052  */
        @Override // com.google.protobuf.NUlFixed
        public final lk.YKK h() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            lk.YKK ykkD;
            int iS = s();
            byte[] bArr = this.d;
            if (iS > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iS <= i - i2) {
                    if (this.e && this.k) {
                        lk.YKK ykk = lk.x;
                        ykkD = new lk.F1(bArr, i2, iS);
                    } else {
                        ykkD = lk.d(bArr, i2, iS);
                    }
                    this.h += iS;
                    return ykkD;
                }
            }
            if (iS == 0) {
                return lk.x;
            }
            if (iS > 0) {
                int i3 = this.f;
                int i4 = this.h;
                if (iS <= i3 - i4) {
                    int i5 = iS + i4;
                    this.h = i5;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                } else {
                    if (iS <= 0) {
                        throw InvalidProtocolBufferException.f();
                    }
                    if (iS == 0) {
                        throw InvalidProtocolBufferException.c();
                    }
                    bArrCopyOfRange = SjP.c;
                }
            } else {
                if (iS <= 0) {
                    throw InvalidProtocolBufferException.f();
                }
                if (iS == 0) {
                    throw InvalidProtocolBufferException.c();
                }
                bArrCopyOfRange = SjP.c;
            }
            lk.YKK ykk2 = lk.x;
            return new lk.YKK(bArrCopyOfRange);
        }

        @Override // com.google.protobuf.NUlFixed
        public final double i() {
            return Double.longBitsToDouble(F());
        }

        @Override // com.google.protobuf.NUlFixed
        public final int j() {
            return s();
        }

        @Override // com.google.protobuf.NUlFixed
        public final int k() {
            return E();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long l() {
            return F();
        }

        @Override // com.google.protobuf.NUlFixed
        public final float m() {
            return Float.intBitsToFloat(E());
        }

        @Override // com.google.protobuf.NUlFixed
        public final void n(int i, DzVS.QnHx qnHx, vv0 vv0Var) throws InvalidProtocolBufferException {
            b();
            this.a++;
            qnHx.v(this, vv0Var);
            a((i << 3) | 4);
            this.a--;
        }

        @Override // com.google.protobuf.NUlFixed
        public final int o() {
            return s();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long p() {
            return G();
        }

        @Override // com.google.protobuf.NUlFixed
        public final DzVS q(F1 f1, vv0 vv0Var) throws InvalidProtocolBufferException {
            int iS = s();
            b();
            int iF = f(iS);
            this.a++;
            DzVS dzVS = (DzVS) f1.b(this, vv0Var);
            a(0);
            this.a--;
            if (c() != 0) {
                throw InvalidProtocolBufferException.f();
            }
            e(iF);
            return dzVS;
        }

        @Override // com.google.protobuf.NUlFixed
        public final void r(DzVS.QnHx qnHx, vv0 vv0Var) throws InvalidProtocolBufferException {
            int iS = s();
            b();
            int iF = f(iS);
            this.a++;
            qnHx.v(this, vv0Var);
            a(0);
            this.a--;
            if (c() != 0) {
                throw InvalidProtocolBufferException.f();
            }
            e(iF);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r3[r2] < 0) goto L34;
         */
        @Override // com.google.protobuf.NUlFixed
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int s() {
            /*
                r5 = this;
                int r0 = r5.h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.d
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.h = r2
                return r0
            L12:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r2
                goto L70
            L31:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.H()
                int r1 = (int) r0
                return r1
            L70:
                r5.h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.NUlFixed.QnHx.s():int");
        }

        @Override // com.google.protobuf.NUlFixed
        public final int t() {
            return E();
        }

        @Override // com.google.protobuf.NUlFixed
        public final long u() {
            return F();
        }

        @Override // com.google.protobuf.NUlFixed
        public final int v() {
            int iS = s();
            return (-(iS & 1)) ^ (iS >>> 1);
        }

        @Override // com.google.protobuf.NUlFixed
        public final long w() {
            long jG = G();
            return (-(jG & 1)) ^ (jG >>> 1);
        }

        @Override // com.google.protobuf.NUlFixed
        public final String x() throws InvalidProtocolBufferException {
            int iS = s();
            if (iS > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iS <= i - i2) {
                    String str = new String(this.d, i2, iS, SjP.a);
                    this.h += iS;
                    return str;
                }
            }
            if (iS == 0) {
                return "";
            }
            if (iS < 0) {
                throw InvalidProtocolBufferException.c();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.NUlFixed
        public final String y() throws InvalidProtocolBufferException {
            int iS = s();
            if (iS > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iS <= i - i2) {
                    String strA = bm88.a.a(this.d, i2, iS);
                    this.h += iS;
                    return strA;
                }
            }
            if (iS == 0) {
                return "";
            }
            if (iS <= 0) {
                throw InvalidProtocolBufferException.c();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.NUlFixed
        public final int z() throws InvalidProtocolBufferException {
            if (D()) {
                this.j = 0;
                return 0;
            }
            int iS = s();
            this.j = iS;
            if ((iS >>> 3) != 0) {
                return iS;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
    }

    public static QnHx d(byte[] bArr, int i, int i2, boolean z) {
        QnHx qnHx = new QnHx(bArr, i, i2, z);
        try {
            qnHx.f(i2);
            return qnHx;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public abstract void a(int i);

    public final void b() throws InvalidProtocolBufferException {
        if (this.a >= this.b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public abstract int c();

    public abstract void e(int i);

    public abstract int f(int i);

    public abstract boolean g();

    public abstract lk.YKK h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract void n(int i, DzVS.QnHx qnHx, vv0 vv0Var);

    public abstract int o();

    public abstract long p();

    public abstract DzVS q(F1 f1, vv0 vv0Var);

    public abstract void r(DzVS.QnHx qnHx, vv0 vv0Var);

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
