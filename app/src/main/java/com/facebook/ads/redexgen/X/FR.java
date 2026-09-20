package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FR extends AbstractC1332dN {
    public final C1075Xy A00;

    public FR(C1A c1a, List<UB> list, C1075Xy c1075Xy) {
        super(c1a, list, c1075Xy);
        this.A00 = c1075Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0952Tc A06(ViewGroup viewGroup, int i) {
        return new C0952Tc(new C0791Mw(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1332dN, com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A0H */
    public final void A0E(C0952Tc c0952Tc, int i) {
        super.A0E(c0952Tc, i);
        C0791Mw c0791Mw = (C0791Mw) c0952Tc.A0l();
        N8 n8 = (N8) c0791Mw.getImageCardView();
        n8.setImageDrawable(null);
        A0F(n8, i);
        UB ub = ((AbstractC1332dN) this).A01.get(i);
        ub.A11().A0F(this.A00);
        ub.A1N(c0791Mw, c0791Mw);
    }
}
