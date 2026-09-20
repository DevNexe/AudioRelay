package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0939So implements O0 {
    public final /* synthetic */ C0937Sm A00;

    public C0939So(C0937Sm c0937Sm) {
        this.A00 = c0937Sm;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABg(String str) {
        this.A00.A0I = false;
        this.A00.A0C.setProgress(100);
        MS.A0N(this.A00.A0C, 8);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABi(String str) {
        this.A00.A0I = true;
        MS.A0N(this.A00.A0C, 0);
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABz(int i) {
        if (this.A00.A0I) {
            this.A00.A0C.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC4(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    @RequiresApi(api = 26)
    public final void AC6() {
        this.A00.A0E.A09().AAF(14);
    }
}
