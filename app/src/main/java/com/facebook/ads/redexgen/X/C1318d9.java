package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1318d9 implements InterfaceC03725f {
    public final /* synthetic */ C02691d A00;

    public C1318d9(C02691d c02691d) {
        this.A00 = c02691d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA1() {
        this.A00.A04.A9v();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA2() {
        this.A00.A04.A9u(AdError.CACHE_ERROR);
    }
}
