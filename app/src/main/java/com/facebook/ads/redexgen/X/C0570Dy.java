package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0570Dy {
    public final int A00;
    public final long A01;

    public C0570Dy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C0570Dy A00(InterfaceC0536Cd interfaceC0536Cd, C0679Ij c0679Ij) throws InterruptedException, IOException {
        interfaceC0536Cd.AD7(c0679Ij.A00, 0, 8);
        c0679Ij.A0Y(0);
        int id = c0679Ij.A08();
        return new C0570Dy(id, c0679Ij.A0K());
    }
}
