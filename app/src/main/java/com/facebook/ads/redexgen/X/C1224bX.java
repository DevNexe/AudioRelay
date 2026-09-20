package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1224bX implements C7M {
    public final List<C1345da> A00;
    public final /* synthetic */ C1223bW A01;

    public C1224bX(C1223bW c1223bW, List<C1345da> list) {
        this.A01 = c1223bW;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C1345da> it = this.A00.iterator();
        while (it.hasNext()) {
            UB ub = new UB(this.A01.A01, it.next(), null, UB.A0K(), this.A01.A00.A01());
            C1345da nativeAdapter = ub.A0y();
            if (nativeAdapter != null) {
                C1345da nativeAdapter2 = ub.A0y();
                if (nativeAdapter2.A0F() != null) {
                    C1345da nativeAdapter3 = ub.A0y();
                    ((AbstractC1307cx) nativeAdapter3.A0F()).A00(ub);
                }
            }
            this.A01.A00.A04(new NativeAd(this.A01.A01, ub));
        }
        C0744Kz.A00(new C1225bY(this));
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A00();
    }
}
