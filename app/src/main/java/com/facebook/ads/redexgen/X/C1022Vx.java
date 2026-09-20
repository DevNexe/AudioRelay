package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1022Vx implements InterfaceC0562Dq {
    public final C0678Ii A00 = new C0678Ii(new byte[4]);
    public final /* synthetic */ C1020Vv A01;

    public C1022Vx(C1020Vv c1020Vv) {
        this.A01 = c1020Vv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0562Dq
    public final void A48(C0679Ij c0679Ij) {
        if (c0679Ij.A0E() != 0) {
            return;
        }
        c0679Ij.A0Z(7);
        int iA04 = c0679Ij.A04() / 4;
        for (int i = 0; i < iA04; i++) {
            c0679Ij.A0a(this.A00, 4);
            int iA05 = this.A00.A04(16);
            this.A00.A08(3);
            if (iA05 == 0) {
                this.A00.A08(13);
            } else {
                int iA06 = this.A00.A04(13);
                this.A01.A06.put(iA06, new W0(new C1021Vw(this.A01, iA06)));
                C1020Vv.A01(this.A01);
            }
        }
        if (this.A01.A05 != 2) {
            this.A01.A06.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0562Dq
    public final void A8K(C0691Iv c0691Iv, InterfaceC0537Ce interfaceC0537Ce, C0568Dw c0568Dw) {
    }
}
