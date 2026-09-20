package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z5 implements InterfaceC04136v {
    public final /* synthetic */ C1098Yv A00;

    public Z5(C1098Yv c1098Yv) {
        this.A00 = c1098Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.A00.A02 != null) {
                C1098Yv c1098Yv = this.A00;
                return c1098Yv.A0F(c1098Yv.A02.canRequestPackageInstalls());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
