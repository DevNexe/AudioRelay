package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Cq {
    public final InterfaceC0545Co A00;

    public abstract void A0B(C0679Ij c0679Ij, long j) throws C0488Af;

    public abstract boolean A0C(C0679Ij c0679Ij) throws C0488Af;

    public Cq(InterfaceC0545Co interfaceC0545Co) {
        this.A00 = interfaceC0545Co;
    }

    public final void A00(C0679Ij c0679Ij, long j) throws C0488Af {
        if (A0C(c0679Ij)) {
            A0B(c0679Ij, j);
        }
    }
}
