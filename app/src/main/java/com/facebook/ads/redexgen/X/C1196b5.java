package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1196b5 extends AbstractC04006i {
    public final List<C04106s> A00;

    public C1196b5(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final void A02(C04106s c04106s) {
        if (!c04106s.A03().contains(EnumC04176z.A0B)) {
            this.A00.add(c04106s);
        }
    }

    public final void A03(EnumC04146w enumC04146w) {
        A01(enumC04146w, this.A00);
    }
}
