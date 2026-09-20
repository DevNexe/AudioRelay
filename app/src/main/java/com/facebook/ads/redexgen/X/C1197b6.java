package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1197b6 extends AbstractC04006i {
    public final List<C04106s> A00;

    public C1197b6(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final List<C04106s> A02() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A03(C04106s c04106s) {
        if (c04106s.A03().contains(EnumC04176z.A0B)) {
            this.A00.add(c04106s);
        }
    }

    public final void A04(EnumC04146w enumC04146w) {
        A01(enumC04146w, this.A00);
    }
}
