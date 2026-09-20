package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1130a1 implements InterfaceC04136v {
    public final /* synthetic */ C1110Zh A00;

    public C1130a1(C1110Zh c1110Zh) {
        this.A00 = c1110Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0E(Arrays.asList(strArr));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
