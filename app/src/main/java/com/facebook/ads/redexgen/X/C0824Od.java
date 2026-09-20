package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0824Od {
    public static final int A00 = MS.A00();

    public static void A00(C1075Xy c1075Xy, ViewGroup viewGroup, String str) {
        new T3(viewGroup, c1075Xy).A07(str);
        View view = new View(c1075Xy);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        MS.A0R(view, c1075Xy);
        viewGroup.addView(view, 0);
    }
}
