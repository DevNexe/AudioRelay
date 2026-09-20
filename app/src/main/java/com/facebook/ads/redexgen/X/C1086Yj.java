package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1086Yj implements InterfaceC04136v {
    public final /* synthetic */ C1085Yi A00;

    public C1086Yj(C1085Yi c1085Yi) {
        this.A00 = c1085Yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        return this.A00.A03(SystemClock.uptimeMillis() / 1000.0f);
    }
}
