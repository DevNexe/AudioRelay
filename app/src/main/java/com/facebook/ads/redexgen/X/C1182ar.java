package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1182ar implements InterfaceC04136v {
    public final /* synthetic */ C1163aY A00;

    public C1182ar(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1163aY c1163aY = this.A00;
            return c1163aY.A04(c1163aY.A01.theme);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
