package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GQ implements InterfaceC0908Rj {
    public final C0644Gy A00;
    public final EnumC0913Ro A01;

    public GQ(C0644Gy c0644Gy, EnumC0913Ro enumC0913Ro) {
        this.A00 = c0644Gy;
        this.A01 = enumC0913Ro;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0908Rj
    public void A3O(Map<RR, EnumC0913Ro> map, Map<GV, EnumC0900Rb> map2) {
        map.put(this.A00, this.A01);
    }
}
