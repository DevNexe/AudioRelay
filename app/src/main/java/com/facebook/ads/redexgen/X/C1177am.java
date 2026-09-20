package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1177am implements InterfaceC04136v {
    public final /* synthetic */ C1163aY A00;

    public C1177am(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() throws Throwable {
        if (this.A00.A02.A0a() != EnumC04176z.A0I) {
            String strA06 = this.A00.A03.A06(10010);
            if (strA06 != null) {
                return this.A00.A08(strA06);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A04);
    }
}
