package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1192b1 implements InterfaceC04136v {
    public final /* synthetic */ C1184at A00;

    public C1192b1(C1184at c1184at) {
        this.A00 = c1184at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A00 != null) {
            C1184at c1184at = this.A00;
            return c1184at.A08(c1184at.A00.getGlEsVersion());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
