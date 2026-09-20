package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1353di implements InterfaceC03725f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1348dd A01;
    public final /* synthetic */ C1348dd A02;
    public final /* synthetic */ C9I A03;

    public C1353di(C1348dd c1348dd, int i, C9I c9i, C1348dd c1348dd2) {
        this.A01 = c1348dd;
        this.A00 = i;
        this.A03 = c9i;
        this.A02 = c1348dd2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA1() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03725f
    public final void AA2() {
        this.A01.A00.ABC(this.A02, KH.A00(AdErrorType.NO_FILL));
    }
}
