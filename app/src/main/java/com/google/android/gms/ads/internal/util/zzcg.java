package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbiy;
import defpackage.e86;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg {
    public boolean d;
    public Context e;
    public boolean c = false;

    @GuardedBy("this")
    public final WeakHashMap b = new WeakHashMap();

    @GuardedBy("this")
    public final e86 a = new e86(this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context) {
        if (this.c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext == null) {
            this.e = context;
        }
        zzbiy.zzc(this.e);
        this.d = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcT)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziy)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.e.registerReceiver(this.a, intentFilter);
        } else {
            this.e.registerReceiver(this.a, intentFilter, 4);
        }
        this.c = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbiy.zzc(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziy)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
