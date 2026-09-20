package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1097Yu implements InterfaceC04136v {
    public final /* synthetic */ C1094Yr A00;

    public C1097Yu(C1094Yr c1094Yr) {
        this.A00 = c1094Yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A00 != null && Build.VERSION.SDK_INT >= 7) {
            C1094Yr c1094Yr = this.A00;
            return c1094Yr.A0F(c1094Yr.A04());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
