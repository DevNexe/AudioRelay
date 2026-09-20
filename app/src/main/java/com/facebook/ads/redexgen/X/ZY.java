package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZY extends C04046m {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public ZY(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC04136v A0G() {
        return new ZZ(this);
    }

    public final InterfaceC04136v A0H() {
        return new C1105Zc(this);
    }

    public final InterfaceC04136v A0I() {
        return new C1104Zb(this);
    }

    public final InterfaceC04136v A0J() {
        return new C1106Zd(this);
    }

    public final InterfaceC04136v A0K() {
        return new C1103Za(this);
    }
}
