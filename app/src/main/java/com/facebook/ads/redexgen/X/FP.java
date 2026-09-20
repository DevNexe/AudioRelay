package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FP extends d2 {
    public FP(C1075Xy c1075Xy, C02811p c02811p) {
        super(c1075Xy, c02811p);
    }

    private InterfaceC02630x A00(Runnable runnable) {
        return new C1310d0(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        ((C1347dc) this.A01).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC02530n interfaceC02530n, C9H c9h, C9F c9f, C02821q c02821q) {
        C1347dc c1347dc = (C1347dc) interfaceC02530n;
        C1311d1 c1311d1 = new C1311d1(this, c02821q, c1347dc);
        A0C().postDelayed(c1311d1, c9h.A05().A05());
        c1347dc.A0A(this.A0B, A00(c1311d1), c02821q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    public final AnonymousClass18 A0T() {
        return ((C1347dc) this.A01).A09();
    }
}
