package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F8 extends C1262cA {
    public final /* synthetic */ AbstractC1248bv A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(AbstractC1248bv abstractC1248bv, Context context) {
        super(context);
        this.A00 = abstractC1248bv;
    }

    @Override // com.facebook.ads.redexgen.X.C1262cA, com.facebook.ads.redexgen.X.AbstractC03474g
    public final void A0I(View view, C03494i c03494i, C03454e c03454e) {
        AbstractC1248bv abstractC1248bv = this.A00;
        int[] iArrA0H = abstractC1248bv.A0H(abstractC1248bv.A00.getLayoutManager(), view);
        int i = iArrA0H[0];
        int i2 = iArrA0H[1];
        int iA0M = A0M(Math.max(Math.abs(i), Math.abs(i2)));
        if (iA0M > 0) {
            c03454e.A04(i, i2, iA0M, ((C1262cA) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1262cA
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
