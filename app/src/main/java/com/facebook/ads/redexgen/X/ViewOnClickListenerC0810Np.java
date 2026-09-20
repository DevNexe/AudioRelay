package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0810Np implements View.OnClickListener {
    public final /* synthetic */ C0813Ns A00;

    public ViewOnClickListenerC0810Np(C0813Ns c0813Ns) {
        this.A00 = c0813Ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A08.canGoForward()) {
                return;
            }
            this.A00.A08.goForward();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
