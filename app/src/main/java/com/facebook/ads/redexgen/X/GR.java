package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GR implements InterfaceC0908Rj {
    public final EnumC0900Rb A00;
    public final C4L A01;

    public GR(C4L c4l, EnumC0900Rb enumC0900Rb) {
        this.A01 = c4l;
        this.A00 = enumC0900Rb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0908Rj
    public void A3O(Map<RR, EnumC0913Ro> map, Map<GV, EnumC0900Rb> map2) {
        map2.put(this.A01, this.A00);
    }
}
