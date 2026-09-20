package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1241bo extends AbstractRunnableC0740Kv {
    public final /* synthetic */ C1239bm A00;

    public C1241bo(C1239bm c1239bm) {
        this.A00 = c1239bm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0740Kv
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdClicked(this.A00.A01.A07());
        }
    }
}
