package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1120Zr implements InterfaceC04136v {
    public final /* synthetic */ C1110Zh A00;

    public C1120Zr(C1110Zh c1110Zh) {
        this.A00 = c1110Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        return this.A00.A08(Build.VERSION.BASE_OS);
    }
}
