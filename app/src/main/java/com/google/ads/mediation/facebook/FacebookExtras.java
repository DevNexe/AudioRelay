package com.google.ads.mediation.facebook;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class FacebookExtras {
    public static final String NATIVE_BANNER = "native_banner";
    public static boolean a;

    public Bundle build() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(NATIVE_BANNER, a);
        return bundle;
    }

    public FacebookExtras setNativeBanner(boolean z) {
        a = z;
        return this;
    }
}
