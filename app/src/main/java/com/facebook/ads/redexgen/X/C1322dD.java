package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1322dD implements InterfaceC03725f {
    public final /* synthetic */ C02691d A00;
    public final /* synthetic */ C1075Xy A01;
    public final /* synthetic */ boolean A02;

    public C1322dD(C02691d c02691d, C1075Xy c1075Xy, boolean z) {
        this.A00 = c02691d;
        this.A01 = c1075Xy;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA1() {
        if (!JR.A1A(this.A01) || !this.A02) {
            this.A00.A04.A9v();
        } else {
            C02691d c02691d = this.A00;
            c02691d.A02 = PB.A01(this.A01, c02691d.A03, 1, new C1323dE(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA2() {
        this.A00.A04.A9u(AdError.CACHE_ERROR);
    }
}
