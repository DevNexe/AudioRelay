package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0596Fc implements Runnable {
    public final /* synthetic */ C0605Fl A00;
    public final /* synthetic */ InterfaceC0608Fo A01;

    public RunnableC0596Fc(C0605Fl c0605Fl, InterfaceC0608Fo interfaceC0608Fo) {
        this.A00 = c0605Fl;
        this.A01 = interfaceC0608Fo;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.ABV(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
