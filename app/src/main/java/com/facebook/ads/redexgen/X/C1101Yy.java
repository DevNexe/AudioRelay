package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1101Yy implements InterfaceC04136v {
    public final /* synthetic */ C1098Yv A00;

    public C1101Yy(C1098Yv c1098Yv) {
        this.A00 = c1098Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A04 != null) {
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(this.A00.A04.length, this.A00.A03.A0U());
            for (int i = 0; i < iMin; i++) {
                arrayList.add(this.A00.A04[i].name);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
