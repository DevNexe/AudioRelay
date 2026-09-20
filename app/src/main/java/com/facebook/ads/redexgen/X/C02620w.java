package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02620w extends C2M implements K3 {
    public AI A00;

    @Nullable
    public List<C0847Pa> A01;

    public C02620w(C1075Xy c1075Xy) {
        super(c1075Xy);
        this.A00 = new AI(this, 1, null, null, null);
    }

    public final void A22(C0895Qw c0895Qw) {
        AI ai = this.A00;
        if (ai != null) {
            ai.A0d(c0895Qw);
        }
    }

    public AI getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(this.A01);
    }
}
