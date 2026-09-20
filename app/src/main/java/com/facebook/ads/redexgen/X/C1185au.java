package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1185au implements InterfaceC04136v {
    public final /* synthetic */ C1184at A00;

    public C1185au(C1184at c1184at) {
        this.A00 = c1184at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (this.A00.A02 != null) {
            return this.A00.A0F(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
