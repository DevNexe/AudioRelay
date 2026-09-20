package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1341dW implements InterfaceC03725f {
    public final /* synthetic */ C0602Fi A00;

    public C1341dW(C0602Fi c0602Fi) {
        this.A00 = c0602Fi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA1() {
        this.A00.A0C.set(true);
        this.A00.A01.ACC(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA2() {
        this.A00.A01.ACF(this.A00, AdError.CACHE_ERROR);
    }
}
