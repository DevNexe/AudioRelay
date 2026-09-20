package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0603Fj implements Runnable {
    public final /* synthetic */ C0605Fl A00;
    public final /* synthetic */ C0607Fn A01;
    public final /* synthetic */ InterfaceC0608Fo A02;

    public RunnableC0603Fj(C0605Fl c0605Fl, InterfaceC0608Fo interfaceC0608Fo, C0607Fn c0607Fn) {
        this.A00 = c0605Fl;
        this.A02 = interfaceC0608Fo;
        this.A01 = c0607Fn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A02.AAZ(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
