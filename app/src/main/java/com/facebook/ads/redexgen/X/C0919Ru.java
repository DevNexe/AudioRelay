package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0919Ru extends OX {
    public final ImageView A00;
    public final C1075Xy A01;

    public C0919Ru(C1075Xy c1075Xy) {
        super(c1075Xy);
        this.A01 = c1075Xy;
        this.A00 = new ImageView(c1075Xy);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        T3 t3 = new T3(this.A00, this.A01);
        t3.A04();
        t3.A07(str);
    }
}
