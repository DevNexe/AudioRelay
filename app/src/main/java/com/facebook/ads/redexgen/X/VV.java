package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VV implements InterfaceC0545Co {
    public static String[] A0F = {"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0613Ft A04;
    public C0613Ft A05;
    public C0613Ft A06;
    public InterfaceC0614Fu A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final HW A0D;
    public final C0612Fs A0C = new C0612Fs();
    public final C0611Fr A0B = new C0611Fr();
    public final C0679Ij A0E = new C0679Ij(32);

    public VV(HW hw) {
        this.A0D = hw;
        this.A0A = hw.A6o();
        this.A04 = new C0613Ft(0L, this.A0A);
        C0613Ft c0613Ft = this.A04;
        this.A05 = c0613Ft;
        this.A06 = c0613Ft;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3L(), new C0613Ft(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        this.A01 += (long) i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            HW hw = this.A0D;
            HV hv = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            hw.ADn(hv);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (this.A05.A03 - j));
            byteBuffer.put(this.A05.A01.A01, this.A05.A00(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.A05.A03 - j));
            System.arraycopy(this.A05.A01.A01, this.A05.A00(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7 A[LOOP:0: B:31:0x00d5->B:32:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    private void A07(X2 x2, C0611Fr c0611Fr) {
        long j;
        int iA0I;
        int[] iArr;
        int[] iArr2;
        int i;
        int length;
        String[] strArr;
        long j2 = c0611Fr.A01;
        this.A0E.A0W(1);
        A06(j2, this.A0E.A00, 1);
        long j3 = j2 + 1;
        byte b = this.A0E.A00[0];
        int subsampleCount = (b & 128) == 0 ? 0 : 1;
        int i2 = b & 127;
        if (x2.A02.A04 != null) {
            A06(j3, x2.A02.A04, i2);
            if (A0F[6].charAt(8) == 'v') {
                A0F[2] = "XQ5VTIZgU7cNYJl8wSWINHCEMr3M82dZ";
                j = j3 + ((long) i2);
                if (subsampleCount != 0) {
                    this.A0E.A0W(2);
                    A06(j, this.A0E.A00, 2);
                    j += 2;
                    iA0I = this.A0E.A0I();
                } else {
                    iA0I = 1;
                }
                iArr = x2.A02.A06;
                if (iArr != null) {
                    length = iArr.length;
                    strArr = A0F;
                    if (strArr[3].charAt(10) != strArr[1].charAt(10)) {
                        String[] strArr2 = A0F;
                        strArr2[0] = "13b4Gtgpoqyqmo3AS7oAoqr";
                        strArr2[5] = "X95RBpGHqlYmay";
                        if (length < iA0I) {
                            iArr = new int[iA0I];
                        }
                    }
                } else {
                    iArr = new int[iA0I];
                }
                iArr2 = x2.A02.A07;
                if (iArr2 != null) {
                    iArr2 = new int[iA0I];
                } else {
                    iArr2 = new int[iA0I];
                }
                if (subsampleCount != 0) {
                    int i3 = iA0I * 6;
                    this.A0E.A0W(i3);
                    A06(j, this.A0E.A00, i3);
                    j += (long) i3;
                    this.A0E.A0Y(0);
                    for (i = 0; i < iA0I; i++) {
                        int subsampleDataLength = this.A0E.A0I();
                        iArr[i] = subsampleDataLength;
                        int subsampleDataLength2 = this.A0E.A0H();
                        iArr2[i] = subsampleDataLength2;
                    }
                } else {
                    iArr[0] = 0;
                    int i4 = c0611Fr.A00;
                    long offset = c0611Fr.A01;
                    iArr2[0] = i4 - ((int) (j - offset));
                }
                C0544Cn c0544Cn = c0611Fr.A02;
                C0528Bu c0528Bu = x2.A02;
                byte[] bArr = c0544Cn.A03;
                byte[] bArr2 = x2.A02.A04;
                int i5 = c0544Cn.A01;
                int i6 = c0544Cn.A02;
                int subsampleDataLength3 = c0544Cn.A00;
                c0528Bu.A03(iA0I, iArr, iArr2, bArr, bArr2, i5, i6, subsampleDataLength3);
                int i7 = (int) (j - c0611Fr.A01);
                c0611Fr.A01 += (long) i7;
                c0611Fr.A00 -= i7;
                return;
            }
        } else {
            C0528Bu c0528Bu2 = x2.A02;
            if (A0F[7].charAt(20) == 'U') {
                A0F[4] = "avxcN779OwCovbtwuSuiJyYUga";
                c0528Bu2.A04 = new byte[16];
                A06(j3, x2.A02.A04, i2);
                if (A0F[6].charAt(8) == 'v') {
                    A0F[2] = "XQ5VTIZgU7cNYJl8wSWINHCEMr3M82dZ";
                    j = j3 + ((long) i2);
                    if (subsampleCount != 0) {
                        this.A0E.A0W(2);
                        A06(j, this.A0E.A00, 2);
                        j += 2;
                        iA0I = this.A0E.A0I();
                    } else {
                        iA0I = 1;
                    }
                    iArr = x2.A02.A06;
                    if (iArr != null) {
                        length = iArr.length;
                        strArr = A0F;
                        if (strArr[3].charAt(10) != strArr[1].charAt(10)) {
                            String[] strArr3 = A0F;
                            strArr3[0] = "13b4Gtgpoqyqmo3AS7oAoqr";
                            strArr3[5] = "X95RBpGHqlYmay";
                            if (length < iA0I) {
                                iArr = new int[iA0I];
                            }
                        }
                    } else {
                        iArr = new int[iA0I];
                    }
                    iArr2 = x2.A02.A07;
                    if (iArr2 != null || iArr2.length < iA0I) {
                        iArr2 = new int[iA0I];
                    }
                    if (subsampleCount != 0) {
                        int i8 = iA0I * 6;
                        this.A0E.A0W(i8);
                        A06(j, this.A0E.A00, i8);
                        j += (long) i8;
                        this.A0E.A0Y(0);
                        while (i < iA0I) {
                            int subsampleDataLength4 = this.A0E.A0I();
                            iArr[i] = subsampleDataLength4;
                            int subsampleDataLength5 = this.A0E.A0H();
                            iArr2[i] = subsampleDataLength5;
                        }
                    } else {
                        iArr[0] = 0;
                        int i9 = c0611Fr.A00;
                        long offset2 = c0611Fr.A01;
                        iArr2[0] = i9 - ((int) (j - offset2));
                    }
                    C0544Cn c0544Cn2 = c0611Fr.A02;
                    C0528Bu c0528Bu3 = x2.A02;
                    byte[] bArr3 = c0544Cn2.A03;
                    byte[] bArr4 = x2.A02.A04;
                    int i10 = c0544Cn2.A01;
                    int i11 = c0544Cn2.A02;
                    int subsampleDataLength6 = c0544Cn2.A00;
                    c0528Bu3.A03(iA0I, iArr, iArr2, bArr3, bArr4, i10, i11, subsampleDataLength6);
                    int i12 = (int) (j - c0611Fr.A01);
                    c0611Fr.A01 += (long) i12;
                    c0611Fr.A00 -= i12;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A08(C0613Ft c0613Ft) {
        if (!c0613Ft.A02) {
            return;
        }
        boolean z = this.A06.A02;
        HV[] hvArr = new HV[(z ? 1 : 0) + (((int) (this.A06.A04 - c0613Ft.A04)) / this.A0A)];
        for (int i = 0; i < hvArr.length; i++) {
            hvArr[i] = c0613Ft.A01;
            c0613Ft = c0613Ft.A01();
        }
        this.A0D.ADo(hvArr);
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new C0613Ft(0L, this.A0A);
        C0613Ft c0613Ft = this.A04;
        this.A05 = c0613Ft;
        this.A06 = c0613Ft;
        this.A01 = 0L;
        this.A0D.AFE();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(AZ az, X2 x2, boolean z, boolean z2, long j) {
        int iA09 = this.A0C.A09(az, x2, z, z2, this.A02, this.A0B);
        if (iA09 == -5) {
            this.A02 = az.A00;
            return -5;
        }
        if (iA09 != -4) {
            if (iA09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!x2.A04()) {
            long j2 = x2.A00;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            A0F[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
            if (j2 < j) {
                x2.A00(Integer.MIN_VALUE);
            }
            if (x2.A0A()) {
                A07(x2, this.A0B);
            }
            x2.A09(this.A0B.A00);
            A05(this.A0B.A01, x2.A01, this.A0B.A00);
        }
        return -4;
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC0614Fu interfaceC0614Fu) {
        this.A07 = interfaceC0614Fu;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0545Co
    public final void A5V(Format format) {
        Format formatA01 = A01(format, this.A00);
        boolean zA0K = this.A0C.A0K(formatA01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0614Fu interfaceC0614Fu = this.A07;
        if (interfaceC0614Fu != null && zA0K) {
            interfaceC0614Fu.ACe(formatA01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0545Co
    public final int AEF(InterfaceC0536Cd interfaceC0536Cd, int i, boolean z) throws InterruptedException, IOException {
        int i2 = interfaceC0536Cd.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(i2);
        if (A0F[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "gj56WjutkODHGuBsULoCjgk";
        strArr[5] = "cXoHIYif5j6YkS";
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0545Co
    public final void AEG(C0679Ij c0679Ij, int i) {
        while (i > 0) {
            int iA00 = A00(i);
            c0679Ij.A0c(this.A06.A01.A01, this.A06.A00(this.A01), iA00);
            i -= iA00;
            A02(iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0545Co
    public final void AEH(long j, int i, int i2, int i3, C0544Cn c0544Cn) {
        if (this.A08) {
            A5V(this.A03);
        }
        if (this.A09) {
            if ((i & 1) != 0) {
                C0612Fs c0612Fs = this.A0C;
                if (A0F[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
                strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
                if (!c0612Fs.A0J(j)) {
                    return;
                }
                String[] strArr2 = A0F;
                if (strArr2[0].length() == strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0F[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                this.A09 = false;
            } else {
                return;
            }
        }
        long timeUs = j + this.A00;
        this.A0C.A0G(timeUs, i, (this.A01 - ((long) i2)) - ((long) i3), i2, c0544Cn);
    }
}
