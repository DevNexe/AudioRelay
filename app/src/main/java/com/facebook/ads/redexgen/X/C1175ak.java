package com.facebook.ads.redexgen.X;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1175ak implements InterfaceC04136v {
    public final /* synthetic */ C1163aY A00;

    public C1175ak(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() {
        return this.A00.A06(new File(this.A00.A00.getApplicationInfo().publicSourceDir).length());
    }
}
