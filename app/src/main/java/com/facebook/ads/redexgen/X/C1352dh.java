package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1352dh extends L8 {
    public final /* synthetic */ C1351dg A00;
    public final /* synthetic */ A1 A01;

    public C1352dh(C1351dg c1351dg, A1 a1) {
        this.A00 = c1351dg;
        this.A01 = a1;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A00.A00.A09();
        if (this.A00.A00.A0A != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0A);
            this.A00.A00.A0A.A0U();
        }
    }
}
