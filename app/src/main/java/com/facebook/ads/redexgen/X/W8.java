package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0554Di {
    public static byte[] A0E;
    public static String[] A0F = {"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    public long A00;
    public long A01;
    public InterfaceC0545Co A02;
    public C0558Dm A03;
    public String A04;
    public boolean A05;
    public final C0563Dr A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0560Do A08 = new C0560Do(7, 128);
    public final C0560Do A06 = new C0560Do(8, 128);
    public final C0560Do A07 = new C0560Do(6, 128);
    public final C0679Ij A0A = new C0679Ij();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    static {
        A01();
    }

    public W8(C0563Dr c0563Dr, boolean z, boolean z2) {
        this.A09 = c0563Dr;
        this.A0B = z;
        this.A0C = z2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0177  */
    private void A02(long j, int i, int i2, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i2);
            C0560Do c0560Do = this.A06;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0F[3] = "yEUIS2SJoSKiyXNZ5S9V3xqSna0x8qYs";
            c0560Do.A04(i2);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    C0674Ie c0674IeA06 = C0675If.A06(this.A08.A01, 3, this.A08.A00);
                    C0673Id c0673IdA05 = C0675If.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A5V(Format.A03(this.A04, A00(0, 9, 103), null, -1, -1, c0674IeA06.A06, c0674IeA06.A02, -1.0f, arrayList, -1, c0674IeA06.A00, null));
                    this.A05 = true;
                    this.A03.A05(c0674IeA06);
                    this.A03.A04(c0673IdA05);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(C0675If.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else {
                C0560Do c0560Do2 = this.A06;
                String[] strArr2 = A0F;
                if (strArr2[7].length() != strArr2[6].length()) {
                    String[] strArr3 = A0F;
                    strArr3[7] = "4gS5xwJzfuuPxe9g1";
                    strArr3[6] = "PKV4Z";
                    if (c0560Do2.A03()) {
                        this.A03.A04(C0675If.A05(this.A06.A01, 3, this.A06.A00));
                        this.A06.A00();
                    }
                } else {
                    String[] strArr4 = A0F;
                    strArr4[7] = "kGyV9pF87NOcG7T4L";
                    strArr4[6] = "bhPwg";
                    if (c0560Do2.A03()) {
                        this.A03.A04(C0675If.A05(this.A06.A01, 3, this.A06.A00));
                        this.A06.A00();
                    }
                }
            }
        }
        if (this.A07.A04(i2)) {
            int iA02 = C0675If.A02(this.A07.A01, this.A07.A00);
            C0679Ij c0679Ij = this.A0A;
            String[] strArr5 = A0F;
            if (strArr5[4].charAt(8) != strArr5[2].charAt(8)) {
                c0679Ij.A0b(this.A07.A01, iA02);
                this.A0A.A0Y(4);
                this.A09.A02(j2, this.A0A);
            } else {
                String[] strArr6 = A0F;
                strArr6[4] = "yBxIEmyTXmgFp9YnTDwoZpE0n0h2mQL3";
                strArr6[2] = "tg7t9oBRXzMr4c01fdI6E0npLzJKU9lY";
                c0679Ij.A0b(this.A07.A01, iA02);
                this.A0A.A0Y(4);
                this.A09.A02(j2, this.A0A);
            }
        }
        this.A03.A02(j, i);
    }

    private void A03(long j, int i, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i);
            this.A06.A01(i);
        }
        this.A07.A01(i);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A03(j, i, j2);
    }

    private void A04(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A03.A06(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A48(C0679Ij c0679Ij) {
        int iA06 = c0679Ij.A06();
        int iA07 = c0679Ij.A07();
        byte[] bArr = c0679Ij.A00;
        this.A01 += (long) c0679Ij.A04();
        this.A02.AEG(c0679Ij, c0679Ij.A04());
        while (true) {
            int iA04 = C0675If.A04(bArr, iA06, iA07, this.A0D);
            if (iA04 == iA07) {
                A04(bArr, iA06, iA07);
                return;
            }
            int iA01 = C0675If.A01(bArr, iA04);
            int nalUnitOffset = iA04 - iA06;
            if (nalUnitOffset > 0) {
                A04(bArr, iA06, iA04);
            }
            int i = iA07 - iA04;
            long j = this.A01 - ((long) i);
            int offset = nalUnitOffset < 0 ? -nalUnitOffset : 0;
            A02(j, i, offset, this.A00);
            A03(j, iA01, this.A00);
            iA06 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void A4V(InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
        c0568Dw.A05();
        this.A04 = c0568Dw.A04();
        this.A02 = interfaceC0537Ce.AFD(c0568Dw.A03(), 2);
        this.A03 = new C0558Dm(this.A02, this.A0B, this.A0C);
        this.A09.A03(interfaceC0537Ce, c0568Dw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AD4(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0554Di
    public final void AEK() {
        C0675If.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
