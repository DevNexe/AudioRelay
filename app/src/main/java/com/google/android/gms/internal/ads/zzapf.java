package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import defpackage.hz5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapf {
    public NetworkCapabilities a;

    public zzapf(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new hz5(this));
        } catch (RuntimeException unused) {
            synchronized (zzapf.class) {
                this.a = null;
            }
        }
    }

    public static zzapf zzc(Context context) {
        if (context != null) {
            return new zzapf((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzapf.class) {
            NetworkCapabilities networkCapabilities = this.a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.a.hasTransport(1)) {
                    return 1L;
                }
                if (this.a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.a;
    }
}
