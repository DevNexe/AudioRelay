package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z2 implements InterfaceC04136v {
    public final /* synthetic */ C1098Yv A00;

    public Z2(C1098Yv c1098Yv) {
        this.A00 = c1098Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C1098Yv c1098Yv = this.A00;
                return c1098Yv.A06(c1098Yv.A01.getLongVersionCode());
            }
            C1098Yv c1098Yv2 = this.A00;
            return c1098Yv2.A04(c1098Yv2.A01.versionCode);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
