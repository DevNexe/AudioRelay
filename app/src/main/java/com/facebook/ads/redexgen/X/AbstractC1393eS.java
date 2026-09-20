package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public abstract class AbstractC1393eS {

    @Nullable
    public InterfaceC1394eT A00;

    public final void A00() {
        InterfaceC1394eT interfaceC1394eT = this.A00;
        if (interfaceC1394eT != null) {
            interfaceC1394eT.onStart();
        }
    }

    public final void A01() {
        InterfaceC1394eT interfaceC1394eT = this.A00;
        if (interfaceC1394eT != null) {
            interfaceC1394eT.onStop();
        }
    }

    public final void A02(InterfaceC1394eT interfaceC1394eT) {
        this.A00 = interfaceC1394eT;
    }
}
