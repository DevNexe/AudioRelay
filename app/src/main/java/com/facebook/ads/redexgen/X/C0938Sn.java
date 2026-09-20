package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0938Sn extends L8 {
    public final /* synthetic */ C0937Sm A00;
    public final /* synthetic */ boolean A01;

    public C0938Sn(C0937Sm c0937Sm, boolean z) {
        this.A00 = c0937Sm;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AbstractC0784Mp abstractC0784MpA08 = this.A00.A0E.A08();
        if (abstractC0784MpA08 == null) {
            return;
        }
        abstractC0784MpA08.setPageDetailsVisible((this.A01 || abstractC0784MpA08.A05()) ? false : true);
        abstractC0784MpA08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
