package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1311d1 extends L8 {
    public final /* synthetic */ C1347dc A00;
    public final /* synthetic */ C02821q A01;
    public final /* synthetic */ FP A02;

    public C1311d1(FP fp, C02821q c02821q, C1347dc c1347dc) {
        this.A02 = fp;
        this.A01 = c02821q;
        this.A00 = c1347dc;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        KH khA00 = KH.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Z(khA00.A03().getErrorCode(), khA00.A04());
        this.A02.A06.A0G(khA00);
    }
}
