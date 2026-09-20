package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0991Up implements InterfaceC0649Hd {
    public final int A00;

    @Nullable
    public final InterfaceC0647Hb A01;
    public final InterfaceC0649Hd A02;
    public final InterfaceC0649Hd A03;
    public final I4 A04;

    @Nullable
    public final I6 A05;

    public C0991Up(I4 i4, InterfaceC0649Hd interfaceC0649Hd, InterfaceC0649Hd interfaceC0649Hd2, InterfaceC0647Hb interfaceC0647Hb, int i, I6 i6) {
        this.A04 = i4;
        this.A03 = interfaceC0649Hd;
        this.A02 = interfaceC0649Hd2;
        this.A01 = interfaceC0647Hb;
        this.A00 = i;
        this.A05 = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0649Hd
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0992Uq A4E() {
        I4 i4 = this.A04;
        InterfaceC0650He interfaceC0650HeA4E = this.A03.A4E();
        InterfaceC0650He interfaceC0650HeA4E2 = this.A02.A4E();
        InterfaceC0647Hb interfaceC0647Hb = this.A01;
        return new C0992Uq(i4, interfaceC0650HeA4E, interfaceC0650HeA4E2, interfaceC0647Hb != null ? interfaceC0647Hb.createDataSink() : null, this.A00, this.A05);
    }
}
