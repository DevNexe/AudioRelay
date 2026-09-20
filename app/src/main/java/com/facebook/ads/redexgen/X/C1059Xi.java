package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1059Xi implements InterfaceC0743Ky {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0743Ky
    public final void AE0(Throwable th, Object obj) {
        if (obj instanceof C8S) {
            C1075Xy c1075XyA5b = ((C8S) obj).A5b();
            if (c1075XyA5b != null) {
                c1075XyA5b.A0H(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1075Xy)) {
            return;
        }
        ((C1075Xy) context).A0H(th);
    }
}
