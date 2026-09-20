package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F2 extends AbstractC0754Lj {
    public final /* synthetic */ C5L A00;

    public F2(C5L c5l) {
        this.A00 = c5l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04609c
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0767Ly c0767Ly) {
        if (this.A00.A08 != null) {
            UB.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
