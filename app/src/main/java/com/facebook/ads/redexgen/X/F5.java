package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F5 {
    public final InterfaceC0647Hb A00;
    public final InterfaceC0649Hd A01;
    public final InterfaceC0649Hd A02;
    public final I4 A03;
    public final C0683In A04;

    public F5(I4 i4, InterfaceC0649Hd interfaceC0649Hd) {
        this(i4, interfaceC0649Hd, null, null, null);
    }

    public F5(I4 i4, InterfaceC0649Hd interfaceC0649Hd, @Nullable InterfaceC0649Hd interfaceC0649Hd2, @Nullable InterfaceC0647Hb interfaceC0647Hb, @Nullable C0683In c0683In) {
        IK.A01(interfaceC0649Hd);
        this.A03 = i4;
        this.A02 = interfaceC0649Hd;
        this.A01 = interfaceC0649Hd2;
        this.A00 = interfaceC0647Hb;
        this.A04 = c0683In;
    }

    public final I4 A00() {
        return this.A03;
    }

    public final C0992Uq A01(boolean z) {
        InterfaceC0650He cacheReadDataSource;
        InterfaceC0648Hc c0993Ur;
        InterfaceC0649Hd interfaceC0649Hd = this.A01;
        if (interfaceC0649Hd != null) {
            cacheReadDataSource = interfaceC0649Hd.A4E();
        } else {
            cacheReadDataSource = new V3();
        }
        if (z) {
            return new C0992Uq(this.A03, V4.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC0647Hb interfaceC0647Hb = this.A00;
        if (interfaceC0647Hb != null) {
            c0993Ur = interfaceC0647Hb.createDataSink();
        } else {
            c0993Ur = new C0993Ur(this.A03, 2097152L);
        }
        InterfaceC0650He interfaceC0650HeA4E = this.A02.A4E();
        C0683In c0683In = this.A04;
        if (c0683In != null) {
            interfaceC0650HeA4E = new C0997Uv(interfaceC0650HeA4E, c0683In, -1000);
        }
        return new C0992Uq(this.A03, interfaceC0650HeA4E, cacheReadDataSource, c0993Ur, 1, null);
    }

    public final C0683In A02() {
        C0683In c0683In = this.A04;
        return c0683In != null ? c0683In : new C0683In();
    }
}
