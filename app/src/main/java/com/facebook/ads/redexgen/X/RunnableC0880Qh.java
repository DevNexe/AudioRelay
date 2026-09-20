package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0880Qh implements Runnable {
    public final /* synthetic */ C0883Qk A00;

    public RunnableC0880Qh(C0883Qk c0883Qk) {
        this.A00 = c0883Qk;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            this.A00.A04.removeCallbacks(this);
            this.A00.A04.postDelayed(this, 250L);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
