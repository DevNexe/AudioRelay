package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6T {
    public final List<InterfaceC03956d> A00 = new ArrayList();

    public final void A00() {
        for (InterfaceC03956d biometricSignalLifecycleHandler : this.A00) {
            biometricSignalLifecycleHandler.AD6();
        }
    }

    public final void A01(InterfaceC03956d interfaceC03956d) {
        this.A00.add(interfaceC03956d);
    }
}
