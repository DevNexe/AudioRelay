package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1243bq extends AbstractRunnableC0740Kv {
    public final /* synthetic */ C1239bm A00;
    public final /* synthetic */ KH A01;

    public C1243bq(C1239bm c1239bm, KH kh) {
        this.A00 = c1239bm;
        this.A01 = kh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0740Kv
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onError(this.A00.A01.A07(), C0748Ld.A00(this.A01));
        }
    }
}
