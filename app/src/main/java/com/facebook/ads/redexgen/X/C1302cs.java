package com.facebook.ads.redexgen.X;

import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1302cs extends AbstractRunnableC0740Kv {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC1300cq A01;

    public C1302cs(AbstractC1300cq abstractC1300cq, Message message) {
        this.A01 = abstractC1300cq;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0740Kv
    public final void A01() {
        this.A01.A04.A80(this.A00);
    }
}
