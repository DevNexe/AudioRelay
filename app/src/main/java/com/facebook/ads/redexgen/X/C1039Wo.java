package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1039Wo implements InterfaceC0535Cc {
    public static byte[] A07;
    public static String[] A08 = {"kwIa2qvFZnh4ugx7FyhwbqYesuLHzW8H", "4Dgc9JYMaZvt2hrxHtp57hAkJrlRZ5uW", "jO6V5", "R3", "Im86Iu6D0MRlrMkG5DQfIyJ6juGc2Tk5", "YTnYWq927V90IgLbpCGbNLebKXRpsTKS", "IVlYalVTOJIVyjwO93zz99ctNlNH9y3g", "4VmeTfaP7iXdbh5q2O9S939ewelN7CTt"};
    public static final InterfaceC0538Cf A09;
    public static final int A0A;
    public static final byte[] A0B;
    public static final byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0545Co A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{68, 2, 22, 5, 9, 1, 68, 16, 29, 20, 1, 68, 110, 108, 12, 0, 31, 71, 71, 69, 37, 41, 54, 73, 51, 38, 110, 19, 63, 37, 60, 52, 112, 62, 63, 36, 112, 54, 57, 62, 52, 112, 17, 29, 2, 112, 56, 53, 49, 52, 53, 34, 126, 118, 83, 83, 90, 88, 94, 83, 31, 126, 114, 109, 31, 66, 101, 125, 106, 103, 98, 111, 43, 123, 106, 111, 111, 98, 101, 108, 43, 105, 98, 127, 120, 43, 109, 100, 121, 43, 109, 121, 106, 102, 110, 43, 99, 110, 106, 111, 110, 121, 43, 100, 104, 11, 30, 117, 97, 112, 125, 123, 59, 39, 115, 100, 100, 79, 91, 74, 71, 65, 1, 79, 67, 92, 3, 89, 76};
    }

    static {
        A05();
        A09 = new C1040Wp();
        A0D = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0E = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0B = C0695Iz.A0i(A03(12, 6, 27));
        A0C = C0695Iz.A0i(A03(18, 9, 50));
        A0A = A0E[8];
    }

    private int A00(int i) throws C0488Af {
        if (!A07(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A03(53, 12, 105));
            sb.append(this.A05 ? A03(105, 2, 10) : A03(103, 2, 124));
            sb.append(A03(0, 12, 50));
            sb.append(i);
            throw new C0488Af(sb.toString());
        }
        if (!this.A05) {
            return A0D[i];
        }
        int[] iArr = A0E;
        if (A08[1].charAt(23) == 'y') {
            throw new RuntimeException();
        }
        A08[2] = "ixm0r";
        return iArr[i];
    }

    private int A01(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        interfaceC0536Cd.AEB();
        interfaceC0536Cd.AD7(this.A06, 0, 1);
        byte b = this.A06[0];
        if ((b & 131) <= 0) {
            return A00((b >> 3) & 15);
        }
        throw new C0488Af(A03(65, 38, 93) + ((int) b));
    }

    private int A02(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            try {
                this.A01 = A01(interfaceC0536Cd);
                this.A00 = this.A01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iAEF = this.A03.AEF(interfaceC0536Cd, this.A00, true);
        if (iAEF == -1) {
            return -1;
        }
        this.A00 -= iAEF;
        if (this.A00 > 0) {
            return 0;
        }
        InterfaceC0545Co interfaceC0545Co = this.A03;
        long j = this.A02;
        String[] strArr = A08;
        if (strArr[4].charAt(15) == strArr[5].charAt(15)) {
            throw new RuntimeException();
        }
        A08[2] = "25B6f";
        interfaceC0545Co.AEH(j, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            this.A03.A5V(Format.A06(null, this.A05 ? A03(117, 12, 120) : A03(107, 10, 66), null, -1, A0A, 1, this.A05 ? 16000 : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i) {
        return !this.A05 && (i < 12 || i > 14);
    }

    private boolean A07(int i) {
        return i >= 0 && i <= 15 && (A08(i) || A06(i));
    }

    private boolean A08(int i) {
        return this.A05 && (i < 10 || i > 13);
    }

    private boolean A09(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        if (A0A(interfaceC0536Cd, A0B)) {
            this.A05 = false;
            interfaceC0536Cd.AEt(A0B.length);
            return true;
        }
        if (!A0A(interfaceC0536Cd, A0C)) {
            return false;
        }
        this.A05 = true;
        interfaceC0536Cd.AEt(A0C.length);
        return true;
    }

    private boolean A0A(InterfaceC0536Cd interfaceC0536Cd, byte[] bArr) throws InterruptedException, IOException {
        interfaceC0536Cd.AEB();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0536Cd.AD7(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        interfaceC0537Ce.AEM(new C1041Wq(-9223372036854775807L));
        this.A03 = interfaceC0537Ce.AFD(0, 1);
        interfaceC0537Ce.A5D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        if (interfaceC0536Cd.A7F() != 0 || A09(interfaceC0536Cd)) {
            A04();
            return A02(interfaceC0536Cd);
        }
        throw new C0488Af(A03(27, 26, 6));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return A09(interfaceC0536Cd);
    }
}
