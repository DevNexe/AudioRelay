package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1387eM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1386eL A01;

    public RunnableC1387eM(C1386eL c1386eL, int i) {
        this.A01 = c1386eL;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A01.A01) {
                this.A01.A06(this.A01.A05.A9j());
                this.A01.A04.postDelayed(this.A01.A09, this.A00);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
