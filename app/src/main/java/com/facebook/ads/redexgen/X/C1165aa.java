package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1165aa implements InterfaceC04136v {
    public final /* synthetic */ C1163aY A00;

    public C1165aa(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1163aY c1163aY = this.A00;
            return c1163aY.A08(c1163aY.A01.processName);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
