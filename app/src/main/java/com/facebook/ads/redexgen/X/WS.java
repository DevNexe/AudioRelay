package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WS implements InterfaceC0535Cc, InterfaceC0542Cl {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final InterfaceC0538Cf A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0537Ce A09;
    public C0679Ij A0A;
    public boolean A0B;
    public DI[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0679Ij A0F;
    public final C0679Ij A0G;
    public final C0679Ij A0H;
    public final ArrayDeque<C1025Wa> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, 23, 21, 88, 11, 17, 2, 29, 88, 20, 29, 11, 11, 88, 12, 16, 25, 22, 88, 16, 29, 25, 28, 29, 10, 88, 20, 29, 22, 31, 12, 16, 88, 80, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new WT();
        A0M = C0695Iz.A08(A04(48, 4, 105));
    }

    public WS() {
        this(0);
    }

    public WS(int i) {
        this.A0E = i;
        this.A0F = new C0679Ij(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0679Ij(C0675If.A03);
        this.A0G = new C0679Ij(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i3 = 0;
        while (true) {
            DI[] diArr = this.A0C;
            if (i3 >= diArr.length) {
                break;
            }
            DI di = diArr[i3];
            int i4 = di.A00;
            if (i4 != di.A03.A01) {
                long j4 = di.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - preferredSkipAmount;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < j)) {
                    i = i5;
                    j = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    sampleIndex = i3;
                }
            }
            i3++;
        }
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (j3 == Long.MAX_VALUE || trackIndex == 0) {
            return i2;
        }
        long sampleOffset = 10485760 + j3;
        if (j2 < sampleOffset) {
            return i2;
        }
        return sampleIndex;
    }

    private int A01(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        int i;
        long jA7F = interfaceC0536Cd.A7F();
        if (this.A06 == -1) {
            this.A06 = A00(jA7F);
            if (this.A06 == -1) {
                return -1;
            }
        }
        DI di = this.A0C[this.A06];
        InterfaceC0545Co interfaceC0545Co = di.A01;
        int i2 = di.A00;
        long j = di.A03.A06[i2];
        int i3 = di.A03.A05[i2];
        long inputPosition = j - jA7F;
        long position = inputPosition + ((long) this.A04);
        if (position < 0 || position >= 262144) {
            c0540Cj.A00 = j;
            return 1;
        }
        if (di.A02.A02 == 1) {
            position += 8;
            i3 -= 8;
        }
        interfaceC0536Cd.AEt((int) position);
        if (di.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i4 = di.A02.A01;
            int i5 = 4 - di.A02.A01;
            while (this.A04 < i3) {
                int i6 = this.A05;
                if (i6 == 0) {
                    byte[] nalLengthData = this.A0G.A00;
                    interfaceC0536Cd.readFully(nalLengthData, i5, i4);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    interfaceC0545Co.AEG(this.A0H, 4);
                    this.A04 += 4;
                    i3 += i5;
                } else {
                    int writtenBytes = interfaceC0545Co.AEF(interfaceC0536Cd, i6, false);
                    this.A04 += writtenBytes;
                    this.A05 -= writtenBytes;
                }
            }
            i = 0;
        } else {
            while (true) {
                int i7 = this.A04;
                if (i7 >= i3) {
                    break;
                }
                int iAEF = interfaceC0545Co.AEF(interfaceC0536Cd, i3 - i7, false);
                int writtenBytes2 = this.A04;
                this.A04 = writtenBytes2 + iAEF;
                int writtenBytes3 = this.A05;
                this.A05 = writtenBytes3 - iAEF;
            }
            i = 0;
        }
        interfaceC0545Co.AEH(di.A03.A07[i2], di.A03.A04[i2], i3, 0, null);
        di.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(DR dr, long j) {
        int iA00 = dr.A00(j);
        if (iA00 == -1) {
            return dr.A01(j);
        }
        return iA00;
    }

    public static long A03(DR dr, long j, long j2) {
        int iA02 = A02(dr, j);
        if (iA02 == -1) {
            return j2;
        }
        return Math.min(dr.A06[iA02], j2);
    }

    private ArrayList<DR> A05(C1025Wa c1025Wa, C0539Cg c0539Cg, boolean z) throws C0488Af {
        DO doA0C;
        ArrayList<DR> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int size = c1025Wa.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i < size) {
                C1025Wa c1025Wa2 = c1025Wa.A01.get(i);
                if (((D3) c1025Wa2).A00 == D3.A1L && (doA0C = D8.A0C(c1025Wa2, c1025Wa.A07(D3.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    DR drA0E = D8.A0E(doA0C, c1025Wa2.A06(D3.A0d).A06(D3.A0h).A06(D3.A16), c0539Cg);
                    if (drA0E.A01 != 0) {
                        arrayList.add(drA0E);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws C0488Af {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j) {
            C1025Wa c1025WaPop = this.A0I.pop();
            if (((D3) c1025WaPop).A00 == D3.A0j) {
                A0A(c1025WaPop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(c1025WaPop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j) {
        for (DI di : this.A0C) {
            DR dr = di.A03;
            int iA00 = dr.A00(j);
            if (iA00 == -1) {
                iA00 = dr.A01(j);
            }
            di.A00 = iA00;
        }
    }

    private void A0A(C1025Wa c1025Wa) throws C0488Af {
        ArrayList<DR> arrayListA05;
        int size = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C0539Cg c0539Cg = new C0539Cg();
        WZ wzA07 = c1025Wa.A07(D3.A1P);
        if (wzA07 != null && (metadata = D8.A0F(wzA07, this.A0B)) != null) {
            c0539Cg.A05(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            arrayListA05 = A05(c1025Wa, c0539Cg, ignoreEditLists);
        } catch (WW unused) {
            c0539Cg = new C0539Cg();
            arrayListA05 = A05(c1025Wa, c0539Cg, true);
        }
        int size2 = arrayListA05.size();
        for (int i = 0; i < size2; i++) {
            DR dr = arrayListA05.get(i);
            DO r13 = dr.A03;
            DI di = new DI(r13, dr, this.A09.AFD(i, r13.A03));
            int trackCount = dr.A00 + 30;
            Format formatA0F = r13.A07.A0F(trackCount);
            if (r13.A03 == 1) {
                if (c0539Cg.A03()) {
                    formatA0F = formatA0F.A0G(c0539Cg.A00, c0539Cg.A01);
                }
                if (metadata != null) {
                    formatA0F = formatA0F.A0J(metadata);
                }
            }
            di.A01.A5V(formatA0F);
            jMax = Math.max(jMax, r13.A04 != -9223372036854775807L ? r13.A04 : dr.A02);
            int maxInputSize = r13.A03;
            if (maxInputSize == 2 && size == -1) {
                size = arrayList.size();
            }
            arrayList.add(di);
        }
        this.A02 = size;
        this.A08 = jMax;
        this.A0C = (DI[]) arrayList.toArray(new DI[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5D();
        this.A09.AEM(this);
    }

    public static boolean A0B(int i) {
        if (i != D3.A0j) {
            int i2 = D3.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i != i2 && i != D3.A0d && i != D3.A0h && i != D3.A16 && i != D3.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i) {
        if (i != D3.A0c && i != D3.A0n && i != D3.A0V && i != D3.A1A && i != D3.A1D && i != D3.A1B) {
            int i2 = D3.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i != i2 && i != D3.A0O && i != D3.A19 && i != D3.A1C && i != D3.A1E && i != D3.A17 && i != D3.A0B && i != D3.A1J && i != D3.A0U && i != D3.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            if (!interfaceC0536Cd.ADc(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long j = this.A07;
        if (j == 1) {
            interfaceC0536Cd.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0N();
        } else if (j == 0) {
            long jA6t = interfaceC0536Cd.A6t();
            if (jA6t == -1 && !this.A0I.isEmpty()) {
                jA6t = this.A0I.peek().A00;
            }
            if (jA6t != -1) {
                this.A07 = (jA6t - interfaceC0536Cd.A7F()) + ((long) this.A00);
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long jA7F = (interfaceC0536Cd.A7F() + this.A07) - ((long) this.A00);
                this.A0I.push(new C1025Wa(this.A01, jA7F));
                if (this.A07 == this.A00) {
                    A08(jA7F);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                IK.A04(this.A00 == 8);
                IK.A04(this.A07 <= 2147483647L);
                this.A0A = new C0679Ij((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C0488Af(A04(0, 48, 100));
    }

    private boolean A0E(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        long j = this.A07 - ((long) this.A00);
        long jA7F = interfaceC0536Cd.A7F() + j;
        boolean z = false;
        C0679Ij c0679Ij = this.A0A;
        if (c0679Ij != null) {
            interfaceC0536Cd.readFully(c0679Ij.A00, this.A00, (int) j);
            if (this.A01 == D3.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new WZ(this.A01, this.A0A));
            }
        } else if (j < 262144) {
            interfaceC0536Cd.AEt((int) j);
        } else {
            c0540Cj.A00 = interfaceC0536Cd.A7F() + j;
            z = true;
        }
        A08(jA7F);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C0679Ij c0679Ij) {
        c0679Ij.A0Y(8);
        if (c0679Ij.A08() == A0M) {
            return true;
        }
        c0679Ij.A0Z(4);
        while (c0679Ij.A04() > 0) {
            if (c0679Ij.A08() == A0M) {
                return true;
            }
        }
        return false;
    }

    public static long[][] A0G(DI[] diArr) {
        long[][] jArr = new long[diArr.length][];
        int[] iArr = new int[diArr.length];
        long[] jArr2 = new long[diArr.length];
        boolean[] zArr = new boolean[diArr.length];
        for (int i = 0; i < diArr.length; i++) {
            jArr[i] = new long[diArr[i].A03.A01];
            jArr2[i] = diArr[i].A03.A07[0];
        }
        long j = 0;
        int minTimeTrackIndex = 0;
        while (minTimeTrackIndex < diArr.length) {
            long j2 = Long.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < i; i3++) {
                if (!zArr[i3] && jArr2[i3] <= j2) {
                    i2 = i3;
                    j2 = jArr2[i3];
                }
            }
            int i4 = iArr[i2];
            jArr[i2][i4] = j;
            int trackSampleIndex = diArr[i2].A03.A05[i4];
            j += (long) trackSampleIndex;
            int i5 = i4 + 1;
            iArr[i2] = i5;
            int trackSampleIndex2 = jArr[i2].length;
            if (i5 < trackSampleIndex2) {
                jArr2[i2] = diArr[i2].A03.A07[i5];
            } else {
                zArr[i2] = true;
                minTimeTrackIndex++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Cl
    public final long A6S() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Cl
    public final C0541Ck A7O(long secondTimeUs) {
        long j;
        long jA03;
        int iA01;
        DI[] diArr = this.A0C;
        if (diArr.length == 0) {
            return new C0541Ck(C0543Cm.A04);
        }
        long j2 = -9223372036854775807L;
        long jA04 = -1;
        int i = this.A02;
        if (i != -1) {
            DR dr = diArr[i].A03;
            int iA02 = A02(dr, secondTimeUs);
            if (iA02 == -1) {
                return new C0541Ck(C0543Cm.A04);
            }
            j = dr.A07[iA02];
            jA03 = dr.A06[iA02];
            if (A0K[5].charAt(28) == 'l') {
                String[] strArr = A0K;
                strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                strArr[6] = "ISWp";
                if (j < secondTimeUs && iA02 < dr.A01 - 1 && (iA01 = dr.A01(secondTimeUs)) != -1 && iA01 != iA02) {
                    j2 = dr.A07[iA01];
                    jA04 = dr.A06[iA01];
                }
            }
            throw new RuntimeException();
        }
        j = secondTimeUs;
        jA03 = Long.MAX_VALUE;
        int i2 = 0;
        while (true) {
            DI[] diArr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i2 < diArr2.length) {
                if (i2 != this.A02) {
                    DR dr2 = diArr2[i2].A03;
                    jA03 = A03(dr2, j, jA03);
                    if (j2 != -9223372036854775807L) {
                        jA04 = A03(dr2, j2, jA04);
                    }
                }
                i2++;
            } else {
                C0543Cm c0543Cm = new C0543Cm(j, jA03);
                if (j2 == -9223372036854775807L) {
                    return new C0541Ck(c0543Cm);
                }
                return new C0541Ck(c0543Cm, new C0543Cm(j2, jA04));
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A09 = interfaceC0537Ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        while (true) {
            int i = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return A01(interfaceC0536Cd, c0540Cj);
                    }
                    throw new IllegalStateException();
                }
                if (A0E(interfaceC0536Cd, c0540Cj)) {
                    return 1;
                }
            } else if (!A0D(interfaceC0536Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return DM.A04(interfaceC0536Cd);
    }
}
