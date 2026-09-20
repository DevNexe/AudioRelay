package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1332dN {
    public final C1075Xy A00;
    public final K7 A01;

    public FX(C1075Xy c1075Xy, C1A c1a, List<UB> list, @Nullable K7 k7) {
        super(c1a, list, c1075Xy);
        this.A00 = c1075Xy;
        this.A01 = k7 == null ? new K7() : k7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0952Tc A06(ViewGroup viewGroup, int i) {
        return new C0952Tc(new C0787Ms(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1332dN, com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A0H */
    public final void A0E(C0952Tc c0952Tc, int i) {
        super.A0E(c0952Tc, i);
        C0787Ms c0787Ms = (C0787Ms) c0952Tc.A0l();
        A0F(c0787Ms.getImageCardView(), i);
        if (((AbstractC1332dN) this).A01.get(i) != null) {
            c0787Ms.setTitle(((AbstractC1332dN) this).A01.get(i).getAdHeadline());
            c0787Ms.setSubtitle(((AbstractC1332dN) this).A01.get(i).getAdLinkDescription());
            c0787Ms.setButtonText(((AbstractC1332dN) this).A01.get(i).getAdCallToAction());
        }
        UB ub = ((AbstractC1332dN) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0787Ms);
        ub.A1O(c0787Ms, c0787Ms, arrayList);
    }
}
