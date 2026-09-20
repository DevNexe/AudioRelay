package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0923Ry extends AbstractC0894Qv {
    public final /* synthetic */ InterfaceC0703Jh A00;
    public final /* synthetic */ MK A01;
    public final /* synthetic */ C0847Pa A02;
    public final /* synthetic */ C0921Rw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0923Ry(C0921Rw c0921Rw, String str, C0847Pa c0847Pa, InterfaceC0703Jh interfaceC0703Jh, Map map, MK mk) {
        this.A03 = c0921Rw;
        this.A04 = str;
        this.A02 = c0847Pa;
        this.A00 = interfaceC0703Jh;
        this.A05 = map;
        this.A01 = mk;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0894Qv
    public final void A02() {
        if (!this.A03.A01.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A07.get(this.A02.A02())) {
            this.A00.A93(this.A04, new OG(this.A05).A03(this.A03.A02).A02(this.A01).A05());
            this.A03.A07.put(this.A02.A02(), true);
        }
    }
}
