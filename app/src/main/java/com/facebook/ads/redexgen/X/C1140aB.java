package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1140aB implements InterfaceC04136v {
    public final /* synthetic */ C1137a8 A00;

    public C1140aB(C1137a8 c1137a8) {
        this.A00 = c1137a8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A00 != null) {
            C1137a8 c1137a8 = this.A00;
            return c1137a8.A08(c1137a8.A00.getName());
        }
        return this.A00.A07(AnonymousClass76.A06);
    }
}
