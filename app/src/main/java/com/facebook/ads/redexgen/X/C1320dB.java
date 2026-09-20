package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1320dB implements C7M {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C02691d A00;
    public final /* synthetic */ C1075Xy A01;
    public final /* synthetic */ boolean A02;

    public C1320dB(C02691d c02691d, C1075Xy c1075Xy, boolean z) {
        this.A00 = c02691d;
        this.A01 = c1075Xy;
        this.A02 = z;
    }

    private void A00(boolean z) {
        if (!z) {
            InterfaceC02681c interfaceC02681c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC02681c.A9u(AdError.CACHE_ERROR);
            return;
        }
        if (JR.A1A(this.A01)) {
            boolean z2 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z2) {
                C02691d c02691d = this.A00;
                c02691d.A02 = PB.A01(this.A01, c02691d.A03, 1, new C1321dC(this));
                return;
            }
        }
        this.A00.A04.A9v();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A00(true);
    }
}
