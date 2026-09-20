package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1194b3 implements InterfaceC04136v {
    public final /* synthetic */ C1184at A00;

    public C1194b3(C1184at c1184at) {
        this.A00 = c1184at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.A00.A02 != null) {
                C1184at c1184at = this.A00;
                return c1184at.A04(c1184at.A02.getLockTaskModeState());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
