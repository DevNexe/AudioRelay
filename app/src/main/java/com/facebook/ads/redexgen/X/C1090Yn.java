package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1090Yn implements InterfaceC04136v {
    public final /* synthetic */ EnumC04096r A00;
    public final /* synthetic */ C1088Yl A01;
    public final /* synthetic */ List A02;

    public C1090Yn(C1088Yl c1088Yl, List list, EnumC04096r enumC04096r) {
        this.A01 = c1088Yl;
        this.A02 = list;
        this.A00 = enumC04096r;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        HashMap map = new HashMap();
        for (C04126u c04126u : this.A02) {
            if (c04126u.A02()) {
                String str = (String) c04126u.A01();
                C1089Ym systemSettings = new C1089Ym(this.A01.A00, str, this.A00);
                map.put(str, systemSettings);
            }
        }
        return this.A01.A03((HashMap<String, C1089Ym>) map);
    }
}
