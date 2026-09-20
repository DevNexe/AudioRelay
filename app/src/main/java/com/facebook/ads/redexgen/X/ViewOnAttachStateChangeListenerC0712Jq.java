package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0712Jq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0710Jo A00;
    public final /* synthetic */ C0711Jp A01;

    public ViewOnAttachStateChangeListenerC0712Jq(C0711Jp c0711Jp, EnumC0710Jo enumC0710Jo) {
        this.A01 = c0711Jp;
        this.A00 = enumC0710Jo;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
