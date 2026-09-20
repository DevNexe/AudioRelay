package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BQ implements Runnable {
    public final /* synthetic */ BS A00;
    public final /* synthetic */ C0530Bw A01;

    public BQ(BS bs, C0530Bw c0530Bw) {
        this.A00 = bs;
        this.A01 = c0530Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            this.A00.A01.AA5(this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
