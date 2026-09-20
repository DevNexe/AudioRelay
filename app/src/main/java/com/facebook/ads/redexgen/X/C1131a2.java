package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1131a2 implements InterfaceC04136v {
    public final /* synthetic */ C1110Zh A00;

    public C1131a2(C1110Zh c1110Zh) {
        this.A00 = c1110Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(Build.SERIAL);
        }
        return this.A00.A08(Build.getSerial());
    }
}
