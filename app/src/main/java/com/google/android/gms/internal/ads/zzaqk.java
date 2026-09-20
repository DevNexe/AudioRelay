package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import defpackage.rz5;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqk {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a = 0;
    public long b = 0;
    public long c = -1;
    public boolean d = false;

    public zzaqk(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new rz5(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzaqk zzd(Context context, Executor executor) {
        return new zzaqk(context, executor, e);
    }

    public final long zzb() {
        long j = this.c;
        this.c = -1L;
        return j;
    }

    public final long zzc() {
        if (this.d) {
            return this.b - this.a;
        }
        return -1L;
    }

    public final void zzh() {
        if (this.d) {
            this.b = System.currentTimeMillis();
        }
    }
}
