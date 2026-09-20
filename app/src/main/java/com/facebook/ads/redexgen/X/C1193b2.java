package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1193b2 implements InterfaceC04136v {
    public final /* synthetic */ C1184at A00;

    public C1193b2(C1184at c1184at) {
        this.A00 = c1184at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 16) {
            if (this.A00.A02 != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                this.A00.A02.getMemoryInfo(memoryInfo);
                return this.A00.A06(memoryInfo.totalMem / 1048576);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
