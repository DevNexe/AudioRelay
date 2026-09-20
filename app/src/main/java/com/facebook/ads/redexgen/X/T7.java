package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T7 extends L8 {
    public final WeakReference<C0895Qw> A00;

    public T7(C0895Qw c0895Qw) {
        this.A00 = new WeakReference<>(c0895Qw);
    }

    public T7(WeakReference<C0895Qw> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C0895Qw c0895Qw = this.A00.get();
        if (c0895Qw != null) {
            c0895Qw.A0U();
        }
    }
}
