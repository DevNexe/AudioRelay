package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T0 extends L8 {
    public final /* synthetic */ OQ A00;

    public T0(OQ oq) {
        this.A00 = oq;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    @RequiresApi(api = 16)
    public final void A06() {
        if (this.A00.isPressed()) {
            OQ oq = this.A00;
            oq.postDelayed(this, oq.A07);
        } else {
            this.A00.setPressed(true);
            OQ oq2 = this.A00;
            oq2.postOnAnimationDelayed(oq2.A09, 250L);
        }
    }
}
