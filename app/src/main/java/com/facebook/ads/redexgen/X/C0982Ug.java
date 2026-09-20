package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0982Ug implements InterfaceC1398eX<JX, C0698Jc> {
    public C0979Ud A00;

    public C0982Ug(C0979Ud c0979Ud) {
        this.A00 = c0979Ud;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1398eX
    public final void A5I(C1395eU<JX, C0698Jc> c1395eU, InterfaceC1384eJ interfaceC1384eJ) {
        int i = JV.A00[interfaceC1384eJ.A7o(c1395eU).ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.A00.A02(c1395eU, interfaceC1384eJ);
    }
}
