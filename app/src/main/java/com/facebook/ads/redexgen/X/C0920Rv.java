package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0920Rv extends C4H<C0918Rt> {
    public final int A00;
    public final C1075Xy A01;
    public final List<String> A02;

    public C0920Rv(C1075Xy c1075Xy, List<String> screenshotUrls, int i) {
        this.A02 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1075Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0918Rt A06(ViewGroup viewGroup, int i) {
        return new C0918Rt(new C0919Ru(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0918Rt c0918Rt, int leftMargin) {
        int i;
        String str = this.A02.get(leftMargin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A00;
        int startSpacing = i2 * 4;
        if (leftMargin == 0) {
            i2 = startSpacing;
        }
        int startSpacing2 = A0D();
        if (leftMargin >= startSpacing2 - 1) {
            int startSpacing3 = this.A00;
            i = startSpacing3 * 4;
        } else {
            i = this.A00;
        }
        marginLayoutParams.setMargins(i2, 0, i, 0);
        c0918Rt.A0l().setLayoutParams(marginLayoutParams);
        c0918Rt.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A02.size();
    }
}
