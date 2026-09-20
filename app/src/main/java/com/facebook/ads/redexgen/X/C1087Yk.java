package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1087Yk implements InterfaceC04136v {
    public final /* synthetic */ C1085Yi A00;

    public C1087Yk(C1085Yi c1085Yi) {
        this.A00 = c1085Yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        return this.A00.A03(SystemClock.elapsedRealtime() / 1000.0f);
    }
}
