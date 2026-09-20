package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0609Fp extends AbstractC1315d6 {
    public final /* synthetic */ C0602Fi A00;
    public final /* synthetic */ AbstractC1335dQ A01;
    public final /* synthetic */ C1324dF A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609Fp(C0602Fi c0602Fi, boolean z, boolean z2, C1324dF c1324dF, AbstractC1335dQ abstractC1335dQ) {
        super(z);
        this.A00 = c0602Fi;
        this.A03 = z2;
        this.A02 = c1324dF;
        this.A01 = abstractC1335dQ;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1315d6
    public final void A00() {
        this.A00.A01.ACF(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1315d6
    public final void A01(boolean z) {
        if (!JR.A1D(this.A00.A04) || !this.A03) {
            this.A00.A0C.set(true);
            this.A00.A01.ACC(this.A01);
        } else {
            C0602Fi c0602Fi = this.A00;
            c0602Fi.A07 = PB.A01(c0602Fi.A04, this.A02, 0, new C1342dX(this));
        }
    }
}
