package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import defpackage.ra1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzce {
    public static zzce b;
    public String a;

    public static zzce zza() {
        if (b == null) {
            b = new zzce();
        }
        return b;
    }

    public final void zzb(Context context) {
        Context contextCreatePackageContext;
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.a)) {
            AtomicBoolean atomicBoolean = ra1.a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
