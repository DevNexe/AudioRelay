package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1225bY extends AbstractRunnableC0740Kv {
    public final /* synthetic */ C1224bX A00;

    public C1225bY(C1224bX c1224bX) {
        this.A00 = c1224bX;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0740Kv
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
