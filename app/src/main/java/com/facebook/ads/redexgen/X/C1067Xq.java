package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1067Xq extends L8 {
    public final /* synthetic */ C1074Xx A00;

    public C1067Xq(C1074Xx c1074Xx) {
        this.A00 = c1074Xx;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() throws Throwable {
        for (C04528u event : C04518t.A02()) {
            C04518t.A0A(this.A00, event.A02(), event.A00(), event.A01(), false);
        }
        C04518t.A02().clear();
    }
}
