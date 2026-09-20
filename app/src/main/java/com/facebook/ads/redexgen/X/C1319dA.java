package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1319dA implements InterfaceC02771l {
    public final /* synthetic */ C02691d A00;

    public C1319dA(C02691d c02691d) {
        this.A00 = c02691d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02771l
    public final void ABm(AdError adError) {
        this.A00.A04.A9u(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02771l
    public final void ABn() {
        this.A00.A04.A9v();
    }
}
