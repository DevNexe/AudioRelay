package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1084Yh implements InterfaceC04136v {
    public final /* synthetic */ C1082Yf A00;
    public final /* synthetic */ List A01;

    public C1084Yh(C1082Yf c1082Yf, List list) {
        this.A00 = c1082Yf;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        HashMap map = new HashMap();
        for (C04126u c04126u : this.A01) {
            if (c04126u.A02()) {
                String str = (String) c04126u.A01();
                C1083Yg systemProperty = new C1083Yg(str);
                map.put(str, systemProperty);
            }
        }
        return this.A00.A02(map);
    }
}
