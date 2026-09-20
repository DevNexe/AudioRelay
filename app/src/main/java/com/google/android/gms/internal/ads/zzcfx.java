package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.zzg;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfx {
    public final String g;
    public final zzg h;
    public long a = -1;
    public long b = -1;

    @GuardedBy("lock")
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();

    @GuardedBy("lock")
    public int i = 0;

    @GuardedBy("lock")
    public int j = 0;

    public zzcfx(String str, zzg zzgVar) {
        this.g = str;
        this.h = zzgVar;
    }

    public final void a() {
        if (((Boolean) zzbku.zza.zze()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }

    public final Bundle zza(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            bundle = new Bundle();
            if (!this.h.zzP()) {
                bundle.putString("session_id", this.g);
            }
            bundle.putLong("basets", this.b);
            bundle.putLong("currts", this.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            Context contextZza = zzcbo.zza(context);
            int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            boolean z = false;
            if (identifier == 0) {
                zzcgn.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        zzcgn.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcgn.zzj("Fail to fetch AdActivity theme");
                    zzcgn.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    public final void zzb() {
        synchronized (this.f) {
            this.i++;
        }
    }

    public final void zzc() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void zzd() {
        a();
    }

    public final void zze() {
        a();
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        synchronized (this.f) {
            long jZzd = this.h.zzd();
            long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
            if (this.b == -1) {
                if (jB - jZzd > ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaN)).longValue()) {
                    this.d = -1;
                } else {
                    this.d = this.h.zzc();
                }
                this.b = j;
                this.a = j;
            } else {
                this.a = j;
            }
            Bundle bundle = zzlVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.c++;
            int i = this.d + 1;
            this.d = i;
            if (i == 0) {
                this.e = 0L;
                this.h.zzD(jB);
            } else {
                this.e = jB - this.h.zze();
            }
        }
    }
}
