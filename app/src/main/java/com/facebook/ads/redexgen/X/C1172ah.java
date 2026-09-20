package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1172ah implements InterfaceC04136v {
    public final /* synthetic */ C1163aY A00;

    public C1172ah(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.A00.A01 != null) {
                C1163aY c1163aY = this.A00;
                return c1163aY.A04(c1163aY.A01.minSdkVersion);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
