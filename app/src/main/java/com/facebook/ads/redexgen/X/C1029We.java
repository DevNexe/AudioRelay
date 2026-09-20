package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.We, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1029We implements InterfaceC0535Cc {
    public static byte[] A0p;
    public static String[] A0q = {"PtjeSixlQpPnp33LbTolurfrF5aBxWMN", "zsPWFAYo6WN4WLRLivc6JVSph6JkIRth", "XheyHWRN6othIFLpaes4AkwCM0c9DMBL", "WLz3vbqVAvFNW8GJMAEq6yPWbMM9CaUw", "Xodlb2gLYburpvZCOlf7Ugos4D", "3NxGJ5nCydCtg30cLxHhJHXlDiPWCbyN", "QrznFntGQRtbXA7cSaAHWbiKbufqFBbd", "iW7nVRcCTDgQKTtcLRaOezFHTOIda"};
    public static final InterfaceC0538Cf A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public InterfaceC0537Ce A0N;
    public Cy A0O;
    public IZ A0P;
    public IZ A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<Cy> A0c;
    public final Cu A0d;
    public final D1 A0e;
    public final C0679Ij A0f;
    public final C0679Ij A0g;
    public final C0679Ij A0h;
    public final C0679Ij A0i;
    public final C0679Ij A0j;
    public final C0679Ij A0k;
    public final C0679Ij A0l;
    public final C0679Ij A0m;
    public final C0679Ij A0n;
    public final boolean A0o;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{34, 108, 109, 118, 34, 113, 119, 114, 114, 109, 112, 118, 103, 102, 104, 125, 124, 41, 119, 104, 125, 127, 41, 119, 104, 125, 127, 41, 119, 104, 125, 127, 41, 84, 65, 67, 21, 75, 84, 65, 67, 21, 75, 84, 65, 67, 21, 93, 84, 65, 66, 21, 86, 82, 68, 68, 114, 99, 99, 126, 121, 112, 100, 84, 126, 103, 127, 114, 101, 90, 120, 115, 114, 55, 25, 7, 25, 25, 27, 55, 41, 55, 53, 69, 57, 39, 60, 44, 43, 73, 87, 76, 92, 91, 39, 77, 80, 88, 90, 77, 91, 91, 111, 113, 106, 122, 125, 1, 98, 97, 125, 125, 98, 107, 125, 125, 28, 2, 24, 28, 30, 110, 9, 23, 14, 4, 9, 11, 58, 36, 54, 43, 62, 60, 84, 55, 73, 80, 78, 92, 65, 84, 86, 62, 93, 34, 8, 22, 4, 26, 102, 8, 10, 4, 27, 5, 21, 10, 15, 9, 37, 59, 52, 39, 41, 75, 45, 42, 48, 75, 40, 45, 48, 6, 24, 19, 21, 18, 2, 15, 3, 74, 84, 93, 68, 89, 73, 66, 88, 88, 122, 117, 60, 111, 59, 104, 120, 122, 119, 126, 59, 111, 114, 118, 126, 120, 116, 127, 126, 59, 107, 105, 114, 116, 105, 59, 111, 116, 59, 111, 114, 118, 126, 120, 116, 127, 126, 72, 120, 122, 119, 126, 59, 121, 126, 114, 117, 124, 59, 104, 126, 111, 53, 34, 14, 12, 3, 8, 15, 8, 15, 6, 65, 4, 15, 2, 19, 24, 17, 21, 8, 14, 15, 65, 0, 15, 5, 65, 2, 14, 12, 17, 19, 4, 18, 18, 8, 14, 15, 65, 8, 18, 65, 15, 14, 21, 65, 18, 20, 17, 17, 14, 19, 21, 4, 5, 9, 37, 36, 62, 47, 36, 62, 9, 37, 39, 58, 11, 38, 45, 37, 106, 99, 79, 78, 84, 69, 78, 84, 101, 78, 67, 97, 76, 71, 79, 0, 79, 99, 98, 120, 105, 98, 120, 73, 98, 111, 99, 104, 101, 98, 107, 67, 126, 104, 105, 126, 44, 75, 103, 102, 124, 109, 102, 124, 77, 102, 107, 103, 108, 97, 102, 111, 91, 107, 103, 120, 109, 40, 40, 3, 15, 56, 21, 28, 9, 76, 1, 42, 38, 17, 60, 53, 32, 23, 32, 36, 33, 19, 32, 55, 54, 44, 42, 43, 101, 16, 23, 24, 25, 117, 57, 52, 54, 60, 59, 50, 117, 38, 52, 56, 37, 57, 48, 117, 38, 60, 47, 48, 117, 58, 32, 33, 117, 58, 51, 117, 39, 52, 59, 50, 48, 123, 74, 77, 66, 67, 93, 106, 110, 107, 89, 106, 125, 124, 102, 96, 97, 47, 61, 22, 27, 10, 1, 8, 12, 29, 28, 88, 44, 10, 25, 27, 19, 88, 30, 23, 13, 22, 28, 88, 26, 13, 12, 88, 59, 23, 22, 12, 29, 22, 12, 61, 22, 27, 51, 29, 1, 49, 60, 88, 15, 25, 11, 88, 22, 23, 12, 88, 30, 23, 13, 22, 28, 95, 98, 110, 127, 116, 105, 115, 117, 116, 58, 120, 115, 110, 58, 115, 105, 58, 105, 127, 110, 58, 115, 116, 58, 105, 115, 125, 116, 123, 118, 58, 120, 99, 110, 127, 105, 64, 93, 66, 78, 91, 21, 15, 124, 91, 78, 93, 91, 3, 15, 106, 65, 75, 3, 15, 125, 74, 78, 75, 96, 93, 75, 74, 93, 3, 15, 99, 78, 86, 74, 93, 3, 15, 124, 91, 86, 67, 74, 3, 15, 97, 78, 66, 74, 3, 15, 98, 78, 93, 72, 70, 65, 99, 3, 15, 98, 78, 93, 72, 70, 65, 125, 3, 15, 98, 78, 93, 72, 70, 65, 121, 3, 15, 106, 73, 73, 74, 76, 91, 3, 15, 123, 74, 87, 91, 48, 29, 31, 21, 18, 27, 92, 19, 18, 16, 5, 92, 15, 9, 12, 12, 19, 14, 8, 25, 24, 92, 21, 18, 92, 47, 21, 17, 12, 16, 25, 62, 16, 19, 31, 23, 15, 82, 31, 51, 60, 54, 51, 38, 61, 32, 43, 114, 55, 62, 55, 63, 55, 60, 38, 114, 1, 55, 55, 57, 27, 22, 114, 61, 32, 114, 1, 55, 55, 57, 2, 61, 33, 59, 38, 59, 61, 60, 114, 60, 61, 38, 114, 52, 61, 39, 60, 54, 122, 66, 91, 67, 94, 71, 91, 82, 23, 100, 82, 80, 90, 82, 89, 67, 23, 82, 91, 82, 90, 82, 89, 67, 68, 23, 89, 88, 67, 23, 68, 66, 71, 71, 88, 69, 67, 82, 83, 54, 23, 88, 14, 25, 20, 17, 28, 88, 12, 10, 25, 27, 19, 11, 88, 15, 29, 10, 29, 88, 30, 23, 13, 22, 28, 68, 101, 42, 124, 107, 102, 99, 110, 42, 124, 107, 120, 99, 100, 126, 42, 102, 111, 100, 109, 126, 98, 42, 103, 107, 121, 97, 42, 108, 101, 127, 100, 110, 96, 108, 119, 101, 113, 96, 102, 113, 43, 39, 48, 60, 53, 46, 87, 40, 63, 43, 68, 72, 67, 82, 79, 67, 56, 86, 68, 68, 81, 93, 86, 71, 90, 86, 45, 87, 86, 68, 58, 69, 73, 64, 89, 84, 69, 67, 84, 51, 8, 3, 30, 22, 3, 5, 18, 3, 2, 70, 15, 2, 92, 70, 24, 35, 40, 53, 61, 40, 46, 57, 40, 41, 109, 33, 44, 46, 36, 35, 42, 109, 59, 44, 33, 56, 40, 119, 109, 60, 53, 39, 58, 47, 45, 88, 5, 12, 30, 3, 22, 20, 103, 124, 26, 0, 28, 124, 18, 3, 75, 66, 80, 77, 88, 90, 41, 50, 84, 78, 82, 50, 92, 78, 77, 44, 37, 55, 42, 63, 61, 78, 85, 51, 41, 53, 85, 59, 44, 57, 86, 95, 77, 80, 69, 71, 52, 47, 73, 83, 79, 47, 83, 80, 6, 15, 29, 0, 21, 23, 24, 127, 25, 3, 31, 127, 24, 21, 6, 19, 53, 60, 46, 48, 76, 53, 37, 52, 76, 37, 44, 54, 49, 32, 32, 97, 104, 
        99, 127, 114, 120, 101, 118, 68, 77, 68, 66, 42, 12, 5, 12, 10, 99, 113, 125, 104, 110, 115, 111, 119, 125, 116, 107, 102, 103, 109, 45, 117, 103, 96, 111, 63, 45, 42, 37};
    }

    static {
        A06();
        A0r = new C1031Wg();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = C0695Iz.A0i(A03(539, 90, 21));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public C1029We() {
        this(0);
    }

    public C1029We(int i) {
        this(new C1032Wh(), i);
    }

    public C1029We(Cu cu, int i) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = cu;
        this.A0d.A8J(new C1030Wf(this, null));
        this.A0o = (i & 1) == 0;
        this.A0e = new D1();
        this.A0c = new SparseArray<>();
        this.A0k = new C0679Ij(4);
        this.A0n = new C0679Ij(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C0679Ij(4);
        this.A0i = new C0679Ij(C0675If.A03);
        this.A0h = new C0679Ij(4);
        this.A0j = new C0679Ij();
        this.A0m = new C0679Ij();
        this.A0f = new C0679Ij(8);
        this.A0g = new C0679Ij();
    }

    private int A00(InterfaceC0536Cd interfaceC0536Cd, InterfaceC0545Co interfaceC0545Co, int i) throws InterruptedException, IOException {
        int iAEF;
        int iA04 = this.A0j.A04();
        if (iA04 > 0) {
            iAEF = Math.min(i, iA04);
            if (A0q[7].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[2] = "aDvj6xsBYLtfkWvKOvjAJhuXcdkZRgYf";
            strArr[6] = "uG0ceA84GetZ2PjOc8Op6VIqDQh3bhN9";
            interfaceC0545Co.AEG(this.A0j, iAEF);
        } else {
            iAEF = interfaceC0545Co.AEF(interfaceC0536Cd, i, false);
        }
        this.A07 += iAEF;
        this.A08 += iAEF;
        return iAEF;
    }

    private long A01(long j) throws C0488Af {
        long j2 = this.A0M;
        if (j2 != -9223372036854775807L) {
            return C0695Iz.A0F(j, j2, 1000L);
        }
        throw new C0488Af(A03(189, 54, 33));
    }

    private InterfaceC0542Cl A02() {
        IZ iz;
        IZ iz2;
        if (this.A0K == -1 || this.A0H == -9223372036854775807L || (iz = this.A0Q) == null || iz.A02() == 0 || (iz2 = this.A0P) == null || iz2.A02() != this.A0Q.A02()) {
            this.A0Q = null;
            this.A0P = null;
            return new C1041Wq(this.A0H);
        }
        int iA02 = this.A0Q.A02();
        int[] iArr = new int[iA02];
        long[] jArr = new long[iA02];
        long[] timesUs = new long[iA02];
        long[] jArr2 = new long[iA02];
        for (int i = 0; i < iA02; i++) {
            jArr2[i] = this.A0Q.A03(i);
            jArr[i] = this.A0K + this.A0P.A03(i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 1;
            iArr[i2] = (int) (jArr[i3] - jArr[i2]);
            int i4 = i2 + 1;
            timesUs[i2] = jArr2[i4] - jArr2[i2];
        }
        iArr[iA02 - 1] = (int) ((this.A0K + this.A0L) - jArr[iA02 - 1]);
        timesUs[iA02 - 1] = this.A0H - jArr2[iA02 - 1];
        this.A0Q = null;
        this.A0P = null;
        return new C1046Wv(iArr, jArr, timesUs, jArr2);
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(InterfaceC0536Cd interfaceC0536Cd, int i) throws InterruptedException, IOException {
        if (this.A0k.A07() >= i) {
            return;
        }
        if (this.A0k.A05() < i) {
            C0679Ij c0679Ij = this.A0k;
            c0679Ij.A0b(Arrays.copyOf(c0679Ij.A00, Math.max(this.A0k.A00.length * 2, i)), this.A0k.A07());
        }
        interfaceC0536Cd.readFully(this.A0k.A00, this.A0k.A07(), i - this.A0k.A07());
        this.A0k.A0X(i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0201  */
    private void A08(InterfaceC0536Cd interfaceC0536Cd, Cy cy, int i) throws InterruptedException, IOException {
        byte[] bArr;
        int finalPartitionSize;
        int i2;
        int i3;
        if (A03(843, 11, 56).equals(cy.A0Y)) {
            A09(interfaceC0536Cd, A0w, i);
            return;
        }
        if (A03(833, 10, 45).equals(cy.A0Y)) {
            A09(interfaceC0536Cd, A0u, i);
            return;
        }
        InterfaceC0545Co interfaceC0545Co = cy.A0W;
        if (!this.A0S) {
            if (cy.A0c) {
                this.A01 &= -1073741825;
                if (!this.A0X) {
                    interfaceC0536Cd.readFully(this.A0k.A00, 0, 1);
                    this.A07++;
                    if ((this.A0k.A00[0] & 128) != 128) {
                        this.A00 = this.A0k.A00[0];
                        this.A0X = true;
                    } else {
                        throw new C0488Af(A03(504, 35, 32));
                    }
                }
                int partitionOffset = (this.A00 & 1) == 1 ? 1 : 0;
                if (partitionOffset != 0) {
                    boolean z = (this.A00 & 2) == 2;
                    this.A01 |= 1073741824;
                    boolean hasSubsampleEncryption = this.A0T;
                    if (!hasSubsampleEncryption) {
                        interfaceC0536Cd.readFully(this.A0f.A00, 0, 8);
                        this.A07 += 8;
                        this.A0T = true;
                        this.A0k.A00[0] = (byte) ((z ? 128 : 0) | 8);
                        this.A0k.A0Y(0);
                        interfaceC0545Co.AEG(this.A0k, 1);
                        this.A08++;
                        this.A0f.A0Y(0);
                        interfaceC0545Co.AEG(this.A0f, 8);
                        this.A08 += 8;
                    }
                    if (z) {
                        boolean hasSubsampleEncryption2 = this.A0U;
                        if (!hasSubsampleEncryption2) {
                            interfaceC0536Cd.readFully(this.A0k.A00, 0, 1);
                            this.A07++;
                            this.A0k.A0Y(0);
                            this.A0A = this.A0k.A0E();
                            this.A0U = true;
                        }
                        int samplePartitionDataSize = this.A0A * 4;
                        this.A0k.A0W(samplePartitionDataSize);
                        interfaceC0536Cd.readFully(this.A0k.A00, 0, samplePartitionDataSize);
                        this.A07 += samplePartitionDataSize;
                        short s = (short) ((this.A0A / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.A0R;
                        if (byteBuffer == null) {
                            this.A0R = ByteBuffer.allocate(i4);
                        } else {
                            int subsampleDataSize = byteBuffer.capacity();
                            if (subsampleDataSize < i4) {
                                this.A0R = ByteBuffer.allocate(i4);
                            }
                        }
                        this.A0R.position(0);
                        this.A0R.putShort(s);
                        int iA0H = 0;
                        int i5 = 0;
                        while (true) {
                            int i6 = this.A0A;
                            String[] strArr = A0q;
                            String str = strArr[2];
                            String str2 = strArr[6];
                            int samplePartitionDataSize2 = str.charAt(10);
                            int partitionOffset2 = str2.charAt(10);
                            if (samplePartitionDataSize2 == partitionOffset2) {
                                A0q[1] = "k69mdXr219EPEfxjmleoRJuaia7o0PSr";
                                if (i5 < i6) {
                                    int i7 = iA0H;
                                    iA0H = this.A0k.A0H();
                                    int partitionOffset3 = i5 % 2;
                                    if (partitionOffset3 == 0) {
                                        int partitionOffset4 = iA0H - i7;
                                        this.A0R.putShort((short) partitionOffset4);
                                    } else {
                                        int partitionOffset5 = iA0H - i7;
                                        this.A0R.putInt(partitionOffset5);
                                    }
                                    i5++;
                                } else {
                                    int i8 = (i - this.A07) - iA0H;
                                    if (i6 % 2 == 1) {
                                        this.A0R.putInt(i8);
                                    } else {
                                        this.A0R.putShort((short) i8);
                                        this.A0R.putInt(0);
                                    }
                                    this.A0g.A0b(this.A0R.array(), i4);
                                    interfaceC0545Co.AEG(this.A0g, i4);
                                    this.A08 += i4;
                                    break;
                                }
                            } else {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            } else if (cy.A0f != null) {
                this.A0j.A0b(cy.A0f, cy.A0f.length);
            }
            if (A0q[7].length() != 22) {
                String[] strArr2 = A0q;
                strArr2[2] = "eRgpr0IiA3tZEnoRsZk5vLwdwByA2WoR";
                strArr2[6] = "B2R3kYZJBQt6DDNd5X8Bo30p1EhdmlAk";
                this.A0S = true;
            } else {
                String[] strArr3 = A0q;
                strArr3[2] = "QAYpS6vLHXt9MUnC4aIg5miPxTeCV04h";
                strArr3[6] = "4gOZ0q0O5OtGCiklrvU5TO6zmpG8Wxaq";
                this.A0S = true;
            }
        }
        int nalUnitLengthFieldLengthDiff = i + this.A0j.A07();
        if (!A03(938, 15, 64).equals(cy.A0Y)) {
            if (A03(967, 16, 106).equals(cy.A0Y)) {
                bArr = this.A0h.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                finalPartitionSize = cy.A0M;
                i2 = 4 - cy.A0M;
                while (this.A07 < nalUnitLengthFieldLengthDiff) {
                    i3 = this.A09;
                    if (i3 == 0) {
                        this.A09 = i3 - A00(interfaceC0536Cd, interfaceC0545Co, i3);
                    } else {
                        A0A(interfaceC0536Cd, bArr, i2, finalPartitionSize);
                        this.A0h.A0Y(0);
                        this.A09 = this.A0h.A0H();
                        this.A0i.A0Y(0);
                        interfaceC0545Co.AEG(this.A0i, 4);
                        this.A08 += 4;
                    }
                }
            } else {
                if (cy.A0X != null) {
                    IK.A04(this.A0j.A07() == 0);
                    cy.A0X.A01(interfaceC0536Cd, this.A01, nalUnitLengthFieldLengthDiff);
                }
                while (true) {
                    int i9 = this.A07;
                    if (i9 >= nalUnitLengthFieldLengthDiff) {
                        break;
                    } else {
                        A00(interfaceC0536Cd, interfaceC0545Co, nalUnitLengthFieldLengthDiff - i9);
                    }
                }
            }
        } else {
            bArr = this.A0h.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            finalPartitionSize = cy.A0M;
            i2 = 4 - cy.A0M;
            while (this.A07 < nalUnitLengthFieldLengthDiff) {
                i3 = this.A09;
                if (i3 == 0) {
                    this.A09 = i3 - A00(interfaceC0536Cd, interfaceC0545Co, i3);
                } else {
                    A0A(interfaceC0536Cd, bArr, i2, finalPartitionSize);
                    this.A0h.A0Y(0);
                    this.A09 = this.A0h.A0H();
                    this.A0i.A0Y(0);
                    interfaceC0545Co.AEG(this.A0i, 4);
                    this.A08 += 4;
                }
            }
        }
        if (A03(181, 8, 49).equals(cy.A0Y)) {
            this.A0n.A0Y(0);
            interfaceC0545Co.AEG(this.A0n, 4);
            this.A08 += 4;
        }
    }

    private void A09(InterfaceC0536Cd interfaceC0536Cd, byte[] bArr, int i) throws InterruptedException, IOException {
        int length = bArr.length + i;
        if (this.A0m.A05() < length) {
            this.A0m.A00 = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        interfaceC0536Cd.readFully(this.A0m.A00, bArr.length, i);
        this.A0m.A0W(length);
    }

    private void A0A(InterfaceC0536Cd interfaceC0536Cd, byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        int iMin = Math.min(i2, this.A0j.A04());
        interfaceC0536Cd.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.A0j.A0c(bArr, i, iMin);
        }
        this.A07 += i2;
    }

    private void A0B(Cy cy, long j) {
        if (cy.A0X != null) {
            cy.A0X.A03(cy, j);
        } else {
            if (A03(843, 11, 56).equals(cy.A0Y)) {
                A0C(cy, A03(33, 19, 75), 19, 1000L, A0x);
            } else {
                if (A03(833, 10, 45).equals(cy.A0Y)) {
                    A0C(cy, A03(14, 19, 119), 21, 10000L, A0v);
                }
            }
            cy.A0W.AEH(j, this.A01, this.A08, 0, cy.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(Cy cy, String str, int i, long j, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i, j, bArr);
        InterfaceC0545Co interfaceC0545Co = cy.A0W;
        C0679Ij c0679Ij = this.A0m;
        interfaceC0545Co.AEG(c0679Ij, c0679Ij.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] bArrA0i;
        if (j == -9223372036854775807L) {
            bArrA0i = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - (((long) (i2 * 3600)) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * 1000000);
            int lastValue = (int) (j4 / 1000000);
            bArrA0i = C0695Iz.A0i(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(lastValue), Integer.valueOf((int) ((j4 - (((long) lastValue) * 1000000)) / j2))));
        }
        System.arraycopy(bArrA0i, 0, bArr, i, bArr2.length);
    }

    private boolean A0E(C0540Cj c0540Cj, long j) {
        if (this.A0Y) {
            this.A0J = j;
            c0540Cj.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        if (this.A0a) {
            long j2 = this.A0J;
            if (j2 != -1) {
                c0540Cj.A00 = j2;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x018c  */
    public static boolean A0F(String str) {
        if (!A03(1006, 5, 40).equals(str) && !A03(1011, 5, 96).equals(str) && !A03(902, 7, 80).equals(str) && !A03(953, 14, 58).equals(str) && !A03(923, 15, 39).equals(str) && !A03(909, 14, 105).equals(str) && !A03(938, 15, 64).equals(str)) {
            String strA03 = A03(967, 16, 106);
            if (A0q[3].charAt(28) == 'C') {
                A0q[4] = "gFQvwDmhScZxFRNyxLtLbYo4v3";
                if (!strA03.equals(str) && !A03(983, 15, 89).equals(str) && !A03(998, 8, 13).equals(str) && !A03(154, 6, 96).equals(str) && !A03(181, 8, 49).equals(str)) {
                    String strA04 = A03(74, 5, 98);
                    if (A0q[7].length() != 22) {
                        A0q[4] = "yYEJAbRmKSD6Tn3gjgDK46nuM7";
                        if (!strA04.equals(str) && !A03(128, 9, 65).equals(str) && !A03(137, 9, 43).equals(str) && !A03(79, 5, 76).equals(str) && !A03(116, 6, 103).equals(str) && !A03(173, 8, 125).equals(str) && !A03(84, 5, 66).equals(str) && !A03(89, 13, 50).equals(str)) {
                            String strA05 = A03(102, 14, 20);
                            if (A0q[7].length() != 22) {
                                A0q[3] = "pyyZW9LYVntbYlKTrY71spzm2cbnCDIb";
                                if (!strA05.equals(str)) {
                                    if (A03(122, 6, 114).equals(str) && !A03(146, 8, 115).equals(str) && !A03(160, 13, 94).equals(str) && !A03(843, 11, 56).equals(str) && !A03(833, 10, 45).equals(str) && !A03(854, 8, 44).equals(str) && !A03(823, 10, 66).equals(str) && !A03(815, 8, 9).equals(str)) {
                                        return false;
                                    }
                                }
                            } else {
                                String[] strArr = A0q;
                                strArr[5] = "q8IJ3S8YGVBTsJL9xOb8znK6VKYJyoeN";
                                strArr[0] = "yoxoUkUsMX88tVPYJ3NBxXOHcZGknnYN";
                                if (!strA05.equals(str)) {
                                    if (A03(122, 6, 114).equals(str)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static int[] A0H(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public final void A0I(int i) throws C0488Af {
        if (i == 160) {
            if (this.A04 != 2) {
                return;
            }
            if (!this.A0W) {
                this.A01 |= 1;
            }
            A0B(this.A0c.get(this.A05), this.A0D);
            this.A04 = 0;
            return;
        }
        if (A0q[3].charAt(28) == 'C') {
            String[] strArr = A0q;
            strArr[2] = "rbl1Q01lKztgjfT5AU1HA1uCy8pKF6Jb";
            strArr[6] = "0IgewP00Z0tSvfgvmyCD0no1Nhaiy8Yj";
            if (i == 174) {
                if (A0F(this.A0O.A0Y)) {
                    Cy cy = this.A0O;
                    cy.A09(this.A0N, cy.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            }
            if (i == 19899) {
                int i2 = this.A0B;
                if (i2 != -1) {
                    long j = this.A0I;
                    if (j != -1) {
                        if (i2 != 475249515) {
                            return;
                        }
                        this.A0F = j;
                        return;
                    }
                }
                throw new C0488Af(A03(667, 50, 104));
            }
            if (i == 25152) {
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(AG.A04, A03(1024, 10, 56), this.A0O.A0V.A03));
                    return;
                }
                throw new C0488Af(A03(449, 55, 66));
            }
            if (A0q[7].length() != 22) {
                A0q[4] = "mvRw2Aey0bC26pGUqGZgnnTCCn";
                if (i == 28032) {
                    if (!this.A0O.A0c || this.A0O.A0f == null) {
                        return;
                    } else {
                        throw new C0488Af(A03(243, 53, 91));
                    }
                }
                if (i == 357149030) {
                    if (this.A0M == -9223372036854775807L) {
                        this.A0M = 1000000L;
                    }
                    long j2 = this.A0G;
                    if (j2 == -9223372036854775807L) {
                        return;
                    }
                    this.A0H = A01(j2);
                    return;
                }
                if (i != 374648427) {
                    if (i != 475249515 || this.A0a) {
                        return;
                    }
                    this.A0N.AEM(A02());
                    this.A0a = true;
                    return;
                }
                if (this.A0c.size() != 0) {
                    this.A0N.A5D();
                    return;
                }
                throw new C0488Af(A03(756, 26, 66));
            }
        }
        throw new RuntimeException();
    }

    public final void A0J(int i, double d) {
        if (i == 181) {
            this.A0O.A0O = (int) d;
            return;
        }
        if (i != 17545) {
            switch (i) {
                case 21969:
                    this.A0O.A06 = (float) d;
                    break;
                case 21970:
                    this.A0O.A07 = (float) d;
                    break;
                case 21971:
                    this.A0O.A04 = (float) d;
                    break;
                case 21972:
                    this.A0O.A05 = (float) d;
                    break;
                case 21973:
                    this.A0O.A02 = (float) d;
                    break;
                case 21974:
                    this.A0O.A03 = (float) d;
                    break;
                case 21975:
                    this.A0O.A08 = (float) d;
                    break;
                case 21976:
                    this.A0O.A09 = (float) d;
                    break;
                case 21977:
                    this.A0O.A00 = (float) d;
                    break;
                case 21978:
                    this.A0O.A01 = (float) d;
                    break;
            }
            return;
        }
        this.A0G = (long) d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    public final void A0K(int timecode, int headerSize, InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        int i;
        int i2;
        int[] iArr;
        int lacing;
        int i3 = 0;
        int i4 = 1;
        if (timecode != 161 && timecode != 163) {
            if (timecode == 16981) {
                Cy cy = this.A0O;
                cy.A0f = new byte[headerSize];
                interfaceC0536Cd.readFully(cy.A0f, 0, headerSize);
                return;
            }
            if (timecode == 18402) {
                byte[] bArr = new byte[headerSize];
                interfaceC0536Cd.readFully(bArr, 0, headerSize);
                this.A0O.A0V = new C0544Cn(1, bArr, 0, 0);
                return;
            }
            String[] strArr = A0q;
            if (strArr[2].charAt(10) != strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            A0q[3] = "8HR6gUBClUOA9VGF2AqdEWeY5A09ChiZ";
            if (timecode == 21419) {
                Arrays.fill(this.A0l.A00, (byte) 0);
                interfaceC0536Cd.readFully(this.A0l.A00, 4 - headerSize, headerSize);
                this.A0l.A0Y(0);
                this.A0B = (int) this.A0l.A0M();
                return;
            }
            if (timecode == 25506) {
                Cy cy2 = this.A0O;
                cy2.A0d = new byte[headerSize];
                interfaceC0536Cd.readFully(cy2.A0d, 0, headerSize);
                return;
            } else if (timecode == 30322) {
                Cy cy3 = this.A0O;
                cy3.A0e = new byte[headerSize];
                interfaceC0536Cd.readFully(cy3.A0e, 0, headerSize);
                return;
            } else {
                throw new C0488Af(A03(862, 15, 92) + timecode);
            }
        }
        if (this.A04 == 0) {
            this.A05 = (int) this.A0e.A05(interfaceC0536Cd, false, true, 8);
            this.A06 = this.A0e.A04();
            this.A0C = -9223372036854775807L;
            this.A04 = 1;
            this.A0k.A0V();
        }
        Cy cy4 = this.A0c.get(this.A05);
        if (cy4 == null) {
            interfaceC0536Cd.AEt(headerSize - this.A06);
            this.A04 = 0;
            return;
        }
        if (this.A04 == 1) {
            A07(interfaceC0536Cd, 3);
            int i5 = (this.A0k.A00[2] & 6) >> 1;
            if (i5 == 0) {
                this.A02 = 1;
                this.A0b = A0H(this.A0b, 1);
                this.A0b[0] = (headerSize - this.A06) - 3;
            } else if (timecode == 163) {
                A07(interfaceC0536Cd, 4);
                this.A02 = (this.A0k.A00[3] & 255) + 1;
                this.A0b = A0H(this.A0b, this.A02);
                if (i5 == 2) {
                    int i6 = (headerSize - this.A06) - 4;
                    int i7 = this.A02;
                    Arrays.fill(this.A0b, 0, i7, i6 / i7);
                } else if (i5 != 1) {
                    if (i5 == 3) {
                        int i8 = 0;
                        int i9 = 4;
                        int sampleIndex = 0;
                        while (true) {
                            int i10 = this.A02;
                            if (sampleIndex >= i10 - 1) {
                                this.A0b[i10 - 1] = ((headerSize - this.A06) - i9) - i8;
                                break;
                            }
                            this.A0b[sampleIndex] = i3;
                            i9++;
                            A07(interfaceC0536Cd, i9);
                            if (this.A0k.A00[i9 - 1] != 0) {
                                long j = 0;
                                int i11 = 0;
                                while (i11 < 8) {
                                    int i12 = 7 - i11;
                                    if (A0q[4].length() != 26) {
                                        throw new RuntimeException();
                                    }
                                    A0q[4] = "Bykf528VWyTJ6zjZNIQBG2ExBd";
                                    int i13 = i4 << i12;
                                    if ((this.A0k.A00[i9 - 1] & i13) != 0) {
                                        int i14 = i9 - 1;
                                        i9 += i11;
                                        A07(interfaceC0536Cd, i9);
                                        int readPosition = i14 + 1;
                                        j = this.A0k.A00[i14] & 255 & (i13 ^ (-1));
                                        while (readPosition < i9) {
                                            int i15 = readPosition + 1;
                                            long readValue = this.A0k.A00[readPosition] & 255;
                                            j = (j << 8) | readValue;
                                            readPosition = i15;
                                        }
                                        if (sampleIndex <= 0) {
                                            break;
                                        }
                                        long readValue2 = (i11 * 7) + 6;
                                        j -= (1 << readValue2) - 1;
                                        break;
                                    }
                                    i11++;
                                    i4 = 1;
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i16 = (int) j;
                                    int[] iArr2 = this.A0b;
                                    if (sampleIndex != 0) {
                                        i16 += iArr2[sampleIndex - 1];
                                    }
                                    iArr2[sampleIndex] = i16;
                                    if (A0q[3].charAt(28) != 'C') {
                                        A0q[3] = "z0Au1LkbuRNouNVheQnfVlMARF4HCclD";
                                        i8 += this.A0b[sampleIndex];
                                        sampleIndex += 0;
                                        i3 = 0;
                                        i4 = 0;
                                    } else {
                                        A0q[3] = "Jxw4JkcEKQdQjQ2wbghJK6p5EXksCnqX";
                                        i8 += this.A0b[sampleIndex];
                                        sampleIndex++;
                                        i3 = 0;
                                        i4 = 1;
                                    }
                                } else {
                                    throw new C0488Af(A03(396, 37, 111));
                                }
                            } else {
                                throw new C0488Af(A03(782, 33, 48));
                            }
                        }
                    } else {
                        throw new C0488Af(A03(877, 25, 119) + i5);
                    }
                } else {
                    int i17 = 0;
                    int i18 = 4;
                    int headerSize2 = 0;
                    while (true) {
                        i = this.A02;
                        int sampleIndex2 = i - 1;
                        if (headerSize2 >= sampleIndex2) {
                            break;
                        }
                        int[] iArr3 = this.A0b;
                        if (A0q[7].length() != 22) {
                            String[] strArr2 = A0q;
                            strArr2[2] = "HssTvrarjitDxoBDF2Pnj4UTJMHcRuUP";
                            strArr2[6] = "K3IxBmd25ftGgmGYMlH4ryvoOn2rdnQj";
                            iArr3[headerSize2] = 0;
                        } else {
                            iArr3[headerSize2] = 0;
                        }
                        do {
                            i18++;
                            A07(interfaceC0536Cd, i18);
                            int sampleIndex3 = i18 - 1;
                            i2 = this.A0k.A00[sampleIndex3] & 255;
                            iArr = this.A0b;
                            int sampleIndex4 = iArr[headerSize2];
                            iArr[headerSize2] = sampleIndex4 + i2;
                        } while (i2 == 255);
                        int sampleIndex5 = iArr[headerSize2];
                        i17 += sampleIndex5;
                        headerSize2++;
                    }
                    this.A0b[i - 1] = ((headerSize - this.A06) - i18) - i17;
                }
            } else {
                throw new C0488Af(A03(629, 38, 70));
            }
            this.A0D = this.A0E + A01((this.A0k.A00[0] << 8) | (this.A0k.A00[1] & 255));
            int i19 = this.A0k.A00[2] & 8;
            if (A0q[4].length() == 26) {
                String[] strArr3 = A0q;
                strArr3[5] = "5G9wMrzgr3HoIE5OqVQ73d664iMAVR2N";
                strArr3[0] = "QdpFkvZSEeJoLmtyZ134AKJ6iIUqyZiN";
                if (i19 == 8) {
                    lacing = 1;
                } else {
                    lacing = 0;
                }
            } else if (i19 == 8) {
                lacing = 1;
            } else {
                lacing = 0;
            }
            this.A01 = (cy4.A0Q == 2 || (timecode == 163 && (this.A0k.A00[2] & 128) == 128) ? 1 : 0) | (lacing != 0 ? Integer.MIN_VALUE : 0);
            this.A04 = 2;
            this.A03 = 0;
        }
        if (timecode != 163) {
            A08(interfaceC0536Cd, cy4, this.A0b[0]);
            return;
        }
        while (true) {
            int i20 = this.A03;
            if (i20 < this.A02) {
                A08(interfaceC0536Cd, cy4, this.A0b[i20]);
                long j2 = this.A0D;
                int i21 = this.A03;
                int timecode2 = cy4.A0F;
                String[] strArr4 = A0q;
                if (strArr4[2].charAt(10) != strArr4[6].charAt(10)) {
                    A0B(cy4, j2 + ((long) ((i21 * timecode2) / AdError.NETWORK_ERROR_CODE)));
                    this.A03++;
                } else {
                    A0q[1] = "E2JpTArVwuU3wpOoffpeNj7iCqMKWnIf";
                    A0B(cy4, j2 + ((long) ((i21 * timecode2) / AdError.NETWORK_ERROR_CODE)));
                    this.A03++;
                }
            } else {
                this.A04 = 0;
                return;
            }
        }
    }

    public final void A0L(int i, long j) throws C0488Af {
        String strA03 = A03(0, 14, 56);
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new C0488Af(A03(327, 21, 54) + j + strA03);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new C0488Af(A03(348, 21, 50) + j + strA03);
        }
        switch (i) {
            case 131:
                this.A0O.A0Q = (int) j;
                return;
            case 136:
                this.A0O.A0Z = j == 1;
                return;
            case 155:
                this.A0C = A01(j);
                return;
            case 159:
                this.A0O.A0B = (int) j;
                return;
            case 176:
                this.A0O.A0R = (int) j;
                return;
            case 179:
                this.A0Q.A04(A01(j));
                return;
            case 186:
                this.A0O.A0J = (int) j;
                return;
            case 215:
                this.A0O.A0N = (int) j;
                return;
            case 231:
                this.A0E = A01(j);
                return;
            case 241:
                if (this.A0Z) {
                    return;
                }
                this.A0P.A04(j);
                this.A0Z = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new C0488Af(A03(296, 16, 112) + j + strA03);
            case 17029:
                if (j >= 1 && j <= 2) {
                    return;
                }
                throw new C0488Af(A03(377, 19, 127) + j + strA03);
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new C0488Af(A03(433, 16, 53) + j + strA03);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new C0488Af(A03(312, 15, 26) + j + strA03);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new C0488Af(A03(52, 22, 45) + j + strA03);
            case 21420:
                this.A0I = this.A0K + j;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.A0O.A0P = 0;
                    return;
                }
                if (i2 == 1) {
                    this.A0O.A0P = 2;
                    return;
                } else if (i2 == 3) {
                    this.A0O.A0P = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.A0O.A0P = 3;
                    return;
                }
            case 21680:
                this.A0O.A0I = (int) j;
                return;
            case 21682:
                this.A0O.A0H = (int) j;
                return;
            case 21690:
                this.A0O.A0G = (int) j;
                return;
            case 21930:
                this.A0O.A0a = j == 1;
                return;
            case 22186:
                this.A0O.A0S = j;
                return;
            case 22203:
                this.A0O.A0T = j;
                return;
            case 25188:
                this.A0O.A0A = (int) j;
                return;
            case 2352003:
                this.A0O.A0F = (int) j;
                return;
            case 2807729:
                this.A0M = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.A0O.A0C = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.A0O.A0C = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.A0O.A0E = 6;
                                return;
                            } else if (i4 == 18) {
                                this.A0O.A0E = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.A0O.A0E = 3;
                        return;
                    case 21947:
                        Cy cy = this.A0O;
                        cy.A0b = true;
                        if (A0q[4].length() != 26) {
                            throw new RuntimeException();
                        }
                        A0q[7] = "BNY";
                        int i5 = (int) j;
                        if (i5 == 1) {
                            cy.A0D = 1;
                            return;
                        }
                        if (i5 == 9) {
                            cy.A0D = 6;
                            return;
                        } else {
                            if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
                                return;
                            }
                            this.A0O.A0D = 2;
                            return;
                        }
                    case 21948:
                        this.A0O.A0K = (int) j;
                        return;
                    case 21949:
                        Cy cy2 = this.A0O;
                        String[] strArr = A0q;
                        if (strArr[5].charAt(31) != strArr[0].charAt(31)) {
                            cy2.A0L = (int) j;
                            return;
                        } else {
                            A0q[1] = "syCXJsWqdpX1qkuhAX2xE5R3ro0aMiDN";
                            cy2.A0L = (int) j;
                            return;
                        }
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    public final void A0M(int i, long j, long j2) throws C0488Af {
        if (i == 160) {
            this.A0W = false;
            return;
        }
        String[] strArr = A0q;
        if (strArr[5].charAt(31) != strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        A0q[4] = "AdTS27cZyEPjMpBmCOVMxp7hS9";
        if (i == 174) {
            this.A0O = new Cy(null);
            return;
        }
        if (i == 187) {
            this.A0Z = false;
            return;
        }
        if (i == 19899) {
            this.A0B = -1;
            this.A0I = -1L;
            return;
        }
        String[] strArr2 = A0q;
        if (strArr2[5].charAt(31) != strArr2[0].charAt(31)) {
            throw new RuntimeException();
        }
        A0q[3] = "wY7PzT4LsA3mCgyVRS2Kw1OTPeLWClxa";
        if (i == 20533) {
            this.A0O.A0c = true;
            return;
        }
        if (i == 21968) {
            this.A0O.A0b = true;
            return;
        }
        if (i != 25152) {
            if (i == 408125543) {
                long j3 = this.A0K;
                if (A0q[3].charAt(28) != 'C') {
                    A0q[1] = "okD0JH5Pg04Fag3yJX3zPaKxT8VrFmF5";
                    if (j3 != -1) {
                        if (A0q[7].length() != 22) {
                            throw new RuntimeException();
                        }
                        A0q[4] = "xUjpTE6fi698I1UVKMv3yTWS8T";
                        if (j3 != j) {
                            throw new C0488Af(A03(717, 39, 13));
                        }
                    }
                } else {
                    A0q[1] = "T2xOY9FAgnWM5SNzjVuKwwLVgl3XIr00";
                    if (j3 != -1) {
                        if (A0q[7].length() != 22) {
                            throw new RuntimeException();
                        }
                        A0q[4] = "xUjpTE6fi698I1UVKMv3yTWS8T";
                        if (j3 != j) {
                            throw new C0488Af(A03(717, 39, 13));
                        }
                    }
                }
                this.A0K = j;
                this.A0L = j2;
                return;
            }
            if (i == 475249515) {
                this.A0Q = new IZ();
                this.A0P = new IZ();
                return;
            }
            String[] strArr3 = A0q;
            if (strArr3[2].charAt(10) != strArr3[6].charAt(10)) {
                throw new RuntimeException();
            }
            A0q[7] = "qI";
            if (i != 524531317 || this.A0a) {
                return;
            }
            if (this.A0o && this.A0F != -1) {
                this.A0Y = true;
            } else {
                this.A0N.AEM(new C1041Wq(this.A0H));
                this.A0a = true;
            }
        }
    }

    public final void A0N(int i, String str) throws C0488Af {
        if (i == 134) {
            this.A0O.A0Y = str;
            return;
        }
        if (i != 17026) {
            if (i == 2274716) {
                this.A0O.A0g = str;
            }
        } else {
            if (A03(1034, 4, 114).equals(str) || A03(1016, 8, 38).equals(str)) {
                return;
            }
            throw new C0488Af(A03(369, 8, 86) + str + A03(0, 14, 56));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A0N = interfaceC0537Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        this.A0V = false;
        boolean zADZ = true;
        while (zADZ && !this.A0V) {
            zADZ = this.A0d.ADZ(interfaceC0536Cd);
            if (zADZ && A0E(c0540Cj, interfaceC0536Cd.A7F())) {
                return 1;
            }
        }
        if (zADZ) {
            return 0;
        }
        for (int i = 0; i < this.A0c.size(); i++) {
            this.A0c.valueAt(i).A07();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A0E = -9223372036854775807L;
        this.A04 = 0;
        this.A0d.reset();
        this.A0e.A06();
        A05();
        for (int i = 0; i < this.A0c.size(); i++) {
            this.A0c.valueAt(i).A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return new D0().A01(interfaceC0536Cd);
    }
}
