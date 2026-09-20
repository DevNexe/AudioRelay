package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0955Tf implements O0 {
    public final /* synthetic */ InterfaceC0785Mq A00;
    public final /* synthetic */ C0953Td A01;

    public C0955Tf(C0953Td c0953Td, InterfaceC0785Mq interfaceC0785Mq) {
        this.A01 = c0953Td;
        this.A00 = interfaceC0785Mq;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABg(String str) {
        this.A01.A0A.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABi(String str) {
        this.A01.A05 = true;
        this.A01.A09.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABz(int i) {
        if (this.A01.A05) {
            this.A01.A0A.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC4(String str) {
        this.A01.A09.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC6() {
        this.A00.AAF(14);
    }
}
