package com.google.protobuf;

import defpackage.B8C;
import defpackage.b70;
import defpackage.de5;
import defpackage.lk;
import defpackage.n54;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedOutputStream extends B8C {
    public static final Logger x = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean y = de5.e;
    public YKK w;

    public static class CQf extends CodedOutputStream {
        public final int A;
        public int B;
        public final byte[] z;

        public CQf(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.z = bArr;
            this.B = 0;
            this.A = i2;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A1(int i, int i2) throws OutOfSpaceException {
            N1(i, 5);
            B1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B1(int i) throws OutOfSpaceException {
            try {
                byte[] bArr = this.z;
                int i2 = this.B;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.B = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C1(int i, long j) throws OutOfSpaceException {
            N1(i, 1);
            D1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void D1(long j) throws OutOfSpaceException {
            try {
                byte[] bArr = this.z;
                int i = this.B;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.B = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void E1(int i, int i2) throws OutOfSpaceException {
            N1(i, 0);
            F1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F1(int i) throws OutOfSpaceException {
            if (i >= 0) {
                P1(i);
            } else {
                R1(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G1(int i, DzVS dzVS) throws OutOfSpaceException {
            N1(i, 2);
            I1(dzVS);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H1(int i, DzVS dzVS, n54 n54Var) throws OutOfSpaceException {
            N1(i, 2);
            P1(((com.google.protobuf.CQf) dzVS).r(n54Var));
            n54Var.a(dzVS, this.w);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void I1(DzVS dzVS) throws OutOfSpaceException {
            P1(dzVS.j());
            dzVS.h(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void J1(int i, DzVS dzVS) throws OutOfSpaceException {
            N1(1, 3);
            O1(2, i);
            G1(3, dzVS);
            N1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K1(int i, lk lkVar) throws OutOfSpaceException {
            N1(1, 3);
            O1(2, i);
            y1(3, lkVar);
            N1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L1(int i, String str) throws OutOfSpaceException {
            N1(i, 2);
            M1(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M1(String str) throws OutOfSpaceException {
            int i = this.B;
            try {
                int iR1 = CodedOutputStream.r1(str.length() * 3);
                int iR2 = CodedOutputStream.r1(str.length());
                int i2 = this.A;
                byte[] bArr = this.z;
                if (iR2 == iR1) {
                    int i3 = i + iR2;
                    this.B = i3;
                    int iB = bm88.a.b(str, bArr, i3, i2 - i3);
                    this.B = i;
                    P1((iB - i) - iR2);
                    this.B = iB;
                } else {
                    P1(bm88.b(str));
                    int i4 = this.B;
                    this.B = bm88.a.b(str, bArr, i4, i2 - i4);
                }
            } catch (bm88.LPt8Fixed e) {
                this.B = i;
                u1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N1(int i, int i2) throws OutOfSpaceException {
            P1((i << 3) | i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O1(int i, int i2) throws OutOfSpaceException {
            N1(i, 0);
            P1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P1(int i) throws OutOfSpaceException {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.z;
                if (i2 == 0) {
                    int i3 = this.B;
                    this.B = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.B;
                        this.B = i4 + 1;
                        bArr[i4] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q1(int i, long j) throws OutOfSpaceException {
            N1(i, 0);
            R1(j);
        }

        @Override // defpackage.B8C
        public final void R0(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            T1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R1(long j) throws OutOfSpaceException {
            boolean z = CodedOutputStream.y;
            int i = this.A;
            byte[] bArr = this.z;
            if (z && i - this.B >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.B;
                    this.B = i2 + 1;
                    de5.r(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i3 = this.B;
                this.B = i3 + 1;
                de5.r(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.B;
                    this.B = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.B;
            this.B = i5 + 1;
            bArr[i5] = (byte) j;
        }

        public final int S1() {
            return this.A - this.B;
        }

        public final void T1(byte[] bArr, int i, int i2) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i, this.z, this.B, i2);
                this.B += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void v1(byte b) throws OutOfSpaceException {
            try {
                byte[] bArr = this.z;
                int i = this.B;
                this.B = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.B), Integer.valueOf(this.A), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w1(int i, boolean z) throws OutOfSpaceException {
            N1(i, 0);
            v1(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x1(byte[] bArr, int i) throws OutOfSpaceException {
            P1(i);
            T1(bArr, 0, i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void y1(int i, lk lkVar) throws OutOfSpaceException {
            N1(i, 2);
            z1(lkVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void z1(lk lkVar) throws OutOfSpaceException {
            P1(lkVar.size());
            lkVar.u(this);
        }
    }

    public static final class F1 extends QnHx {
        public final OutputStream C;

        public F1(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.C = outputStream;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A1(int i, int i2) throws IOException {
            Y1(14);
            U1(i, 5);
            S1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B1(int i) throws IOException {
            Y1(4);
            S1(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C1(int i, long j) throws IOException {
            Y1(18);
            U1(i, 1);
            T1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void D1(long j) throws IOException {
            Y1(8);
            T1(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void E1(int i, int i2) throws IOException {
            Y1(20);
            U1(i, 0);
            if (i2 >= 0) {
                V1(i2);
            } else {
                W1(i2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F1(int i) throws IOException {
            if (i >= 0) {
                P1(i);
            } else {
                R1(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G1(int i, DzVS dzVS) throws IOException {
            N1(i, 2);
            I1(dzVS);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H1(int i, DzVS dzVS, n54 n54Var) throws IOException {
            N1(i, 2);
            P1(((com.google.protobuf.CQf) dzVS).r(n54Var));
            n54Var.a(dzVS, this.w);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void I1(DzVS dzVS) throws IOException {
            P1(dzVS.j());
            dzVS.h(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void J1(int i, DzVS dzVS) throws IOException {
            N1(1, 3);
            O1(2, i);
            G1(3, dzVS);
            N1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void K1(int i, lk lkVar) throws IOException {
            N1(1, 3);
            O1(2, i);
            y1(3, lkVar);
            N1(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void L1(int i, String str) throws IOException {
            N1(i, 2);
            M1(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void M1(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iR1 = CodedOutputStream.r1(length);
                int i = iR1 + length;
                int i2 = this.A;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iB = bm88.a.b(str, bArr, 0, length);
                    P1(iB);
                    Z1(bArr, 0, iB);
                    return;
                }
                if (i > i2 - this.B) {
                    X1();
                }
                int iR2 = CodedOutputStream.r1(str.length());
                int i3 = this.B;
                byte[] bArr2 = this.z;
                try {
                    if (iR2 == iR1) {
                        int i4 = i3 + iR2;
                        this.B = i4;
                        int iB2 = bm88.a.b(str, bArr2, i4, i2 - i4);
                        this.B = i3;
                        V1((iB2 - i3) - iR2);
                        this.B = iB2;
                    } else {
                        int iB3 = bm88.b(str);
                        V1(iB3);
                        this.B = bm88.a.b(str, bArr2, this.B, iB3);
                    }
                } catch (bm88.LPt8Fixed e) {
                    this.B = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (bm88.LPt8Fixed e3) {
                u1(str, e3);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void N1(int i, int i2) throws IOException {
            P1((i << 3) | i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void O1(int i, int i2) throws IOException {
            Y1(20);
            U1(i, 0);
            V1(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void P1(int i) throws IOException {
            Y1(5);
            V1(i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q1(int i, long j) throws IOException {
            Y1(20);
            U1(i, 0);
            W1(j);
        }

        @Override // defpackage.B8C
        public final void R0(byte[] bArr, int i, int i2) throws IOException {
            Z1(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R1(long j) throws IOException {
            Y1(10);
            W1(j);
        }

        public final void X1() throws IOException {
            this.C.write(this.z, 0, this.B);
            this.B = 0;
        }

        public final void Y1(int i) throws IOException {
            if (this.A - this.B < i) {
                X1();
            }
        }

        public final void Z1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.B;
            int i4 = this.A;
            int i5 = i4 - i3;
            byte[] bArr2 = this.z;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.B += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.B = i4;
            X1();
            if (i7 > i4) {
                this.C.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.B = i7;
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void v1(byte b) throws IOException {
            if (this.B == this.A) {
                X1();
            }
            int i = this.B;
            this.B = i + 1;
            this.z[i] = b;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void w1(int i, boolean z) throws IOException {
            Y1(11);
            U1(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.B;
            this.B = i2 + 1;
            this.z[i2] = b;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void x1(byte[] bArr, int i) throws IOException {
            P1(i);
            Z1(bArr, 0, i);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void y1(int i, lk lkVar) throws IOException {
            N1(i, 2);
            z1(lkVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void z1(lk lkVar) throws IOException {
            P1(lkVar.size());
            lkVar.u(this);
        }
    }

    public static abstract class QnHx extends CodedOutputStream {
        public final int A;
        public int B;
        public final byte[] z;

        public QnHx(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.z = bArr;
            this.A = bArr.length;
        }

        public final void S1(int i) {
            int i2 = this.B;
            int i3 = i2 + 1;
            byte[] bArr = this.z;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.B = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void T1(long j) {
            int i = this.B;
            int i2 = i + 1;
            byte[] bArr = this.z;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.B = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void U1(int i, int i2) {
            V1((i << 3) | i2);
        }

        public final void V1(int i) {
            boolean z = CodedOutputStream.y;
            byte[] bArr = this.z;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.B;
                    this.B = i2 + 1;
                    de5.r(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                int i3 = this.B;
                this.B = i3 + 1;
                de5.r(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.B;
                this.B = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            int i5 = this.B;
            this.B = i5 + 1;
            bArr[i5] = (byte) i;
        }

        public final void W1(long j) {
            boolean z = CodedOutputStream.y;
            byte[] bArr = this.z;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.B;
                    this.B = i + 1;
                    de5.r(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.B;
                this.B = i2 + 1;
                de5.r(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.B;
                this.B = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            int i4 = this.B;
            this.B = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    public static int V0(int i) {
        return p1(i) + 1;
    }

    public static int W0(int i, lk lkVar) {
        int iP1 = p1(i);
        int size = lkVar.size();
        return r1(size) + size + iP1;
    }

    public static int X0(lk lkVar) {
        int size = lkVar.size();
        return r1(size) + size;
    }

    public static int Y0(int i) {
        return p1(i) + 8;
    }

    public static int Z0(int i, int i2) {
        return f1(i2) + p1(i);
    }

    public static int a1(int i) {
        return p1(i) + 4;
    }

    public static int b1(int i) {
        return p1(i) + 8;
    }

    public static int c1(int i) {
        return p1(i) + 4;
    }

    @Deprecated
    public static int d1(int i, DzVS dzVS, n54 n54Var) {
        return ((com.google.protobuf.CQf) dzVS).r(n54Var) + (p1(i) * 2);
    }

    public static int e1(int i, int i2) {
        return f1(i2) + p1(i);
    }

    public static int f1(int i) {
        if (i >= 0) {
            return r1(i);
        }
        return 10;
    }

    public static int g1(int i, long j) {
        return t1(j) + p1(i);
    }

    public static int h1(WE we) {
        int iJ;
        if (we.d != null) {
            iJ = we.d.size();
        } else {
            lk lkVar = we.a;
            if (lkVar != null) {
                iJ = lkVar.size();
            } else {
                iJ = we.c != null ? we.c.j() : 0;
            }
        }
        return r1(iJ) + iJ;
    }

    public static int i1(int i, DzVS dzVS) {
        int iP1 = p1(i);
        int iJ = dzVS.j();
        return r1(iJ) + iJ + iP1;
    }

    public static int j1(int i) {
        return p1(i) + 4;
    }

    public static int k1(int i) {
        return p1(i) + 8;
    }

    public static int l1(int i, int i2) {
        return r1((i2 >> 31) ^ (i2 << 1)) + p1(i);
    }

    public static int m1(int i, long j) {
        return t1((j >> 63) ^ (j << 1)) + p1(i);
    }

    public static int n1(int i, String str) {
        return o1(str) + p1(i);
    }

    public static int o1(String str) {
        int length;
        try {
            length = bm88.b(str);
        } catch (bm88.LPt8Fixed unused) {
            length = str.getBytes(SjP.a).length;
        }
        return r1(length) + length;
    }

    public static int p1(int i) {
        return r1((i << 3) | 0);
    }

    public static int q1(int i, int i2) {
        return r1(i2) + p1(i);
    }

    public static int r1(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s1(int i, long j) {
        return t1(j) + p1(i);
    }

    public static int t1(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A1(int i, int i2);

    public abstract void B1(int i);

    public abstract void C1(int i, long j);

    public abstract void D1(long j);

    public abstract void E1(int i, int i2);

    public abstract void F1(int i);

    public abstract void G1(int i, DzVS dzVS);

    public abstract void H1(int i, DzVS dzVS, n54 n54Var);

    public abstract void I1(DzVS dzVS);

    public abstract void J1(int i, DzVS dzVS);

    public abstract void K1(int i, lk lkVar);

    public abstract void L1(int i, String str);

    public abstract void M1(String str);

    public abstract void N1(int i, int i2);

    public abstract void O1(int i, int i2);

    public abstract void P1(int i);

    public abstract void Q1(int i, long j);

    public abstract void R1(long j);

    public final void u1(String str, bm88.LPt8Fixed lPt8) throws OutOfSpaceException {
        x.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) lPt8);
        byte[] bytes = str.getBytes(SjP.a);
        try {
            P1(bytes.length);
            R0(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    public abstract void v1(byte b);

    public abstract void w1(int i, boolean z);

    public abstract void x1(byte[] bArr, int i);

    public abstract void y1(int i, lk lkVar);

    public abstract void z1(lk lkVar);

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(b70.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
