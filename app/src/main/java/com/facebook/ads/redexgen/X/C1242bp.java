package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1242bp extends AbstractRunnableC0740Kv {
    public final /* synthetic */ C1239bm A00;

    public C1242bp(C1239bm c1239bm) {
        this.A00 = c1239bm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0740Kv
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
