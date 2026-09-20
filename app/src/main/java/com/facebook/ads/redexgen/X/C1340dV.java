package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1340dV implements InterfaceC02771l {
    public final /* synthetic */ C0602Fi A00;

    public C1340dV(C0602Fi c0602Fi) {
        this.A00 = c0602Fi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02771l
    public final void ABm(AdError adError) {
        this.A00.A01.ACF(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02771l
    public final void ABn() {
        this.A00.A0C.set(true);
        this.A00.A01.ACC(this.A00);
    }
}
