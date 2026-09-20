package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC0664Hu implements Runnable {
    public final InterfaceC0663Ht A00;

    public RunnableC0664Hu(InterfaceC0663Ht interfaceC0663Ht) {
        this.A00 = interfaceC0663Ht;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.ABM();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
