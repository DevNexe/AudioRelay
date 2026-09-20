package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z7 implements InterfaceC04136v {
    public final /* synthetic */ C1098Yv A00;

    public Z7(C1098Yv c1098Yv) {
        this.A00 = c1098Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A02 != null) {
            C1098Yv c1098Yv = this.A00;
            return c1098Yv.A0F(c1098Yv.A02.isSafeMode());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
