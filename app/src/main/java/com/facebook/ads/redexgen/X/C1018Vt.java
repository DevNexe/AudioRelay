package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1018Vt implements InterfaceC0535Cc {
    public static byte[] A05;
    public static String[] A06 = {"TnN98hFrpPh0PRtpc088aNdcZccscvrw", "5aRpZ2NNsZI5w0o7DGq1eAqNryB", "mEVhsrU6MzIr1qyqOlGiN", "yrEmV4s21h7BLFfB7siMTKTjJQry3", "EfBKzRp", "ss80CflBP4AmUjPde3BocO42m8Tqd1M1", "kqV6vinpOYrD", "3vWKjffhrtNYzin5lJ6IQFsZaR1xXQhq"};
    public static final InterfaceC0538Cf A07;
    public int A00;
    public int A01;
    public InterfaceC0537Ce A02;
    public InterfaceC0545Co A03;
    public C1017Vs A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{100, 95, 66, 68, 65, 65, 94, 67, 69, 84, 85, 17, 94, 67, 17, 68, 95, 67, 84, 82, 94, 86, 95, 88, 75, 84, 85, 17, 70, 80, 71, 17, 89, 84, 80, 85, 84, 67, 31, 107, 127, 110, 99, 101, 37, 120, 107, 125};
    }

    static {
        A01();
        A07 = new C1019Vu();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A02 = interfaceC0537Ce;
        this.A03 = interfaceC0537Ce.AFD(0, 1);
        this.A04 = null;
        interfaceC0537Ce.A5D();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00ab A[PHI: r5 r6
  0x00ab: PHI (r5v4 'size' int) = (r5v1 'size' int), (r5v5 'size' int) binds: [B:24:0x00e0, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r6v4 int) = (r6v2 int), (r6v5 int) binds: [B:24:0x00e0, B:15:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final int ADX(InterfaceC0536Cd interfaceC0536Cd, C0540Cj c0540Cj) throws InterruptedException, IOException {
        int iAEF;
        int size;
        if (this.A04 == null) {
            this.A04 = C0571Dz.A00(interfaceC0536Cd);
            C1017Vs c1017Vs = this.A04;
            if (c1017Vs == null) {
                throw new C0488Af(A00(0, 39, 121));
            }
            String[] strArr = A06;
            if (strArr[0].charAt(26) == strArr[7].charAt(26)) {
                throw new RuntimeException();
            }
            A06[6] = "qnd5ZZOQpU6p";
            this.A03.A5V(Format.A06(null, A00(39, 9, 66), null, c1017Vs.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
            this.A00 = this.A04.A01();
        }
        if (!this.A04.A07()) {
            C0571Dz.A03(interfaceC0536Cd, this.A04);
            this.A02.AEM(this.A04);
        }
        InterfaceC0545Co interfaceC0545Co = this.A03;
        int i = 32768 - this.A01;
        String[] strArr2 = A06;
        if (strArr2[3].length() != strArr2[2].length()) {
            String[] strArr3 = A06;
            strArr3[0] = "ZttzqU8TZk2sw4NPxxJqPVJwNlIpsBsB";
            strArr3[7] = "U3TfmanSbDpEsJ78blUW3XKzJFnKPbla";
            iAEF = interfaceC0545Co.AEF(interfaceC0536Cd, i, true);
            size = -1;
            if (iAEF != -1) {
                this.A01 += iAEF;
            }
        } else {
            iAEF = interfaceC0545Co.AEF(interfaceC0536Cd, i, true);
            size = -1;
            if (iAEF != -1) {
                this.A01 += iAEF;
            }
        }
        int i2 = this.A01 / this.A00;
        if (i2 > 0) {
            long jA05 = this.A04.A05(interfaceC0536Cd.A7F() - ((long) this.A01));
            int i3 = this.A00 * i2;
            this.A01 -= i3;
            this.A03.AEH(jA05, 1, i3, this.A01, null);
        }
        if (iAEF == size) {
            return size;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        return C0571Dz.A00(interfaceC0536Cd) != null;
    }
}
