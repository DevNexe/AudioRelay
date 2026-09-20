package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1095Ys implements InterfaceC04136v {
    public final /* synthetic */ C1094Yr A00;

    public C1095Ys(C1094Yr c1094Yr) {
        this.A00 = c1094Yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.A00.A00 != null) {
                C1094Yr c1094Yr = this.A00;
                return c1094Yr.A0F(c1094Yr.A00.isPowerSaveMode());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
