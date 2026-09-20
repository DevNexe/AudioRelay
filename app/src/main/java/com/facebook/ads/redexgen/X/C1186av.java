package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1186av implements InterfaceC04136v {
    public final /* synthetic */ C1184at A00;

    public C1186av(C1184at c1184at) {
        this.A00 = c1184at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1184at c1184at = this.A00;
            return c1184at.A08(c1184at.A01.processName);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
