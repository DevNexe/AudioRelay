package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1226bZ extends AbstractRunnableC0740Kv {
    public final /* synthetic */ C1223bW A00;
    public final /* synthetic */ KH A01;

    public C1226bZ(C1223bW c1223bW, KH kh) {
        this.A00 = c1223bW;
        this.A01 = kh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0740Kv
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(C0748Ld.A00(this.A01));
        }
    }
}
