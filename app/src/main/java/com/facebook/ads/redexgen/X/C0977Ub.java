package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0977Ub extends L8 {
    public final /* synthetic */ C0976Ua A00;

    public C0977Ub(C0976Ua c0976Ua) {
        this.A00 = c0976Ua;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
