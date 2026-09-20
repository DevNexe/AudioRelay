package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import defpackage.ik0;
import defpackage.so5;
import defpackage.x53;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbe {
    public String a;
    public int b;
    public int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final float n;
    public final int o;
    public final int p;
    public final String q;

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    public zzcbe(Context context) {
        ActivityInfo activityInfo;
        String str;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zzbiy.zzc(context);
        b(context);
        d(context);
        c(context);
        Locale locale = Locale.getDefault();
        this.f = a(packageManager, "geo:0,0?q=donuts") != null;
        this.g = a(packageManager, "http://www.google.com") != null;
        this.h = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzq();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        this.i = zzcgg.zzq();
        this.j = ik0.b(context);
        this.k = ik0.d(context);
        this.l = locale.getLanguage();
        ResolveInfo resolveInfoA = a(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (resolveInfoA == null || (activityInfo = resolveInfoA.activityInfo) == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfoB = so5.a(context).b(0, activityInfo.packageName);
                if (packageInfoB != null) {
                    str = packageInfoB.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.m = str;
        try {
            PackageInfo packageInfoB2 = so5.a(context).b(128, "com.android.vending");
            if (packageInfoB2 != null) {
                str2 = packageInfoB2.versionCode + "." + packageInfoB2.packageName;
            }
        } catch (Exception unused2) {
        }
        this.q = str2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.n = displayMetrics.density;
        this.o = displayMetrics.widthPixels;
        this.p = displayMetrics.heightPixels;
    }

    public static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "DeviceInfo.gatherAudioInfo");
            }
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void c(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziy)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    public final void d(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = telephonyManager.getNetworkOperator();
        if (x53.b()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhi)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.c = networkType;
        telephonyManager.getPhoneType();
        this.b = -2;
        com.google.android.gms.ads.internal.zzt.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzx(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.b = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.b = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public final zzcbf zza() {
        return new zzcbf(this.f, this.g, this.a, this.h, this.i, this.j, this.k, this.l, this.m, this.q, this.b, this.c, this.n, this.o, this.p, this.d, this.e);
    }

    public zzcbe(Context context, zzcbf zzcbfVar) {
        zzbiy.zzc(context);
        b(context);
        d(context);
        c(context);
        this.d = Build.FINGERPRINT;
        this.e = Build.DEVICE;
        zzbjw.zzg(context);
        this.f = zzcbfVar.zza;
        this.g = zzcbfVar.zzb;
        this.h = zzcbfVar.zzd;
        this.i = zzcbfVar.zze;
        this.j = zzcbfVar.zzf;
        this.k = zzcbfVar.zzg;
        this.l = zzcbfVar.zzh;
        this.m = zzcbfVar.zzi;
        this.q = zzcbfVar.zzj;
        this.n = zzcbfVar.zzm;
        this.o = zzcbfVar.zzn;
        this.p = zzcbfVar.zzo;
    }
}
