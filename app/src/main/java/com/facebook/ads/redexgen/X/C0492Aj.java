package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0492Aj extends QK {
    public C0492Aj(C1075Xy c1075Xy) {
        super(c1075Xy);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int newHeightSpec, int i) {
        if (View.MeasureSpec.getMode(newHeightSpec) == 1073741824) {
            i = newHeightSpec;
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            newHeightSpec = i;
        }
        super.onMeasure(newHeightSpec, i);
    }
}
